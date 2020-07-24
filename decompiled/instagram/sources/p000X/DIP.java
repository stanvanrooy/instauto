package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;

/* renamed from: X.DIP */
public final class DIP implements C29951DIb {
    public final DIL A00 = new DIL();
    public final DIQ A01;
    public final DIV[] A02;

    public final DAX A5g(DAX dax) {
        DIL dil = this.A00;
        boolean z = dax.A03;
        dil.A05 = z;
        DIQ diq = this.A01;
        float max = Math.max(0.1f, Math.min(dax.A01, 8.0f));
        if (diq.A01 != max) {
            diq.A01 = max;
            diq.A06 = true;
        }
        float max2 = Math.max(0.1f, Math.min(dax.A00, 8.0f));
        if (diq.A00 != max2) {
            diq.A00 = max2;
            diq.A06 = true;
        }
        return new DAX(max, max2, z);
    }

    public final long APk(long j) {
        long j2;
        DIQ diq = this.A01;
        long j3 = diq.A03;
        long j4 = j;
        if (j3 < OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
            return (long) (((double) diq.A01) * ((double) j));
        }
        int i = diq.A05.A03;
        int i2 = diq.A04.A03;
        if (i == i2) {
            j2 = diq.A02;
        } else {
            j2 = diq.A02 * ((long) i);
            j3 *= (long) i2;
        }
        return C25948Bd0.A04(j4, j2, j3);
    }

    public final long AWA() {
        return this.A00.A04;
    }

    public DIP(DIV... divArr) {
        int length = divArr.length;
        DIV[] divArr2 = new DIV[(length + 2)];
        this.A02 = divArr2;
        System.arraycopy(divArr, 0, divArr2, 0, length);
        DIQ diq = new DIQ();
        this.A01 = diq;
        DIV[] divArr3 = this.A02;
        divArr3[length] = this.A00;
        divArr3[length + 1] = diq;
    }

    public final DIV[] AGM() {
        return this.A02;
    }
}
