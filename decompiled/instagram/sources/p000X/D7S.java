package p000X;

import android.os.Handler;

/* renamed from: X.D7S */
public final class D7S implements Runnable {
    public final /* synthetic */ C29706D5s A00;

    public D7S(C29706D5s d5s) {
        this.A00 = d5s;
    }

    public final void run() {
        C29706D5s d5s = this.A00;
        Handler handler = d5s.A08;
        if (handler != null) {
            AnonymousClass0ZA.A08(handler, d5s.A0P);
        }
    }
}
