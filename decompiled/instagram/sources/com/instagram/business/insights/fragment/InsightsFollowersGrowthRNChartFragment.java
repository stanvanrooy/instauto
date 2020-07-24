package com.instagram.business.insights.fragment;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.business.insights.model.FollowersGrowthData;
import com.instagram.business.insights.model.GrowthDataPoint;
import com.instagram.common.p004ui.base.IgTextView;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass2YN;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C14100jl;
import p000X.C152836g5;
import p000X.C16310oO;
import p000X.C16920pO;
import p000X.C23176ABe;
import p000X.C23300zv;
import p000X.C27274C6h;
import p000X.C27275C6j;
import p000X.C27276C6k;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C53832Un;

public class InsightsFollowersGrowthRNChartFragment extends C27341Hl {
    public double A00 = -1.0d;
    public int A01;
    public C27355CAa A02;
    public ArrayList A03;
    public long A04;
    public final C11200ea A05 = new C27275C6j(this);
    public LinearLayout mFilterLinearLayout;

    public final String getModuleName() {
        return "account_insights_followers_activity_chart_fragment";
    }

    public final C06590Pq getSession() {
        return AnonymousClass0J1.A06(this.mArguments);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-992966664);
        super.onCreate(bundle);
        this.A02 = new C27355CAa((AnonymousClass0C1) getSession(), this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A03 = bundle2.getParcelableArrayList("ARG.Chart.Followers.Growth");
        }
        AnonymousClass0Z0.A09(736241462, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1263549097);
        View inflate = layoutInflater.inflate(C0003R.layout.insights_rn_chart_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1141368378, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1527529754);
        C23300zv.A00(getSession()).A03(C152836g5.class, this.A05);
        super.onDestroyView();
        C27355CAa cAa = this.A02;
        Integer num = Constants.A0V;
        Integer num2 = Constants.A0N;
        cAa.A04(num, num2, num2, System.currentTimeMillis() - this.A04);
        AnonymousClass0Z0.A09(-811971081, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        this.mFilterLinearLayout = (LinearLayout) view.findViewById(C0003R.C0005id.insights_chart_filter_view);
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_chart_title)).setText(C0003R.string.followers_growth_title);
        View findViewById = view.findViewById(C0003R.C0005id.insights_chart_info_icon);
        findViewById.setOnClickListener(new C27276C6k(this));
        AnonymousClass2YN.A02(findViewById, C0003R.C0005id.insights_chart_title);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_small);
        IgTextView igTextView = new IgTextView(getContext());
        igTextView.setText(C0003R.string.followers_growth_see_posts);
        igTextView.setCompoundDrawablePadding(resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_medium));
        igTextView.setTextColor(C019000b.A00(getContext(), C0003R.color.igds_primary_button));
        igTextView.setTypeface(Typeface.create("Roboto-Regular", 1));
        igTextView.setTextSize(0, resources.getDimension(C0003R.dimen.font_medium));
        igTextView.setPadding(0, 0, 0, dimensionPixelSize);
        igTextView.setOnClickListener(new C27274C6h(this));
        AnonymousClass2YN.A02(igTextView, C0003R.C0005id.insights_chart_info_icon);
        int generateViewId = View.generateViewId();
        this.A01 = generateViewId;
        igTextView.setId(generateViewId);
        this.mFilterLinearLayout.addView(igTextView);
        AnonymousClass0C1 r6 = (AnonymousClass0C1) getSession();
        Bundle bundle2 = new Bundle();
        bundle2.putString("pk", r6.A04());
        bundle2.putString("userID", r6.A04());
        bundle2.putString("fbUserId", C14100jl.A01(r6));
        bundle2.putString("chartType", "GROWTH_CHART");
        ArrayList arrayList = this.A03;
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            A052.A0S();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FollowersGrowthData followersGrowthData = (FollowersGrowthData) it.next();
                A052.A0T();
                String str2 = followersGrowthData.A01;
                if (str2 != null) {
                    A052.A0H("graph_name", str2);
                }
                if (followersGrowthData.A02 != null) {
                    A052.A0d("data_points");
                    A052.A0S();
                    Iterator it2 = followersGrowthData.A02.iterator();
                    while (it2.hasNext()) {
                        GrowthDataPoint growthDataPoint = (GrowthDataPoint) it2.next();
                        if (growthDataPoint != null) {
                            A052.A0T();
                            A052.A0F("timestamp", growthDataPoint.A00);
                            A052.A0F("value", growthDataPoint.A01);
                            A052.A0Q();
                        }
                    }
                    A052.A0P();
                }
                A052.A0F("total", followersGrowthData.A00);
                A052.A0Q();
            }
            A052.A0P();
            A052.close();
            str = stringWriter.toString();
        } catch (IOException unused) {
            str = "";
        }
        bundle2.putString("data", str);
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r6);
        newReactNativeLauncher.BkI("IgInsightsChartRoute");
        newReactNativeLauncher.Bjt(bundle2);
        Bundle A70 = newReactNativeLauncher.A70();
        View view2 = this.mView;
        AnonymousClass0a4.A06(view2);
        AnonymousClass2YN.A02(view2.findViewById(C0003R.C0005id.insights_chart_rn_container), this.A01);
        AnonymousClass1H6 A0Q = getChildFragmentManager().A0Q();
        C16310oO.A00.A00();
        C23176ABe aBe = new C23176ABe();
        aBe.setArguments(A70);
        A0Q.A02(C0003R.C0005id.insights_chart_rn_container, aBe);
        A0Q.A0H();
        C23300zv.A00(getSession()).A02(C152836g5.class, this.A05);
        this.A04 = System.currentTimeMillis();
    }
}
