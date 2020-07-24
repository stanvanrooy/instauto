package p000X;

/* renamed from: X.0j7  reason: invalid class name and case insensitive filesystem */
public final class C13720j7 extends C13020hl {
    public static final C13720j7 A01 = new C13720j7("", 0, 0);
    public final int A00;

    public final boolean A02(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.A00;
    }

    public final boolean A00(int i) {
        if (i == this.A00) {
            return true;
        }
        return false;
    }

    public final boolean A01(int i, int i2) {
        if (i == this.A00 && i2 == 0) {
            return true;
        }
        return false;
    }

    public C13720j7(String str, int i, int i2) {
        super(str, i);
        this.A00 = i2;
    }
}
