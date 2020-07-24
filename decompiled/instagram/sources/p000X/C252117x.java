package p000X;

/* renamed from: X.17x  reason: invalid class name and case insensitive filesystem */
public abstract class C252117x implements C252217y {
    public static C252117x A00;
    public static boolean A01;

    public abstract double A03();

    public abstract void A04(int i);

    public abstract void A05(C11910fs r1);

    public abstract boolean A06();

    public abstract boolean A07();

    public abstract boolean A08();

    public abstract boolean A09(double d);

    public abstract void BZj(C11910fs r1);

    public static synchronized C252117x A02() {
        C252117x r0;
        synchronized (C252117x.class) {
            if (A00 == null) {
                A00 = new C42501sS();
            }
            r0 = A00;
        }
        return r0;
    }
}
