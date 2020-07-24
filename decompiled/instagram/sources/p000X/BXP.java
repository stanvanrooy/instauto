package p000X;

/* renamed from: X.BXP */
public final class BXP implements BXU {
    public final long A00;
    public final BYP A01;
    public final BY1 A02;
    public final String A03;

    public final boolean BWt(C25731BXb bXb, BXX bxx) {
        if (this.A01 == null || this.A02 == null) {
            return false;
        }
        String str = this.A03;
        if (!str.equals(bxx.A01)) {
            bxx = bXb.A02(bxx.A02, str);
        }
        return this.A02.A00(this.A01.A00(bxx), this.A00);
    }

    public BXP(String str, BYP byp, BY1 by1, long j) {
        this.A03 = str;
        this.A02 = by1;
        this.A01 = byp;
        this.A00 = j;
    }

    public long getCount() {
        return this.A00;
    }

    public BYP getEvent() {
        return this.A01;
    }

    public BY1 getMetric() {
        return this.A02;
    }
}
