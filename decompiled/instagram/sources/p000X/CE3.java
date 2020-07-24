package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CE3 */
public final class CE3 implements View.OnClickListener {
    public final /* synthetic */ CDZ A00;

    public CE3(CDZ cdz) {
        this.A00 = cdz;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-828003532);
        CCZ.A07(this.A00.A02, C27398CBr.LOCATIONS_SELECTION, "done_button");
        CDZ cdz = this.A00;
        CDA cda = cdz.A03;
        CD3 cd3 = cdz.A02;
        cda.A0B(cd3, ImmutableList.A09(cd3.A07.A04));
        FragmentActivity activity = this.A00.getActivity();
        AnonymousClass0a4.A06(activity);
        activity.onBackPressed();
        AnonymousClass0Z0.A0C(1340870136, A05);
    }
}
