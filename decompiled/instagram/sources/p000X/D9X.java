package p000X;

/* renamed from: X.D9X */
public final class D9X {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public DA7 A04;
    public D9k A05;
    public final C29687D4y A06;
    public final C29771D9b A07 = new C29771D9b();
    public final D9O A08 = new D9O();
    public final D9O A09 = new D9O(1);

    public static C29773D9d A00(D9X d9x) {
        C29771D9b d9b = d9x.A07;
        int i = d9b.A06.A02;
        C29773D9d d9d = d9b.A07;
        if (d9d == null) {
            C29773D9d[] d9dArr = d9x.A05.A0A;
            if (d9dArr == null) {
                d9d = null;
            } else {
                d9d = d9dArr[i];
            }
        }
        if (d9d == null || !d9d.A03) {
            return null;
        }
        return d9d;
    }

    public final void A01() {
        C29771D9b d9b = this.A07;
        d9b.A02 = 0;
        d9b.A05 = 0;
        d9b.A09 = false;
        d9b.A0A = false;
        d9b.A07 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final boolean A02() {
        this.A01++;
        int i = this.A00 + 1;
        this.A00 = i;
        int[] iArr = this.A07.A0D;
        int i2 = this.A02;
        if (i != iArr[i2]) {
            return true;
        }
        this.A02 = i2 + 1;
        this.A00 = 0;
        return false;
    }

    public D9X(C29687D4y d4y) {
        this.A06 = d4y;
    }
}
