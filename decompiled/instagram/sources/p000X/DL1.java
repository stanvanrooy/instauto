package p000X;

/* renamed from: X.DL1 */
public final class DL1 {
    public DFJ A00;
    public final C29885DEu A01;

    private float A00(int i, int i2, int i3, int i4) {
        double d;
        double d2;
        DL1 dl1;
        boolean z;
        int i5 = i3;
        int i6 = i;
        int i7 = 1;
        boolean z2 = false;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z2 = true;
        }
        int i8 = i2;
        int i9 = i4;
        if (z2) {
            i8 = i6;
            i6 = i2;
            i9 = i5;
            i5 = i4;
        }
        int abs = Math.abs(i5 - i6);
        int i10 = i9 - i8;
        int abs2 = Math.abs(i10);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = -1;
        if (i6 < i5) {
            i13 = 1;
        }
        if (i8 < i9) {
            i12 = 1;
        }
        int i14 = i5 + i13;
        int i15 = i8;
        int i16 = 0;
        int i17 = i6;
        while (true) {
            if (i17 == i14) {
                break;
            }
            int i18 = i17;
            if (z2) {
                i18 = i15;
            }
            int i19 = i15;
            if (z2) {
                i19 = i17;
            }
            if (i16 == i7) {
                dl1 = this;
                z = true;
            } else {
                dl1 = this;
                z = false;
            }
            if (z == dl1.A01.A03(i18, i19)) {
                if (i16 == 2) {
                    d = (double) (i17 - i6);
                    d2 = (double) (i15 - i8);
                    break;
                }
                i16++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i15 == i9) {
                    break;
                }
                i15 += i12;
                i11 -= abs;
            }
            i17 += i13;
            i7 = 1;
        }
        if (i16 != 2) {
            return Float.NaN;
        }
        d = (double) (i14 - i6);
        d2 = (double) i10;
        return (float) Math.sqrt((d * d) + (d2 * d2));
    }

    public static float A02(DL1 dl1, DL0 dl0, DL0 dl02) {
        int i = (int) dl0.A00;
        int i2 = (int) dl0.A01;
        int i3 = (int) dl02.A00;
        int i4 = (int) dl02.A01;
        float A012 = dl1.A01(i, i2, i3, i4);
        float A013 = dl1.A01(i3, i4, i, i2);
        if (Float.isNaN(A012)) {
            return A013 / 7.0f;
        }
        if (Float.isNaN(A013)) {
            return A012 / 7.0f;
        }
        return (A012 + A013) / 14.0f;
    }

    public DL1(C29885DEu dEu) {
        this.A01 = dEu;
    }

    private float A01(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        float f2;
        float A002 = A00(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i5 = 0;
        } else {
            int i8 = this.A01.A02;
            if (i6 >= i8) {
                i5 = i8 - 1;
                f = ((float) (i5 - i)) / ((float) (i6 - i));
            } else {
                i5 = i6;
                f = 1.0f;
            }
        }
        float f3 = (float) i2;
        int i9 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i9 < 0) {
            f2 = f3 / ((float) (i2 - i9));
        } else {
            int i10 = this.A01.A00;
            if (i9 >= i10) {
                i7 = i10 - 1;
                f2 = ((float) (i7 - i2)) / ((float) (i9 - i2));
            } else {
                i7 = i9;
                f2 = 1.0f;
            }
        }
        return (A002 + A00(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i7)) - 1.0f;
    }
}
