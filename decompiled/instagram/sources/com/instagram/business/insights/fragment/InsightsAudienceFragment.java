package com.instagram.business.insights.fragment;

import android.os.Bundle;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.business.insights.p014ui.InsightsUnitParagraphView;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1H6;
import p000X.C27283C6v;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C75;

public class InsightsAudienceFragment extends BaseAccountInsightsTabFragment {
    public C27283C6v A00;
    public AnonymousClass0C1 A01;
    public C27355CAa A02;
    public View mFollowersGrowthView;
    public InsightsUnitParagraphView mFollowersUnit;
    public View mHasEnoughFollowers;
    public View mNotEnoughFollowers;

    public final String getModuleName() {
        return "account_insights_audience";
    }

    public static void A00(InsightsAudienceFragment insightsAudienceFragment, C27341Hl r1, int i) {
        AnonymousClass1H6 A0Q = insightsAudienceFragment.getChildFragmentManager().A0Q();
        A0Q.A02(i, r1);
        A0Q.A0H();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2132370298);
        super.onCreate(bundle);
        AnonymousClass0C1 r0 = (AnonymousClass0C1) getSession();
        this.A01 = r0;
        C27355CAa cAa = new C27355CAa(r0, this);
        this.A02 = cAa;
        C27283C6v c6v = new C27283C6v(this.A01, cAa);
        this.A00 = c6v;
        c6v.A02();
        registerLifecycleListener(this.A00);
        AnonymousClass0Z0.A09(-1148009905, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1036685731);
        super.onDestroy();
        C27283C6v c6v = this.A00;
        if (c6v != null) {
            unregisterLifecycleListener(c6v);
        }
        AnonymousClass0Z0.A09(-1302474561, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContentViewStub.setLayoutResource(C0003R.layout.audience_insights_fragment);
        this.mContentViewStub.inflate();
        this.mFollowersUnit = (InsightsUnitParagraphView) view.findViewById(C0003R.C0005id.audience_followers_unit);
        this.mNotEnoughFollowers = view.findViewById(C0003R.C0005id.audience_not_enough_followers);
        this.mFollowersGrowthView = view.findViewById(C0003R.C0005id.audience_followers_growth);
        this.mHasEnoughFollowers = view.findViewById(C0003R.C0005id.audience_has_enough_followers);
        A07();
        C27283C6v c6v = this.A00;
        if (c6v != null) {
            synchronized (c6v) {
                c6v.A02 = this;
                if (!c6v.A04) {
                    C75 c75 = c6v.A03;
                    if (c75 != null) {
                        C27283C6v.A00(c6v, c75);
                    }
                } else if (this != null) {
                    A06();
                }
            }
        }
    }
}
