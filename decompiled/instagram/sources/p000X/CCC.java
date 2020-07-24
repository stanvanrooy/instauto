package p000X;

import android.view.View;

/* renamed from: X.CCC */
public final class CCC implements View.OnClickListener {
    public final /* synthetic */ CCA A00;

    public CCC(CCA cca) {
        this.A00 = cca;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-428360080);
        CCZ.A07(this.A00.A02, C27398CBr.NUX_DESTINATION, "education_destination_profile");
        CCA cca = this.A00;
        cca.A03.A06(cca.A02, CCN.PROFILE_VISITS);
        this.A00.getActivity().onBackPressed();
        AnonymousClass0Z0.A0C(-2081119147, A05);
    }
}
