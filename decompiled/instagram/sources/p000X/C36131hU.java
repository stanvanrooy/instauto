package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.1hU  reason: invalid class name and case insensitive filesystem */
public final class C36131hU {
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01d7, code lost:
        if (r25 != false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0295, code lost:
        if (r0.A07 == r13) goto L_0x0298;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0696, code lost:
        if (r5.A02 != r7) goto L_0x0698;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x075f, code lost:
        if (r5.A02 != r9) goto L_0x0761;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x07e7, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:406:0x06d4  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06e6  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x06fa  */
    /* JADX WARNING: Removed duplicated region for block: B:419:0x0704  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0710  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x074d  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x077c  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0798  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x07b6  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x07db  */
    /* JADX WARNING: Removed duplicated region for block: B:546:0x07d6 A[SYNTHETIC] */
    public static void A00(AnonymousClass1ZS r34, AnonymousClass1ZY r35, int i) {
        int i2;
        int i3;
        C31671Zh[] r16;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        AnonymousClass1ZU r10;
        int i6;
        AnonymousClass1ZZ r12;
        AnonymousClass1ZZ r9;
        int A00;
        AnonymousClass1ZZ r8;
        AnonymousClass1ZV r4;
        AnonymousClass1ZZ r5;
        int i7;
        boolean z3;
        AnonymousClass1ZU r92;
        AnonymousClass1ZZ r82;
        AnonymousClass1ZV r42;
        AnonymousClass1ZZ r7;
        int A002;
        int A003;
        AnonymousClass1ZV r122;
        AnonymousClass1ZZ r52;
        AnonymousClass1ZZ r43;
        AnonymousClass1ZZ r53;
        AnonymousClass1ZZ r44;
        AnonymousClass1ZZ r83;
        AnonymousClass1ZZ r72;
        float f;
        int size;
        C31661Zg r27;
        int i8;
        int i9;
        int i10;
        boolean z4;
        AnonymousClass1ZW r2;
        float f2;
        float f3;
        boolean z5;
        float f4;
        int A01;
        float f5;
        int A012;
        AnonymousClass1ZU r22;
        int i11;
        int A013;
        int i12;
        boolean z6;
        int i13 = i;
        AnonymousClass1ZS r36 = r34;
        if (i13 == 0) {
            i2 = r36.A00;
            r16 = r36.A0D;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = r36.A02;
            r16 = r36.A0E;
        }
        for (int i14 = 0; i14 < i2; i14++) {
            C31671Zh r54 = r16[i14];
            if (!r54.A0C) {
                int i15 = r54.A01 << 1;
                AnonymousClass1ZU r45 = r54.A04;
                boolean z7 = false;
                AnonymousClass1ZU r73 = r45;
                boolean z8 = false;
                while (!z8) {
                    r54.A02++;
                    AnonymousClass1ZU[] r0 = r45.A0w;
                    int i16 = r54.A01;
                    AnonymousClass1ZU r14 = null;
                    r0[i16] = null;
                    r45.A0v[i16] = null;
                    int i17 = r45.A0T;
                    if (i17 != 8) {
                        if (r54.A06 == null) {
                            r54.A06 = r45;
                        }
                        r54.A0A = r45;
                        Integer num = r45.A0x[i16];
                        Integer num2 = Constants.A0C;
                        if (num == num2 && ((i12 = r45.A0t[i16]) == 0 || i12 == 3 || i12 == 2)) {
                            r54.A03++;
                            float f6 = r45.A0r[i16];
                            if (f6 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                r54.A00 += f6;
                            }
                            if (i17 != 8 && num == num2 && (i12 == 0 || i12 == 3)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                if (f6 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    r54.A0F = true;
                                } else {
                                    r54.A0E = true;
                                }
                                if (r54.A0B == null) {
                                    r54.A0B = new ArrayList();
                                }
                                r54.A0B.add(r45);
                            }
                            if (r54.A05 == null) {
                                r54.A05 = r45;
                            }
                            AnonymousClass1ZU r02 = r54.A09;
                            if (r02 != null) {
                                r02.A0v[r54.A01] = r45;
                            }
                            r54.A09 = r45;
                        }
                    }
                    if (r73 != r45) {
                        r73.A0w[r54.A01] = r45;
                    }
                    AnonymousClass1ZV r03 = r45.A0u[i15 + 1].A04;
                    if (r03 != null) {
                        AnonymousClass1ZU r23 = r03.A07;
                        AnonymousClass1ZV r04 = r23.A0u[i15].A04;
                        if (r04 != null && r04.A07 == r45) {
                            r14 = r23;
                        }
                    }
                    if (r14 == null) {
                        r14 = r45;
                        z8 = true;
                    }
                    r73 = r45;
                    r45 = r14;
                }
                r54.A08 = r45;
                if (r54.A01 != 0 || !r54.A0G) {
                    r54.A07 = r54.A04;
                } else {
                    r54.A07 = r45;
                }
                if (r54.A0E && r54.A0F) {
                    z7 = true;
                }
                r54.A0D = z7;
            }
            r54.A0C = true;
            boolean z9 = false;
            if ((r36.A01 & 4) == 4) {
                z9 = true;
            }
            if (z9) {
                AnonymousClass1ZU r74 = r54.A04;
                AnonymousClass1ZU r6 = r54.A08;
                AnonymousClass1ZU r11 = r54.A06;
                AnonymousClass1ZU r142 = r54.A0A;
                AnonymousClass1ZU r05 = r54.A07;
                float f7 = r54.A00;
                Integer num3 = Constants.ONE;
                if (i13 == 0) {
                    i10 = r05.A0C;
                } else {
                    i10 = r05.A0R;
                }
                boolean z10 = false;
                if (i10 == 0) {
                    z10 = true;
                }
                boolean z11 = false;
                if (i10 == 1) {
                    z11 = true;
                }
                if (i10 == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AnonymousClass1ZU r13 = r74;
                int i18 = 0;
                boolean z12 = false;
                int i19 = 0;
                float f8 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                float f9 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (true) {
                    if (!z12) {
                        int i20 = r13.A0T;
                        if (i20 != 8) {
                            i19++;
                            if (i13 == 0) {
                                A013 = r13.A02();
                            } else {
                                A013 = r13.A01();
                            }
                            f8 += (float) A013;
                            if (r13 != r11) {
                                f8 += (float) r13.A0u[i3].A00();
                            }
                            if (r13 != r142) {
                                f8 += (float) r13.A0u[i3 + 1].A00();
                            }
                            AnonymousClass1ZV[] r3 = r13.A0u;
                            f9 = f9 + ((float) r3[i3].A00()) + ((float) r3[i3 + 1].A00());
                        }
                        AnonymousClass1ZV[] r32 = r13.A0u;
                        if (i20 != 8 && r13.A0x[i13] == Constants.A0C) {
                            i18++;
                            if (i13 != 0) {
                                if (r13.A0E != 0 || r13.A0I != 0) {
                                    break;
                                }
                                i11 = r13.A0G;
                            } else if (r13.A0F != 0 || r13.A0J != 0) {
                                break;
                            } else {
                                i11 = r13.A0H;
                            }
                            if (i11 == 0) {
                                if (r13.A01 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        AnonymousClass1ZV r06 = r32[i3 + 1].A04;
                        if (r06 != null) {
                            r22 = r06.A07;
                            AnonymousClass1ZV r07 = r22.A0u[i3].A04;
                            if (r07 != null) {
                            }
                        }
                        r22 = null;
                        if (r22 != null) {
                            r13 = r22;
                        } else {
                            z12 = true;
                        }
                    } else {
                        AnonymousClass1ZW r46 = r74.A0u[i3].A05;
                        int i21 = i3 + 1;
                        AnonymousClass1ZW r08 = r6.A0u[i21].A05;
                        AnonymousClass1ZW r33 = r46.A06;
                        if (r33 != null && (r2 = r08.A06) != null && r33.A00 == 1 && r2.A00 == 1 && (i18 <= 0 || i18 == i19)) {
                            if (z4 || z10 || z11) {
                                if (r11 != null) {
                                    f2 = (float) r11.A0u[i3].A00();
                                } else {
                                    f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                }
                                if (r142 != null) {
                                    f2 += (float) r142.A0u[i21].A00();
                                }
                            } else {
                                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                            }
                            float f10 = r33.A01;
                            float f11 = r2.A01;
                            if (f10 < f11) {
                                f3 = f11 - f10;
                            } else {
                                f3 = f10 - f11;
                            }
                            float f12 = f3 - f8;
                            if (i18 <= 0 || i18 != i19) {
                                if (f12 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                    z4 = true;
                                    z10 = false;
                                    z11 = false;
                                }
                                if (z4) {
                                    float f13 = f12 - f2;
                                    if (i13 == 0) {
                                        f5 = r74.A02;
                                    } else if (i13 == 1) {
                                        f5 = r74.A06;
                                    } else {
                                        f5 = -1.0f;
                                    }
                                    float f14 = f10 + (f13 * f5);
                                    while (r74 != null) {
                                        AnonymousClass1ZU r102 = r74.A0w[i13];
                                        if (r102 != null || r74 == r6) {
                                            if (i13 == 0) {
                                                A012 = r74.A02();
                                            } else {
                                                A012 = r74.A01();
                                            }
                                            AnonymousClass1ZV r24 = r74.A0u[i3];
                                            float A004 = f14 + ((float) r24.A00());
                                            r24.A05.A05(r46.A05, A004);
                                            float f15 = A004 + ((float) A012);
                                            r74.A0u[i21].A05.A05(r46.A05, f15);
                                            r74.A0u[i3].A05.A04(r35);
                                            r74.A0u[i21].A05.A04(r35);
                                            f14 = f15 + ((float) r74.A0u[i21].A00());
                                        }
                                        r74 = r102;
                                    }
                                } else if (z10 || z11) {
                                    if (z10 || z11) {
                                        f12 -= f2;
                                    }
                                    float f16 = f12 / ((float) (i19 + 1));
                                    if (z11) {
                                        float f17 = 2.0f;
                                        if (i19 > 1) {
                                            f17 = (float) (i19 - 1);
                                        }
                                        f16 = f12 / f17;
                                    }
                                    if (r74.A0T != 8) {
                                        f4 = f10 + f16;
                                    } else {
                                        f4 = f10;
                                    }
                                    if (z11 && i19 > 1) {
                                        f4 = ((float) r11.A0u[i3].A00()) + f10;
                                    }
                                    if (z10 && r11 != null) {
                                        f4 += (float) r11.A0u[i3].A00();
                                    }
                                    while (r74 != null) {
                                        AnonymousClass1ZU r93 = r74.A0w[i13];
                                        if (r93 != null || r74 == r6) {
                                            if (i13 == 0) {
                                                A01 = r74.A02();
                                            } else {
                                                A01 = r74.A01();
                                            }
                                            float f18 = (float) A01;
                                            if (r74 != r11) {
                                                f4 += (float) r74.A0u[i3].A00();
                                            }
                                            r74.A0u[i3].A05.A05(r46.A05, f4);
                                            r74.A0u[i21].A05.A05(r46.A05, f4 + f18);
                                            r74.A0u[i3].A05.A04(r35);
                                            r74.A0u[i21].A05.A04(r35);
                                            f4 += f18 + ((float) r74.A0u[i21].A00());
                                            if (!(r93 == null || r93.A0T == 8)) {
                                                f4 += f16;
                                            }
                                        }
                                        r74 = r93;
                                    }
                                }
                            } else {
                                AnonymousClass1ZU r09 = r13.A0h;
                                if (r09 == null || r09.A0x[i13] != num3) {
                                    float f19 = (f12 + f8) - f9;
                                    while (r74 != null) {
                                        AnonymousClass1ZU r132 = r74.A0w[i13];
                                        if (r132 != null || r74 == r6) {
                                            float f20 = f19 / ((float) i18);
                                            if (f7 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                                float f21 = r74.A0r[i13];
                                                if (f21 == -1.0f) {
                                                    f20 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                                } else {
                                                    f20 = (f21 * f19) / f7;
                                                }
                                            }
                                            if (r74.A0T == 8) {
                                                f20 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                                            }
                                            AnonymousClass1ZV r112 = r74.A0u[i3];
                                            float A005 = f10 + ((float) r112.A00());
                                            r112.A05.A05(r46.A05, A005);
                                            float f22 = A005 + f20;
                                            r74.A0u[i21].A05.A05(r46.A05, f22);
                                            r74.A0u[i3].A05.A04(r35);
                                            r74.A0u[i21].A05.A04(r35);
                                            f10 = f22 + ((float) r74.A0u[i21].A00());
                                        }
                                        r74 = r132;
                                    }
                                }
                            }
                            z5 = true;
                        }
                    }
                }
                z5 = false;
                if (z5) {
                }
            }
            AnonymousClass1ZY r75 = r35;
            AnonymousClass1ZU r62 = r54.A04;
            AnonymousClass1ZU r37 = r54.A08;
            AnonymousClass1ZU r010 = r54.A06;
            AnonymousClass1ZU r25 = r54.A0A;
            AnonymousClass1ZU r322 = r54.A07;
            float f23 = r54.A00;
            boolean z13 = false;
            if (r36.A0x[i13] == Constants.ONE) {
                z13 = true;
            }
            if (i13 == 0) {
                i4 = r322.A0C;
            } else {
                i4 = r322.A0R;
            }
            boolean z14 = false;
            if (i4 == 0) {
                z14 = true;
            }
            boolean z15 = false;
            if (i4 == 1) {
                z15 = true;
            }
            if (i4 == 2) {
                z = true;
            } else {
                z = false;
            }
            AnonymousClass1ZU r133 = r62;
            boolean z16 = false;
            while (true) {
                AnonymousClass1ZU r222 = null;
                if (z16) {
                    break;
                }
                AnonymousClass1ZV r143 = r133.A0u[i3];
                if (!z13) {
                    i8 = 4;
                }
                i8 = 1;
                int A006 = r143.A00();
                AnonymousClass1ZV r47 = r143.A04;
                if (!(r47 == null || r133 == r62)) {
                    A006 += r47.A00();
                }
                if (z && r133 != r62 && r133 != r010) {
                    i8 = 6;
                } else if (z14 && z13) {
                    i8 = 4;
                }
                if (r47 != null) {
                    if (r133 == r010) {
                        r75.A0G(r143.A03, r47.A03, A006, 5);
                    } else {
                        r75.A0G(r143.A03, r47.A03, A006, 6);
                    }
                    r75.A0F(r143.A03, r143.A04.A03, A006, i8);
                }
                if (z13) {
                    if (r133.A0T == 8 || r133.A0x[i13] != Constants.A0C) {
                        i9 = 0;
                    } else {
                        AnonymousClass1ZV[] r94 = r133.A0u;
                        i9 = 0;
                        r75.A0G(r94[i3 + 1].A03, r94[i3].A03, 0, 5);
                    }
                    r75.A0G(r133.A0u[i3].A03, r36.A0u[i3].A03, i9, 6);
                }
                AnonymousClass1ZV r48 = r133.A0u[i3 + 1].A04;
                if (r48 != null) {
                    AnonymousClass1ZU r95 = r48.A07;
                    AnonymousClass1ZV r49 = r95.A0u[i3].A04;
                    if (r49 != null && r49.A07 == r133) {
                        r222 = r95;
                    }
                }
                z16 = true;
                if (r222 != null) {
                    r133 = r222;
                    z16 = false;
                }
            }
            if (r25 != null) {
                int i22 = i3 + 1;
                AnonymousClass1ZV r96 = r37.A0u[i22].A04;
                if (r96 != null) {
                    AnonymousClass1ZV r410 = r25.A0u[i22];
                    r75.A0H(r410.A03, r96.A03, -r410.A00(), 5);
                }
            }
            if (z13) {
                int i23 = i3 + 1;
                AnonymousClass1ZZ r113 = r36.A0u[i23].A03;
                AnonymousClass1ZV r411 = r37.A0u[i23];
                r75.A0G(r113, r411.A03, r411.A00(), 6);
            }
            ArrayList arrayList = r54.A0B;
            if (arrayList != null && (size = arrayList.size()) > 1) {
                if (r54.A0F && !r54.A0D) {
                    f23 = (float) r54.A03;
                }
                float f24 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                AnonymousClass1ZU r15 = null;
                int i24 = 0;
                float f25 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                while (i24 < size) {
                    AnonymousClass1ZU r84 = (AnonymousClass1ZU) arrayList.get(i24);
                    float f26 = r84.A0r[i13];
                    if (f26 < f24) {
                        if (r54.A0D) {
                            AnonymousClass1ZV[] r412 = r84.A0u;
                            r75.A0F(r412[i3 + 1].A03, r412[i3].A03, 0, 4);
                            i24++;
                            f24 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        } else {
                            f26 = 1.0f;
                        }
                    }
                    if (f26 == f24) {
                        AnonymousClass1ZV[] r413 = r84.A0u;
                        r75.A0F(r413[i3 + 1].A03, r413[i3].A03, 0, 6);
                    } else {
                        if (r15 != null) {
                            AnonymousClass1ZV[] r144 = r15.A0u;
                            AnonymousClass1ZZ r134 = r144[i3].A03;
                            int i25 = i3 + 1;
                            AnonymousClass1ZZ r28 = r144[i25].A03;
                            AnonymousClass1ZV[] r145 = r84.A0u;
                            AnonymousClass1ZZ r31 = r145[i3].A03;
                            AnonymousClass1ZZ r30 = r145[i25].A03;
                            C31611Za A06 = r35.A06();
                            A06.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                            if (f23 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f25 == f26) {
                                A06.A03.A05(r134, 1.0f);
                                A06.A03.A05(r28, -1.0f);
                                A06.A03.A05(r30, 1.0f);
                                r27 = A06.A03;
                                r28 = r31;
                            } else if (f25 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                A06.A03.A05(r134, 1.0f);
                                r27 = A06.A03;
                            } else if (f26 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                                A06.A03.A05(r31, 1.0f);
                                r27 = A06.A03;
                                r28 = r30;
                            } else {
                                float f27 = (f25 / f23) / (f26 / f23);
                                A06.A03.A05(r134, 1.0f);
                                A06.A03.A05(r28, -1.0f);
                                A06.A03.A05(r30, f27);
                                A06.A03.A05(r31, -f27);
                                r75.A0B(A06);
                            }
                            r27.A05(r28, -1.0f);
                            r75.A0B(A06);
                        }
                        f25 = f26;
                        r15 = r84;
                    }
                    i24++;
                    f24 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
            }
            if (r010 != null && (r010 == r25 || z)) {
                AnonymousClass1ZV r55 = r62.A0u[i3];
                int i26 = i3 + 1;
                AnonymousClass1ZV r97 = r37.A0u[i26];
                AnonymousClass1ZV r414 = r55.A04;
                if (r414 != null) {
                    r83 = r414.A03;
                } else {
                    r83 = null;
                }
                AnonymousClass1ZV r415 = r97.A04;
                if (r415 != null) {
                    r72 = r415.A03;
                } else {
                    r72 = null;
                }
                if (r010 == r25) {
                    AnonymousClass1ZV[] r416 = r010.A0u;
                    r55 = r416[i3];
                    r97 = r416[i26];
                }
                if (!(r83 == null || r72 == null)) {
                    if (i13 == 0) {
                        f = r322.A02;
                    } else {
                        f = r322.A06;
                    }
                    r35.A0E(r55.A03, r83, r55.A00(), f, r72, r97.A03, r97.A00(), 5);
                }
            } else if (!z14 || r010 == null) {
                int i27 = 8;
                if (z15 && r010 != null) {
                    int i28 = r54.A03;
                    if (i28 > 0) {
                        z2 = true;
                    }
                    z2 = false;
                    AnonymousClass1ZU r114 = r010;
                    AnonymousClass1ZU r135 = r010;
                    while (r114 != null) {
                        AnonymousClass1ZU[] r417 = r114.A0w;
                        while (true) {
                            r10 = r417[i13];
                            if (r10 != null && r10.A0T == i27) {
                                r417 = r10.A0w;
                            } else if (!(r114 == r010 || r114 == r25 || r10 == null)) {
                                if (r10 == r25) {
                                    r10 = null;
                                }
                                AnonymousClass1ZV[] r56 = r114.A0u;
                                AnonymousClass1ZV r85 = r56[i3];
                                r12 = r85.A03;
                                int i29 = i3 + 1;
                                AnonymousClass1ZV r146 = r135.A0u[i29];
                                r9 = r146.A03;
                                int A007 = r85.A00();
                                AnonymousClass1ZV r57 = r56[i29];
                                A00 = r57.A00();
                                if (r10 == null) {
                                    r4 = r10.A0u[i3];
                                    r8 = r4.A03;
                                    r57 = r4.A04;
                                    if (r57 == null) {
                                        r5 = null;
                                    }
                                    r5 = r57.A03;
                                } else {
                                    r4 = r57.A04;
                                    if (r4 != null) {
                                        r8 = r4.A03;
                                    } else {
                                        r8 = null;
                                    }
                                    r5 = r57.A03;
                                }
                                if (r4 != null) {
                                    A00 += r4.A00();
                                }
                                int A008 = r146.A00() + A007;
                                i7 = 4;
                                if (z2) {
                                    i7 = 6;
                                }
                                if (!(r12 == null || r9 == null || r8 == null || r5 == null)) {
                                    i6 = 8;
                                    r75.A0E(r12, r9, A008, 0.5f, r8, r5, A00, i7);
                                    if (r114.A0T != i6) {
                                        r114 = r135;
                                    }
                                    r135 = r114;
                                    i27 = 8;
                                    r114 = r10;
                                }
                            }
                        }
                        if (r10 == r25) {
                        }
                        AnonymousClass1ZV[] r562 = r114.A0u;
                        AnonymousClass1ZV r852 = r562[i3];
                        r12 = r852.A03;
                        int i292 = i3 + 1;
                        AnonymousClass1ZV r1462 = r135.A0u[i292];
                        r9 = r1462.A03;
                        int A0072 = r852.A00();
                        AnonymousClass1ZV r572 = r562[i292];
                        A00 = r572.A00();
                        if (r10 == null) {
                        }
                        if (r4 != null) {
                        }
                        int A0082 = r1462.A00() + A0072;
                        i7 = 4;
                        if (z2) {
                        }
                        i6 = 8;
                        r75.A0E(r12, r9, A0082, 0.5f, r8, r5, A00, i7);
                        if (r114.A0T != i6) {
                        }
                        r135 = r114;
                        i27 = 8;
                        r114 = r10;
                    }
                    AnonymousClass1ZV r123 = r010.A0u[i3];
                    AnonymousClass1ZV r136 = r62.A0u[i3].A04;
                    int i30 = i3 + 1;
                    AnonymousClass1ZV r115 = r25.A0u[i30];
                    AnonymousClass1ZV r103 = r37.A0u[i30].A04;
                    if (r136 == null) {
                        i5 = 5;
                    } else if (r010 != r25) {
                        i5 = 5;
                        r75.A0F(r123.A03, r136.A03, r123.A00(), 5);
                    } else {
                        i5 = 5;
                        if (r103 != null) {
                            r75.A0E(r123.A03, r136.A03, r123.A00(), 0.5f, r115.A03, r103.A03, r115.A00(), 5);
                        }
                    }
                    if (!(r103 == null || r010 == r25)) {
                        r75.A0F(r115.A03, r103.A03, -r115.A00(), i5);
                    }
                }
            } else {
                int i31 = r54.A03;
                if (i31 > 0) {
                    z3 = true;
                }
                z3 = false;
                AnonymousClass1ZU r116 = r010;
                AnonymousClass1ZU r104 = r010;
                while (r116 != null) {
                    AnonymousClass1ZU[] r418 = r116.A0w;
                    while (true) {
                        r92 = r418[i13];
                        if (r92 != null && r92.A0T == 8) {
                            r418 = r92.A0w;
                        } else if (r92 != null || r116 == r25) {
                            AnonymousClass1ZV[] r58 = r116.A0u;
                            AnonymousClass1ZV r124 = r58[i3];
                            r82 = r124.A03;
                            r42 = r124.A04;
                            if (r42 == null) {
                                r7 = r42.A03;
                            } else {
                                r7 = null;
                            }
                            if (r104 == r116) {
                                r7 = r104.A0u[i3 + 1].A03;
                            } else if (r116 == r010 && r104 == r116) {
                                AnonymousClass1ZV r419 = r62.A0u[i3].A04;
                                if (r419 != null) {
                                    r7 = r419.A03;
                                } else {
                                    r7 = null;
                                }
                            }
                            A002 = r124.A00();
                            int i32 = i3 + 1;
                            AnonymousClass1ZV r420 = r58[i32];
                            A003 = r420.A00();
                            if (r92 == null) {
                                r122 = r92.A0u[i3];
                                r52 = r122.A03;
                            } else {
                                r122 = r37.A0u[i32].A04;
                                if (r122 != null) {
                                    r52 = r122.A03;
                                } else {
                                    r52 = null;
                                }
                            }
                            r43 = r420.A03;
                            if (r122 != null) {
                                A003 += r122.A00();
                            }
                            if (r104 != null) {
                                A002 += r104.A0u[i32].A00();
                            }
                            if (!(r82 == null || r7 == null || r52 == null || r43 == null)) {
                                if (r116 == r010) {
                                    A002 = r010.A0u[i3].A00();
                                }
                                if (r116 == r25) {
                                    A003 = r25.A0u[i32].A00();
                                }
                                int i33 = 4;
                                if (z3) {
                                    i33 = 6;
                                }
                                r35.A0E(r82, r7, A002, 0.5f, r52, r43, A003, i33);
                            }
                        }
                    }
                    AnonymousClass1ZV[] r582 = r116.A0u;
                    AnonymousClass1ZV r1242 = r582[i3];
                    r82 = r1242.A03;
                    r42 = r1242.A04;
                    if (r42 == null) {
                    }
                    if (r104 == r116) {
                    }
                    A002 = r1242.A00();
                    int i322 = i3 + 1;
                    AnonymousClass1ZV r4202 = r582[i322];
                    A003 = r4202.A00();
                    if (r92 == null) {
                    }
                    r43 = r4202.A03;
                    if (r122 != null) {
                    }
                    if (r104 != null) {
                    }
                    if (r116 == r010) {
                    }
                    if (r116 == r25) {
                    }
                    int i332 = 4;
                    if (z3) {
                    }
                    r35.A0E(r82, r7, A002, 0.5f, r52, r43, A003, i332);
                    if (r116.A0T != 8) {
                        r104 = r116;
                    }
                    r116 = r92;
                }
            }
            if ((z14 || z15) && r010 != null) {
                AnonymousClass1ZV[] r98 = r010.A0u;
                AnonymousClass1ZV r76 = r98[i3];
                int i34 = i3 + 1;
                AnonymousClass1ZV r63 = r25.A0u[i34];
                AnonymousClass1ZV r117 = r63;
                AnonymousClass1ZV r421 = r76.A04;
                if (r421 != null) {
                    r53 = r421.A03;
                } else {
                    r53 = null;
                }
                AnonymousClass1ZV r422 = r63.A04;
                if (r422 != null) {
                    r44 = r422.A03;
                } else {
                    r44 = null;
                }
                if (r37 != r25) {
                    AnonymousClass1ZV r38 = r37.A0u[i34].A04;
                    if (r38 != null) {
                        r44 = r38.A03;
                    } else {
                        r44 = null;
                    }
                }
                if (r010 == r25) {
                    r63 = r98[i34];
                }
                if (!(r53 == null || r44 == null)) {
                    r35.A0E(r76.A03, r53, r76.A00(), 0.5f, r44, r63.A03, r117.A00(), 5);
                }
            }
        }
    }
}
