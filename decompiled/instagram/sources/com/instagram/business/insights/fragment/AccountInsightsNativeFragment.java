package com.instagram.business.insights.fragment;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass40t;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C16170o9;
import p000X.C17640qZ;
import p000X.C220559et;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C29131Os;
import p000X.C29471Qa;
import p000X.C6Q;
import p000X.C6S;
import p000X.C6U;
import p000X.C6V;
import p000X.C6W;

public class AccountInsightsNativeFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public AnonymousClass1AM A00;
    public C27355CAa A01;
    public C29131Os A02;
    public C29471Qa A03;
    public AnonymousClass1OC A04;
    public boolean A05 = true;
    public long A06;
    public AppBarLayout A07;
    public WeakReference A08;
    public WeakReference A09;
    public WeakReference A0A;
    public CircularImageView mAvatarImageView;
    public FrameLayout mQPView;
    public IgSegmentedTabLayout mTabLayout;
    public IgTextView mUsername;

    public static void A01(AccountInsightsNativeFragment accountInsightsNativeFragment) {
        A04(accountInsightsNativeFragment, 1);
        WeakReference weakReference = accountInsightsNativeFragment.A08;
        if (weakReference == null || weakReference.get() == null) {
            String token = accountInsightsNativeFragment.getSession().getToken();
            AccountInsightsActivityFragment accountInsightsActivityFragment = new AccountInsightsActivityFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
            accountInsightsActivityFragment.setArguments(bundle);
            accountInsightsNativeFragment.A08 = new WeakReference(accountInsightsActivityFragment);
        }
        accountInsightsNativeFragment.A00((AnonymousClass1HD) accountInsightsNativeFragment.A08.get(), ((C27341Hl) accountInsightsNativeFragment.A08.get()).getModuleName());
    }

    public static void A02(AccountInsightsNativeFragment accountInsightsNativeFragment) {
        A04(accountInsightsNativeFragment, 2);
        WeakReference weakReference = accountInsightsNativeFragment.A09;
        if (weakReference == null || weakReference.get() == null) {
            String token = accountInsightsNativeFragment.getSession().getToken();
            InsightsAudienceFragment insightsAudienceFragment = new InsightsAudienceFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
            insightsAudienceFragment.setArguments(bundle);
            accountInsightsNativeFragment.A09 = new WeakReference(insightsAudienceFragment);
        }
        accountInsightsNativeFragment.A00((AnonymousClass1HD) accountInsightsNativeFragment.A09.get(), ((C27341Hl) accountInsightsNativeFragment.A09.get()).getModuleName());
    }

    public final String getModuleName() {
        return AnonymousClass40t.$const$string(183);
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private void A00(AnonymousClass1HD r3, String str) {
        if (this.A00.A0N(str) == null) {
            AnonymousClass1H6 A0Q = this.A00.A0Q();
            A0Q.A04(C0003R.C0005id.content_view, r3, str);
            A0Q.A0H();
        }
    }

    public static void A03(AccountInsightsNativeFragment accountInsightsNativeFragment) {
        WeakReference weakReference = accountInsightsNativeFragment.A0A;
        if (weakReference == null || weakReference.get() == null) {
            String token = accountInsightsNativeFragment.getSession().getToken();
            InsightsContentFragment insightsContentFragment = new InsightsContentFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
            insightsContentFragment.setArguments(bundle);
            accountInsightsNativeFragment.A0A = new WeakReference(insightsContentFragment);
        }
        accountInsightsNativeFragment.A00((AnonymousClass1HD) accountInsightsNativeFragment.A0A.get(), ((C27341Hl) accountInsightsNativeFragment.A0A.get()).getModuleName());
    }

    public static void A04(AccountInsightsNativeFragment accountInsightsNativeFragment, int i) {
        Integer num;
        IgSegmentedTabLayout igSegmentedTabLayout = accountInsightsNativeFragment.mTabLayout;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.setSelectedIndex(i);
            HashMap hashMap = new HashMap();
            hashMap.put("primaryContentTab", "true");
            C27355CAa cAa = accountInsightsNativeFragment.A01;
            Integer num2 = Constants.A0C;
            if (i == 0) {
                num = Constants.ZERO;
            } else if (i != 1) {
                num = num2;
            } else {
                num = Constants.ONE;
            }
            Integer num3 = Constants.A0P;
            cAa.A06(num2, num, num3, num3, hashMap, (String) null);
        }
    }

    public final C06590Pq getSession() {
        return AnonymousClass0J1.A06(this.mArguments);
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.insights);
        r2.Bo6(true);
    }

    public final boolean onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis() - this.A06;
        if (!C16170o9.A00() || currentTimeMillis <= 3000) {
            return false;
        }
        C16170o9.A00.A01(getActivity(), (AnonymousClass0C1) getSession(), "221413735630339");
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1956321983);
        super.onCreate(bundle);
        AnonymousClass0C1 r6 = (AnonymousClass0C1) getSession();
        C17640qZ r3 = C17640qZ.A00;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.ACCOUNT_INSIGHTS_HEADER;
        AnonymousClass1NW A032 = r3.A03();
        A032.A03 = new C6Q(this);
        AnonymousClass1OC A092 = r3.A09(this, this, r6, quickPromotionSlot, A032.A00());
        this.A04 = A092;
        C29131Os A002 = C17640qZ.A00.A00(getContext(), r6, A092);
        this.A02 = A002;
        this.A03 = new C29471Qa(ImmutableList.A03(A002));
        registerLifecycleListener(this.A04);
        if (bundle != null) {
            this.A05 = bundle.getBoolean("AppBarLayout_Expanded", true);
        }
        this.A01 = new C27355CAa((AnonymousClass0C1) getSession(), this);
        AnonymousClass0Z0.A09(-1449751130, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(817273082);
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), C0003R.style.InsightsAccountTabLayoutTheme)).inflate(C0003R.layout.account_insights_native_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1264601023, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(884218056);
        super.onDestroy();
        this.A01.A04(Constants.A0P, (Integer) null, Constants.A0N, System.currentTimeMillis() - this.A06);
        AnonymousClass00B.A01.markerEnd(39124996, 4);
        AnonymousClass0Z0.A09(2030095495, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1441222749);
        super.onDestroyView();
        unregisterLifecycleListener(this.A04);
        AnonymousClass0Z0.A09(-9133554, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        IgSegmentedTabLayout igSegmentedTabLayout = this.mTabLayout;
        if (igSegmentedTabLayout != null) {
            bundle.putInt("ARG.Account.SelectedTab", igSegmentedTabLayout.getSelectedIndex());
        }
        bundle.putBoolean("AppBarLayout_Expanded", this.A05);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mAvatarImageView = (CircularImageView) view.findViewById(C0003R.C0005id.avatar_imageview);
        this.mUsername = (IgTextView) view.findViewById(C0003R.C0005id.username);
        this.mTabLayout = (IgSegmentedTabLayout) view.findViewById(C0003R.C0005id.segmented_tab_layout);
        this.mQPView = (FrameLayout) view.findViewById(C0003R.C0005id.qp_container);
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(C0003R.C0005id.app_bar);
        this.A07 = appBarLayout;
        appBarLayout.A01(new C6W(this));
        this.A07.setExpanded(this.A05);
        this.A00 = getChildFragmentManager();
        C13300iJ r3 = ((AnonymousClass0C1) getSession()).A06;
        CircularImageView circularImageView = this.mAvatarImageView;
        if (circularImageView != null) {
            circularImageView.setUrl(r3.ASv(), getModuleName());
        }
        IgTextView igTextView = this.mUsername;
        if (igTextView != null) {
            igTextView.setText(r3.AZn());
        }
        IgSegmentedTabLayout igSegmentedTabLayout = this.mTabLayout;
        if (igSegmentedTabLayout != null) {
            igSegmentedTabLayout.A01(new C220559et(C0003R.string.account_tab_content, (String) null, true), new C6S(this));
            this.mTabLayout.A01(new C220559et(C0003R.string.account_tab_activity, (String) null, true), new C6U(this));
            this.mTabLayout.A01(new C220559et(C0003R.string.account_tab_audience, (String) null, true), new C6V(this));
        }
        Bundle bundle2 = this.mArguments;
        int i = 0;
        if (bundle2 != null && bundle2.getInt("ARG.Account.SelectedTab", -1) != -1) {
            i = this.mArguments.getInt("ARG.Account.SelectedTab");
            this.mArguments.remove("ARG.Account.SelectedTab");
        } else if (bundle != null) {
            i = bundle.getInt("ARG.Account.SelectedTab", 0);
        } else {
            A03(this);
        }
        this.mTabLayout.setSelectedIndex(i);
        this.A04.BL4();
        this.A01.A04(Constants.A0P, (Integer) null, Constants.A0C, 0);
        this.A06 = System.currentTimeMillis();
    }
}
