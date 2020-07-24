package com.instagram.business.insights.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass6KJ;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C14100jl;
import p000X.C15300mf;
import p000X.C16310oO;
import p000X.C16920pO;
import p000X.C23176ABe;
import p000X.C27048Bx0;
import p000X.C27281C6t;
import p000X.C27282C6u;
import p000X.C27284C6y;
import p000X.C27355CAa;
import p000X.C36981iv;
import p000X.C53832Un;
import p000X.C74;

public class AccountInsightsActivityFragment extends BaseAccountInsightsTabFragment {
    public static final NumberFormat A03 = NumberFormat.getInstance(C15300mf.A03());
    public static final SimpleDateFormat A04 = new SimpleDateFormat("MMM dd", C15300mf.A03());
    public C27282C6u A00;
    public AnonymousClass0C1 A01;
    public boolean A02;
    public LinearLayout mDiscoverySectionContainer;
    public View mDiscoveryView;
    public LinearLayout mInteractionsSectionContainer;
    public View mInteractionsView;
    public FrameLayout mProductsRNChart;
    public LinearLayout mProductsSectionContainer;
    public View mProductsView;

    public final String getModuleName() {
        return "account_insights_activity";
    }

    public static void A04(AccountInsightsActivityFragment accountInsightsActivityFragment, List list, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("pk", accountInsightsActivityFragment.A01.A04());
        bundle.putString("userID", accountInsightsActivityFragment.A01.A04());
        bundle.putString("fbUserId", C14100jl.A01(accountInsightsActivityFragment.A01));
        bundle.putString("chartType", "VERTICAL_BAR");
        bundle.putString("data", AnonymousClass6KJ.A01(list));
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(accountInsightsActivityFragment.A01);
        newReactNativeLauncher.BkI("IgInsightsChartRoute");
        newReactNativeLauncher.Bjt(bundle);
        Bundle A70 = newReactNativeLauncher.A70();
        AnonymousClass1H6 A0Q = accountInsightsActivityFragment.getChildFragmentManager().A0Q();
        C16310oO.A00.A00();
        C23176ABe aBe = new C23176ABe();
        aBe.setArguments(A70);
        A0Q.A02(i, aBe);
        A0Q.A0H();
    }

    public final C06590Pq getSession() {
        Bundle bundle = this.mArguments;
        AnonymousClass11J.A00(bundle);
        return AnonymousClass0J1.A06(bundle);
    }

    public static void A00(View view, int i, String str, String str2) {
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_value)).setText(C36981iv.A01(i));
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_value_message)).setText(str);
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_value_time_frame)).setText(str2);
    }

    public static void A01(AccountInsightsActivityFragment accountInsightsActivityFragment, View view, int i, int i2) {
        ((IgImageView) view.findViewById(C0003R.C0005id.activity_empty_icon)).setImageDrawable(C019000b.A03(accountInsightsActivityFragment.getContext(), i));
        ((IgTextView) view.findViewById(C0003R.C0005id.activity_empty_message)).setText(i2);
    }

    public static void A02(AccountInsightsActivityFragment accountInsightsActivityFragment, View view, String str, String str2, String str3, String[] strArr, boolean z, boolean z2, Integer num) {
        ((IgTextView) view.findViewById(C0003R.C0005id.insights_chart_title)).setText(str);
        if (z) {
            IgImageView igImageView = (IgImageView) view.findViewById(C0003R.C0005id.insights_chart_info_icon);
            igImageView.setOnClickListener(new C27281C6t(accountInsightsActivityFragment, str2, str3, z2, num, strArr));
            igImageView.setVisibility(0);
        }
        view.setVisibility(0);
    }

    public static void A03(AccountInsightsActivityFragment accountInsightsActivityFragment, LinearLayout linearLayout, List list) {
        AnonymousClass11J.A00(accountInsightsActivityFragment.getContext());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C74 c74 = (C74) it.next();
            C27048Bx0 bx0 = new C27048Bx0(accountInsightsActivityFragment.getContext());
            bx0.A02.setText(c74.A00);
            bx0.A03.setText(C36981iv.A01(c74.A01));
            String str = c74.A03;
            if (str != null) {
                bx0.A01.setText(str);
                bx0.A01.setVisibility(0);
            }
            linearLayout.addView(bx0);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1640698918);
        super.onCreate(bundle);
        AnonymousClass0C1 r0 = (AnonymousClass0C1) getSession();
        this.A01 = r0;
        this.A02 = C36981iv.A03(r0);
        C27355CAa cAa = new C27355CAa(this.A01, this);
        this.A00 = cAa;
        C27282C6u c6u = new C27282C6u(this.A01, cAa, this.A02);
        this.A00 = c6u;
        c6u.A01();
        registerLifecycleListener(this.A00);
        AnonymousClass0Z0.A09(1221088142, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(851734352);
        super.onDestroy();
        C27282C6u c6u = this.A00;
        if (c6u != null) {
            unregisterLifecycleListener(c6u);
        }
        AnonymousClass0Z0.A09(670236299, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A07();
        this.mContentViewStub.setLayoutResource(C0003R.layout.account_insights_activity_fragment);
        this.mContentViewStub.inflate();
        this.mInteractionsView = ((ViewStub) view.findViewById(C0003R.C0005id.interactions_view)).inflate();
        this.mInteractionsSectionContainer = (LinearLayout) view.findViewById(C0003R.C0005id.interactions_section_view);
        this.mDiscoveryView = ((ViewStub) view.findViewById(C0003R.C0005id.discovery_view)).inflate();
        this.mDiscoverySectionContainer = (LinearLayout) view.findViewById(C0003R.C0005id.discovery_section_view);
        if (this.A02) {
            view.findViewById(C0003R.C0005id.interaction_divider).setVisibility(0);
            this.mProductsRNChart = (FrameLayout) view.findViewById(C0003R.C0005id.products_rn_chart_container);
            this.mProductsView = ((ViewStub) view.findViewById(C0003R.C0005id.products_view)).inflate();
            this.mProductsSectionContainer = (LinearLayout) view.findViewById(C0003R.C0005id.products_section_view);
        }
        C27282C6u c6u = this.A00;
        synchronized (c6u) {
            c6u.A00 = this;
            if (!c6u.A02) {
                C27284C6y c6y = c6u.A01;
                if (c6y != null) {
                    C27282C6u.A00(c6u, c6y);
                }
            } else if (this != null) {
                A06();
            }
        }
    }
}
