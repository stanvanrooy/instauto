package p000X;

import java.util.Arrays;

/* renamed from: X.D50 */
public final class D50 implements D8B {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    public final boolean AhX() {
        return true;
    }

    public final D5Z AVP(long j) {
        int A022 = C25948Bd0.A02(this.A04, j, true);
        long[] jArr = this.A04;
        long j2 = jArr[A022];
        long[] jArr2 = this.A03;
        D5Y d5y = new D5Y(j2, jArr2[A022]);
        if (d5y.A01 >= j || A022 == this.A00 - 1) {
            return new D5Z(d5y, d5y);
        }
        int i = A022 + 1;
        return new D5Z(d5y, new D5Y(jArr[i], jArr2[i]));
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.A00 + ", sizes=" + Arrays.toString(this.A01) + ", offsets=" + Arrays.toString(this.A03) + ", timeUs=" + Arrays.toString(this.A04) + ", durationsUs=" + Arrays.toString(this.A02) + ")";
    }

    public D50(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }

    public final long AKg() {
        return this.A05;
    }
}
