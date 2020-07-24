package p000X;

/* renamed from: X.CC5 */
public final class CC5 implements C79583dh {
    public final /* synthetic */ CC4 A00;

    public CC5(CC4 cc4) {
        this.A00 = cc4;
    }

    public final boolean BRj(boolean z) {
        C56202c6 r0;
        CCZ.A07(this.A00.A0A, C27398CBr.AUDIENCE, "regulated_category_switch");
        if (!z) {
            CC4 cc4 = this.A00;
            cc4.A0C.A08(cc4.A0A, (CC7) null);
            this.A00.A08.A02();
            CC4.A04(this.A00);
            return true;
        }
        CC4 cc42 = this.A00;
        if (cc42.A0B == C26905BuU.HEC_APPEAL && (r0 = cc42.A0G) != null) {
            r0.A06(true);
        }
        CC4.A03(this.A00);
        return false;
    }
}
