package p000X;

import com.instagram.realtimeclient.RealtimeSubscription;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.0id  reason: invalid class name and case insensitive filesystem */
public final class C13500id {
    public static final byte[] A00;
    public static final char[] A01;
    public static final char[] A02;
    public static final String[] A03 = {"0", RealtimeSubscription.GRAPHQL_MQTT_VERSION, "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static final String[] A04 = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r6 != 0) goto L_0x0023;
     */
    static {
        char c;
        char[] cArr = new char[CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS];
        A02 = cArr;
        char[] cArr2 = new char[CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS];
        A01 = cArr2;
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            char c2 = (char) (i2 + 48);
            char c3 = c2;
            if (i2 == 0) {
                c3 = 0;
            }
            int i3 = 0;
            while (i3 < 10) {
                char c4 = (char) (i3 + 48);
                if (i2 == 0) {
                    c = 0;
                }
                c = c4;
                for (int i4 = 0; i4 < 10; i4++) {
                    char c5 = (char) (i4 + 48);
                    cArr[i] = c3;
                    int i5 = i + 1;
                    cArr[i5] = c;
                    int i6 = i + 2;
                    cArr[i6] = c5;
                    cArr2[i] = c2;
                    cArr2[i5] = c4;
                    cArr2[i6] = c5;
                    i += 4;
                }
                i3++;
            }
        }
        byte[] bArr = new byte[CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS];
        A00 = bArr;
        for (int i7 = 0; i7 < 4000; i7++) {
            bArr[i7] = (byte) cArr2[i7];
        }
    }

    public static int A00(int i, byte[] bArr, int i2) {
        int A022;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return A06((long) i, bArr, i2);
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i >= 1000000) {
            boolean z = false;
            if (i >= 1000000000) {
                z = true;
            }
            int i3 = i2;
            if (z) {
                i -= 1000000000;
                if (i >= 1000000000) {
                    i -= 1000000000;
                    i3 = i2 + 1;
                    bArr[i2] = 50;
                } else {
                    i3 = i2 + 1;
                    bArr[i2] = 49;
                }
            }
            int i4 = i / 1000;
            int i5 = i - (i4 * 1000);
            int i6 = i4 / 1000;
            int i7 = i4 - (i6 * 1000);
            if (z) {
                A022 = A01(i6, bArr, i3);
            } else {
                A022 = A02(i6, bArr, i3);
            }
            return A01(i5, bArr, A01(i7, bArr, A022));
        } else if (i >= 1000) {
            int i8 = i / 1000;
            return A01(i - (i8 * 1000), bArr, A02(i8, bArr, i2));
        } else if (i >= 10) {
            return A02(i, bArr, i2);
        } else {
            int i9 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i9;
        }
    }

    public static int A01(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        byte[] bArr2 = A00;
        int i5 = i3 + 1;
        bArr[i2] = bArr2[i3];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        bArr[i4] = bArr2[i5];
        int i8 = i6 + 1;
        bArr[i6] = bArr2[i7];
        return i8;
    }

    public static int A02(int i, byte[] bArr, int i2) {
        int i3 = i << 2;
        char[] cArr = A02;
        int i4 = i3 + 1;
        char c = cArr[i3];
        if (c != 0) {
            bArr[i2] = (byte) c;
            i2++;
        }
        int i5 = i4 + 1;
        char c2 = cArr[i4];
        if (c2 != 0) {
            bArr[i2] = (byte) c2;
            i2++;
        }
        int i6 = i2 + 1;
        bArr[i2] = (byte) cArr[i5];
        return i6;
    }

    public static int A03(int i, char[] cArr, int i2) {
        int A05;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return A07((long) i, cArr, i2);
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i >= 1000000) {
            boolean z = false;
            if (i >= 1000000000) {
                z = true;
            }
            int i3 = i2;
            if (z) {
                i -= 1000000000;
                if (i >= 1000000000) {
                    i -= 1000000000;
                    i3 = i2 + 1;
                    cArr[i2] = '2';
                } else {
                    i3 = i2 + 1;
                    cArr[i2] = '1';
                }
            }
            int i4 = i / 1000;
            int i5 = i - (i4 * 1000);
            int i6 = i4 / 1000;
            int i7 = i4 - (i6 * 1000);
            if (z) {
                A05 = A04(i6, cArr, i3);
            } else {
                A05 = A05(i6, cArr, i3);
            }
            return A04(i5, cArr, A04(i7, cArr, A05));
        } else if (i >= 1000) {
            int i8 = i / 1000;
            return A04(i - (i8 * 1000), cArr, A05(i8, cArr, i2));
        } else if (i >= 10) {
            return A05(i, cArr, i2);
        } else {
            int i9 = i2 + 1;
            cArr[i2] = (char) (i + 48);
            return i9;
        }
    }

    public static int A04(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        int i4 = i2 + 1;
        char[] cArr2 = A01;
        int i5 = i3 + 1;
        cArr[i2] = cArr2[i3];
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        cArr[i4] = cArr2[i5];
        int i8 = i6 + 1;
        cArr[i6] = cArr2[i7];
        return i8;
    }

    public static int A05(int i, char[] cArr, int i2) {
        int i3 = i << 2;
        char[] cArr2 = A02;
        int i4 = i3 + 1;
        char c = cArr2[i3];
        if (c != 0) {
            cArr[i2] = c;
            i2++;
        }
        int i5 = i4 + 1;
        char c2 = cArr2[i4];
        if (c2 != 0) {
            cArr[i2] = c2;
            i2++;
        }
        int i6 = i2 + 1;
        cArr[i2] = cArr2[i5];
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r7 <= 2147483647L) goto L_0x0031;
     */
    public static int A06(long j, byte[] bArr, int i) {
        if (j < 0) {
            if (j <= -2147483648L) {
                if (j == Long.MIN_VALUE) {
                    int length = "-9223372036854775808".length();
                    int i2 = 0;
                    while (i2 < length) {
                        bArr[i] = (byte) "-9223372036854775808".charAt(i2);
                        i2++;
                        i++;
                    }
                    return i;
                }
                bArr[i] = 45;
                j = -j;
                i++;
                int i3 = 10;
                for (long j2 = 10000000000L; j >= j2 && i3 != 19; j2 = (j2 << 1) + (j2 << 3)) {
                    i3++;
                }
                int i4 = i3 + i;
                int i5 = i4;
                while (j > 2147483647L) {
                    i5 -= 3;
                    long j3 = j / 1000;
                    A01((int) (j - (1000 * j3)), bArr, i5);
                    j = j3;
                }
                int i6 = (int) j;
                while (i6 >= 1000) {
                    i5 -= 3;
                    int i7 = i6 / 1000;
                    A01(i6 - (i7 * 1000), bArr, i5);
                    i6 = i7;
                }
                A02(i6, bArr, i);
                return i4;
            }
        }
        return A00((int) j, bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r7 <= 2147483647L) goto L_0x0026;
     */
    public static int A07(long j, char[] cArr, int i) {
        if (j < 0) {
            if (j <= -2147483648L) {
                if (j == Long.MIN_VALUE) {
                    int length = "-9223372036854775808".length();
                    "-9223372036854775808".getChars(0, length, cArr, i);
                    return i + length;
                }
                cArr[i] = '-';
                j = -j;
                i++;
                int i2 = 10;
                for (long j2 = 10000000000L; j >= j2 && i2 != 19; j2 = (j2 << 1) + (j2 << 3)) {
                    i2++;
                }
                int i3 = i2 + i;
                int i4 = i3;
                while (j > 2147483647L) {
                    i4 -= 3;
                    long j3 = j / 1000;
                    A04((int) (j - (1000 * j3)), cArr, i4);
                    j = j3;
                }
                int i5 = (int) j;
                while (i5 >= 1000) {
                    i4 -= 3;
                    int i6 = i5 / 1000;
                    A04(i5 - (i6 * 1000), cArr, i4);
                    i5 = i6;
                }
                A05(i5, cArr, i);
                return i3;
            }
        }
        return A03((int) j, cArr, i);
    }

    public static String A08(int i) {
        String[] strArr = A03;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = A04;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }
}
