package p000X;

/* renamed from: X.0i7  reason: invalid class name and case insensitive filesystem */
public final class C13230i7 {
    public static final String A00 = "-9223372036854775808".substring(1);

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r6 > 9) goto L_0x005e;
     */
    public static int A01(String str) {
        boolean z = false;
        char charAt = str.charAt(0);
        int length = str.length();
        int i = 1;
        if (charAt == '-') {
            z = true;
        }
        if (z) {
            if (length != 1 && length <= 10) {
                charAt = str.charAt(1);
                i = 2;
            }
            return Integer.parseInt(str);
        }
        if (charAt <= '9' && charAt >= '0') {
            int i2 = charAt - '0';
            if (i < length) {
                int i3 = i + 1;
                char charAt2 = str.charAt(i);
                if (charAt2 <= '9' && charAt2 >= '0') {
                    i2 = (i2 * 10) + (charAt2 - '0');
                    if (i3 < length) {
                        int i4 = i3 + 1;
                        char charAt3 = str.charAt(i3);
                        if (charAt3 <= '9' && charAt3 >= '0') {
                            i2 = (i2 * 10) + (charAt3 - '0');
                            if (i4 < length) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    char charAt4 = str.charAt(i4);
                                    if (charAt4 > '9' || charAt4 < '0') {
                                        break;
                                    }
                                    i2 = (i2 * 10) + (charAt4 - '0');
                                    if (i5 >= length) {
                                        break;
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                return -i2;
            }
            return i2;
        }
        return Integer.parseInt(str);
    }

    public static double A00(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int A02(char[] cArr, int i, int i2) {
        int i3 = cArr[i] - '0';
        int i4 = i2 + i;
        int i5 = i + 1;
        if (i5 >= i4) {
            return i3;
        }
        int i6 = (i3 * 10) + (cArr[i5] - '0');
        int i7 = i5 + 1;
        if (i7 >= i4) {
            return i6;
        }
        int i8 = (i6 * 10) + (cArr[i7] - '0');
        int i9 = i7 + 1;
        if (i9 >= i4) {
            return i8;
        }
        int i10 = (i8 * 10) + (cArr[i9] - '0');
        int i11 = i9 + 1;
        if (i11 >= i4) {
            return i10;
        }
        int i12 = (i10 * 10) + (cArr[i11] - '0');
        int i13 = i11 + 1;
        if (i13 >= i4) {
            return i12;
        }
        int i14 = (i12 * 10) + (cArr[i13] - '0');
        int i15 = i13 + 1;
        if (i15 >= i4) {
            return i14;
        }
        int i16 = (i14 * 10) + (cArr[i15] - '0');
        int i17 = i15 + 1;
        if (i17 >= i4) {
            return i16;
        }
        int i18 = (i16 * 10) + (cArr[i17] - '0');
        int i19 = i17 + 1;
        if (i19 < i4) {
            return (i18 * 10) + (cArr[i19] - '0');
        }
        return i18;
    }
}
