package p000X;

/* renamed from: X.1Me  reason: invalid class name and case insensitive filesystem */
public final class C28551Me {
    public C15880ng A00;
    public C28661Mp A01;
    public AnonymousClass1WP A02;
    public boolean A03 = C05770Lw.A00().A00.getBoolean("force_defer_feed_response", false);
    public boolean A04;
    public final C109004mm A05;
    public final boolean A06;

    public final void A00(boolean z) {
        Integer num;
        if (this.A01 != null) {
            this.A01 = null;
            this.A00 = null;
            AnonymousClass1WP r3 = this.A02;
            if (r3 != null) {
                AnonymousClass1YO r0 = r3.A00.A0O;
                if (r0 != null && r0.A0D()) {
                    C27321Hj r2 = r3.A00;
                    AnonymousClass0C1 r1 = r2.A0V;
                    if (z) {
                        num = Constants.ONE;
                    } else {
                        num = Constants.ZERO;
                    }
                    AnonymousClass2X3.A01(r1, r2, num);
                }
                r3.A00.A0A.Bg7(C29621Qp.MAIN_FEED);
            }
        }
    }

    public C28551Me(AnonymousClass0C1 r4) {
        this.A06 = C28521Mb.A00(r4).A02();
        this.A05 = AnonymousClass13N.A00(r4);
    }
}
