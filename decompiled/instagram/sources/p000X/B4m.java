package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.B4m */
public final class B4m implements C60352jl, C60362jm, C60372jn, C60382jo {
    public final B4v A00;
    public final C60292jf A01;
    public final Executor A02;

    public final void Aue() {
        this.A01.A0G();
    }

    public final void AxY(C60302jg r4) {
        AnonymousClass0Z9.A03(this.A02, new B4l(this, r4), 1094221318);
    }

    public final void B42(Exception exc) {
        this.A01.A0H(exc);
    }

    public final void BPi(Object obj) {
        this.A01.A0I(obj);
    }

    public B4m(Executor executor, B4v b4v, C60292jf r3) {
        this.A02 = executor;
        this.A00 = b4v;
        this.A01 = r3;
    }
}
