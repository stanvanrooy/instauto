package p000X;

/* renamed from: X.AOI */
public final class AOI implements Runnable {
    public final /* synthetic */ APC A00;
    public final /* synthetic */ AQ5 A01;

    public AOI(AQ5 aq5, APC apc) {
        this.A01 = aq5;
        this.A00 = apc;
    }

    public final void run() {
        C23470ANr aNr = this.A01.A09;
        if (aNr != null) {
            APC apc = this.A00;
            if (aNr.A0A != Constants.A0Y) {
                if (C23470ANr.A02(aNr) && apc == null) {
                    aNr.A0a.A01();
                }
                C23467ANo aNo = aNr.A08;
                if (aNo != null) {
                    C72733Gu r4 = aNo.A0H.A04.A0D;
                    if (r4.A02()) {
                        C476624x.A08(true, r4.A01());
                    }
                    aNo.A09.A02(true);
                    aNo.A0H.A04.A05.setEnabled(true);
                    C23467ANo.A04(aNo, true);
                }
            }
        }
    }
}
