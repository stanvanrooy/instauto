package p000X;

/* renamed from: X.ACF */
public final class ACF {
    public int A00 = 0;
    public long[] A01 = new long[20];

    public final long A00(int i) {
        int i2 = this.A00;
        if (i < i2) {
            return this.A01[i];
        }
        throw new IndexOutOfBoundsException(AnonymousClass000.A07("", i, " >= ", i2));
    }

    public final void A01(long j) {
        int i = this.A00;
        long[] jArr = this.A01;
        if (i == jArr.length) {
            long[] jArr2 = new long[Math.max(i + 1, (int) (((double) i) * 1.8d))];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.A01 = jArr2;
        }
        long[] jArr3 = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArr3[i2] = j;
    }
}
