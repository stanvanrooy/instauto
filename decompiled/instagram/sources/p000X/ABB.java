package p000X;

/* renamed from: X.ABB */
public final class ABB extends ABK {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public double A08;
    public double A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E;
    public final C23179ABh A0F;

    public static boolean A00(ABB abb) {
        C23179ABh aBh = abb.A0F;
        if (Math.abs(aBh.A01) > abb.A04) {
            return false;
        }
        if (Math.abs(abb.A01 - aBh.A00) <= abb.A00 || abb.A07 == 0.0d) {
            return true;
        }
        return false;
    }

    public ABB(C23043A0y a0y) {
        C23179ABh aBh = new C23179ABh();
        this.A0F = aBh;
        aBh.A01 = a0y.getDouble("initialVelocity");
        A02(a0y);
    }
}
