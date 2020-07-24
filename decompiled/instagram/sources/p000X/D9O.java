package p000X;

import java.nio.charset.Charset;

/* renamed from: X.D9O */
public final class D9O {
    public int A00;
    public int A01;
    public byte[] A02;

    public final int A00() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.A01 = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    public final int A01() {
        byte[] bArr = this.A02;
        int i = this.A01;
        this.A01 = i + 1;
        return bArr[i] & 255;
    }

    public final int A03() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.A01 = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public final long A04() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        int i5 = i4 + 1;
        this.A01 = i5;
        int i6 = i5 + 1;
        this.A01 = i6;
        int i7 = i6 + 1;
        this.A01 = i7;
        int i8 = i7 + 1;
        this.A01 = i8;
        this.A01 = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (255 & ((long) bArr[i8]));
    }

    public final long A05() {
        byte[] bArr = this.A02;
        int i = this.A01;
        int i2 = i + 1;
        this.A01 = i2;
        int i3 = i2 + 1;
        this.A01 = i3;
        int i4 = i3 + 1;
        this.A01 = i4;
        this.A01 = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (255 & ((long) bArr[i4]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r0 == r2) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2 == 13) goto L_0x001a;
     */
    public final String A07() {
        boolean z;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i2;
        if (i - i2 == 0) {
            return null;
        }
        while (i3 < i) {
            byte b = this.A02[i3];
            if (b != 10) {
                z = false;
            }
            z = true;
            if (z) {
                break;
            }
            i3++;
        }
        if (i3 - i2 >= 3) {
            byte[] bArr = this.A02;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.A01 = i2 + 3;
            }
        }
        byte[] bArr2 = this.A02;
        int i4 = this.A01;
        String str = new String(bArr2, i4, i3 - i4, Charset.forName("UTF-8"));
        this.A01 = i3;
        int i5 = this.A00;
        if (i3 != i5) {
            byte[] bArr3 = this.A02;
            if (bArr3[i3] == 13) {
                int i6 = i3 + 1;
                this.A01 = i6;
            }
            int i7 = this.A01;
            if (bArr3[i7] == 10) {
                this.A01 = i7 + 1;
                return str;
            }
        }
        return str;
    }

    public final String A08() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i2;
        if (i - i2 == 0) {
            return null;
        }
        while (i3 < i && this.A02[i3] != 0) {
            i3++;
        }
        String str = new String(this.A02, i2, i3 - i2, Charset.forName("UTF-8"));
        this.A01 = i3;
        if (i3 < this.A00) {
            this.A01 = i3 + 1;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r5.A02[r1] != 0) goto L_0x0017;
     */
    public final String A09(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.A01;
        int i4 = (i3 + i) - 1;
        if (i4 < this.A00) {
            i2 = i - 1;
        }
        i2 = i;
        String str = new String(this.A02, i3, i2, Charset.forName("UTF-8"));
        this.A01 += i;
        return str;
    }

    public final void A0A(int i) {
        byte[] bArr = this.A02;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        A0E(bArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r3 > r2.A02.length) goto L_0x0008;
     */
    public final void A0B(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        }
        z = false;
        D6U.A02(z);
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3 > r2.A00) goto L_0x0007;
     */
    public final void A0C(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        }
        z = false;
        D6U.A02(z);
        this.A01 = i;
    }

    public final void A0D(int i) {
        A0C(this.A01 + i);
    }

    public final void A0E(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
        this.A01 = 0;
    }

    public final void A0F(byte[] bArr, int i, int i2) {
        System.arraycopy(this.A02, this.A01, bArr, i, i2);
        this.A01 += i2;
    }

    public final int A02() {
        int A002 = A00();
        if (A002 >= 0) {
            return A002;
        }
        throw new IllegalStateException(AnonymousClass000.A05("Top bit not zero: ", A002));
    }

    public final long A06() {
        long A04 = A04();
        if (A04 >= 0) {
            return A04;
        }
        throw new IllegalStateException(AnonymousClass000.A0B("Top bit not zero: ", A04));
    }

    public D9O() {
        this.A02 = C25948Bd0.A05;
    }

    public D9O(int i) {
        this.A02 = new byte[i];
        this.A00 = i;
    }

    public D9O(byte[] bArr) {
        this.A02 = bArr;
        this.A00 = bArr.length;
    }

    public D9O(byte[] bArr, int i) {
        this.A02 = bArr;
        this.A00 = i;
    }
}
