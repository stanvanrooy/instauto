package p000X;

import java.util.Arrays;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.DIR */
public final class DIR {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(DIR dir, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = dir.A0G;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) >> 1) + i2) * i3);
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 255;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i6 < i5 * i2) {
                i6 = i2;
                i5 = i9;
            }
            if (i9 * i8 > i7 * i2) {
                i8 = i2;
                i7 = i9;
            }
            i2++;
        }
        this.A02 = i5 / i6;
        this.A01 = i7 / i8;
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        if ((r12 << 1) > (r6.A07 * 3)) goto L_0x0141;
     */
    public static void A01(DIR dir) {
        int i;
        int i2;
        int A002;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        DIR dir2 = dir;
        int i10 = dir2.A05;
        float f = dir2.A0F;
        float f2 = dir2.A0D;
        float f3 = f / f2;
        float f4 = dir2.A0E * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = dir2.A00;
            if (i11 >= dir2.A0J) {
                int i12 = 0;
                do {
                    int i13 = dir2.A09;
                    if (i13 > 0) {
                        i5 = Math.min(dir2.A0J, i13);
                        dir2.A02(dir2.A0A, i12, i5);
                        dir2.A09 -= i5;
                    } else {
                        short[] sArr = dir2.A0A;
                        int i14 = dir2.A0H;
                        if (i14 > 4000) {
                            i = i14 / CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
                        } else {
                            i = 1;
                        }
                        int i15 = dir2.A0G;
                        if (i15 == 1 && i == 1) {
                            i2 = dir2.A0K;
                            i3 = dir2.A0I;
                        } else {
                            dir2.A03(sArr, i12, i);
                            short[] sArr2 = dir2.A0L;
                            i2 = dir2.A0K;
                            int i16 = dir2.A0I;
                            A002 = dir2.A00(sArr2, 0, i2 / i, i16 / i);
                            if (i != 1) {
                                int i17 = A002 * i;
                                int i18 = i << 2;
                                int i19 = i17 - i18;
                                i3 = i17 + i18;
                                if (i19 >= i2) {
                                    i2 = i19;
                                }
                                if (i3 > i16) {
                                    i3 = i16;
                                }
                                if (i15 != 1) {
                                    dir2.A03(sArr, i12, 1);
                                    A002 = dir2.A00(sArr2, 0, i2, i3);
                                }
                            }
                            int i20 = dir2.A02;
                            int i21 = dir2.A01;
                            if (!(i20 == 0 || dir2.A08 == 0 || i21 > i20 * 3)) {
                                z = true;
                            }
                            z = false;
                            if (z) {
                                i4 = dir2.A08;
                            } else {
                                i4 = A002;
                            }
                            dir2.A07 = i20;
                            dir2.A08 = A002;
                            if (((double) f3) > 1.0d) {
                                int i22 = i4;
                                if (f3 >= 2.0f) {
                                    i22 = (int) (((float) i4) / (f3 - 1.0f));
                                } else {
                                    dir2.A09 = (int) ((((float) i4) * (2.0f - f3)) / (f3 - 1.0f));
                                }
                                short[] A042 = A04(dir2, dir2.A0B, dir2.A05, i22);
                                dir2.A0B = A042;
                                int i23 = dir2.A0G;
                                int i24 = dir2.A05;
                                int i25 = i12 + i4;
                                for (int i26 = 0; i26 < i23; i26++) {
                                    int i27 = (i24 * i23) + i26;
                                    int i28 = (i25 * i23) + i26;
                                    int i29 = (i12 * i23) + i26;
                                    for (int i30 = 0; i30 < i22; i30++) {
                                        A042[i27] = (short) (((sArr[i29] * (i22 - i30)) + (sArr[i28] * i30)) / i22);
                                        i27 += i23;
                                        i29 += i23;
                                        i28 += i23;
                                    }
                                }
                                dir2.A05 = i24 + i22;
                                i5 = i4 + i22;
                            } else {
                                int i31 = i4;
                                if (f3 < 0.5f) {
                                    i31 = (int) ((((float) i4) * f3) / (1.0f - f3));
                                } else {
                                    dir2.A09 = (int) ((((float) i4) * ((2.0f * f3) - 1.0f)) / (1.0f - f3));
                                }
                                int i32 = i4 + i31;
                                short[] A043 = A04(dir2, dir2.A0B, dir2.A05, i32);
                                dir2.A0B = A043;
                                int i33 = dir2.A0G;
                                System.arraycopy(sArr, i12 * i33, A043, dir2.A05 * i33, i33 * i4);
                                int i34 = dir2.A0G;
                                short[] sArr3 = dir2.A0B;
                                int i35 = dir2.A05;
                                int i36 = i35 + i4;
                                int i37 = i12 + i4;
                                for (int i38 = 0; i38 < i34; i38++) {
                                    int i39 = (i36 * i34) + i38;
                                    int i40 = (i12 * i34) + i38;
                                    int i41 = (i37 * i34) + i38;
                                    for (int i42 = 0; i42 < i31; i42++) {
                                        sArr3[i39] = (short) (((sArr[i41] * (i31 - i42)) + (sArr[i40] * i42)) / i31);
                                        i39 += i34;
                                        i41 += i34;
                                        i40 += i34;
                                    }
                                }
                                dir2.A05 = i35 + i32;
                                i5 = i31;
                            }
                        }
                        A002 = dir2.A00(sArr, i12, i2, i3);
                        int i202 = dir2.A02;
                        int i212 = dir2.A01;
                        z = true;
                    }
                    i12 += i5;
                } while (dir2.A0J + i12 <= i11);
                int i43 = dir2.A00 - i12;
                short[] sArr4 = dir2.A0A;
                int i44 = dir2.A0G;
                System.arraycopy(sArr4, i12 * i44, sArr4, 0, i44 * i43);
                dir2.A00 = i43;
            }
        } else {
            dir2.A02(dir2.A0A, 0, dir2.A00);
            dir2.A00 = 0;
        }
        if (f4 != 1.0f && (i6 = dir2.A05) != i10) {
            int i45 = dir2.A0H;
            int i46 = (int) (((float) i45) / f4);
            while (true) {
                if (i46 <= 16384 && i45 <= 16384) {
                    break;
                }
                i46 >>= 1;
                i45 >>= 1;
            }
            int i47 = i6 - i10;
            short[] A044 = A04(dir2, dir2.A0C, dir2.A06, i47);
            dir2.A0C = A044;
            short[] sArr5 = dir2.A0B;
            int i48 = dir2.A0G;
            System.arraycopy(sArr5, i10 * i48, A044, dir2.A06 * i48, i48 * i47);
            dir2.A05 = i10;
            dir2.A06 += i47;
            int i49 = 0;
            while (true) {
                i7 = dir2.A06;
                boolean z2 = true;
                if (i49 >= i7 - 1) {
                    break;
                }
                while (true) {
                    i8 = dir2.A04 + 1;
                    int i50 = i8 * i46;
                    i9 = dir2.A03;
                    if (i50 <= i9 * i45) {
                        break;
                    }
                    short[] A045 = A04(dir2, dir2.A0B, dir2.A05, 1);
                    dir2.A0B = A045;
                    int i51 = 0;
                    while (true) {
                        int i52 = dir2.A0G;
                        if (i51 >= i52) {
                            break;
                        }
                        short[] sArr6 = dir2.A0C;
                        int i53 = (i52 * i49) + i51;
                        short s = sArr6[i53];
                        short s2 = sArr6[i53 + i52];
                        int i54 = dir2.A04;
                        int i55 = i54 * i46;
                        int i56 = (i54 + 1) * i46;
                        int i57 = i56 - (dir2.A03 * i45);
                        int i58 = i56 - i55;
                        A045[(dir2.A05 * i52) + i51] = (short) (((s * i57) + ((i58 - i57) * s2)) / i58);
                        i51++;
                    }
                    dir2.A03++;
                    dir2.A05++;
                }
                dir2.A04 = i8;
                if (i8 == i45) {
                    dir2.A04 = 0;
                    if (i9 != i46) {
                        z2 = false;
                    }
                    D6U.A03(z2);
                    dir2.A03 = 0;
                }
                i49++;
            }
            int i59 = i7 - 1;
            if (i59 != 0) {
                short[] sArr7 = dir2.A0C;
                int i60 = dir2.A0G;
                System.arraycopy(sArr7, i59 * i60, sArr7, 0, (i7 - i59) * i60);
                dir2.A06 -= i59;
            }
        }
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] A042 = A04(this, this.A0B, this.A05, i2);
        this.A0B = A042;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, A042, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public DIR(int i, int i2, float f, float f2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = ((float) i) / ((float) i3);
        this.A0K = i / ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 << 1;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }
}
