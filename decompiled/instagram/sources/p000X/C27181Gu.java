package p000X;

/* renamed from: X.1Gu  reason: invalid class name and case insensitive filesystem */
public final class C27181Gu {
    public static double A01(double d, double d2, double d3, double d4, double d5) {
        double d6 = d3 - d2;
        double d7 = d5 - d4;
        double d8 = 0.0d;
        if (d6 != 0.0d) {
            d8 = (d - d2) / d6;
        }
        return d4 + (d8 * d7);
    }

    public static double A00(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }
}
