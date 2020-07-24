package p000X;

/* renamed from: X.08c  reason: invalid class name and case insensitive filesystem */
public final class C037108c implements C04470Ec {
    public int A00;

    public C037108c(int i) {
        this.A00 = i + 8;
    }

    public final int A8x(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = ((((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2) - ((this.A00 + i4) - i)) >>> 2;
                bArr[i5] = (byte) (i7 >>> 16);
                bArr[i6] = (byte) (i7 >>> 8);
                bArr[i4] = (byte) i7;
            }
            i4 += 4;
        }
        int i8 = i4 - i;
        this.A00 += i8;
        return i8;
    }
}
