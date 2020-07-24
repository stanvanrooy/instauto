package p000X;

import android.view.View;
import com.instagram.business.insights.fragment.InsightsContentFragment;

/* renamed from: X.AGN */
public final class AGN implements View.OnClickListener {
    public final /* synthetic */ InsightsContentFragment A00;

    public AGN(InsightsContentFragment insightsContentFragment) {
        this.A00 = insightsContentFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(34275956);
        InsightsContentFragment insightsContentFragment = this.A00;
        InsightsContentFragment.A00(insightsContentFragment, Constants.A0C, Constants.A14, Constants.A0X, Constants.A0Y);
        if (insightsContentFragment.A02 == null) {
            insightsContentFragment.A02 = C16330oQ.A00.A04(insightsContentFragment.getContext(), insightsContentFragment, (AnonymousClass0C1) insightsContentFragment.getSession());
        }
        insightsContentFragment.A02.BpO(Constants.ZERO, Constants.A0N);
        AnonymousClass0Z0.A0C(-1287513600, A05);
    }
}
