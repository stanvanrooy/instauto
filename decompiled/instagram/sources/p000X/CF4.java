package p000X;

import android.view.View;

/* renamed from: X.CF4 */
public final class CF4 extends AnonymousClass4UW {
    public final /* synthetic */ C27475CEr A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CF4(C27475CEr cEr, int i) {
        super(i);
        this.A00 = cEr;
    }

    public final void onClick(View view) {
        C27475CEr cEr = this.A00;
        AnonymousClass2UC r4 = new AnonymousClass2UC(cEr.getActivity(), cEr.A04, "https://www.facebook.com/policies/ads", AnonymousClass2UD.PROMOTE);
        r4.A04(this.A00.getModuleName());
        r4.A01();
    }
}
