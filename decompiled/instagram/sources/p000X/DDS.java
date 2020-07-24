package p000X;

/* renamed from: X.DDS */
public final class DDS {
    public int A00;
    public int A01;

    public final void A00(int i, int i2) {
        if (i <= i2) {
            this.A01 = i;
            this.A00 = i2;
            return;
        }
        throw new IllegalArgumentException("start cannot be greater than end");
    }
}
