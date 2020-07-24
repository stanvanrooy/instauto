package p000X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.D6F */
public final class D6F implements D7Y {
    public D5D A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public boolean A04;
    public long[] A05;
    public final Format A06;
    public final C25950Bd4 A07 = new C25950Bd4();

    public final boolean AhB() {
        return true;
    }

    public final void Ap0() {
    }

    public final int BYz(D8z d8z, C29717D6d d6d, boolean z) {
        if (z || !this.A04) {
            d8z.A00 = this.A06;
            this.A04 = true;
            return -5;
        }
        int i = this.A01;
        if (i != this.A05.length) {
            this.A01 = i + 1;
            byte[] A012 = this.A07.A01(this.A00.A03[i]);
            if (A012 != null) {
                d6d.A04(A012.length);
                d6d.A01.put(A012);
                d6d.A00 = this.A05[i];
                d6d.A00 = 1;
                return -4;
            }
        } else if (!this.A03) {
            d6d.A00 = 4;
            return -4;
        }
        return -3;
    }

    public final void A00(long j) {
        boolean z = false;
        int A032 = C25948Bd0.A03(this.A05, j, true, false);
        this.A01 = A032;
        if (this.A03 && A032 == this.A05.length) {
            z = true;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.A02 = j;
    }

    public final void A01(D5D d5d, boolean z) {
        long j;
        int i = this.A01;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.A05[i - 1];
        }
        this.A03 = z;
        this.A00 = d5d;
        long[] jArr = d5d.A02;
        this.A05 = jArr;
        long j2 = this.A02;
        if (j2 != -9223372036854775807L) {
            A00(j2);
        } else if (j != -9223372036854775807L) {
            this.A01 = C25948Bd0.A03(jArr, j, false, false);
        }
    }

    public final int Bor(long j) {
        int max = Math.max(this.A01, C25948Bd0.A03(this.A05, j, true, false));
        int i = max - this.A01;
        this.A01 = max;
        return i;
    }

    public D6F(D5D d5d, Format format, boolean z) {
        this.A06 = format;
        this.A00 = d5d;
        this.A05 = d5d.A02;
        A01(d5d, z);
    }
}
