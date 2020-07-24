package p000X;

/* renamed from: X.0Oe  reason: invalid class name and case insensitive filesystem */
public final class C06210Oe {
    public static byte[] A00(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = ((i3 * i4) * 3) >> 1;
        byte[] bArr2 = new byte[i6];
        int i7 = ((i2 >> 1) - (i4 >> 1)) * i;
        int i8 = 0;
        while (true) {
            i5 = (i6 / 3) << 1;
            if (i8 >= i5) {
                break;
            }
            bArr2[i8] = bArr[i8 + i7];
            i8++;
        }
        int length = (bArr.length / 3) << 1;
        int i9 = i7 >> 1;
        int i10 = i6 - i5;
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11 + i5] = bArr[i11 + length + i9];
        }
        return bArr2;
    }
}
