package p000X;

/* renamed from: X.BFc */
public final class BFc implements BFW {
    public final /* synthetic */ C2095390r A00;
    public final /* synthetic */ AnonymousClass917 A01;
    public final /* synthetic */ C239612r A02;

    public BFc(C239612r r1, AnonymousClass917 r2, C2095390r r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void AxZ(BFP bfp) {
        int i;
        if (bfp.A06()) {
            C240012v r2 = this.A02.A02;
            if (r2 != null) {
                r2.A06(this.A01.A00, ((Integer) bfp.A05()).intValue());
            }
            if (((Integer) bfp.A05()).equals(0)) {
                C240012v r1 = this.A02.A02;
                if (r1 != null) {
                    r1.A09(this.A01, 1, 0);
                }
                this.A00.A01(1);
                return;
            }
            synchronized (this.A02) {
                this.A02.A05.put(bfp.A05(), new BFh(this.A01, this.A00));
            }
            return;
        }
        if (this.A02.A02 != null) {
            Exception A04 = bfp.A04();
            if (A04 instanceof BFb) {
                i = ((BFb) A04).A00();
            } else {
                i = 0;
            }
            this.A02.A02.A09(this.A01, 2, i);
        }
        this.A00.A00(bfp.A04());
    }
}
