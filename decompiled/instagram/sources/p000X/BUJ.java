package p000X;

/* renamed from: X.BUJ */
public final class BUJ {
    public BUO A00;
    public final C05450Ko A01;

    public final void A01() {
        BUO buo = this.A00;
        if (buo != null) {
            BUN bun = BUN.STOPPED;
            synchronized (buo) {
                if (buo.A07 == null) {
                    BUO.A02(buo, bun);
                }
            }
        }
    }

    public BUJ() {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "MediaScannerJobService";
        this.A01 = A002.A01();
    }

    public final void A00() {
        A01();
        C06590Pq A012 = AnonymousClass0J1.A01(this);
        if (A012.AgN()) {
            BUO buo = new BUO(C05210Iq.A02(A012));
            this.A00 = buo;
            this.A01.ADc(new BUP(this, buo));
        }
    }
}
