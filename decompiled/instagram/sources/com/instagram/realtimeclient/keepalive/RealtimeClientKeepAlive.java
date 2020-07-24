package com.instagram.realtimeclient.keepalive;

import android.os.Handler;
import android.os.Looper;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.lang.ref.WeakReference;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IT;
import p000X.AnonymousClass0ZA;
import p000X.C06570Po;
import p000X.C11590fD;
import p000X.C19020sn;

public class RealtimeClientKeepAlive implements C06570Po {
    public static final String SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION = "SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION";
    public static final String TAG = "RealtimeClientKeepAlive";
    public Runnable mDelayStopRunnable;
    public final AnonymousClass0IT mDirectPluginProvider;
    public final String mKeepaliveCondition;
    public final Handler mMainLooperHandler;
    public final AnonymousClass0IT mRealtimeClientManagerProvider;
    public final AnonymousClass0C1 mUserSession;

    public class RemoveKeepAliveRunnable implements Runnable {
        public final String mKeepaliveCondition;
        public final WeakReference mRealtimeClientManager;

        public void run() {
            RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManager.get();
            if (realtimeClientManager != null) {
                realtimeClientManager.removeKeepAliveCondition(this.mKeepaliveCondition);
            }
        }

        public RemoveKeepAliveRunnable(RealtimeClientManager realtimeClientManager, String str) {
            this.mRealtimeClientManager = new WeakReference(realtimeClientManager);
            this.mKeepaliveCondition = str;
        }
    }

    private synchronized void clearLastStopRunnable() {
        Runnable runnable = this.mDelayStopRunnable;
        if (runnable != null) {
            AnonymousClass0ZA.A08(this.mMainLooperHandler, runnable);
        }
        this.mDelayStopRunnable = null;
    }

    public synchronized void doKeepAlive() {
        clearLastStopRunnable();
        RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManagerProvider.get();
        AnonymousClass0ZA.A0E(this.mMainLooperHandler, new Runnable(realtimeClientManager) {
            public final /* synthetic */ RealtimeClientManager f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RealtimeClientKeepAlive.this.lambda$doKeepAlive$2$RealtimeClientKeepAlive(this.f$1);
            }
        }, 893195649);
        RemoveKeepAliveRunnable removeKeepAliveRunnable = new RemoveKeepAliveRunnable(realtimeClientManager, this.mKeepaliveCondition);
        this.mDelayStopRunnable = removeKeepAliveRunnable;
        AnonymousClass0ZA.A09(this.mMainLooperHandler, removeKeepAliveRunnable, (long) realtimeClientManager.getDelayDisconnectKeepaliveMs(), -1702210914);
    }

    public synchronized void onUserSessionWillEnd(boolean z) {
        clearLastStopRunnable();
        AnonymousClass0ZA.A0E(this.mMainLooperHandler, new RemoveKeepAliveRunnable((RealtimeClientManager) this.mRealtimeClientManagerProvider.get(), this.mKeepaliveCondition), 890575950);
    }

    public static RealtimeClientKeepAlive getInstance(AnonymousClass0C1 r2) {
        return (RealtimeClientKeepAlive) r2.AVA(RealtimeClientKeepAlive.class, new C11590fD() {
            public final Object get() {
                return RealtimeClientKeepAlive.lambda$getInstance$1(AnonymousClass0C1.this);
            }
        });
    }

    public static /* synthetic */ RealtimeClientKeepAlive lambda$getInstance$1(AnonymousClass0C1 r6) {
        return new RealtimeClientKeepAlive(r6, SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION, new Handler(Looper.getMainLooper()), new AnonymousClass0IT() {
            public final Object get() {
                return RealtimeClientManager.getInstance(AnonymousClass0C1.this);
            }
        }, $$Lambda$IKfJFRuKGGjZwbXuVqZxPoXi2w85.INSTANCE);
    }

    public /* synthetic */ void lambda$doKeepAlive$2$RealtimeClientKeepAlive(RealtimeClientManager realtimeClientManager) {
        if (!this.mUserSession.Abj()) {
            ((C19020sn) this.mDirectPluginProvider.get()).A08(this.mUserSession);
            realtimeClientManager.addKeepAliveCondition(this.mKeepaliveCondition);
        }
    }

    public RealtimeClientKeepAlive(AnonymousClass0C1 r1, String str, Handler handler, AnonymousClass0IT r4, AnonymousClass0IT r5) {
        this.mUserSession = r1;
        this.mKeepaliveCondition = str;
        this.mMainLooperHandler = handler;
        this.mRealtimeClientManagerProvider = r4;
        this.mDirectPluginProvider = r5;
    }
}
