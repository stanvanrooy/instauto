package p000X;

import android.view.View;

/* renamed from: X.CCB */
public final class CCB implements View.OnClickListener {
    public final /* synthetic */ CCA A00;

    public CCB(CCA cca) {
        this.A00 = cca;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-567184475);
        CCZ.A07(this.A00.A02, C27398CBr.NUX_AUDIENCE, "education_audience_automatic");
        CCA cca = this.A00;
        cca.A03.A0A(cca.A02, CGU.A00(Constants.ZERO));
        this.A00.getActivity().onBackPressed();
        AnonymousClass0Z0.A0C(-601091159, A05);
    }
}
