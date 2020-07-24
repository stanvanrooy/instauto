package p000X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.D6P */
public final class D6P implements D7Y {
    public boolean A00;
    public final D7Y A01;
    public final /* synthetic */ D66 A02;

    public D6P(D66 d66, D7Y d7y) {
        this.A02 = d66;
        this.A01 = d7y;
    }

    public final boolean AhB() {
        if (this.A02.A00() || !this.A01.AhB()) {
            return false;
        }
        return true;
    }

    public final void Ap0() {
        this.A01.Ap0();
    }

    public final int BYz(D8z d8z, C29717D6d d6d, boolean z) {
        if (this.A02.A00()) {
            return -3;
        }
        if (this.A00) {
            d6d.A00 = 4;
            return -4;
        }
        int BYz = this.A01.BYz(d8z, d6d, z);
        if (BYz == -5) {
            Format format = d8z.A00;
            int i = format.A06;
            if (!(i == 0 && format.A07 == 0)) {
                int i2 = 0;
                if (this.A02.A00 == Long.MIN_VALUE) {
                    i2 = format.A07;
                }
                d8z.A00 = format.A06(i, i2);
            }
            return -5;
        }
        D66 d66 = this.A02;
        long j = d66.A00;
        if (j == Long.MIN_VALUE || ((BYz != -4 || d6d.A00 < j) && (BYz != -3 || d66.AHJ() != Long.MIN_VALUE))) {
            return BYz;
        }
        d6d.A03();
        d6d.A00 = 4;
        this.A00 = true;
        return -4;
    }

    public final int Bor(long j) {
        if (this.A02.A00()) {
            return -3;
        }
        return this.A01.Bor(j);
    }
}
