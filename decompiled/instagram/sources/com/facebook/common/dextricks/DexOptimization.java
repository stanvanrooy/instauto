package com.facebook.common.dextricks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Messenger;
import com.facebook.common.dextricks.OptimizationConfiguration;
import java.io.Closeable;
import java.io.File;
import p000X.AnonymousClass000;
import p000X.AnonymousClass00Y;
import p000X.AnonymousClass0FU;
import p000X.AnonymousClass0Z0;
import p000X.C04100Ck;

public final class DexOptimization {
    public static final String ACTION_OPTIMIZE = "com.facebook.dexopt";
    public static final int JOB_ID = -87105851;
    public static final String OPT_KEY_CLIENT = "client";
    public static final String OPT_KEY_DEX_STORE_ROOT = "dexStoreRoot";
    public static final String PROCESS_NAME = "optsvc";

    public final class Client {
        public static volatile Messenger sOptListener;

        public static boolean getShouldDisableRestartProcessAfterDexOpt(Context context, DexStore dexStore, C04100Ck r5) {
            return AnonymousClass0FU.A07(context, Experiments.DO_NOT_RESTART_PROCESS_AFTER_DEX_OPT) || (r5.A12 && dexStore.isReoptimization(context));
        }

        public static Messenger getMessenger(Context context, DexStore dexStore) {
            if (sOptListener == null) {
                synchronized (Client.class) {
                    if (sOptListener == null) {
                        sOptListener = constructClientMessenger(context, dexStore);
                    }
                }
            }
            return sOptListener;
        }

        public static void startBackgroundOptimization(Context context, DexStore dexStore) {
            try {
                Mlog.safeFmt("starting background optimization", new Object[0]);
                AnonymousClass00Y.enqueueWork(context, Service.class, (int) DexOptimization.JOB_ID, new Intent(DexOptimization.ACTION_OPTIMIZE).putExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT, dexStore.root.getAbsolutePath()).putExtra(DexOptimization.OPT_KEY_CLIENT, getMessenger(context, dexStore)));
            } catch (SecurityException e) {
                Mlog.m35w("Failure to start DexOptimization.Service", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.m35w("Failure to start DexOptimization.Service", e2);
                    return;
                }
                throw e2;
            }
        }

        public static Messenger constructClientMessenger(Context context, DexStore dexStore) {
            C04100Ck A03 = C04100Ck.A03(context);
            return new Messenger(new DexOptimizationMessageHandler(context, getShouldDisableRestartProcessAfterDexOpt(context, dexStore, A03), A03.A0i, A03.A2F));
        }
    }

    public final class Service extends AnonymousClass00Y {
        public boolean isScreenOn;
        public OptSvcBroadcastReceiver mReceiver;
        public long unpauseTime;

        public final class OptSvcOptimizationConfigurationProvider extends OptimizationConfiguration.Provider {
            public OptimizationConfiguration mPausedConfig;
            public OptimizationConfiguration mScreenOffConfig;

            public OptSvcOptimizationConfigurationProvider() {
                super(new OptimizationConfiguration(Prio.lowest(), 1, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 1000, 100, 3600000, 10, OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE, false));
                OptimizationConfiguration optimizationConfiguration = this.baseline;
                this.mScreenOffConfig = new OptimizationConfiguration(optimizationConfiguration.prio, optimizationConfiguration.flags, 900, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, optimizationConfiguration.processPollMs, optimizationConfiguration.timeBetweenOptimizationAttemptsMs, optimizationConfiguration.maximumOptimizationAttempts, 0, optimizationConfiguration.installDex2OatHooks);
                this.mPausedConfig = new OptimizationConfiguration(optimizationConfiguration.prio, optimizationConfiguration.flags, 0, 100, optimizationConfiguration.processPollMs, optimizationConfiguration.timeBetweenOptimizationAttemptsMs, optimizationConfiguration.maximumOptimizationAttempts, 0, optimizationConfiguration.installDex2OatHooks);
            }

            public OptimizationConfiguration getInstantaneous() {
                long nanoTime = System.nanoTime();
                Service service = Service.this;
                if (nanoTime < service.unpauseTime) {
                    return this.mPausedConfig;
                }
                if (service.isScreenOn) {
                    return this.baseline;
                }
                return this.mScreenOffConfig;
            }
        }

        public final class OptSvcBroadcastReceiver extends BroadcastReceiver {
            public void onReceive(Context context, Intent intent) {
                int i;
                Object[] objArr;
                String str;
                int A01 = AnonymousClass0Z0.A01(-1965829126);
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        Service.this.isScreenOn = true;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen on";
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        Service.this.isScreenOn = false;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen off";
                    } else if (DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE.equals(action)) {
                        long longExtra = intent.getLongExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, -1);
                        if (longExtra < 0) {
                            Mlog.m35w("bogus pause broadcast received", new Object[0]);
                            i = -1976892630;
                            AnonymousClass0Z0.A0E(intent, i, A01);
                        }
                        Service service = Service.this;
                        long max = Math.max(service.unpauseTime, longExtra);
                        service.unpauseTime = max;
                        objArr = new Object[]{Long.valueOf(max), Long.valueOf((System.nanoTime() - max) / 1000000)};
                        str = "pause broadcast received: will unpause at time %s (%s ms from now)";
                    }
                    Mlog.safeFmt(str, objArr);
                }
                i = -1358566438;
                AnonymousClass0Z0.A0E(intent, i, A01);
            }

            public OptSvcBroadcastReceiver() {
            }
        }

        public void onHandleWork(Intent intent) {
            SocketLock socketLock;
            if (DexOptimization.ACTION_OPTIMIZE.equals(intent.getAction())) {
                Mlog.safeFmt("optsvc received opt intent", new Object[0]);
                String stringExtra = intent.getStringExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT);
                Messenger messenger = (Messenger) intent.getParcelableExtra(DexOptimization.OPT_KEY_CLIENT);
                DexOptimizationMessageHandler.send(messenger, 1, 0);
                try {
                    socketLock = new SocketLock("com.facebook.dexopt.lock");
                    while (!socketLock.tryAcquire()) {
                        try {
                            Mlog.safeFmt("another application is optimizing; waiting", new Object[0]);
                            Thread.sleep(1000);
                        } catch (InterruptedException unused) {
                            Mlog.safeFmt("optimization canceled for dex store %s", stringExtra);
                            DexOptimizationMessageHandler.send(messenger, 2, 2);
                            Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                            C0015Fs.safeClose((Closeable) socketLock);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                Mlog.m36w(th, "optimization failed for dex store %s", stringExtra);
                                DexOptimizationMessageHandler.send(messenger, 2, 1);
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                C0015Fs.safeClose((Closeable) socketLock);
                            } catch (Throwable th2) {
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                C0015Fs.safeClose((Closeable) socketLock);
                                throw th2;
                            }
                        }
                    }
                    Mlog.safeFmt("acquired xappLock", new Object[0]);
                    DexStore findOpened = DexStore.findOpened(new File(stringExtra));
                    if (findOpened != null) {
                        findOpened.optimize(getApplicationContext(), new OptSvcOptimizationConfigurationProvider());
                        DexOptimizationMessageHandler.send(messenger, 2, 0);
                        Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                        C0015Fs.safeClose((Closeable) socketLock);
                    }
                    throw new IllegalArgumentException(AnonymousClass000.A0E("no such opened dex store: ", stringExtra));
                } catch (InterruptedException unused2) {
                    socketLock = null;
                    Mlog.safeFmt("optimization canceled for dex store %s", stringExtra);
                    DexOptimizationMessageHandler.send(messenger, 2, 2);
                    Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                    C0015Fs.safeClose((Closeable) socketLock);
                } catch (Throwable th3) {
                    th = th3;
                    socketLock = null;
                    Mlog.m36w(th, "optimization failed for dex store %s", stringExtra);
                    DexOptimizationMessageHandler.send(messenger, 2, 1);
                    Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                    C0015Fs.safeClose((Closeable) socketLock);
                }
            } else {
                Mlog.m35w("optsvc received intent with unknown action: %s", intent.getAction());
            }
        }

        public void onCreate() {
            int A04 = AnonymousClass0Z0.A04(954401035);
            super.onCreate();
            Mlog.safeFmt("optsvc created", new Object[0]);
            this.isScreenOn = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = new OptSvcBroadcastReceiver();
            this.mReceiver = optSvcBroadcastReceiver;
            registerReceiver(optSvcBroadcastReceiver, intentFilter);
            this.mInterruptIfStopped = true;
            AnonymousClass0Z0.A0B(1529376969, A04);
        }

        public void onDestroy() {
            int A04 = AnonymousClass0Z0.A04(1172643408);
            Mlog.safeFmt("optsvc being shut down", new Object[0]);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = this.mReceiver;
            if (optSvcBroadcastReceiver != null) {
                unregisterReceiver(optSvcBroadcastReceiver);
                this.mReceiver = null;
            }
            super.onDestroy();
            AnonymousClass0Z0.A0B(1823019804, A04);
        }
    }
}
