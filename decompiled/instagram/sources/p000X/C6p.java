package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.fragment.InsightsFollowersActivityRNChartFragment;
import java.util.Map;

/* renamed from: X.C6p */
public final class C6p implements View.OnClickListener {
    public final /* synthetic */ InsightsFollowersActivityRNChartFragment A00;

    public C6p(InsightsFollowersActivityRNChartFragment insightsFollowersActivityRNChartFragment) {
        this.A00 = insightsFollowersActivityRNChartFragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1700139173);
        InsightsFollowersActivityRNChartFragment insightsFollowersActivityRNChartFragment = this.A00;
        insightsFollowersActivityRNChartFragment.A04.A06(Constants.A0C, Constants.A03, Constants.A0A, Constants.A0U, (Map) null, (String) null);
        C27341Hl A02 = C22290yA.A00.A00().A02(insightsFollowersActivityRNChartFragment.getSession().getToken(), insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_title), insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_message), new String[]{insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_hours_title), insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_hours_message), insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_days_title), insightsFollowersActivityRNChartFragment.getString(C0003R.string.followers_activity_help_days_message)});
        AnonymousClass2TH r1 = new AnonymousClass2TH(insightsFollowersActivityRNChartFragment.getSession());
        r1.A00 = 0.35f;
        r1.A0T = false;
        r1.A00().A01(insightsFollowersActivityRNChartFragment.getActivity(), A02);
        AnonymousClass0Z0.A0C(-1882159301, A05);
    }
}
