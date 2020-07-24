package p000X;

/* renamed from: X.ASX */
public final class ASX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public ASX() {
        this(new ASZ());
    }

    public ASX(ASZ asz) {
        this.A03 = asz.A04;
        this.A02 = asz.A02;
        this.A00 = asz.A00;
        this.A01 = asz.A01;
        this.A04 = asz.A05;
    }
}
