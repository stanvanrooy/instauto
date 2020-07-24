package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.DL3 */
public final class DL3 {
    public static final DL9 A05 = new DL9();
    public boolean A00;
    public final C29885DEu A01;
    public final ArrayList A02 = new ArrayList();
    public final int[] A03 = new int[5];
    public final DFJ A04;

    public static boolean A01(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    public static boolean A00(DL3 dl3) {
        int size = dl3.A02.size();
        Iterator it = dl3.A02.iterator();
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int i = 0;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        while (it.hasNext()) {
            DLB dlb = (DLB) it.next();
            if (dlb.A01 >= 2) {
                i++;
                f2 += dlb.A00;
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        Iterator it2 = dl3.A02.iterator();
        while (it2.hasNext()) {
            f += Math.abs(((DLB) it2.next()).A00 - f3);
        }
        if (f <= f2 * 0.05f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010f  */
    public final boolean A02(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        boolean z2 = false;
        int i10 = iArr[2];
        int i11 = iArr[3];
        int i12 = iArr[4];
        int i13 = iArr[0] + iArr[1] + i10 + i11 + i12;
        int i14 = (int) (((float) ((i2 - i12) - i11)) - (((float) i10) / 2.0f));
        C29885DEu dEu = this.A01;
        int i15 = dEu.A00;
        Arrays.fill(this.A03, 0);
        int[] iArr2 = this.A03;
        int i16 = i;
        while (i16 >= 0 && dEu.A03(i14, i16)) {
            iArr2[2] = iArr2[2] + 1;
            i16--;
        }
        float f2 = Float.NaN;
        if (i16 >= 0) {
            while (i16 >= 0 && !dEu.A03(i14, i16)) {
                int i17 = iArr2[1];
                if (i17 > i10) {
                    break;
                }
                iArr2[1] = i17 + 1;
                i16--;
            }
            if (i16 >= 0 && iArr2[1] <= i10) {
                while (i16 >= 0 && dEu.A03(i14, i16)) {
                    int i18 = iArr2[0];
                    if (i18 > i10) {
                        break;
                    }
                    iArr2[0] = i18 + 1;
                    i16--;
                }
                if (iArr2[0] <= i10) {
                    int i19 = i + 1;
                    while (i19 < i15 && dEu.A03(i14, i19)) {
                        iArr2[2] = iArr2[2] + 1;
                        i19++;
                    }
                    if (i19 != i15) {
                        while (i19 < i15 && !dEu.A03(i14, i19) && (i4 = iArr2[3]) < i10) {
                            iArr2[3] = i4 + 1;
                            i19++;
                        }
                        if (i19 != i15 && iArr2[3] < i10) {
                            while (i19 < i15 && dEu.A03(i14, i19) && (i3 = iArr2[4]) < i10) {
                                iArr2[4] = i3 + 1;
                                i19++;
                            }
                            int i20 = iArr2[4];
                            if (i20 < i10) {
                                int i21 = iArr2[2];
                                int i22 = iArr2[3];
                                if (Math.abs(((((iArr2[0] + iArr2[1]) + i21) + i22) + i20) - i13) * 5 < (i13 << 1) && A01(iArr2)) {
                                    f2 = ((float) ((i19 - i20) - i22)) - (((float) i21) / 2.0f);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(f2)) {
            int i23 = (int) f2;
            int i24 = iArr[2];
            C29885DEu dEu2 = this.A01;
            int i25 = dEu2.A02;
            Arrays.fill(iArr2, 0);
            int[] iArr3 = this.A03;
            int i26 = i14;
            while (i26 >= 0 && dEu2.A03(i26, i23)) {
                iArr3[2] = iArr3[2] + 1;
                i26--;
            }
            float f3 = Float.NaN;
            if (i26 >= 0) {
                while (i26 >= 0 && !dEu2.A03(i26, i23)) {
                    int i27 = iArr3[1];
                    if (i27 > i24) {
                        break;
                    }
                    iArr3[1] = i27 + 1;
                    i26--;
                }
                if (i26 >= 0 && iArr3[1] <= i24) {
                    while (i26 >= 0 && dEu2.A03(i26, i23)) {
                        int i28 = iArr3[0];
                        if (i28 > i24) {
                            break;
                        }
                        iArr3[0] = i28 + 1;
                        i26--;
                    }
                    if (iArr3[0] <= i24) {
                        int i29 = i14 + 1;
                        while (i29 < i25 && dEu2.A03(i29, i23)) {
                            iArr3[2] = iArr3[2] + 1;
                            i29++;
                        }
                        if (i29 != i25) {
                            while (i29 < i25 && !dEu2.A03(i29, i23) && (i6 = iArr3[3]) < i24) {
                                iArr3[3] = i6 + 1;
                                i29++;
                            }
                            if (i29 != i25 && iArr3[3] < i24) {
                                while (i29 < i25 && dEu2.A03(i29, i23) && (i5 = iArr3[4]) < i24) {
                                    iArr3[4] = i5 + 1;
                                    i29++;
                                }
                                int i30 = iArr3[4];
                                if (i30 < i24) {
                                    int i31 = iArr3[2];
                                    int i32 = iArr3[3];
                                    if (Math.abs(((((iArr3[0] + iArr3[1]) + i31) + i32) + i30) - i13) * 5 < i13) {
                                        if (A01(iArr3)) {
                                            f3 = ((float) ((i29 - i30) - i32)) - (((float) i31) / 2.0f);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                f = f3;
                if (!Float.isNaN(f3)) {
                    int i33 = (int) f3;
                    Arrays.fill(iArr3, 0);
                    int[] iArr4 = this.A03;
                    int i34 = 0;
                    while (i23 >= i34 && i33 >= i34 && this.A01.A03(i33 - i34, i23 - i34)) {
                        iArr4[2] = iArr4[2] + 1;
                        i34++;
                    }
                    if (iArr4[2] != 0) {
                        while (i23 >= i34 && i33 >= i34 && !this.A01.A03(i33 - i34, i23 - i34)) {
                            iArr4[1] = iArr4[1] + 1;
                            i34++;
                        }
                        if (iArr4[1] != 0) {
                            while (i23 >= i34 && i33 >= i34 && this.A01.A03(i33 - i34, i23 - i34)) {
                                iArr4[0] = iArr4[0] + 1;
                                i34++;
                            }
                            if (iArr4[0] != 0) {
                                C29885DEu dEu3 = this.A01;
                                int i35 = dEu3.A00;
                                int i36 = dEu3.A02;
                                int i37 = 1;
                                while (true) {
                                    int i38 = i23 + i37;
                                    if (i38 < i35 && (i9 = i33 + i37) < i36 && dEu3.A03(i9, i38)) {
                                        iArr4[2] = iArr4[2] + 1;
                                        i37++;
                                    }
                                }
                                while (true) {
                                    int i39 = i23 + i37;
                                    if (i39 < i35 && (i8 = i33 + i37) < i36 && !dEu3.A03(i8, i39)) {
                                        iArr4[3] = iArr4[3] + 1;
                                        i37++;
                                    }
                                }
                                if (iArr4[3] != 0) {
                                    while (true) {
                                        int i40 = i23 + i37;
                                        if (i40 >= i35 || (i7 = i33 + i37) >= i36 || !dEu3.A03(i7, i40)) {
                                            int i41 = iArr4[4];
                                        } else {
                                            iArr4[4] = iArr4[4] + 1;
                                            i37++;
                                        }
                                    }
                                    int i412 = iArr4[4];
                                    if (i412 != 0) {
                                        z = false;
                                        int i42 = 0;
                                        int i43 = 0;
                                        while (true) {
                                            if (i42 < 5) {
                                                int i44 = iArr4[i42];
                                                if (i44 == 0) {
                                                    break;
                                                }
                                                i43 += i44;
                                                i42++;
                                            } else if (i43 >= 7) {
                                                float f4 = ((float) i43) / 7.0f;
                                                float f5 = f4 / 1.333f;
                                                if (Math.abs(f4 - ((float) iArr4[0])) < f5 && Math.abs(f4 - ((float) iArr4[1])) < f5 && Math.abs((f4 * 3.0f) - ((float) iArr4[2])) < 3.0f * f5 && Math.abs(f4 - ((float) iArr4[3])) < f5 && Math.abs(f4 - ((float) i412)) < f5) {
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (z) {
                                            float f6 = ((float) i13) / 7.0f;
                                            int i45 = 0;
                                            while (true) {
                                                if (i45 >= this.A02.size()) {
                                                    break;
                                                }
                                                DLB dlb = (DLB) this.A02.get(i45);
                                                float f7 = dlb.A01;
                                                boolean z3 = false;
                                                if (Math.abs(f2 - f7) <= f6 && Math.abs(f3 - dlb.A00) <= f6) {
                                                    float f8 = dlb.A00;
                                                    float abs = Math.abs(f6 - f8);
                                                    if (abs <= 1.0f || abs <= f8) {
                                                        z3 = true;
                                                    }
                                                }
                                                if (z3) {
                                                    ArrayList arrayList = this.A02;
                                                    int i46 = dlb.A01;
                                                    int i47 = i46 + 1;
                                                    float f9 = (float) i46;
                                                    float f10 = (float) i47;
                                                    arrayList.set(i45, new DLB(((f9 * dlb.A00) + f3) / f10, ((f9 * f7) + f2) / f10, ((f9 * dlb.A00) + f6) / f10, i47));
                                                    z2 = true;
                                                    break;
                                                }
                                                i45++;
                                            }
                                            if (!z2) {
                                                this.A02.add(new DLB(f, f2, f6, 1));
                                            }
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
            f = Float.NaN;
            if (!Float.isNaN(f3)) {
            }
        }
        return false;
    }

    public DL3(C29885DEu dEu, DFJ dfj) {
        this.A01 = dEu;
        this.A04 = dfj;
    }
}
