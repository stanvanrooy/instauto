package p000X;

/* renamed from: X.0nO  reason: invalid class name and case insensitive filesystem */
public final class C15700nO implements C15690nN {
    public static C15700nO A07;
    public double A00 = -1.0d;
    public double A01 = -1.0d;
    public C13740j9 A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;

    public final synchronized double A01() {
        return this.A00;
    }

    public final synchronized long A02() {
        return this.A03;
    }

    public final synchronized long A03() {
        return this.A05;
    }

    public final synchronized void At2(double d, long j, long j2) {
        if (this.A05 != 0) {
            double d2 = (double) (this.A03 / this.A05);
            Double.isNaN(d2);
            d = (d2 + d) / 2.0d;
        }
        this.A00 = d;
        this.A03 += j;
        this.A05 += j2;
        if (this.A02 != null) {
            this.A02.A0A("last_measured_bandwidth", (float) this.A00);
        }
    }

    public final synchronized void At3(double d, long j, long j2) {
        if (this.A06 != 0) {
            double d2 = (double) (this.A04 / this.A06);
            Double.isNaN(d2);
            d = (d2 + d) / 2.0d;
        }
        this.A01 = d;
        this.A04 += j;
        this.A06 += j2;
        if (this.A02 != null) {
            this.A02.A0A("last_measured_experimental_bandwidth", (float) this.A01);
        }
    }

    public final void BcF(double d) {
    }

    public static synchronized C15700nO A00() {
        C15700nO r0;
        synchronized (C15700nO.class) {
            if (A07 == null) {
                A07 = new C15700nO();
            }
            r0 = A07;
        }
        return r0;
    }

    public static synchronized void setInstanceForTesting(C15700nO r2) {
        synchronized (C15700nO.class) {
            A07 = r2;
        }
    }
}
