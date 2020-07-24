package p000X;

/* renamed from: X.DLA */
public abstract class DLA {
    public static DLA A00 = new DL5();

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    public C29885DEu A00(C29885DEu dEu, int i, int i2, DL6 dl6) {
        int i3 = i;
        if (i > 0) {
            int i4 = i2;
            if (i2 > 0) {
                C29885DEu dEu2 = new C29885DEu(i3, i4);
                int i5 = i << 1;
                float[] fArr = new float[i5];
                loop0:
                for (int i6 = 0; i6 < i4; i6++) {
                    float f = ((float) i6) + 0.5f;
                    for (int i7 = 0; i7 < i5; i7 += 2) {
                        fArr[i7] = ((float) (i7 >> 1)) + 0.5f;
                        fArr[i7 + 1] = f;
                    }
                    DL6 dl62 = dl6;
                    float f2 = dl62.A00;
                    float f3 = dl62.A01;
                    float f4 = dl62.A02;
                    float f5 = dl62.A03;
                    float f6 = dl62.A04;
                    float f7 = dl62.A05;
                    float f8 = dl62.A06;
                    float f9 = dl62.A07;
                    float f10 = dl62.A08;
                    int i8 = i5 - 1;
                    for (int i9 = 0; i9 < i8; i9 += 2) {
                        float f11 = fArr[i9];
                        int i10 = i9 + 1;
                        float f12 = fArr[i10];
                        float f13 = (f4 * f11) + (f7 * f12) + f10;
                        fArr[i9] = (((f2 * f11) + (f5 * f12)) + f8) / f13;
                        fArr[i10] = (((f11 * f3) + (f12 * f6)) + f9) / f13;
                    }
                    C29885DEu dEu3 = dEu;
                    int i11 = dEu3.A02;
                    int i12 = dEu3.A00;
                    int i13 = i5 - 1;
                    int i14 = 0;
                    boolean z = true;
                    while (true) {
                        if (i14 < i13 && z) {
                            int i15 = (int) fArr[i14];
                            int i16 = i14 + 1;
                            int i17 = (int) fArr[i16];
                            if (i15 < -1 || i15 > i11 || i17 < -1 || i17 > i12) {
                                break loop0;
                            }
                            if (i15 == -1) {
                                fArr[i14] = 0.0f;
                            } else {
                                z = false;
                                if (i15 == i11) {
                                    fArr[i14] = (float) (i11 - 1);
                                }
                                if (i17 != -1) {
                                    fArr[i16] = 0.0f;
                                } else if (i17 == i12) {
                                    fArr[i16] = (float) (i12 - 1);
                                } else {
                                    i14 += 2;
                                }
                                z = true;
                                i14 += 2;
                            }
                            z = true;
                            if (i17 != -1) {
                            }
                            z = true;
                            i14 += 2;
                        } else {
                            int i18 = i5 - 2;
                            boolean z2 = true;
                        }
                    }
                    int i182 = i5 - 2;
                    boolean z22 = true;
                    while (i182 >= 0 && z22) {
                        int i19 = (int) fArr[i182];
                        int i20 = i182 + 1;
                        int i21 = (int) fArr[i20];
                        if (i19 >= -1 && i19 <= i11 && i21 >= -1 && i21 <= i12) {
                            if (i19 == -1) {
                                fArr[i182] = 0.0f;
                            } else {
                                z22 = false;
                                if (i19 == i11) {
                                    fArr[i182] = (float) (i11 - 1);
                                }
                                if (i21 != -1) {
                                    fArr[i20] = 0.0f;
                                } else if (i21 == i12) {
                                    fArr[i20] = (float) (i12 - 1);
                                } else {
                                    i182 -= 2;
                                }
                                z22 = true;
                                i182 -= 2;
                            }
                            z22 = true;
                            if (i21 != -1) {
                            }
                            z22 = true;
                            i182 -= 2;
                        }
                    }
                    int i22 = 0;
                    while (i22 < i5) {
                        try {
                            if (dEu3.A03((int) fArr[i22], (int) fArr[i22 + 1])) {
                                dEu2.A01(i22 / 2, i6);
                            }
                            i22 += 2;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw DFG.A00;
                        }
                    }
                }
                return dEu2;
            }
        }
        throw DFG.A00;
    }
}
