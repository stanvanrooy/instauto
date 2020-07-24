package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.B4a */
public final class B4a implements Runnable {
    public final /* synthetic */ C60292jf A00;
    public final /* synthetic */ Callable A01;

    public B4a(C60292jf r1, Callable callable) {
        this.A00 = r1;
        this.A01 = callable;
    }

    public final void run() {
        try {
            this.A00.A0I(this.A01.call());
        } catch (Exception e) {
            this.A00.A0H(e);
        }
    }
}
