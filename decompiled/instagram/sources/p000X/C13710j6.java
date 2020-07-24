package p000X;

/* renamed from: X.0j6  reason: invalid class name and case insensitive filesystem */
public final class C13710j6 extends C13020hl {
    public final int A00;
    public final int A01;

    public final boolean A00(int i) {
        return false;
    }

    public final boolean A02(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.A00 && iArr[1] == this.A01;
    }

    public final boolean A01(int i, int i2) {
        if (i == this.A00 && i2 == this.A01) {
            return true;
        }
        return false;
    }

    public C13710j6(String str, int i, int i2, int i3) {
        super(str, i);
        this.A00 = i2;
        this.A01 = i3;
    }
}
