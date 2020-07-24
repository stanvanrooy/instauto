package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DL2 */
public final class DL2 {
    public static final DL0[] A01 = new DL0[0];
    public final C29882DEr A00 = new C29882DEr();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v148, resolved type: X.DLB} */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03af, code lost:
        if (r2 != 3) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c6, code lost:
        if (r2 < r7) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04da, code lost:
        if (p000X.DL4.A01(r9, r10) == false) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04dc, code lost:
        r1 = p000X.DL4.A00(r9, r10, r8, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x04e0, code lost:
        if (r1 == null) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0681, code lost:
        if (r4.A02 < 0) goto L_0x0683;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013e, code lost:
        if (r20.containsKey(p000X.DF1.TRY_HARDER) == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0176, code lost:
        if ((r9 & 1) == 1) goto L_0x0178;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x067e  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0686  */
    public final C229589y6 A00(C229569y4 r43, Map map) {
        DL0[] dl0Arr;
        DL8 dl8;
        List list;
        String str;
        boolean z;
        DFJ dfj;
        boolean z2;
        DLB dlb;
        float f;
        float f2;
        float f3;
        DLD dld;
        int i;
        int i2;
        int[] iArr;
        int length;
        int[] iArr2;
        int[] iArr3;
        int i3;
        Map map2 = map;
        if (map != null) {
            if (map2.containsKey(DF1.PURE_BARCODE)) {
                C29885DEu A002 = r43.A00();
                int i4 = 0;
                while (true) {
                    iArr = A002.A03;
                    length = iArr.length;
                    if (i4 < length && iArr[i4] == 0) {
                        i4++;
                    } else if (i4 != length) {
                        iArr2 = null;
                    } else {
                        int i5 = A002.A01;
                        int i6 = i4 / i5;
                        int i7 = (i4 % i5) << 5;
                        int i8 = iArr[i4];
                        int i9 = 0;
                        while ((i8 << (31 - i9)) == 0) {
                            i9++;
                        }
                        iArr2 = new int[]{i7 + i9, i6};
                    }
                }
                if (i4 != length) {
                }
                int i10 = length - 1;
                while (i10 >= 0 && iArr[i10] == 0) {
                    i10--;
                }
                if (i10 < 0) {
                    iArr3 = null;
                } else {
                    int i11 = A002.A01;
                    int i12 = i10 / i11;
                    int i13 = (i10 % i11) << 5;
                    int i14 = 31;
                    while ((iArr[i10] >>> i14) == 0) {
                        i14--;
                    }
                    iArr3 = new int[]{i13 + i14, i12};
                }
                if (!(iArr2 == null || iArr3 == null)) {
                    int i15 = A002.A00;
                    int i16 = A002.A02;
                    int i17 = iArr2[0];
                    int i18 = i17;
                    int i19 = i17;
                    boolean z3 = true;
                    int i20 = iArr2[1];
                    int i21 = i20;
                    int i22 = 0;
                    while (i17 < i16 && i20 < i15) {
                        if (z3 != A002.A03(i17, i20)) {
                            i22++;
                            if (i22 == 5) {
                                break;
                            }
                            z3 = !z3;
                        }
                        i17++;
                        i20++;
                    }
                    if (!(i17 == i16 || i20 == i15)) {
                        float f4 = ((float) (i17 - i18)) / 7.0f;
                        int i23 = iArr3[1];
                        int i24 = iArr3[0];
                        if (i18 < i24 && i21 < i23 && ((i3 = i23 - i21) == i24 - i18 || (i24 = i18 + i3) < i16)) {
                            int round = Math.round(((float) ((i24 - i18) + 1)) / f4);
                            int round2 = Math.round(((float) (i3 + 1)) / f4);
                            if (round > 0 && round2 > 0 && round2 == round) {
                                int i25 = (int) (f4 / 2.0f);
                                int i26 = i21 + i25;
                                int i27 = i19 + i25;
                                int i28 = (((int) (((float) (round - 1)) * f4)) + i27) - i24;
                                if (i28 > 0) {
                                    if (i28 <= i25) {
                                        i27 -= i28;
                                    }
                                }
                                int i29 = (((int) (((float) (round2 - 1)) * f4)) + i26) - i23;
                                if (i29 > 0) {
                                    if (i29 <= i25) {
                                        i26 -= i29;
                                    }
                                }
                                C29885DEu dEu = new C29885DEu(round, round2);
                                for (int i30 = 0; i30 < round2; i30++) {
                                    int i31 = ((int) (((float) i30) * f4)) + i26;
                                    for (int i32 = 0; i32 < round; i32++) {
                                        if (A002.A03(((int) (((float) i32) * f4)) + i27, i31)) {
                                            dEu.A01(i32, i30);
                                        }
                                    }
                                }
                                dl8 = this.A00.A01(dEu, map2);
                                dl0Arr = A01;
                                Object obj = dl8.A00;
                                if ((obj instanceof DFI) && ((DFI) obj).A00 && dl0Arr != null && dl0Arr.length >= 3) {
                                    DL0 dl0 = dl0Arr[0];
                                    dl0Arr[0] = dl0Arr[2];
                                    dl0Arr[2] = dl0;
                                }
                                C229589y6 r2 = new C229589y6(dl8.A04, dl8.A06, dl0Arr);
                                list = dl8.A05;
                                if (list != null) {
                                    r2.A00(DL7.BYTE_SEGMENTS, list);
                                }
                                str = dl8.A03;
                                if (str != null) {
                                    r2.A00(DL7.ERROR_CORRECTION_LEVEL, str);
                                }
                                if (dl8.A01 >= 0) {
                                    z = true;
                                }
                                z = false;
                                if (z) {
                                    r2.A00(DL7.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dl8.A02));
                                    r2.A00(DL7.STRUCTURED_APPEND_PARITY, Integer.valueOf(dl8.A01));
                                }
                                return r2;
                            }
                        }
                    }
                }
                throw DFG.A00;
            }
        }
        DL1 dl1 = new DL1(r43.A00());
        if (map == null) {
            dfj = null;
        } else {
            dfj = (DFJ) map2.get(DF1.NEED_RESULT_POINT_CALLBACK);
        }
        DL1 dl12 = dl1;
        dl12.A00 = dfj;
        DL3 dl3 = new DL3(dl12.A01, dfj);
        if (map != null) {
            z2 = true;
        }
        z2 = false;
        C29885DEu dEu2 = dl3.A01;
        int i33 = dEu2.A00;
        int i34 = dEu2.A02;
        int i35 = (i33 * 3) / 388;
        if (i35 < 3 || z2) {
            i35 = 3;
        }
        int[] iArr4 = new int[5];
        int i36 = i35 - 1;
        boolean z4 = false;
        while (i36 < i33 && !z4) {
            Arrays.fill(iArr4, 0);
            z4 = false;
            int i37 = 0;
            int i38 = 0;
            while (i37 < i34) {
                if (!dl3.A01.A03(i37, i36)) {
                    if ((i38 & 1) == 0) {
                        if (i38 == 4) {
                            if (!DL3.A01(iArr4) || !dl3.A02(iArr4, i36, i37)) {
                                iArr4[0] = iArr4[2];
                                iArr4[1] = iArr4[3];
                                iArr4[2] = iArr4[4];
                                iArr4[3] = 1;
                                iArr4[4] = 0;
                                i38 = 3;
                                i37++;
                            } else {
                                if (dl3.A00) {
                                    z4 = DL3.A00(dl3);
                                } else {
                                    if (dl3.A02.size() > 1) {
                                        DLB dlb2 = null;
                                        Iterator it = dl3.A02.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            DLB dlb3 = (DLB) it.next();
                                            if (dlb3.A01 >= 2) {
                                                if (dlb2 != null) {
                                                    dl3.A00 = true;
                                                    i2 = ((int) (Math.abs(dlb2.A00 - dlb3.A00) - Math.abs(dlb2.A01 - dlb3.A01))) / 2;
                                                    break;
                                                }
                                                dlb2 = dlb3;
                                            }
                                        }
                                    }
                                    i2 = 0;
                                    int i39 = iArr4[2];
                                    if (i2 > i39) {
                                        i36 += (i2 - i39) - 2;
                                        i37 = i34 - 1;
                                    }
                                }
                                Arrays.fill(iArr4, 0);
                                i38 = 0;
                                i35 = 2;
                                i37++;
                            }
                        }
                    }
                    iArr4[i38] = iArr4[i38] + 1;
                    i37++;
                }
                i38++;
                iArr4[i38] = iArr4[i38] + 1;
                i37++;
            }
            if (DL3.A01(iArr4) && dl3.A02(iArr4, i36, i34)) {
                i35 = iArr4[0];
                if (dl3.A00) {
                    z4 = DL3.A00(dl3);
                }
            }
            i36 += i35;
        }
        if (dl3.A02.size() >= 3) {
            Collections.sort(dl3.A02, DL3.A05);
            double[] dArr = new double[3];
            DLB[] dlbArr = new DLB[3];
            double d = Double.MAX_VALUE;
            int i40 = 0;
            while (i40 < dl3.A02.size() - 2) {
                DLB dlb4 = dl3.A02.get(i40);
                DLB dlb5 = dlb4;
                float f5 = dlb4.A00;
                i40++;
                int i41 = i40;
                while (i41 < dl3.A02.size() - 1) {
                    DLB dlb6 = (DLB) dl3.A02.get(i41);
                    double d2 = (double) (dlb5.A00 - dlb6.A00);
                    double d3 = (double) (dlb5.A01 - dlb6.A01);
                    double d4 = (d2 * d2) + (d3 * d3);
                    i41++;
                    for (int i42 = i41; i42 < dl3.A02.size(); i42++) {
                        DLB dlb7 = (DLB) dl3.A02.get(i42);
                        if (dlb7.A00 <= 1.4f * f5) {
                            dArr[0] = d4;
                            float f6 = dlb6.A00;
                            float f7 = dlb7.A00;
                            double d5 = (double) (f6 - f7);
                            float f8 = dlb6.A01;
                            float f9 = dlb7.A01;
                            double d6 = (double) (f8 - f9);
                            dArr[1] = (d5 * d5) + (d6 * d6);
                            double d7 = (double) (dlb5.A00 - f7);
                            double d8 = (double) (dlb5.A01 - f9);
                            dArr[2] = (d7 * d7) + (d8 * d8);
                            Arrays.sort(dArr);
                            double d9 = dArr[2];
                            double abs = Math.abs(d9 - (dArr[1] * 2.0d)) + Math.abs(d9 - (dArr[0] * 2.0d));
                            if (abs < d) {
                                dlbArr[0] = dlb5;
                                dlbArr[1] = dlb6;
                                dlbArr[2] = dlb7;
                                d = abs;
                            }
                        }
                    }
                }
            }
            if (d != Double.MAX_VALUE) {
                DLB dlb8 = dlbArr[0];
                DLB dlb9 = dlbArr[1];
                float A003 = DL0.A00(dlb8, dlb9);
                DLB dlb10 = dlbArr[2];
                float A004 = DL0.A00(dlb9, dlb10);
                float A005 = DL0.A00(dlb8, dlb10);
                if (A004 < A003 || A004 < A005) {
                    if (A005 >= A004) {
                        dlb = dlb9;
                    }
                    dlb = dlb10;
                    dlb10 = dlb9;
                } else {
                    dlb = dlb8;
                    dlb8 = dlb9;
                }
                float f10 = dlb.A00;
                float f11 = dlb.A01;
                if (((dlb10.A00 - f10) * (dlb8.A01 - f11)) - ((dlb10.A01 - f11) * (dlb8.A00 - f10)) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    DLB dlb11 = dlb10;
                    dlb10 = dlb8;
                    dlb8 = dlb11;
                }
                dlbArr[0] = dlb8;
                dlbArr[1] = dlb;
                dlbArr[2] = dlb10;
                DLC dlc = new DLC(dlbArr);
                DLB dlb12 = dlc.A01;
                DLB dlb13 = dlc.A02;
                DLB dlb14 = dlc.A00;
                DLB dlb15 = dlb12;
                DL1 dl13 = dl1;
                float A02 = (DL1.A02(dl13, dlb15, dlb13) + DL1.A02(dl13, dlb15, dlb14)) / 2.0f;
                if (A02 >= 1.0f) {
                    DLB dlb16 = dlb15;
                    float A006 = DL0.A00(dlb15, dlb13) / A02;
                    float f12 = 0.5f;
                    if (A006 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f12 = -0.5f;
                    }
                    int i43 = (int) (A006 + f12);
                    float A007 = DL0.A00(dlb16, dlb14) / A02;
                    float f13 = 0.5f;
                    if (A007 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        f13 = -0.5f;
                    }
                    int i44 = ((i43 + ((int) (A007 + f13))) / 2) + 7;
                    int i45 = i44 & 3;
                    if (i45 == 0) {
                        i44++;
                    } else if (i45 == 2) {
                        i44--;
                    }
                    if (i44 % 4 == 1) {
                        try {
                            C29888DEx A012 = C29888DEx.A01((i44 - 17) / 4);
                            int i46 = ((A012.A01 << 2) + 17) - 7;
                            DLD dld2 = null;
                            if (A012.A02.length > 0) {
                                float f14 = dlb13.A00;
                                float f15 = dlb16.A00;
                                float f16 = (f14 - f15) + dlb14.A00;
                                float f17 = dlb13.A01;
                                float f18 = dlb12.A01;
                                float f19 = 1.0f - (3.0f / ((float) i46));
                                int i47 = (int) (f15 + ((f16 - f15) * f19));
                                int i48 = (int) (f18 + (f19 * (((f17 - f18) + dlb14.A01) - f18)));
                                int i49 = 4;
                                while (true) {
                                    if (i49 > 16) {
                                        break;
                                    }
                                    try {
                                        int i50 = (int) (((float) i49) * A02);
                                        int max = Math.max(0, i47 - i50);
                                        C29885DEu dEu3 = dl1.A01;
                                        int min = Math.min(dEu3.A02 - 1, i47 + i50) - max;
                                        float f20 = 3.0f * A02;
                                        if (((float) min) >= f20) {
                                            int max2 = Math.max(0, i48 - i50);
                                            int min2 = Math.min(dEu3.A00 - 1, i48 + i50) - max2;
                                            if (((float) min2) >= f20) {
                                                DL4 dl4 = new DL4(dEu3, max, max2, min, min2, A02, dl1.A00);
                                                int i51 = dl4.A01;
                                                int i52 = i51;
                                                int i53 = dl4.A00;
                                                int i54 = dl4.A03 + i51;
                                                int i55 = dl4.A02 + (i53 >> 1);
                                                int[] iArr5 = new int[3];
                                                int i56 = 0;
                                                loop14:
                                                while (true) {
                                                    if (i56 < i53) {
                                                        if ((i56 & 1) == 0) {
                                                            i = (i56 + 1) / 2;
                                                        } else {
                                                            i = -((i56 + 1) / 2);
                                                        }
                                                        int i57 = i + i55;
                                                        iArr5[0] = 0;
                                                        iArr5[1] = 0;
                                                        iArr5[2] = 0;
                                                        int i58 = i52;
                                                        while (i58 < i54 && !dl4.A04.A03(i58, i57)) {
                                                            i58++;
                                                        }
                                                        int i59 = 0;
                                                        while (true) {
                                                            if (i58 >= i54) {
                                                                break;
                                                            }
                                                            if (!dl4.A04.A03(i58, i57)) {
                                                                if (i59 == 1) {
                                                                    i59 = 2;
                                                                }
                                                                iArr5[i59] = iArr5[i59] + 1;
                                                            } else if (i59 == 1) {
                                                                iArr5[1] = iArr5[1] + 1;
                                                            } else if (i59 == 2) {
                                                                if (DL4.A01(dl4, iArr5) && (dld = DL4.A00(dl4, iArr5, i57, i58)) != null) {
                                                                    break loop14;
                                                                }
                                                                iArr5[0] = iArr5[2];
                                                                iArr5[1] = 1;
                                                                iArr5[2] = 0;
                                                                i59 = 1;
                                                            } else {
                                                                i59++;
                                                                iArr5[i59] = iArr5[i59] + 1;
                                                            }
                                                            i58++;
                                                        }
                                                    } else if (!dl4.A05.isEmpty()) {
                                                        dld = (DLD) dl4.A05.get(0);
                                                    } else {
                                                        throw DFG.A00;
                                                    }
                                                    i56++;
                                                }
                                                dld2 = dld;
                                            } else {
                                                throw DFG.A00;
                                            }
                                        } else {
                                            throw DFG.A00;
                                        }
                                    } catch (DFG unused) {
                                        i49 <<= 1;
                                    }
                                }
                            }
                            DLB dlb17 = dlb12;
                            float f21 = ((float) i44) - 3.5f;
                            if (dld2 != null) {
                                DLD dld3 = dld2;
                                f = dld3.A00;
                                f2 = dld3.A01;
                                f3 = f21 - 3.0f;
                            } else {
                                f = (dlb13.A00 - dlb17.A00) + dlb14.A00;
                                f2 = (dlb13.A01 - dlb17.A01) + dlb14.A01;
                                f3 = f21;
                            }
                            float f22 = dlb17.A00;
                            float f23 = dlb17.A01;
                            float f24 = dlb13.A00;
                            float f25 = dlb13.A01;
                            DLB dlb18 = dlb14;
                            float f26 = dlb18.A00;
                            float f27 = dlb18.A01;
                            DL6 A008 = DL6.A00(3.5f, 3.5f, f21, 3.5f, f3, f3, 3.5f, f21);
                            float f28 = A008.A04;
                            float f29 = A008.A08;
                            float f30 = A008.A05;
                            float f31 = A008.A07;
                            float f32 = A008.A06;
                            float f33 = A008.A03;
                            float f34 = A008.A02;
                            float f35 = A008.A01;
                            float f36 = A008.A00;
                            DL6 dl6 = new DL6((f28 * f29) - (f30 * f31), (f30 * f32) - (f33 * f29), (f33 * f31) - (f28 * f32), (f34 * f31) - (f35 * f29), (f29 * f36) - (f34 * f32), (f32 * f35) - (f31 * f36), (f35 * f30) - (f34 * f28), (f34 * f33) - (f30 * f36), (f36 * f28) - (f35 * f33));
                            DL6 A009 = DL6.A00(f22, f23, f24, f25, f, f2, f26, f27);
                            float f37 = A009.A00;
                            float f38 = dl6.A00;
                            float f39 = A009.A03;
                            float f40 = dl6.A01;
                            float f41 = A009.A06;
                            float f42 = dl6.A02;
                            float f43 = (f37 * f38) + (f39 * f40) + (f41 * f42);
                            float f44 = dl6.A03;
                            float f45 = dl6.A04;
                            float f46 = dl6.A05;
                            float f47 = (f37 * f44) + (f39 * f45) + (f41 * f46);
                            float f48 = dl6.A06;
                            float f49 = dl6.A07;
                            float f50 = dl6.A08;
                            float f51 = (f37 * f48) + (f39 * f49) + (f41 * f50);
                            float f52 = A009.A01;
                            float f53 = A009.A04;
                            float f54 = (f52 * f38) + (f53 * f40);
                            float f55 = A009.A07;
                            float f56 = (f55 * f50) + (f52 * f48) + (f53 * f49);
                            float f57 = A009.A02;
                            float f58 = A009.A05;
                            float f59 = (f38 * f57) + (f40 * f58);
                            float f60 = A009.A08;
                            DL6 dl62 = new DL6(f43, f47, f51, f54 + (f55 * f42), (f52 * f44) + (f53 * f45) + (f55 * f46), f56, (f42 * f60) + f59, (f44 * f57) + (f45 * f58) + (f46 * f60), (f57 * f48) + (f58 * f49) + (f60 * f50));
                            int i60 = i44;
                            DLE dle = new DLE(DLA.A00.A00(dl1.A01, i60, i60, dl62), dld2 == null ? new DL0[]{dlb14, dlb12, dlb13} : new DL0[]{dlb14, dlb12, dlb13, dld2});
                            dl8 = this.A00.A01(dle.A00, map2);
                            dl0Arr = dle.A01;
                            Object obj2 = dl8.A00;
                            DL0 dl02 = dl0Arr[0];
                            dl0Arr[0] = dl0Arr[2];
                            dl0Arr[2] = dl02;
                            C229589y6 r22 = new C229589y6(dl8.A04, dl8.A06, dl0Arr);
                            list = dl8.A05;
                            if (list != null) {
                            }
                            str = dl8.A03;
                            if (str != null) {
                            }
                            if (dl8.A01 >= 0) {
                            }
                            z = false;
                            if (z) {
                            }
                            return r22;
                        } catch (IllegalArgumentException unused2) {
                            throw DF9.A00();
                        }
                    } else {
                        throw DF9.A00();
                    }
                }
            }
        }
        throw DFG.A00;
    }
}
