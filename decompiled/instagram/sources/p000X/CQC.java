package p000X;

import android.os.Bundle;

/* renamed from: X.CQC */
public final class CQC extends C18690sG implements C18720sJ {
    public final /* synthetic */ CQ8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CQC(CQ8 cq8) {
        super(0);
        this.A00 = cq8;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Bundle requireArguments = this.A00.requireArguments();
        C13150hy.A01(requireArguments, "requireArguments()");
        AnonymousClass0C1 r5 = (AnonymousClass0C1) this.A00.A02.getValue();
        C13150hy.A01(r5, "userSession");
        CQ8 cq8 = this.A00;
        String string = requireArguments.getString("prior_module");
        if (string == null) {
            C13150hy.A00();
        }
        C13150hy.A01(string, "args.getString(ShoppingI…tants.ARG_PRIOR_MODULE)!!");
        CQD cqd = new CQD(r5, cq8, string);
        AnonymousClass0C1 r6 = (AnonymousClass0C1) this.A00.A02.getValue();
        C13150hy.A01(r6, "userSession");
        return new C27763CQh(r6, cqd, requireArguments.getString("TAGGED_MERCHANT_ID"), requireArguments.getString(AnonymousClass0C5.$const$string(179)), requireArguments.getString("TAGGED_BUSINESS_PARTNER_ID"), requireArguments.getString("TAGGED_BUSINESS_PARTNER_USERNAME"));
    }
}
