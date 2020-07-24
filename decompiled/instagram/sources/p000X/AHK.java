package p000X;

/* renamed from: X.AHK */
public final class AHK implements C54122Vv {
    public final /* synthetic */ C23296AGw A00;

    public final boolean BDK(C54042Vn r3) {
        if (r3 == null) {
            return false;
        }
        ((AnonymousClass99K) r3).getItem().getItemId();
        C54122Vv r0 = this.A00.A04;
        if (r0 != null) {
            return r0.BDK(r3);
        }
        return false;
    }

    public AHK(C23296AGw aGw) {
        this.A00 = aGw;
    }

    public final void Awx(C54042Vn r3, boolean z) {
        if (r3 instanceof AnonymousClass99K) {
            r3.A02().A0F(false);
        }
        C54122Vv r0 = this.A00.A04;
        if (r0 != null) {
            r0.Awx(r3, z);
        }
    }
}
