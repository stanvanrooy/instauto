package p000X;

/* renamed from: X.0Nc  reason: invalid class name and case insensitive filesystem */
public final class C05950Nc {
    public double A00 = -1.0d;
    public boolean A01;
    public int A02 = 0;
    public final double A03 = 0.18181818181818182d;
    public final int A04 = ((int) Math.ceil(1.0d / 0.18181818181818182d));

    public final void A00(double d) {
        this.A01 = true;
        double d2 = this.A03;
        double d3 = 1.0d - d2;
        int i = this.A02;
        if (i > this.A04) {
            this.A00 = (this.A00 * d3) + (d2 * d);
        } else {
            double d4 = (double) i;
            this.A00 = (((this.A00 * d4) * d3) + d) / ((d4 * d3) + 1.0d);
        }
        this.A02 = i + 1;
    }
}
