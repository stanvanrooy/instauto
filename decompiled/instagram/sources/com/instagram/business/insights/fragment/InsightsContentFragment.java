package com.instagram.business.insights.fragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.business.insights.p014ui.InsightsTopStoriesView;
import com.instagram.business.insights.p014ui.InsightsUnitParagraphView;
import com.instagram.common.p004ui.base.IgTextView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6AF;
import p000X.C06220Of;
import p000X.C13300iJ;
import p000X.C14100jl;
import p000X.C145266Iy;
import p000X.C152746fv;
import p000X.C17020pY;
import p000X.C22290yA;
import p000X.C249816v;
import p000X.C27288C7c;
import p000X.C27289C7d;
import p000X.C27292C7h;
import p000X.C27293C7i;
import p000X.C27294C7j;
import p000X.C27295C7k;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C31131Wo;
import p000X.C31151Wq;
import p000X.C53932Vb;
import p000X.C75;
import p000X.C7l;

public class InsightsContentFragment extends BaseAccountInsightsTabFragment implements C31131Wo, C53932Vb {
    public C27289C7d A00;
    public InsightsStoryViewerController A01;
    public C31151Wq A02;
    public AnonymousClass0C1 A03;
    public WeakReference A04;
    public boolean A05;
    public boolean A06;
    public C27355CAa A07;
    public InsightsUnitParagraphView mContentInfo;
    public View mOverviewHeader;
    public ViewStub mPartnerPostsEmptyStub;
    public ViewStub mPartnerPostsViewStub;
    public ViewStub mPartnerStoriesEmptyStub;
    public ViewStub mPartnerStoriesViewStub;
    public ViewStub mPromotionsEmptyViewStub;
    public View mPromotionsLayout;
    public IgTextView mPromotionsSeeOlder;
    public ViewStub mPromotionsViewStub;
    public ViewStub mYourPostsEmptyViewStub;
    public IgTextView mYourPostsSeeOlder;
    public ViewStub mYourPostsViewStub;
    public ViewStub mYourStoriesEmptyViewStub;
    public View mYourStoriesInfoIcon;
    public IgTextView mYourStoriesSeeOlder;
    public ViewStub mYourStoriesViewStub;

    public final void AbX(Intent intent) {
    }

    public final void Ar4(int i, int i2) {
    }

    public final void Ar5(int i, int i2) {
    }

    public final String getModuleName() {
        return "account_insights_content";
    }

    public static void A00(InsightsContentFragment insightsContentFragment, Integer num, Integer num2, Integer num3, Integer num4) {
        insightsContentFragment.A07.A06(num, num2, num3, num4, (Map) null, (String) null);
    }

    public final void A08(ImmutableList immutableList) {
        this.mYourStoriesInfoIcon.setVisibility(0);
        View inflate = this.mYourStoriesViewStub.inflate();
        Integer num = Constants.A0Z;
        InsightsTopStoriesView insightsTopStoriesView = (InsightsTopStoriesView) inflate.findViewById(C0003R.C0005id.content_top_stories_view);
        insightsTopStoriesView.A02 = false;
        insightsTopStoriesView.setData(immutableList);
        insightsTopStoriesView.A01 = getModuleName();
        insightsTopStoriesView.A00 = new C7l(this, num);
        View view = this.mView;
        AnonymousClass0a4.A06(view);
        View findViewById = view.findViewById(C0003R.C0005id.content_top_stories_create);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C152746fv(this));
    }

    public static void A01(InsightsContentFragment insightsContentFragment, String str, String str2, Integer num, String[] strArr) {
        AnonymousClass11J.A00(insightsContentFragment.getActivity());
        AnonymousClass11J.A00(insightsContentFragment.getContext());
        A00(insightsContentFragment, Constants.A0C, Constants.A03, Constants.A0A, num);
        C27341Hl A022 = C22290yA.A00.A00().A02(insightsContentFragment.A03.getToken(), str, str2, strArr);
        AnonymousClass2TH r1 = new AnonymousClass2TH(insightsContentFragment.A03);
        r1.A00 = 0.35f;
        r1.A0T = false;
        r1.A00().A01(insightsContentFragment.getActivity(), A022);
    }

    public final void BJ1(String str) {
        AnonymousClass5F9.A03(getActivity(), str, 1);
        AnonymousClass0C1 r2 = this.A03;
        C27355CAa.A03(r2, "top_stories", str, C14100jl.A01(r2));
    }

    public final void BJW(List list, AnonymousClass1OY r12) {
        View view;
        if (!list.isEmpty()) {
            boolean z = false;
            String APo = ((AnonymousClass1NJ) list.get(0)).APo();
            C13300iJ A0c = ((AnonymousClass1NJ) list.get(0)).A0c(this.A03);
            AnonymousClass1OY r9 = r12;
            if (r12 == AnonymousClass1OY.BUSINESS_INSIGHTS) {
                z = true;
            }
            WeakReference weakReference = this.A04;
            if (weakReference == null || weakReference.get() == null) {
                view = this.mYourStoriesInfoIcon;
            } else {
                view = (View) this.A04.get();
            }
            this.A01.A02(C17020pY.A00().A0Q(this.A03).A0J(APo, new C249816v(A0c), z, list), 0, C06220Of.A0A(view), getActivity(), this.A03, r9);
        }
    }

    public final void BpW(File file, int i) {
        AnonymousClass6AF.A02(getActivity(), i, file);
    }

    public final void Bps(Intent intent, int i) {
        AnonymousClass1BH.A0B(intent, i, this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A02.Ar3(i, i2, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (p000X.C36981iv.A03(r1) == false) goto L_0x0052;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean booleanValue;
        boolean z2;
        int A022 = AnonymousClass0Z0.A02(1363400167);
        super.onCreate(bundle);
        AnonymousClass0C1 r1 = (AnonymousClass0C1) getSession();
        this.A03 = r1;
        this.A07 = new C27355CAa(r1, this);
        AnonymousClass0C1 r4 = this.A03;
        Integer num = r4.A06.A1b;
        if (num == Constants.A0C || (num == Constants.A0N && ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.INSIGHTS_PROMOTIONS_FOR_CREATORS, "has_promotions", false, (AnonymousClass04H) null)).booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        this.A06 = z;
        AnonymousClass0C1 r12 = this.A03;
        Boolean bool = r12.A06.A0e;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            z2 = true;
        }
        z2 = false;
        this.A05 = z2;
        C27289C7d c7d = new C27289C7d(this.A03, this.A07, z2, this.A06);
        this.A00 = c7d;
        c7d.A01();
        registerLifecycleListener(this.A00);
        InsightsStoryViewerController insightsStoryViewerController = new InsightsStoryViewerController(getActivity());
        this.A01 = insightsStoryViewerController;
        registerLifecycleListener(insightsStoryViewerController);
        AnonymousClass0Z0.A09(1185305209, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1706754268);
        unregisterLifecycleListener(this.A01);
        super.onDestroy();
        unregisterLifecycleListener(this.A00);
        AnonymousClass0Z0.A09(1284275868, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mContentViewStub.setLayoutResource(C0003R.layout.content_insights_fragment);
        this.mContentViewStub.inflate();
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.your_content_posts_stub);
        viewStub.setLayoutResource(C0003R.layout.content_insights_posts_layout);
        viewStub.inflate();
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0003R.C0005id.your_content_stories_stub);
        viewStub2.setLayoutResource(C0003R.layout.content_insights_stories_layout);
        viewStub2.inflate();
        this.mContentInfo = (InsightsUnitParagraphView) view.findViewById(C0003R.C0005id.content_info);
        this.mYourPostsSeeOlder = (IgTextView) view.findViewById(C0003R.C0005id.your_content_posts_see_older);
        this.mYourPostsEmptyViewStub = (ViewStub) view.findViewById(C0003R.C0005id.your_content_posts_empty_stub);
        this.mYourPostsViewStub = (ViewStub) view.findViewById(C0003R.C0005id.your_content_posts_stub);
        this.mYourPostsSeeOlder.setOnClickListener(new C27295C7k(this));
        this.mYourStoriesSeeOlder = (IgTextView) view.findViewById(C0003R.C0005id.your_content_stories_see_older);
        this.mYourStoriesEmptyViewStub = (ViewStub) view.findViewById(C0003R.C0005id.your_content_stories_empty_stub);
        this.mYourStoriesViewStub = (ViewStub) view.findViewById(C0003R.C0005id.your_content_stories_stub);
        this.mYourStoriesInfoIcon = view.findViewById(C0003R.C0005id.your_content_stories_info_icon);
        this.mYourStoriesSeeOlder.setOnClickListener(new C27292C7h(this));
        this.mYourStoriesInfoIcon.setOnClickListener(new C27288C7c(this));
        this.mPromotionsLayout = view.findViewById(C0003R.C0005id.content_promotions_layout);
        this.mPromotionsEmptyViewStub = (ViewStub) view.findViewById(C0003R.C0005id.content_promotions_empty_stub);
        this.mPromotionsViewStub = (ViewStub) view.findViewById(C0003R.C0005id.content_promotions_stub);
        IgTextView igTextView = (IgTextView) view.findViewById(C0003R.C0005id.content_promotions_see_older);
        this.mPromotionsSeeOlder = igTextView;
        igTextView.setOnClickListener(new C145266Iy(this));
        A07();
        this.mOverviewHeader = ((ViewStub) view.findViewById(C0003R.C0005id.content_overview)).inflate();
        if (this.A05) {
            view.findViewById(C0003R.C0005id.your_content_start_divider_for_seller).setVisibility(0);
            view.findViewById(C0003R.C0005id.your_content_title).setVisibility(0);
            view.findViewById(C0003R.C0005id.partner_content_posts_layout).setVisibility(0);
            view.findViewById(C0003R.C0005id.partner_content_stories_layout).setVisibility(0);
            this.mPartnerPostsViewStub = (ViewStub) view.findViewById(C0003R.C0005id.partner_content_top_posts_media);
            view.findViewById(C0003R.C0005id.partner_content_posts_see_older).setOnClickListener(new C27294C7j(this));
            this.mPartnerStoriesViewStub = (ViewStub) view.findViewById(C0003R.C0005id.partner_content_stories_media);
            view.findViewById(C0003R.C0005id.partner_content_stories_see_older).setOnClickListener(new C27293C7i(this));
            this.mPartnerPostsEmptyStub = (ViewStub) view.findViewById(C0003R.C0005id.partner_content_top_posts_empty);
            this.mPartnerStoriesEmptyStub = (ViewStub) view.findViewById(C0003R.C0005id.partner_content_top_stories_empty);
        } else {
            view.findViewById(C0003R.C0005id.your_content_start_divider_regular).setVisibility(0);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            ((IgTextView) view.findViewById(C0003R.C0005id.your_content_posts_title)).setTypeface(typeface);
            ((IgTextView) view.findViewById(C0003R.C0005id.your_content_stories_title)).setTypeface(typeface);
            ((IgTextView) view.findViewById(C0003R.C0005id.content_promotions_title)).setTypeface(typeface);
        }
        C27289C7d c7d = this.A00;
        if (c7d != null) {
            synchronized (c7d) {
                c7d.A02 = this;
                if (!c7d.A04) {
                    C75 c75 = c7d.A03;
                    if (c75 != null) {
                        C27289C7d.A00(c7d, c75);
                    }
                } else if (this != null) {
                    A06();
                }
            }
        }
    }
}
