package com.instagram.business.insights.fragment;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.business.insights.model.DataPoint;
import com.instagram.business.insights.model.DaysHourlyFollowersData;
import com.instagram.common.p004ui.base.IgTextView;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass6KJ;
import p000X.AnonymousClass6KK;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C14100jl;
import p000X.C16310oO;
import p000X.C16920pO;
import p000X.C23176ABe;
import p000X.C27279C6q;
import p000X.C27280C6r;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C53832Un;
import p000X.C6p;
import p000X.C7H;
import p000X.C7I;
import p000X.C7K;

public class InsightsFollowersActivityRNChartFragment extends C27341Hl {
    public int A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public C27355CAa A04;
    public ArrayList A05;
    public ArrayList A06;
    public boolean A07;
    public int A08;
    public long A09;
    public IgTextView mEmptyTextView;
    public LinearLayout mFilterLinearLayout;
    public View mRNContainer;

    public final String getModuleName() {
        return "account_insights_followers_activity_chart_fragment";
    }

    public static void A00(InsightsFollowersActivityRNChartFragment insightsFollowersActivityRNChartFragment, boolean z) {
        TextView textView;
        int i;
        if (z != insightsFollowersActivityRNChartFragment.A07) {
            insightsFollowersActivityRNChartFragment.A07 = z;
            if (z) {
                insightsFollowersActivityRNChartFragment.A02.setTextColor(insightsFollowersActivityRNChartFragment.A00);
                textView = insightsFollowersActivityRNChartFragment.A03;
                i = insightsFollowersActivityRNChartFragment.A08;
            } else {
                insightsFollowersActivityRNChartFragment.A02.setTextColor(insightsFollowersActivityRNChartFragment.A08);
                textView = insightsFollowersActivityRNChartFragment.A03;
                i = insightsFollowersActivityRNChartFragment.A00;
            }
            textView.setTextColor(i);
            if (insightsFollowersActivityRNChartFragment.A07) {
                if (!insightsFollowersActivityRNChartFragment.A06.isEmpty()) {
                    insightsFollowersActivityRNChartFragment.mEmptyTextView.setVisibility(8);
                    insightsFollowersActivityRNChartFragment.mRNContainer.setVisibility(0);
                    insightsFollowersActivityRNChartFragment.A01((ArrayList) null, insightsFollowersActivityRNChartFragment.A06);
                }
                insightsFollowersActivityRNChartFragment.mEmptyTextView.setVisibility(0);
                insightsFollowersActivityRNChartFragment.mRNContainer.setVisibility(8);
            } else {
                if (!insightsFollowersActivityRNChartFragment.A05.isEmpty()) {
                    insightsFollowersActivityRNChartFragment.mEmptyTextView.setVisibility(8);
                    insightsFollowersActivityRNChartFragment.mRNContainer.setVisibility(0);
                    insightsFollowersActivityRNChartFragment.A01(insightsFollowersActivityRNChartFragment.A05, (ArrayList) null);
                }
                insightsFollowersActivityRNChartFragment.mEmptyTextView.setVisibility(0);
                insightsFollowersActivityRNChartFragment.mRNContainer.setVisibility(8);
            }
            C7I c7i = new C7I(insightsFollowersActivityRNChartFragment);
            AnonymousClass1E1.A0b(insightsFollowersActivityRNChartFragment.mEmptyTextView, c7i);
            AnonymousClass1E1.A0b(insightsFollowersActivityRNChartFragment.mRNContainer, c7i);
        }
    }

    public final C06590Pq getSession() {
        return AnonymousClass0J1.A06(this.mArguments);
    }

    private void A01(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        AnonymousClass0C1 r5 = (AnonymousClass0C1) getSession();
        Bundle bundle = new Bundle();
        bundle.putString("pk", r5.A04());
        bundle.putString("userID", r5.A04());
        bundle.putString("fbUserId", C14100jl.A01(r5));
        if (arrayList != null) {
            bundle.putString("chartType", "VERTICAL_BAR");
            bundle.putString("data", AnonymousClass6KJ.A01(arrayList));
        } else if (arrayList2 != null) {
            bundle.putString("chartType", "VERTICAL_BAR_PAGING");
            try {
                StringWriter stringWriter = new StringWriter();
                C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                A052.A0S();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    DaysHourlyFollowersData daysHourlyFollowersData = (DaysHourlyFollowersData) it.next();
                    A052.A0T();
                    String str2 = daysHourlyFollowersData.A00;
                    if (str2 != null) {
                        A052.A0H("name", str2);
                    }
                    if (daysHourlyFollowersData.A01 != null) {
                        A052.A0d("points");
                        A052.A0S();
                        Iterator it2 = daysHourlyFollowersData.A01.iterator();
                        while (it2.hasNext()) {
                            DataPoint dataPoint = (DataPoint) it2.next();
                            if (dataPoint != null) {
                                AnonymousClass6KK.A00(A052, dataPoint);
                            }
                        }
                        A052.A0P();
                    }
                    A052.A0Q();
                }
                A052.A0P();
                A052.close();
                str = stringWriter.toString();
            } catch (IOException unused) {
                str = "";
            }
            bundle.putString("data", str);
        }
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r5);
        newReactNativeLauncher.BkI("IgInsightsChartRoute");
        newReactNativeLauncher.Bjt(bundle);
        Bundle A70 = newReactNativeLauncher.A70();
        AnonymousClass1H6 A0Q = getChildFragmentManager().A0Q();
        C16310oO.A00.A00();
        C23176ABe aBe = new C23176ABe();
        aBe.setArguments(A70);
        A0Q.A02(C0003R.C0005id.insights_chart_rn_container, aBe);
        A0Q.A0H();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(261170509);
        super.onCreate(bundle);
        this.A04 = new C27355CAa((AnonymousClass0C1) getSession(), this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A05 = bundle2.getParcelableArrayList("ARG.Chart.Followers.Daily");
            this.A06 = bundle2.getParcelableArrayList("ARG.Chart.Followers.Hourly");
        }
        AnonymousClass0Z0.A09(1941953177, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(918180871);
        View inflate = layoutInflater.inflate(C0003R.layout.insights_rn_chart_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1441753670, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1660040021);
        super.onDestroy();
        C27355CAa cAa = this.A04;
        Integer num = Constants.A0U;
        Integer num2 = Constants.A0N;
        cAa.A04(num, num2, num2, System.currentTimeMillis() - this.A09);
        AnonymousClass0Z0.A09(155686909, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyTextView = (IgTextView) view.findViewById(C0003R.C0005id.insights_chart_empty);
        this.mRNContainer = view.findViewById(C0003R.C0005id.insights_chart_rn_container);
        this.mFilterLinearLayout = (LinearLayout) view.findViewById(C0003R.C0005id.insights_chart_filter_view);
        this.A08 = C019000b.A00(getContext(), C0003R.color.blue_5);
        this.A00 = C019000b.A00(getContext(), C0003R.color.igds_primary_text);
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_chart_title)).setText(C0003R.string.followers_activity_title);
        this.mEmptyTextView.setText(C0003R.string.followers_activity_empty);
        View findViewById = view.findViewById(C0003R.C0005id.insights_chart_info_icon);
        this.A01 = findViewById;
        findViewById.setOnClickListener(new C6p(this));
        Typeface create = Typeface.create("Roboto-Regular", 0);
        Resources resources = getResources();
        float dimension = resources.getDimension(C0003R.dimen.font_medium);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_small);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.account_margin_medium_large);
        IgTextView igTextView = new IgTextView(getContext());
        igTextView.setId(View.generateViewId());
        igTextView.setText(C0003R.string.followers_activity_filter_hours);
        igTextView.setTextColor(this.A00);
        igTextView.setTypeface(create);
        igTextView.setTextSize(0, dimension);
        igTextView.setPaddingRelative(dimensionPixelSize2, 0, 0, dimensionPixelSize);
        this.A03 = igTextView;
        igTextView.setOnClickListener(new C27279C6q(this));
        this.mFilterLinearLayout.addView(this.A03);
        AnonymousClass1E1.A0b(this.A03, new C7K(this));
        IgTextView igTextView2 = new IgTextView(getContext());
        igTextView2.setId(View.generateViewId());
        igTextView2.setText(C0003R.string.followers_activity_filter_days);
        igTextView2.setTextColor(this.A00);
        igTextView2.setTypeface(create);
        igTextView2.setTextSize(0, dimension);
        igTextView2.setPaddingRelative(dimensionPixelSize2, 0, 0, dimensionPixelSize);
        this.A02 = igTextView2;
        igTextView2.setOnClickListener(new C27280C6r(this));
        this.mFilterLinearLayout.addView(this.A02);
        AnonymousClass1E1.A0b(this.A02, new C7H(this));
        A00(this, true);
        this.A09 = System.currentTimeMillis();
    }
}
