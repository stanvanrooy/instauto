package p000X;

/* renamed from: X.1Fq  reason: invalid class name and case insensitive filesystem */
public final class C26881Fq {
    public final double A00;
    public final double A01;

    public C26881Fq(double d, double d2) {
        double d3;
        double d4 = 20.0d - 0.0d;
        double d5 = 0.0d + ((((d2 / 1.7d) - 0.0d) / d4) * (0.8d - 0.0d));
        double d6 = 0.5d + ((((d / 1.7d) - 0.0d) / d4) * (200.0d - 0.5d));
        this.A01 = d6;
        if (d6 <= 18.0d) {
            d3 = ((Math.pow(d6, 3.0d) * 7.0E-4d) - (Math.pow(d6, 2.0d) * 0.031d)) + (d6 * 0.64d) + 1.28d;
        } else if (d6 > 18.0d && d6 <= 44.0d) {
            d3 = ((Math.pow(d6, 3.0d) * 4.4E-5d) - (Math.pow(d6, 2.0d) * 0.006d)) + (d6 * 0.36d) + 2.0d;
        } else if (d6 > 44.0d) {
            d3 = ((Math.pow(d6, 3.0d) * 4.5E-7d) - (Math.pow(d6, 2.0d) * 3.32E-4d)) + (d6 * 0.1078d) + 5.84d;
        } else {
            d3 = 0.0d;
        }
        double d7 = (2.0d * d5) - (d5 * d5);
        this.A00 = (0.01d * d7) + ((1.0d - d7) * d3);
    }
}
