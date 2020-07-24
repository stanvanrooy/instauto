package p000X;

/* renamed from: X.D4p */
public final class D4p implements D54 {
    public D4I A00 = null;
    public D2M A01 = null;
    public boolean A02 = false;
    public AnonymousClass96X A03;
    public AnonymousClass96X A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final AnonymousClass96X A09;

    public D4p(AnonymousClass96X r4, AnonymousClass96X r5, AnonymousClass96X r6, int i, long j, D2M d2m, boolean z, D4I d4i) {
        this.A09 = r4;
        this.A07 = 1;
        this.A06 = i * 1000;
        this.A08 = j * 1000;
        this.A02 = true;
        this.A04 = r5;
        this.A03 = r6;
        this.A05 = z;
        this.A00 = d4i;
        this.A01 = d2m;
    }

    public final D5V AAN(D5W d5w, D2U d2u, int i, int[] iArr, D4t d4t, int i2, long j, boolean z, boolean z2, C29710D5w d5w2, D56 d56, C29678D4m d4m) {
        AnonymousClass96X r0;
        int i3 = i2;
        if ((i3 != 1 || (r0 = this.A03) == null) && (i3 != 2 || (r0 = this.A04) == null)) {
            r0 = this.A09;
        }
        C2101694m AAO = r0.AAO();
        int i4 = this.A07;
        int i5 = this.A06;
        long j2 = this.A08;
        boolean z3 = this.A02;
        boolean z4 = this.A05;
        return new C29669D4c(d5w, d2u, i, iArr, d4t, i3, AAO, j, i4, i5, j2, z, z2, d5w2, z3, z4, d56, this.A00, d4m, this.A01);
    }
}
