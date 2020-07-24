package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CEH */
public final class CEH implements View.OnClickListener {
    public final /* synthetic */ CDY A00;

    public CEH(CDY cdy) {
        this.A00 = cdy;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-663472231);
        CCZ.A07(this.A00.A03, C27398CBr.LOCATIONS_SELECTION, "address_search_bar");
        C16310oO.A00.A02();
        CEI cei = new CEI();
        CDY cdy = this.A00;
        cei.A04 = cdy.A09;
        FragmentActivity activity = cdy.getActivity();
        AnonymousClass0a4.A06(activity);
        C52362Om r2 = new C52362Om(activity, cdy.A03.A0Q);
        r2.A02 = cei;
        r2.A02();
        AnonymousClass0Z0.A0C(-837209781, A05);
    }
}
