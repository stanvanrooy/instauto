package p000X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: X.CCE */
public final class CCE implements View.OnClickListener {
    public final /* synthetic */ CCA A00;

    public CCE(CCA cca) {
        this.A00 = cca;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-2070995933);
        CCZ.A07(this.A00.A02, C27398CBr.NUX_DESTINATION, "education_destination_website");
        if (!TextUtils.isEmpty(this.A00.A02.A0U)) {
            CCA cca = this.A00;
            CD3 cd3 = cca.A02;
            if (cd3.A0A != null) {
                cca.A03.A06(cd3, CCN.WEBSITE_CLICK);
                this.A00.getActivity().onBackPressed();
                AnonymousClass0Z0.A0C(1528457360, A05);
            }
        }
        this.A00.getActivity().onBackPressed();
        C16310oO.A00.A02();
        C27410CCd cCd = new C27410CCd();
        CCA cca2 = this.A00;
        C52362Om r2 = new C52362Om(cca2.getActivity(), cca2.A02.A0Q);
        r2.A02 = cCd;
        r2.A02();
        AnonymousClass0Z0.A0C(1528457360, A05);
    }
}
