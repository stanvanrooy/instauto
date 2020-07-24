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
import com.instagram.business.insights.model.InsightsChartFilterData;
import com.instagram.common.p004ui.base.IgTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.AGM;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass6KJ;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C14100jl;
import p000X.C16310oO;
import p000X.C16920pO;
import p000X.C23176ABe;
import p000X.C27277C6m;
import p000X.C27278C6n;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C53832Un;
import p000X.C7E;
import p000X.C7J;

public class InsightsRNChartFragment extends C27341Hl {
    public int A00;
    public View A01;
    public C27355CAa A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public ArrayList A08;
    public List A09;
    public String[] A0A;
    public int A0B;
    public long A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public IgTextView mEmptyTextView;
    public LinearLayout mFilterLinearLayout;
    public View mRNContainer;

    public static void A00(InsightsRNChartFragment insightsRNChartFragment, InsightsChartFilterData insightsChartFilterData) {
        int i;
        String str = insightsChartFilterData.A01;
        if (!str.equals(insightsRNChartFragment.A0D)) {
            insightsRNChartFragment.A0D = str;
            for (TextView textView : insightsRNChartFragment.A09) {
                if (insightsChartFilterData.A01.equals(textView.getText().toString())) {
                    i = insightsRNChartFragment.A0B;
                } else {
                    i = insightsRNChartFragment.A00;
                }
                textView.setTextColor(i);
            }
            ArrayList arrayList = insightsChartFilterData.A02;
            if (arrayList.isEmpty()) {
                insightsRNChartFragment.mEmptyTextView.setVisibility(0);
                insightsRNChartFragment.mRNContainer.setVisibility(8);
                insightsRNChartFragment.mFilterLinearLayout.setVisibility(8);
            } else {
                insightsRNChartFragment.mEmptyTextView.setVisibility(8);
                insightsRNChartFragment.mRNContainer.setVisibility(0);
                AnonymousClass0C1 r3 = (AnonymousClass0C1) insightsRNChartFragment.getSession();
                Bundle bundle = new Bundle();
                bundle.putString("pk", r3.A04());
                bundle.putString("userID", r3.A04());
                bundle.putString("fbUserId", C14100jl.A01(r3));
                bundle.putString("chartType", insightsRNChartFragment.A05);
                bundle.putString("data", AnonymousClass6KJ.A01(arrayList));
                C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r3);
                newReactNativeLauncher.BkI("IgInsightsChartRoute");
                newReactNativeLauncher.Bjt(bundle);
                Bundle A70 = newReactNativeLauncher.A70();
                AnonymousClass1H6 A0Q = insightsRNChartFragment.getChildFragmentManager().A0Q();
                C16310oO.A00.A00();
                C23176ABe aBe = new C23176ABe();
                aBe.setArguments(A70);
                A0Q.A02(C0003R.C0005id.insights_chart_rn_container, aBe);
                A0Q.A0H();
            }
            C7E c7e = new C7E(insightsRNChartFragment);
            AnonymousClass1E1.A0b(insightsRNChartFragment.mEmptyTextView, c7e);
            AnonymousClass1E1.A0b(insightsRNChartFragment.mRNContainer, c7e);
        }
    }

    public final String getModuleName() {
        return AnonymousClass000.A0E("account_insights_chart_fragment", this.A05);
    }

    public final C06590Pq getSession() {
        return AnonymousClass0J1.A06(this.mArguments);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2050628346);
        super.onCreate(bundle);
        this.A02 = new C27355CAa((AnonymousClass0C1) getSession(), this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0F = bundle2.getString("ARG.Chart.Title");
            this.A0E = bundle2.getString("ARG.Chart.EmptyText");
            this.A05 = bundle2.getString("ARG.Chart.Type");
            this.A03 = AGM.A00(bundle2.getString("ARG.Chart.Parent"));
            this.A04 = AGM.A00(bundle2.getString("ARG.Chart.Unit"));
            this.A08 = bundle2.getParcelableArrayList("ARG.Chart.Filters");
            this.A07 = bundle2.getString("ARG.Chart.Help.Title", "");
            this.A06 = bundle2.getString("ARG.Chart.Help.Message", "");
            this.A0A = bundle2.getStringArray("ARG.Chart.Help.Items");
        }
        AnonymousClass0Z0.A09(-1825186260, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1865203155);
        View inflate = layoutInflater.inflate(C0003R.layout.insights_rn_chart_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1489958623, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1084184157);
        super.onDestroy();
        this.A02.A04(this.A04, this.A03, Constants.A0N, System.currentTimeMillis() - this.A0C);
        AnonymousClass0Z0.A09(143551961, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mEmptyTextView = (IgTextView) view.findViewById(C0003R.C0005id.insights_chart_empty);
        this.mRNContainer = view.findViewById(C0003R.C0005id.insights_chart_rn_container);
        this.mFilterLinearLayout = (LinearLayout) view.findViewById(C0003R.C0005id.insights_chart_filter_view);
        this.A0B = C019000b.A00(getContext(), C0003R.color.blue_5);
        this.A00 = C019000b.A00(getContext(), C0003R.color.igds_primary_text);
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_chart_title)).setText(this.A0F);
        this.mEmptyTextView.setText(this.A0E);
        View findViewById = view.findViewById(C0003R.C0005id.insights_chart_info_icon);
        this.A01 = findViewById;
        findViewById.setOnClickListener(new C27277C6m(this));
        ArrayList arrayList = this.A08;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.A08;
            AnonymousClass0a4.A06(arrayList2);
            this.A09 = new ArrayList(arrayList2.size());
            if (this.A08.size() > 1) {
                Typeface create = Typeface.create("Roboto-Regular", 0);
                Resources resources = getResources();
                float dimension = resources.getDimension(C0003R.dimen.font_medium);
                int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.insights_view_margin_small);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.account_margin_medium_large);
                C7J c7j = new C7J(this);
                Iterator it = this.A08.iterator();
                while (it.hasNext()) {
                    InsightsChartFilterData insightsChartFilterData = (InsightsChartFilterData) it.next();
                    IgTextView igTextView = new IgTextView(getContext());
                    igTextView.setText(insightsChartFilterData.A01);
                    igTextView.setTextColor(this.A00);
                    igTextView.setTypeface(create);
                    igTextView.setTextSize(0, dimension);
                    igTextView.setPaddingRelative(dimensionPixelSize2, 0, 0, dimensionPixelSize);
                    igTextView.setOnClickListener(new C27278C6n(this, insightsChartFilterData));
                    AnonymousClass1E1.A0b(igTextView, c7j);
                    this.mFilterLinearLayout.addView(igTextView);
                    this.A09.add(igTextView);
                    igTextView.setTag(this.A01);
                    this.A01 = igTextView;
                }
            }
            A00(this, (InsightsChartFilterData) this.A08.get(0));
        }
        this.A0C = System.currentTimeMillis();
    }
}
