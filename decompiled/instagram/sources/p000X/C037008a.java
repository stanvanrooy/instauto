package p000X;

/* renamed from: X.08a  reason: invalid class name and case insensitive filesystem */
public final class C037008a implements C04470Ec {
    public static final int[] A01 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};
    public int A00;

    public C037008a(int i) {
        this.A00 = i;
    }

    public final int A8x(byte[] bArr, int i, int i2) {
        int i3 = (i + i2) - 16;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = A01[bArr[i4] & 31];
            int i6 = 0;
            int i7 = 5;
            while (i6 < 3) {
                if (((i5 >>> i6) & 1) != 0) {
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    long j = 0;
                    for (int i10 = 0; i10 < 6; i10++) {
                        j |= (((long) bArr[(i4 + i8) + i10]) & 255) << (i10 << 3);
                    }
                    long j2 = j >>> i9;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        long j3 = (long) ((((((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4) - ((this.A00 + i4) - i)) >>> 4);
                        long j4 = ((((j2 & -77309403137L) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i9) | (((long) ((1 << i9) - 1)) & j);
                        for (int i11 = 0; i11 < 6; i11++) {
                            bArr[i4 + i8 + i11] = (byte) ((int) (j4 >>> (i11 << 3)));
                        }
                    }
                }
                i6++;
                i7 += 41;
            }
            i4 += 16;
        }
        int i12 = i4 - i;
        this.A00 += i12;
        return i12;
    }
}
