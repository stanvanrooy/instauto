package p000X;

import com.instagram.mainactivity.MainActivity;

/* renamed from: X.APG */
public final class APG extends AnonymousClass0L1 {
    public final /* synthetic */ MainActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public APG(MainActivity mainActivity) {
        super("InAppPurchasesSync", 669);
        this.A00 = mainActivity;
    }

    public final void A00() {
        MainActivity mainActivity = this.A00;
        AnonymousClass0C1 r2 = mainActivity.A06;
        if (r2 != null && ((C212489Ek) r2.AVA(C212489Ek.class, new C227099px())).A00) {
            C27990CZa A002 = C16520oj.A00.A00(mainActivity, r2);
            C1898489j r22 = new C1898489j();
            r22.A00 = "ALL_PRODUCTS";
            A002.A04(new AQ4(r22), new C229359xh(A002));
        }
    }
}
