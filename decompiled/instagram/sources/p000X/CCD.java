package p000X;

import android.view.View;

/* renamed from: X.CCD */
public final class CCD implements View.OnClickListener {
    public final /* synthetic */ CCA A00;

    public CCD(CCA cca) {
        this.A00 = cca;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(535384331);
        CCZ.A07(this.A00.A02, C27398CBr.NUX_DESTINATION, "education_destination_direct");
        CCA cca = this.A00;
        cca.A03.A06(cca.A02, CCN.A02);
        this.A00.getActivity().onBackPressed();
        AnonymousClass0Z0.A0C(-920834819, A05);
    }
}
