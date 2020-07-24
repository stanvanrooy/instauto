package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1nW  reason: invalid class name and case insensitive filesystem */
public final class C39771nW {
    public C39791nY A00 = C39791nY.A00;
    public final Handler A01;
    public final C39781nX A02;
    public final C39811na A03;
    public final ConcurrentLinkedQueue A04 = new ConcurrentLinkedQueue();
    public final AtomicReference A05 = new AtomicReference((Object) null);

    public static void A00(C39771nW r3, String str, boolean z) {
        HeroPlayerServiceApi heroPlayerServiceApi = r3.A02.A00.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                if (A03(r3)) {
                    C39811na r1 = r3.A03;
                    synchronized (r1) {
                        r1.A00.clear();
                    }
                }
                heroPlayerServiceApi.A89(str, z);
            } catch (RemoteException e) {
                C40431oe.A04("PrefetchClient", e, "RemoteException when cancelPrefetchForOrigin", new Object[0]);
            }
        }
    }

    public static void A01(C39771nW r3, String str, boolean z) {
        HeroPlayerServiceApi heroPlayerServiceApi = r3.A02.A00.A0K;
        if (heroPlayerServiceApi != null) {
            try {
                if (A03(r3)) {
                    C39811na r1 = r3.A03;
                    synchronized (r1) {
                        r1.A00.remove(str);
                    }
                }
                heroPlayerServiceApi.A8A(str, z);
            } catch (RemoteException e) {
                C40431oe.A04("PrefetchClient", e, "RemoteException when cancelPrefetchForVideo", new Object[0]);
            }
        }
    }

    public static boolean A02(C39771nW r5) {
        HeroPlayerSetting heroPlayerSetting = (HeroPlayerSetting) r5.A05.get();
        if (heroPlayerSetting == null || !heroPlayerSetting.A10 || Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
            return false;
        }
        return true;
    }

    public static boolean A03(C39771nW r1) {
        HeroPlayerSetting heroPlayerSetting = (HeroPlayerSetting) r1.A05.get();
        if (heroPlayerSetting == null || !heroPlayerSetting.A1o) {
            return false;
        }
        return true;
    }

    public C39771nW(C39781nX r3, Handler handler) {
        this.A02 = r3;
        this.A03 = new C39811na();
        this.A01 = handler;
    }
}
