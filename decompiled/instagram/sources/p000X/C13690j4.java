package p000X;

/* renamed from: X.0j4  reason: invalid class name and case insensitive filesystem */
public final class C13690j4 extends C13020hl {
    public final int A00;
    public final int[] A01;

    public final boolean A00(int i) {
        return false;
    }

    public final boolean A01(int i, int i2) {
        return false;
    }

    public final boolean A02(int[] iArr, int i) {
        if (i == this.A00) {
            int i2 = 0;
            while (i2 < i) {
                if (iArr[i2] == this.A01[i2]) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public C13690j4(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 >= 3) {
            this.A01 = iArr;
            this.A00 = i2;
            return;
        }
        throw new IllegalArgumentException("Qlen must >= 3");
    }
}
