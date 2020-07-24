package p000X;

/* renamed from: X.D1Q */
public final class D1Q implements C29605D1k {
    public final D1U A00 = new D1U(this, BME.A00, this);
    public final C25945Bcx A01 = C25945Bcx.A00();
    public final D2V A02;
    public final C29603D1i A03;

    public D1Q(C29603D1i d1i, D2V d2v) {
        this.A03 = d1i;
        this.A02 = d2v;
    }

    public final /* bridge */ /* synthetic */ C29659D3s AGg(long j) {
        D1O A022;
        C25945Bcx bcx = this.A01;
        synchronized (bcx) {
            A022 = bcx.A03.A02();
        }
        boolean z = false;
        if (A022.A06 > 0) {
            z = true;
        }
        if (!z) {
            C29603D1i d1i = this.A03;
            if (d1i == null) {
                A022 = new D1O();
            } else {
                A022 = d1i.AGm();
                long j2 = A022.A06;
                boolean z2 = false;
                if (j2 > 0) {
                    z2 = true;
                }
                if (z2) {
                    A022 = new D1O(A022, (long) (((float) j2) * 0.6f));
                }
            }
        }
        long j3 = A022.A06;
        if (j3 != j3) {
            return new D1O(A022, j3);
        }
        return A022;
    }

    public final long AGl() {
        long j;
        C25945Bcx bcx = this.A01;
        synchronized (bcx) {
            j = bcx.A01;
        }
        return j;
    }
}
