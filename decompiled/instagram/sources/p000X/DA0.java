package p000X;

/* renamed from: X.DA0 */
public final class DA0 {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public final int A01(int i) {
        int i2;
        this.A00 += i;
        int i3 = 0;
        while (true) {
            i2 = this.A00;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.A00 = i4;
            byte[] bArr = this.A03;
            int i5 = this.A02;
            this.A02 = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.A03;
        int i6 = this.A02;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i6 + 1;
        }
        A00(this);
        return i7;
    }

    public static void A00(DA0 da0) {
        boolean z;
        int i;
        int i2 = da0.A02;
        if (i2 < 0 || (i2 >= (i = da0.A01) && !(i2 == i && da0.A00 == 0))) {
            z = false;
        } else {
            z = true;
        }
        D6U.A03(z);
    }

    public final boolean A02() {
        byte[] bArr = this.A03;
        int i = this.A02;
        byte b = bArr[i];
        int i2 = this.A00;
        boolean z = false;
        if ((b & (128 >> i2)) != 0) {
            z = true;
        }
        int i3 = i2 + 1;
        this.A00 = i3;
        if (i3 == 8) {
            this.A00 = 0;
            this.A02 = i + 1;
        }
        A00(this);
        return z;
    }

    public DA0() {
    }

    public DA0(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }
}
