package p000X;

/* renamed from: X.1zd  reason: invalid class name and case insensitive filesystem */
public final class C46371zd implements Runnable {
    public final /* synthetic */ C32191ak A00;

    public C46371zd(C32191ak r1) {
        this.A00 = r1;
    }

    public final void run() {
        C32191ak r2 = this.A00;
        if (!C32191ak.A07(r2)) {
            if (C32191ak.A00(r2).A00 == Constants.ONE) {
                this.A00.A0C(Constants.ZERO);
            }
            r2 = this.A00;
        }
        Runnable runnable = r2.A0A;
        if (runnable != null) {
            AnonymousClass0ZA.A08(r2.A0E, runnable);
            r2.A0A = null;
        }
    }
}
