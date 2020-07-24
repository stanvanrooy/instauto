package p000X;

/* renamed from: X.B27 */
public final class B27 implements B2W {
    public final /* synthetic */ C25115B1l A00;

    public B27(C25115B1l b1l) {
        this.A00 = b1l;
    }

    public final void BDa(AV6 av6, String str) {
        synchronized (this.A00.A0B) {
            for (B2W BDa : this.A00.A0B) {
                BDa.BDa(av6, str);
            }
        }
    }
}
