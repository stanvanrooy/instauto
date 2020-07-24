package p000X;

/* renamed from: X.00y  reason: invalid class name and case insensitive filesystem */
public final class C020900y implements Runnable {
    public final /* synthetic */ C04410Dw A00;

    public C020900y(C04410Dw r1) {
        this.A00 = r1;
    }

    public final void run() {
        C04410Dw r4 = this.A00;
        AnonymousClass01N r3 = AnonymousClass01N.NATIVE_CRASH_REPORT;
        if (r4.A0P(r3) > 0) {
            AnonymousClass01N[] r1 = {r3};
            new AnonymousClass01S(r4, r1).start();
            r4.A0P(r1);
        }
    }
}
