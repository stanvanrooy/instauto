package p000X;

import java.util.Arrays;

/* renamed from: X.0i1  reason: invalid class name and case insensitive filesystem */
public final class C13180i1 {
    public static final int[] A00;
    public static final int[] A01;
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final byte[] A07;
    public static final char[] A08;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        A08 = charArray;
        int length = charArray.length;
        byte[] bArr = new byte[length];
        A07 = bArr;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) charArray[i];
        }
        int[] iArr = new int[256];
        for (int i2 = 0; i2 < 32; i2++) {
            iArr[i2] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        A01 = iArr;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i3 = 128; i3 < 256; i3++) {
            int i4 = 2;
            if ((i3 & 224) != 192) {
                i4 = 3;
                if ((i3 & 240) != 224) {
                    i4 = -1;
                    if ((i3 & 248) == 240) {
                        i4 = 4;
                    }
                }
            }
            iArr2[i3] = i4;
        }
        A04 = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        A03 = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        A05 = iArr4;
        int[] iArr5 = new int[256];
        A02 = iArr5;
        System.arraycopy(A04, 128, iArr5, 128, 128);
        int[] iArr6 = A02;
        Arrays.fill(iArr6, 0, 32, -1);
        iArr6[9] = 0;
        iArr6[10] = 10;
        iArr6[13] = 13;
        iArr6[42] = 42;
        int[] iArr7 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr7[i6] = -1;
        }
        iArr7[34] = 34;
        iArr7[92] = 92;
        iArr7[8] = 98;
        iArr7[9] = 116;
        iArr7[12] = 102;
        iArr7[10] = 110;
        iArr7[13] = 114;
        A06 = iArr7;
        int[] iArr8 = new int[128];
        A00 = iArr8;
        Arrays.fill(iArr8, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            A00[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr9 = A00;
            int i9 = i8 + 10;
            iArr9[i8 + 97] = i9;
            iArr9[i8 + 65] = i9;
        }
    }

    public static void A00(StringBuilder sb, String str) {
        int i;
        int[] iArr = A06;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= length || (i = iArr[charAt]) == 0) {
                sb.append(charAt);
            } else {
                sb.append('\\');
                if (i < 0) {
                    sb.append('u');
                    sb.append('0');
                    sb.append('0');
                    char[] cArr = A08;
                    sb.append(cArr[charAt >> 4]);
                    sb.append(cArr[charAt & 15]);
                } else {
                    sb.append((char) i);
                }
            }
        }
    }

    public static byte[] A01() {
        return (byte[]) A07.clone();
    }

    public static char[] A02() {
        return (char[]) A08.clone();
    }
}
