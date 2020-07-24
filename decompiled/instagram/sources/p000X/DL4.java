package p000X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.DL4 */
public final class DL4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C29885DEu A04;
    public final List A05 = new ArrayList(5);
    public final int[] A06;
    public final float A07;
    public final DFJ A08;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    public static DLD A00(DL4 dl4, int[] iArr, int i, int i2) {
        float f;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = i3 + i4 + i5;
        float f2 = ((float) (i2 - i5)) - (((float) i4) / 2.0f);
        int i7 = (int) f2;
        int i8 = i4 << 1;
        C29885DEu dEu = dl4.A04;
        int i9 = dEu.A00;
        int[] iArr2 = dl4.A06;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i10 = i;
        while (i10 >= 0 && dEu.A03(i7, i10)) {
            int i11 = iArr2[1];
            if (i11 > i8) {
                break;
            }
            iArr2[1] = i11 + 1;
            i10--;
        }
        float f3 = Float.NaN;
        if (i10 >= 0 && iArr2[1] <= i8) {
            while (i10 >= 0 && !dEu.A03(i7, i10)) {
                int i12 = iArr2[0];
                if (i12 > i8) {
                    break;
                }
                iArr2[0] = i12 + 1;
                i10--;
            }
            if (iArr2[0] <= i8) {
                int i13 = i + 1;
                while (i13 < i9 && dEu.A03(i7, i13)) {
                    int i14 = iArr2[1];
                    if (i14 > i8) {
                        break;
                    }
                    iArr2[1] = i14 + 1;
                    i13++;
                }
                if (i13 != i9 && iArr2[1] <= i8) {
                    while (i13 < i9 && !dEu.A03(i7, i13)) {
                        int i15 = iArr2[2];
                        if (i15 > i8) {
                            break;
                        }
                        iArr2[2] = i15 + 1;
                        i13++;
                    }
                    int i16 = iArr2[2];
                    if (i16 <= i8) {
                        int i17 = iArr2[0];
                        int i18 = iArr2[1];
                        if (Math.abs(((i17 + i18) + i16) - i6) * 5 < (i6 << 1)) {
                            if (A01(dl4, iArr2)) {
                                f3 = ((float) (i13 - i16)) - (((float) i18) / 2.0f);
                            }
                        }
                    }
                }
            }
            f = Float.NaN;
            if (!Float.isNaN(f3)) {
                return null;
            }
            float f4 = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
            for (DLD dld : dl4.A05) {
                float f5 = dld.A01;
                boolean z = false;
                if (Math.abs(f3 - f5) <= f4 && Math.abs(f2 - dld.A00) <= f4) {
                    float f6 = dld.A00;
                    float abs = Math.abs(f4 - f6);
                    if (abs <= 1.0f || abs <= f6) {
                        z = true;
                        continue;
                    }
                }
                if (z) {
                    return new DLD((dld.A00 + f2) / 2.0f, (f5 + f3) / 2.0f, (dld.A00 + f4) / 2.0f);
                }
            }
            dl4.A05.add(new DLD(f2, f, f4));
            return null;
        }
        f = f3;
        if (!Float.isNaN(f3)) {
        }
    }

    public static boolean A01(DL4 dl4, int[] iArr) {
        float f = dl4.A07;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    public DL4(C29885DEu dEu, int i, int i2, int i3, int i4, float f, DFJ dfj) {
        this.A04 = dEu;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A07 = f;
        this.A06 = new int[3];
        this.A08 = dfj;
    }
}
