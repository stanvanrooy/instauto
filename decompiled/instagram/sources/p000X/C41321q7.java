package p000X;

/* renamed from: X.1q7  reason: invalid class name and case insensitive filesystem */
public final class C41321q7 extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41321q7(C37531jo r3) {
        super("maybeFetchPartnerProgramEligibilityInfo", 389);
        this.A00 = r3;
    }

    public final void A00() {
        C37531jo r6 = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(r6.A07, AnonymousClass0L7.IGTV_REVSHARE_ONBOARDING, "enabled", false, (AnonymousClass04H) null)).booleanValue() || ((Boolean) AnonymousClass0L6.A02(r6.A07, AnonymousClass0L7.USER_PAY, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass0C1 r3 = r6.A07;
            C15890nh r2 = new C15890nh(new AnonymousClass4QG(r3).A00, 210);
            r2.A09 = Constants.A0N;
            r2.A0C = "business/eligibility/get_monetization_products_onboarding_eligibility_data/";
            r2.A06(AnonymousClass4PR.class, false);
            C17850qu A03 = r2.A03();
            C13150hy.A01(A03, "IgApi.Builder<PartnerPro…ss.java)\n        .build()");
            A03.A00 = new C98244Mg(r3);
            C12810hQ.A02(A03);
        }
    }
}
