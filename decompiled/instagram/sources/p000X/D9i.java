package p000X;

/* renamed from: X.D9i */
public final class D9i {
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final D9O A06;
    public final D9O A07;
    public final boolean A08;

    public final boolean A00() {
        long A052;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            return false;
        }
        if (this.A08) {
            A052 = this.A06.A06();
        } else {
            A052 = this.A06.A05();
        }
        this.A02 = A052;
        if (i2 == this.A03) {
            D9O d9o = this.A07;
            this.A01 = d9o.A02();
            d9o.A0D(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                i = this.A07.A02() - 1;
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }

    public D9i(D9O d9o, D9O d9o2, boolean z) {
        this.A07 = d9o;
        this.A06 = d9o2;
        this.A08 = z;
        d9o2.A0C(12);
        this.A05 = d9o2.A02();
        d9o.A0C(12);
        this.A04 = d9o.A02();
        if (d9o.A00() != 1 ? false : true) {
            this.A00 = -1;
            return;
        }
        throw new IllegalStateException(String.valueOf("first_chunk must be 1"));
    }
}
