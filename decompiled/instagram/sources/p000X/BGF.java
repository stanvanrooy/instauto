package p000X;

import java.io.Serializable;

/* renamed from: X.BGF */
public final class BGF extends BGE implements BGK, Serializable {
    public final long A04() {
        long j = this.base;
        BGG[] bggArr = this.A00;
        if (bggArr != null) {
            for (BGG bgg : bggArr) {
                if (bgg != null) {
                    j += bgg.value;
                }
            }
        }
        return j;
    }

    public final void A2Q(long j) {
        int length;
        BGG bgg;
        BGG[] bggArr = this.A00;
        if (bggArr == null) {
            long j2 = this.base;
            if (A03(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = (int[]) BGE.A02.get();
        boolean z = true;
        if (!(iArr == null || bggArr == null || (length = bggArr.length) < 1 || (bgg = bggArr[(length - 1) & iArr[0]]) == null)) {
            long j3 = bgg.value;
            z = bgg.A00(j3, j3 + j);
            if (z) {
                return;
            }
        }
        A02(j, iArr, z);
    }

    public final void Acx() {
        A2Q(1);
    }

    public final double doubleValue() {
        return (double) A04();
    }

    public final float floatValue() {
        return (float) A04();
    }

    public final int intValue() {
        return (int) A04();
    }

    public final long longValue() {
        return A04();
    }

    public final String toString() {
        return Long.toString(A04());
    }
}
