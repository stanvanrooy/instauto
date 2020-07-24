package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Arrays;

/* renamed from: X.1Zg  reason: invalid class name and case insensitive filesystem */
public final class C31661Zg {
    public int A00 = 0;
    public int A01 = -1;
    public float[] A02 = new float[8];
    public int[] A03 = new int[8];
    public int[] A04 = new int[8];
    public int A05 = 8;
    public int A06 = -1;
    public boolean A07 = false;
    public final C31611Za A08;
    public final C31631Zc A09;

    public final void A05(AnonymousClass1ZZ r10, float f) {
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            A01(r10, true);
            return;
        }
        int i = this.A01;
        if (i == -1) {
            this.A01 = 0;
            this.A02[0] = f;
            this.A03[0] = r10.A04;
            this.A04[0] = -1;
            r10.A06++;
            r10.A01(this.A08);
            this.A00++;
            if (!this.A07) {
                int i2 = this.A06 + 1;
                this.A06 = i2;
                int length = this.A03.length;
                if (i2 >= length) {
                    this.A07 = true;
                    this.A06 = length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.A00) {
            int i5 = this.A03[i];
            int i6 = r10.A04;
            if (i5 == i6) {
                this.A02[i] = f;
                return;
            }
            if (i5 < i6) {
                i4 = i;
            }
            i = this.A04[i];
            i3++;
        }
        int i7 = this.A06;
        int i8 = i7 + 1;
        if (this.A07) {
            int[] iArr = this.A03;
            if (iArr[i7] != -1) {
                i7 = iArr.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr2 = this.A03;
        int length2 = iArr2.length;
        if (i7 >= length2 && this.A00 < length2) {
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    break;
                } else if (iArr2[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        if (i7 >= length2) {
            i7 = length2;
            int i10 = this.A05 << 1;
            this.A05 = i10;
            this.A07 = false;
            this.A06 = length2 - 1;
            this.A02 = Arrays.copyOf(this.A02, i10);
            this.A03 = Arrays.copyOf(this.A03, this.A05);
            this.A04 = Arrays.copyOf(this.A04, this.A05);
        }
        this.A03[i7] = r10.A04;
        this.A02[i7] = f;
        if (i4 != -1) {
            int[] iArr3 = this.A04;
            iArr3[i7] = iArr3[i4];
            iArr3[i4] = i7;
        } else {
            this.A04[i7] = this.A01;
            this.A01 = i7;
        }
        r10.A06++;
        r10.A01(this.A08);
        int i11 = this.A00 + 1;
        this.A00 = i11;
        if (!this.A07) {
            this.A06++;
        }
        int length3 = this.A03.length;
        if (i11 >= length3) {
            this.A07 = true;
        }
        if (this.A06 >= length3) {
            this.A07 = true;
            this.A06 = length3 - 1;
        }
    }

    public final void A06(AnonymousClass1ZZ r12, float f, boolean z) {
        int i;
        if (f != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            int i2 = this.A01;
            int i3 = i2;
            if (i2 == -1) {
                this.A01 = 0;
                this.A02[0] = f;
                this.A03[0] = r12.A04;
                this.A04[0] = -1;
                r12.A06++;
                r12.A01(this.A08);
                this.A00++;
                if (!this.A07) {
                    i = this.A06 + 1;
                    this.A06 = i;
                } else {
                    return;
                }
            } else {
                int i4 = 0;
                int i5 = -1;
                while (i2 != -1) {
                    int i6 = this.A00;
                    if (i4 >= i6) {
                        break;
                    }
                    int i7 = this.A03[i2];
                    int i8 = r12.A04;
                    if (i7 == i8) {
                        float[] fArr = this.A02;
                        float f2 = fArr[i2] + f;
                        fArr[i2] = f2;
                        if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            if (i2 == i3) {
                                this.A01 = this.A04[i2];
                            } else {
                                int[] iArr = this.A04;
                                iArr[i5] = iArr[i2];
                            }
                            if (z) {
                                r12.A02(this.A08);
                            }
                            if (this.A07) {
                                this.A06 = i2;
                            }
                            r12.A06--;
                            this.A00 = i6 - 1;
                            return;
                        }
                        return;
                    }
                    if (i7 < i8) {
                        i5 = i2;
                    }
                    i2 = this.A04[i2];
                    i4++;
                }
                int i9 = this.A06;
                int i10 = i9 + 1;
                if (this.A07) {
                    int[] iArr2 = this.A03;
                    if (iArr2[i9] != -1) {
                        i9 = iArr2.length;
                    }
                } else {
                    i9 = i10;
                }
                int[] iArr3 = this.A03;
                int length = iArr3.length;
                if (i9 >= length && this.A00 < length) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            break;
                        } else if (iArr3[i11] == -1) {
                            i9 = i11;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (i9 >= length) {
                    i9 = length;
                    int i12 = this.A05 << 1;
                    this.A05 = i12;
                    this.A07 = false;
                    this.A06 = length - 1;
                    this.A02 = Arrays.copyOf(this.A02, i12);
                    this.A03 = Arrays.copyOf(this.A03, this.A05);
                    this.A04 = Arrays.copyOf(this.A04, this.A05);
                }
                this.A03[i9] = r12.A04;
                this.A02[i9] = f;
                if (i5 != -1) {
                    int[] iArr4 = this.A04;
                    iArr4[i9] = iArr4[i5];
                    iArr4[i5] = i9;
                } else {
                    this.A04[i9] = this.A01;
                    this.A01 = i9;
                }
                r12.A06++;
                r12.A01(this.A08);
                this.A00++;
                if (!this.A07) {
                    this.A06++;
                }
                i = this.A06;
            }
            int length2 = this.A03.length;
            if (i >= length2) {
                this.A07 = true;
                this.A06 = length2 - 1;
            }
        }
    }

    public final float A00(AnonymousClass1ZZ r5) {
        int i = this.A01;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            if (this.A03[i] == r5.A04) {
                return this.A02[i];
            }
            i = this.A04[i];
            i2++;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float A01(AnonymousClass1ZZ r11, boolean z) {
        int i = this.A01;
        int i2 = i;
        if (i != -1) {
            int i3 = 0;
            int i4 = -1;
            while (i != -1) {
                int i5 = this.A00;
                if (i3 >= i5) {
                    break;
                }
                int[] iArr = this.A03;
                if (iArr[i] == r11.A04) {
                    if (i == i2) {
                        this.A01 = this.A04[i];
                    } else {
                        int[] iArr2 = this.A04;
                        iArr2[i4] = iArr2[i];
                    }
                    if (z) {
                        r11.A02(this.A08);
                    }
                    r11.A06--;
                    this.A00 = i5 - 1;
                    iArr[i] = -1;
                    if (this.A07) {
                        this.A06 = i;
                    }
                    return this.A02[i];
                }
                i3++;
                i4 = i;
                i = this.A04[i];
            }
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final AnonymousClass1ZZ A02(int i) {
        int i2 = this.A01;
        int i3 = 0;
        while (i2 != -1 && i3 < this.A00) {
            if (i3 == i) {
                return this.A09.A02[this.A03[i2]];
            }
            i2 = this.A04[i2];
            i3++;
        }
        return null;
    }

    public final AnonymousClass1ZZ A03(boolean[] zArr, AnonymousClass1ZZ r11) {
        Integer num;
        int i = this.A01;
        int i2 = 0;
        AnonymousClass1ZZ r7 = null;
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        while (i != -1 && i2 < this.A00) {
            float f2 = this.A02[i];
            if (f2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                AnonymousClass1ZZ r2 = this.A09.A02[this.A03[i]];
                if ((zArr == null || !zArr[r2.A04]) && r2 != r11 && (((num = r2.A07) == Constants.A0C || num == Constants.A0N) && f2 < f)) {
                    r7 = r2;
                    f = f2;
                }
            }
            i = this.A04[i];
            i2++;
        }
        return r7;
    }

    public final void A04() {
        int i = this.A01;
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            AnonymousClass1ZZ r1 = this.A09.A02[this.A03[i]];
            if (r1 != null) {
                r1.A02(this.A08);
            }
            i = this.A04[i];
            i2++;
        }
        this.A01 = -1;
        this.A06 = -1;
        this.A07 = false;
        this.A00 = 0;
    }

    public final String toString() {
        int i = this.A01;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.A00) {
            str = (AnonymousClass000.A0E(str, " -> ") + this.A02[i] + " : ") + this.A09.A02[this.A03[i]];
            i = this.A04[i];
            i2++;
        }
        return str;
    }

    public C31661Zg(C31611Za r4, C31631Zc r5) {
        this.A08 = r4;
        this.A09 = r5;
    }
}
