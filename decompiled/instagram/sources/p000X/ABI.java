package p000X;

/* renamed from: X.ABI */
public final class ABI extends ABX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AB3 A03;
    public final A1N A04;

    public ABI(C23043A0y a0y, AB3 ab3) {
        this.A03 = ab3;
        this.A00 = a0y.getInt("animationId");
        this.A01 = a0y.getInt("toValue");
        this.A02 = a0y.getInt("value");
        this.A04 = A1N.A00(a0y.getMap("animationConfig"));
    }
}
