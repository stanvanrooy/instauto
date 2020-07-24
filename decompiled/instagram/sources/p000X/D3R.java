package p000X;

/* renamed from: X.D3R */
public final class D3R implements D4K {
    public double A00;
    public int A01;
    public int A02;
    public int A03;

    public final int AGV(int i) {
        if (i <= 0) {
            return this.A02;
        }
        int i2 = this.A01;
        if (i >= i2) {
            return this.A03;
        }
        double exp = 1.0d - Math.exp((this.A00 * -1.0d) * (1.0d - (((double) i) / ((double) i2))));
        int i3 = this.A03;
        return i3 + ((int) (((double) (this.A02 - i3)) * exp));
    }

    public D3R(D2V d2v, int i, double d) {
        this.A02 = d2v.A03();
        this.A03 = d2v.A01();
        this.A01 = i;
        this.A00 = d;
    }
}
