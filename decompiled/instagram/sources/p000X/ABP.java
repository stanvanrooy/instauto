package p000X;

/* renamed from: X.ABP */
public class ABP extends ABX {
    public double A00 = 0.0d;
    public double A01 = Double.NaN;
    public C23180ABi A02;
    public Object A03 = null;

    public final double A04() {
        if (Double.isNaN(this.A00 + this.A01)) {
            A01();
        }
        return this.A00 + this.A01;
    }

    public ABP() {
    }

    public ABP(C23043A0y a0y) {
        this.A01 = a0y.getDouble("value");
        this.A00 = a0y.getDouble("offset");
    }
}
