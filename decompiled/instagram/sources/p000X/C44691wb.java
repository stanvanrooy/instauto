package p000X;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
public final class C44691wb implements Runnable {
    public final /* synthetic */ C32551bS A00;

    public C44691wb(C32551bS r1) {
        this.A00 = r1;
    }

    public final void run() {
        C32551bS r2 = this.A00;
        C36841ih r1 = r2.A03;
        if (C32551bS.A09(r1)) {
            C32551bS.A05(r2);
            return;
        }
        if (r1.A0J == Constants.ZERO) {
            C32551bS.A08(r2, Constants.ONE);
        }
        C32551bS.A05(this.A00);
    }
}
