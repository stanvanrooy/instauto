package p000X;

/* renamed from: X.1zb  reason: invalid class name and case insensitive filesystem */
public final class C46351zb implements C29241Pd {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Object A03 = null;
    public final C29241Pd A04;

    public final void A00() {
        int i = this.A02;
        if (i != 0) {
            if (i == 1) {
                this.A04.B7Z(this.A01, this.A00);
            } else if (i == 2) {
                this.A04.BIS(this.A01, this.A00);
            } else if (i == 3) {
                this.A04.Auy(this.A01, this.A00, this.A03);
            }
            this.A03 = null;
            this.A02 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r5.A01;
     */
    public final void Auy(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.A02 != 3 || i > (i4 = i3 + this.A00) || (i5 = i + i2) < i3 || this.A03 != obj) {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A03 = obj;
            this.A02 = 3;
            return;
        }
        int min = Math.min(i, i3);
        this.A01 = min;
        this.A00 = Math.max(i4, i5) - min;
    }

    public final void B7Z(int i, int i2) {
        int i3;
        if (this.A02 == 1 && i >= (i3 = this.A01)) {
            int i4 = this.A00;
            if (i <= i3 + i4) {
                this.A00 = i4 + i2;
                this.A01 = Math.min(i, i3);
                return;
            }
        }
        A00();
        this.A01 = i;
        this.A00 = i2;
        this.A02 = 1;
    }

    public final void BIS(int i, int i2) {
        int i3;
        if (this.A02 != 2 || (i3 = this.A01) < i || i3 > i + i2) {
            A00();
            this.A01 = i;
            this.A00 = i2;
            this.A02 = 2;
            return;
        }
        this.A00 += i2;
        this.A01 = i;
    }

    public C46351zb(C29241Pd r2) {
        this.A04 = r2;
    }

    public final void BBx(int i, int i2) {
        A00();
        this.A04.BBx(i, i2);
    }
}
