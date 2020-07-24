package p000X;

/* renamed from: X.DF3 */
public final class DF3 {
    public int A00;
    public int A01;
    public final byte[] A02;

    public final int A01(int i) {
        byte b;
        if (i < 1 || i > 32 || i > A00()) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i2 = this.A00;
        if (i2 > 0) {
            int i3 = 8 - i2;
            int min = Math.min(i, i3);
            int i4 = i3 - min;
            byte[] bArr = this.A02;
            int i5 = this.A01;
            b = (((255 >> (8 - min)) << i4) & bArr[i5]) >> i4;
            i -= min;
            int i6 = i2 + min;
            this.A00 = i6;
            if (i6 == 8) {
                this.A00 = 0;
                this.A01 = i5 + 1;
            }
        } else {
            b = 0;
        }
        if (i <= 0) {
            return b;
        }
        while (i >= 8) {
            byte[] bArr2 = this.A02;
            int i7 = this.A01;
            b = (b << 8) | (bArr2[i7] & 255);
            this.A01 = i7 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return b;
        }
        int i8 = 8 - i;
        int i9 = (b << i) | ((((255 >> i8) << i8) & this.A02[this.A01]) >> i8);
        this.A00 += i;
        return i9;
    }

    public final int A00() {
        return ((this.A02.length - this.A01) << 3) - this.A00;
    }

    public DF3(byte[] bArr) {
        this.A02 = bArr;
    }
}
