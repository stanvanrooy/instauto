package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1cT  reason: invalid class name and case insensitive filesystem */
public abstract class C33161cT {
    public static Handler A04;
    public final FutureTask A00 = new C33181cV(this, new C33171cU(this));
    public final AtomicBoolean A01 = new AtomicBoolean();
    public final AtomicBoolean A02 = new AtomicBoolean();
    public volatile Integer A03 = Constants.ZERO;

    public abstract Object A00();

    public void A01(Object obj) {
    }

    public void A02(Object obj) {
    }

    public final void A03(Object obj) {
        Handler handler;
        synchronized (C33161cT.class) {
            if (A04 == null) {
                A04 = new Handler(Looper.getMainLooper());
            }
            handler = A04;
        }
        AnonymousClass0ZA.A0E(handler, new C37281jP(this, obj), 2029090268);
    }
}
