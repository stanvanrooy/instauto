package p000X;

/* renamed from: X.DAV */
public final class DAV implements C29801DAl {
    public long A00;
    public boolean A01;
    public long A02;
    public DAX A03 = DAX.A04;
    public final BME A04;

    public final void A00() {
        if (this.A01) {
            A01(ASP());
            this.A01 = false;
        }
    }

    public final void A01(long j) {
        this.A02 = j;
        if (this.A01) {
            this.A00 = this.A04.ACp();
        }
    }

    public final long ASP() {
        long j;
        long j2 = this.A02;
        if (!this.A01) {
            return j2;
        }
        long ACp = this.A04.ACp() - this.A00;
        DAX dax = this.A03;
        if (dax.A01 == 1.0f) {
            j = C29686D4x.A00(ACp);
        } else {
            j = ACp * ((long) dax.A02);
        }
        return j2 + j;
    }

    public final DAX BjV(DAX dax) {
        if (this.A01) {
            A01(ASP());
        }
        this.A03 = dax;
        return dax;
    }

    public DAV(BME bme) {
        this.A04 = bme;
    }

    public final DAX ASF() {
        return this.A03;
    }
}
