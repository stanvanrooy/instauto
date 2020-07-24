package p000X;

/* renamed from: X.D1I */
public final class D1I implements D15 {
    public int A00;
    public D19 A01;
    public final int A02;
    public final boolean A03;
    public final byte[] A04;

    public final void cancel() {
    }

    public final long BWT(D1M d1m) {
        D19 d19 = this.A01;
        if (d19 != null) {
            d19.BSW(d1m, C43711ux.CACHED);
        }
        this.A00 = 0;
        D19 d192 = this.A01;
        if (d192 != null) {
            d192.BSY(false);
        }
        return (long) this.A02;
    }

    public final void close() {
        D19 d19 = this.A01;
        if (d19 != null) {
            d19.BSR();
            this.A01 = null;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A02;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return -1;
        }
        if (i2 > i5) {
            i2 = i5;
        }
        if (i2 > 0) {
            System.arraycopy(this.A04, i4, bArr, i, i2);
            this.A00 += i2;
            D19 d19 = this.A01;
            if (d19 != null) {
                d19.Au8(i2);
            }
        }
        return i2;
    }

    public D1I(byte[] bArr, int i, D19 d19, boolean z) {
        this.A04 = bArr;
        this.A02 = i;
        this.A01 = d19;
        this.A03 = z;
    }
}
