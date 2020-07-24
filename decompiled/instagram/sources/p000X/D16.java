package p000X;

import java.util.Map;

/* renamed from: X.D16 */
public final class D16 implements D17 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public D1M A07;
    public final int A08;
    public final D17 A09;
    public final int A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r5 >= ((long) r4.A0A)) goto L_0x0048;
     */
    private int A00() {
        long j;
        boolean z;
        D1M d1m = this.A07;
        long j2 = d1m.A02;
        if (j2 > 0) {
            j = Math.min((long) this.A0A, j2 - (this.A04 - d1m.A03));
        } else {
            j = (long) this.A0A;
        }
        long BWT = this.A09.BWT(new D1M(d1m.A04, d1m.A07, this.A03, this.A04, j, d1m.A06, d1m.A00, d1m.A05));
        if (BWT >= 0) {
            z = true;
        }
        z = false;
        this.A05 = z;
        return (int) BWT;
    }

    public final Map AUX() {
        return this.A09.AUX();
    }

    public final long BWT(D1M d1m) {
        this.A07 = d1m;
        this.A06 = new byte[this.A08];
        this.A03 = d1m.A01;
        this.A04 = d1m.A03;
        int A002 = A00();
        this.A02 = A002;
        this.A00 = 0;
        if (A002 >= 0 && A002 < this.A0A) {
            return (long) A002;
        }
        long j = d1m.A02;
        if (j < 0) {
            return -1;
        }
        return j;
    }

    public final void BkD(String str, String str2) {
        this.A09.BkD(str, str2);
    }

    public final void cancel() {
        this.A09.cancel();
    }

    public final void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.A00;
        if (i4 >= i2) {
            System.arraycopy(this.A06, this.A01, bArr, i, i2);
            this.A01 += i2;
            this.A00 -= i2;
            return i2;
        }
        if (i4 > 0) {
            System.arraycopy(this.A06, this.A01, bArr, i, i4);
            int i5 = this.A00;
            i += i5;
            i3 = i2 - i5;
            this.A00 = 0;
        } else {
            i3 = i2;
        }
        do {
            if (this.A02 > 0) {
                int read = this.A09.read(bArr, i, i3);
                if (read == -1) {
                    this.A02 = 0;
                } else {
                    i += read;
                    i3 -= read;
                    this.A02 -= read;
                    long j = (long) read;
                    this.A04 += j;
                    this.A03 += j;
                }
            }
            int i6 = this.A00;
            if (this.A02 + i6 <= this.A08) {
                int i7 = this.A01;
                if (i7 > 0) {
                    if (i6 > 0) {
                        byte[] bArr2 = this.A06;
                        System.arraycopy(bArr2, i7, bArr2, 0, i6);
                    }
                    this.A01 = 0;
                }
                while (true) {
                    int i8 = this.A02;
                    if (i8 <= 0) {
                        break;
                    }
                    int read2 = this.A09.read(this.A06, this.A00, i8);
                    if (read2 == -1) {
                        this.A02 = 0;
                        break;
                    }
                    this.A00 += read2;
                    this.A02 -= read2;
                    long j2 = (long) read2;
                    this.A04 += j2;
                    this.A03 += j2;
                }
                if (!this.A05) {
                    this.A09.close();
                    this.A02 = A00();
                }
            }
            if (this.A00 > 0 || this.A02 > 0) {
                int read3 = read(bArr, i, i3);
                int i9 = i2 - i3;
                if (read3 == -1) {
                    read3 = 0;
                }
                return i9 + read3;
            }
            int i10 = i2 - i3;
            if (i10 <= 0) {
                return -1;
            }
            return i10;
        } while (i3 != 0);
        return i2;
    }

    public D16(D17 d17, int i, int i2) {
        this.A09 = d17;
        this.A08 = i;
        this.A0A = i2;
    }

    public final void A8J(int i) {
    }
}
