package p000X;

/* renamed from: X.0Cs  reason: invalid class name and case insensitive filesystem */
public final class C04170Cs extends C022301o {
    public final /* synthetic */ C022301o A00;
    public final /* synthetic */ AnonymousClass08T A01;

    public C04170Cs(AnonymousClass08T r1, C022301o r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A01(AnonymousClass0SX r3, Runnable runnable) {
        AnonymousClass02S r1;
        if (r3 != AnonymousClass0SX.DURING_ANR) {
            r1 = new AnonymousClass02S(this);
        } else {
            if (r3 == AnonymousClass0SX.NO_ANR_DETECTED) {
                this.A01.A09.cleanupAppStateFile();
            }
            r1 = null;
        }
        C022301o r0 = this.A00;
        if (r0 != null) {
            r0.A01(r3, r1);
        }
    }
}
