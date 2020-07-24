package p000X;

/* renamed from: X.D9h */
public final class D9h {
    public final int A00;
    public final int A01;
    public final long A02;
    public final D9k A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public final int A00(long j) {
        for (int A032 = C25948Bd0.A03(this.A07, j, true, false); A032 < this.A07.length; A032++) {
            if ((this.A04[A032] & 1) != 0) {
                return A032;
            }
        }
        return -1;
    }

    public D9h(D9k d9k, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = false;
        D6U.A02(length == length2);
        int length3 = jArr.length;
        D6U.A02(length3 == length2);
        int length4 = iArr2.length;
        D6U.A02(length4 == length2 ? true : z);
        this.A03 = d9k;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }
}
