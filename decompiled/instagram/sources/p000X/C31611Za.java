package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1Za  reason: invalid class name and case insensitive filesystem */
public class C31611Za implements C31621Zb {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public AnonymousClass1ZZ A01 = null;
    public boolean A02 = false;
    public final C31661Zg A03;

    public final void A01(AnonymousClass1ZZ r5, AnonymousClass1ZZ r6, AnonymousClass1ZZ r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        if (!z) {
            this.A03.A05(r5, -1.0f);
            this.A03.A05(r6, 1.0f);
            this.A03.A05(r7, 1.0f);
            return;
        }
        this.A03.A05(r5, 1.0f);
        this.A03.A05(r6, -1.0f);
        this.A03.A05(r7, -1.0f);
    }

    public final void A02(AnonymousClass1ZZ r5, AnonymousClass1ZZ r6, AnonymousClass1ZZ r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        if (!z) {
            this.A03.A05(r5, -1.0f);
            this.A03.A05(r6, 1.0f);
            this.A03.A05(r7, -1.0f);
            return;
        }
        this.A03.A05(r5, 1.0f);
        this.A03.A05(r6, -1.0f);
        this.A03.A05(r7, 1.0f);
    }

    public final void A00(AnonymousClass1ZZ r7) {
        AnonymousClass1ZZ r2 = this.A01;
        if (r2 != null) {
            this.A03.A05(r2, -1.0f);
            this.A01 = null;
        }
        C31661Zg r5 = this.A03;
        float A012 = r5.A01(r7, true) * -1.0f;
        this.A01 = r7;
        if (A012 != 1.0f) {
            this.A00 /= A012;
            int i = r5.A01;
            int i2 = 0;
            while (i != -1 && i2 < r5.A00) {
                float[] fArr = r5.A02;
                fArr[i] = fArr[i] / A012;
                i = r5.A04[i];
                i2++;
            }
        }
    }

    public void A2x(AnonymousClass1ZZ r4) {
        int i = r4.A05;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.A03.A05(r4, f);
    }

    public final AnonymousClass1ZZ AON() {
        return this.A01;
    }

    public final AnonymousClass1ZZ AS5(AnonymousClass1ZY r3, boolean[] zArr) {
        return this.A03.A03(zArr, (AnonymousClass1ZZ) null);
    }

    public final void AdQ(C31621Zb r8) {
        float f;
        if (r8 instanceof C31611Za) {
            C31611Za r82 = (C31611Za) r8;
            this.A01 = null;
            this.A03.A04();
            int i = 0;
            while (true) {
                C31661Zg r5 = r82.A03;
                int i2 = r5.A00;
                if (i < i2) {
                    AnonymousClass1ZZ A022 = r5.A02(i);
                    int i3 = r5.A01;
                    int i4 = 0;
                    while (true) {
                        if (i3 == -1 || i4 >= i2) {
                            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                        } else if (i4 == i) {
                            f = r5.A02[i3];
                            break;
                        } else {
                            i3 = r5.A04[i3];
                            i4++;
                        }
                    }
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    this.A03.A06(A022, f, true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void clear() {
        this.A03.A04();
        this.A01 = null;
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    public final String toString() {
        StringBuilder sb;
        boolean z;
        float f;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        AnonymousClass1ZZ r2 = this.A01;
        if (r2 == null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append("0");
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(r2);
        }
        String A0E = AnonymousClass000.A0E(sb.toString(), " = ");
        float f2 = this.A00;
        if (f2 != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A0E = AnonymousClass000.A04(A0E, f2);
            z = true;
        } else {
            z = false;
        }
        int i = this.A03.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C31661Zg r7 = this.A03;
            AnonymousClass1ZZ A022 = r7.A02(i2);
            if (A022 != null) {
                int i3 = r7.A01;
                int i4 = 0;
                while (true) {
                    if (i3 == -1 || i4 >= r7.A00) {
                        f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    } else if (i4 == i2) {
                        f = r7.A02[i3];
                        break;
                    } else {
                        i3 = r7.A04[i3];
                        i4++;
                    }
                }
                f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    String r3 = A022.toString();
                    if (!z) {
                        if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            sb2 = new StringBuilder();
                            sb2.append(A0E);
                            str = "- ";
                        }
                        if (f == 1.0f) {
                            sb3 = new StringBuilder();
                        } else {
                            sb3 = new StringBuilder();
                            sb3.append(A0E);
                            sb3.append(f);
                            A0E = " ";
                        }
                        sb3.append(A0E);
                        sb3.append(r3);
                        A0E = sb3.toString();
                        z = true;
                    } else if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                        A0E = AnonymousClass000.A0E(A0E, " + ");
                        if (f == 1.0f) {
                        }
                        sb3.append(A0E);
                        sb3.append(r3);
                        A0E = sb3.toString();
                        z = true;
                    } else {
                        sb2 = new StringBuilder();
                        sb2.append(A0E);
                        str = " - ";
                    }
                    sb2.append(str);
                    A0E = sb2.toString();
                    f *= -1.0f;
                    if (f == 1.0f) {
                    }
                    sb3.append(A0E);
                    sb3.append(r3);
                    A0E = sb3.toString();
                    z = true;
                }
            }
        }
        if (!z) {
            return AnonymousClass000.A0E(A0E, "0.0");
        }
        return A0E;
    }

    public C31611Za(C31631Zc r2) {
        this.A03 = new C31661Zg(this, r2);
    }
}
