package p000X;

/* renamed from: X.1sC  reason: invalid class name and case insensitive filesystem */
public final class C42341sC {
    public static int A03;
    public double A00;
    public double A01;
    public double A02;

    public final synchronized int A00() {
        double d;
        double d2;
        double d3;
        double d4 = this.A02;
        double d5 = (double) AnonymousClass20M.RENDERING.A00;
        Double.isNaN(d5);
        double d6 = d4 * d5;
        double d7 = this.A01;
        double d8 = (double) AnonymousClass20M.MEDIA_UPLOADING.A00;
        Double.isNaN(d8);
        d = d6 + (d7 * d8);
        d2 = this.A00;
        d3 = (double) AnonymousClass20M.COVER_PHOTO_UPLOADING.A00;
        Double.isNaN(d3);
        return (int) (d + (d2 * d3));
    }

    public final synchronized void A01(AnonymousClass20M r4, double d) {
        switch (r4.ordinal()) {
            case 0:
                this.A02 = d;
                break;
            case 1:
                this.A01 = d;
                break;
            case 2:
                this.A00 = d;
                break;
            default:
                throw new IllegalArgumentException("unknown step: " + r4);
        }
        A03 = (A03 + 1) % 5;
    }
}
