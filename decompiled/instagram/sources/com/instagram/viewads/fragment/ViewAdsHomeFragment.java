package com.instagram.viewads.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.viewpager.ScrollingOptionalViewPager;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.AnonymousClass6YQ;
import p000X.C06590Pq;
import p000X.C119435Al;
import p000X.C22140xu;
import p000X.C26301Cs;
import p000X.C27341Hl;

public class ViewAdsHomeFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HL, AnonymousClass1HM, AnonymousClass2NF {
    public static final List A03 = Arrays.asList(C119435Al.values());
    public AnonymousClass0C1 A00;
    public C119435Al A01 = C119435Al.FEED;
    public String A02;
    public FixedTabBar mTabBar;
    public AnonymousClass3DK mTabController;
    public ScrollingOptionalViewPager mViewPager;

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void A00(boolean z) {
        AnonymousClass3DK r0 = this.mTabController;
        int i = 8;
        if (z) {
            i = 0;
        }
        r0.A01.setVisibility(i);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        C119435Al r6 = (C119435Al) obj;
        switch (r6.ordinal()) {
            case 0:
                C22140xu.A00.A00();
                String token = this.A00.getToken();
                String str = this.A02;
                Bundle bundle = new Bundle();
                AnonymousClass6YQ r1 = new AnonymousClass6YQ();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
                bundle.putString("ViewAds.TARGET_USER_ID", str);
                r1.setArguments(bundle);
                return r1;
            case 1:
                C22140xu.A00.A00();
                String token2 = this.A00.getToken();
                String str2 = this.A02;
                Bundle bundle2 = new Bundle();
                ViewAdsStoryFragment viewAdsStoryFragment = new ViewAdsStoryFragment();
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", token2);
                bundle2.putString("ViewAds.TARGET_USER_ID", str2);
                viewAdsStoryFragment.setArguments(bundle2);
                return viewAdsStoryFragment;
            default:
                throw new IllegalArgumentException("Unsupported tab: " + r6);
        }
    }

    public final AnonymousClass3DN AB4(Object obj) {
        return AnonymousClass3DN.A00(((C119435Al) obj).A00);
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        this.A01 = (C119435Al) obj;
    }

    public final void Bel() {
        ((AnonymousClass1HL) this.mTabController.A01()).Bel();
    }

    public final String getModuleName() {
        C119435Al r3 = this.A01;
        switch (r3.ordinal()) {
            case 0:
                return "view_ads_feed";
            case 1:
                return "view_ads_story";
            default:
                throw new IllegalArgumentException("Unsupported tab: " + r3);
        }
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final boolean onBackPressed() {
        AnonymousClass1HD A012 = this.mTabController.A01();
        if (A012 instanceof AnonymousClass1HK) {
            return ((AnonymousClass1HK) A012).onBackPressed();
        }
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.view_ads_title);
        r2.Bo6(true);
        r2.BmP(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(297243771);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A02 = bundle2.getString("ViewAds.TARGET_USER_ID");
        AnonymousClass0Z0.A09(-992699852, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2012077965);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_view_ads_home, viewGroup, false);
        AnonymousClass0Z0.A09(1605087353, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1557369285);
        super.onDestroyView();
        ViewAdsHomeFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-725238157, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(1926535219);
        super.onStart();
        if (getRootActivity() instanceof C26301Cs) {
            ((C26301Cs) getRootActivity()).Bl6(0);
        }
        AnonymousClass0Z0.A09(2114046562, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mTabBar = (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view);
        this.mViewPager = (ScrollingOptionalViewPager) view.findViewById(C0003R.C0005id.view_pager);
        AnonymousClass3DK r1 = new AnonymousClass3DK(this, getChildFragmentManager(), this.mViewPager, this.mTabBar, A03);
        this.mTabController = r1;
        r1.A03(this.A01);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
