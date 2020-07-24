package p000X;

/* renamed from: X.D6C */
public final class D6C implements D7Y {
    public boolean A00;
    public final int A01;
    public final C29708D5u A02;
    public final C29715D6b A03;
    public final /* synthetic */ C29708D5u A04;

    public final void Ap0() {
    }

    public D6C(C29708D5u d5u, C29708D5u d5u2, C29715D6b d6b, int i) {
        this.A04 = d5u;
        this.A02 = d5u2;
        this.A03 = d6b;
        this.A01 = i;
    }

    private void A00() {
        if (!this.A00) {
            C29708D5u d5u = this.A04;
            D6I d6i = d5u.A0H;
            int[] iArr = d5u.A0N;
            int i = this.A01;
            d6i.A05(iArr[i], d5u.A0O[i], 0, (Object) null, d5u.A04);
            this.A00 = true;
        }
    }

    public final boolean AhB() {
        C29708D5u d5u = this.A04;
        if (d5u.A0C) {
            return true;
        }
        if (d5u.A05() || !this.A03.A0B.A03()) {
            return false;
        }
        return true;
    }

    public final int BYz(D8z d8z, C29717D6d d6d, boolean z) {
        C29708D5u d5u = this.A04;
        if (d5u.A05()) {
            return -3;
        }
        C29715D6b d6b = this.A03;
        boolean z2 = d5u.A0C;
        long j = d5u.A01;
        int A06 = d6b.A06(d8z, d6d, z, z2, j);
        if (A06 == -4) {
            A00();
        }
        return A06;
    }

    public final int Bor(long j) {
        int A05;
        if (!this.A04.A0C || j <= this.A03.A07()) {
            A05 = this.A03.A05(j, true);
            if (A05 == -1) {
                A05 = 0;
            }
        } else {
            A05 = this.A03.A04();
        }
        if (A05 > 0) {
            A00();
        }
        return A05;
    }
}
