package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.video.heroplayer.client.HeroServiceClient$HeroServiceEventReceiver;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.TigonStatesListener;
import com.facebook.video.heroplayer.ipc.TigonTraceListener;
import com.facebook.video.heroplayer.ipc.TigonTrafficShapingListener;
import com.facebook.video.heroplayer.ipc.VideoPlayContextualSetting;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.ipc.ZeroVideoRewriteConfig;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1nP  reason: invalid class name and case insensitive filesystem */
public final class C39731nP implements Handler.Callback {
    public static final C39731nP A0W = new C39731nP();
    public Context A00;
    public Intent A01;
    public Class A02;
    public HashMap A03;
    public boolean A04;
    public final Handler A05;
    public final C39741nR A06 = new C39741nR();
    public final C39771nW A07;
    public final Runnable A08 = new C39761nV(this);
    public final Map A09 = Collections.synchronizedMap(new WeakHashMap());
    public final ConcurrentLinkedQueue A0A = new ConcurrentLinkedQueue();
    public final CopyOnWriteArraySet A0B = new CopyOnWriteArraySet();
    public final HeroServiceClient$HeroServiceEventReceiver A0C = new HeroServiceClient$HeroServiceEventReceiver(this);
    public final VideoPlayContextualSetting A0D = new VideoPlayContextualSetting();
    public volatile long A0E;
    public volatile long A0F;
    public volatile long A0G;
    public volatile ServiceConnection A0H;
    public volatile ResultReceiver A0I;
    public volatile C40641oz A0J;
    public volatile HeroPlayerServiceApi A0K;
    public volatile TigonStatesListener A0L;
    public volatile TigonTraceListener A0M;
    public volatile TigonTrafficShapingListener A0N;
    public volatile HeroPlayerSetting A0O;
    public volatile C40421od A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;
    public volatile int A0S;
    public volatile ZeroVideoRewriteConfig A0T;
    public volatile Exception A0U;
    public volatile boolean A0V;

    public static synchronized void A01(C39731nP r6) {
        synchronized (r6) {
            try {
                r6.A01.putExtra("ExperimentationSetting", r6.A03);
                r6.A01.putExtra("HeroPlayerSetting", r6.A0O);
                r6.A01.putExtra("ServiceEvent", r6.A0C);
                AnonymousClass0ZI.A02(r6.A00, r6.A01, r6.A0H, 1, -2043842437);
                r6.A0U = null;
                r6.A0F = SystemClock.elapsedRealtime();
                r6.A0S++;
                C40431oe.A01("HeroServiceClient", "finished mApplicationContext.bindService", new Object[0]);
            } catch (SecurityException e) {
                C40431oe.A01("HeroServiceClient", "SecurityException when bindService", e);
                r6.A0U = e;
            } catch (RuntimeException e2) {
                r6.A0U = e2;
                if (e2.getCause() == null || !(e2.getCause() instanceof DeadObjectException)) {
                    throw e2;
                }
                r6.A0U = (Exception) e2.getCause();
                C40431oe.A03("HeroServiceClient", "DeadObjectException when binding service", new Object[0]);
            }
        }
    }

    public static void A00(C39731nP r3) {
        HeroPlayerServiceApi heroPlayerServiceApi = r3.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                heroPlayerServiceApi.A8c();
            } catch (RemoteException e) {
                C40431oe.A05("HeroServiceClient", e, "Error occurs while clearing cache for internal settings", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.equalsIgnoreCase("ig_stories") == false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    public static void A02(C39731nP r10, VideoPlayRequest videoPlayRequest, boolean z, float f) {
        boolean z2;
        C40691p4 r7;
        long j;
        HeroPlayerServiceApi heroPlayerServiceApi = r10.A0K;
        C40641oz r4 = r10.A0J;
        VideoSource videoSource = videoPlayRequest.A05;
        String str = videoSource.A09;
        if (str != null) {
            z2 = true;
        }
        z2 = false;
        Boolean valueOf = Boolean.valueOf(z2);
        boolean z3 = videoSource.A0K;
        if (r10.A0O != null && r10.A0O.A14 && heroPlayerServiceApi == null && z3 && valueOf.booleanValue()) {
            r10.A0A.offer(new AnonymousClass89G(videoPlayRequest, z, f));
        }
        if (heroPlayerServiceApi != null && r4 != null) {
            C40431oe.A01("HeroServiceClient", AnonymousClass000.A0E("client side warming up vid=", videoPlayRequest.A05.A0D), new Object[0]);
            synchronized (r4) {
                String str2 = videoPlayRequest.A05.A0D;
                if (r4.A01.get(str2) == null) {
                    r4.A00.BWC(videoPlayRequest);
                    Surface surface = null;
                    if (!z) {
                        r7 = null;
                    } else if (!C40701p5.A00.isEmpty()) {
                        Iterator it = C40701p5.A00.iterator();
                        r7 = (C40691p4) it.next();
                        it.remove();
                    } else {
                        r7 = new C40691p4();
                    }
                    if (r7 != null) {
                        try {
                            surface = r7.A00;
                        } catch (RemoteException e) {
                            e = e;
                            j = 0;
                            C40431oe.A05("WarmupPool", e, "RemoteException when warmUpPlayerAndReturn", new Object[0]);
                            r4.A00.BWB(videoPlayRequest, e.getMessage());
                            C45931yr r3 = new C45931yr(j, r7, videoPlayRequest.A05.A0D);
                            if (j == 0) {
                            }
                        }
                    }
                    j = heroPlayerServiceApi.Bu9(videoPlayRequest, surface, f);
                    try {
                        r4.A00.BWD(videoPlayRequest);
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                    C45931yr r32 = new C45931yr(j, r7, videoPlayRequest.A05.A0D);
                    if (j == 0) {
                        r4.A01.put(str2, r32);
                    } else {
                        C40701p5.A00(r32.A01);
                    }
                }
            }
        }
    }

    public static void A03(C39731nP r2, String str) {
        HeroPlayerServiceApi heroPlayerServiceApi = r2.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                heroPlayerServiceApi.Apl(str);
            } catch (RemoteException e) {
                C40431oe.A04("HeroServiceClient", e, "RemoteException when networkTypeChanged", new Object[0]);
            }
        }
    }

    public static boolean A05(C39731nP r5) {
        HeroPlayerSetting heroPlayerSetting = r5.A0O;
        if (heroPlayerSetting == null || !heroPlayerSetting.A10 || Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            return false;
        }
        return true;
    }

    public final void A07() {
        C40641oz r1 = this.A0J;
        if (r1 != null) {
            synchronized (r1) {
                r1.A01.evictAll();
            }
            return;
        }
        HeroPlayerServiceApi heroPlayerServiceApi = this.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                heroPlayerServiceApi.A8p();
            } catch (RemoteException e) {
                C40431oe.A04("HeroServiceClient", e, "RemoteException when clearWarmUpPool", new Object[0]);
            }
        }
    }

    public final void A09(String str, boolean z) {
        C39771nW r3 = this.A07;
        if (C39771nW.A02(r3)) {
            AnonymousClass0ZA.A0E(r3.A01, new C30629Dge(r3, str, z), 1179346451);
        } else {
            C39771nW.A01(r3, str, z);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        HeroPlayerServiceApi heroPlayerServiceApi = this.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                Object[] objArr = (Object[]) message.obj;
                heroPlayerServiceApi.As1(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue(), (HeroScrollSetting) objArr[2]);
                return true;
            } catch (RemoteException e) {
                C40431oe.A04("HeroServiceClient", e, "RemoteException when onAppScrollStateChanged", new Object[0]);
            }
        }
        return true;
    }

    public C39731nP() {
        HandlerThread handlerThread = new HandlerThread("HeroClientHandlerThread", 10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A05 = handler;
        this.A07 = new C39771nW(new C39781nX(this), handler);
    }

    public static void A04(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File A042 : listFiles) {
                A04(A042);
            }
        }
        file.delete();
    }

    public final void A06() {
        if (A05(this)) {
            AnonymousClass0ZA.A0E(this.A05, new BLV(this), 600779822);
        } else {
            A00(this);
        }
    }

    public final void A08(String str) {
        if (A05(this)) {
            AnonymousClass0ZA.A0E(this.A05, new BLW(this, str), 1392098068);
        } else {
            A03(this, str);
        }
    }
}
