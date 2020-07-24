package p000X;

/* renamed from: X.DL0 */
public class DL0 {
    public final float A00;
    public final float A01;

    public static float A00(DL0 dl0, DL0 dl02) {
        float f = dl0.A00;
        float f2 = dl0.A01;
        double d = (double) (f - dl02.A00);
        double d2 = (double) (f2 - dl02.A01);
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DL0)) {
            return false;
        }
        DL0 dl0 = (DL0) obj;
        if (this.A00 == dl0.A00 && this.A01 == dl0.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }

    public final String toString() {
        return "(" + this.A00 + ',' + this.A01 + ')';
    }

    public DL0(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
