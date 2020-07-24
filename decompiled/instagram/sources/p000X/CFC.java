package p000X;

/* renamed from: X.CFC */
public final class CFC implements C79583dh {
    public final /* synthetic */ CFB A00;

    public CFC(CFB cfb) {
        this.A00 = cfb;
    }

    public final boolean BRj(boolean z) {
        CCZ.A07(this.A00.A06, C27398CBr.AUDIENCE, "regulated_category_switch");
        if (!z) {
            CFB cfb = this.A00;
            cfb.A07.A08(cfb.A06, (CC7) null);
            return true;
        }
        this.A00.A0A.A00();
        return false;
    }
}
