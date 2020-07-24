package p000X;

import android.os.Handler;

/* renamed from: X.D7F */
public final class D7F {
    public final Handler A00;
    public final C29762D8m A01;

    public final void A00(C29730D6u d6u) {
        synchronized (d6u) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new D87(this, d6u), -559613357);
        }
    }

    public D7F(Handler handler, C29762D8m d8m) {
        if (d8m != null) {
            D6U.A01(handler);
        } else {
            handler = null;
        }
        this.A00 = handler;
        this.A01 = d8m;
    }
}
