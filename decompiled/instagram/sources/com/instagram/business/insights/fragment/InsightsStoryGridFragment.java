package com.instagram.business.insights.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass5F9;
import p000X.C06220Of;
import p000X.C13300iJ;
import p000X.C14100jl;
import p000X.C17020pY;
import p000X.C225709nb;
import p000X.C249816v;
import p000X.C26808Bst;
import p000X.C27298C7o;
import p000X.C27320C8p;
import p000X.C27325C8u;
import p000X.C27355CAa;
import p000X.C28341Li;
import p000X.C53932Vb;
import p000X.C8M;
import p000X.C8R;
import p000X.C8S;
import p000X.C8T;

public class InsightsStoryGridFragment extends BaseGridInsightsFragment implements C27320C8p, C225709nb, C53932Vb {
    public static final C26808Bst[] A04 = {C26808Bst.TAPS_BACK, C26808Bst.CALL, C26808Bst.EMAIL, C26808Bst.EXITS, C26808Bst.FOLLOW, C26808Bst.TAPS_FORWARD, C26808Bst.GET_DIRECTIONS, C26808Bst.IMPRESSION_COUNT, C26808Bst.LINK_CLICKS, C26808Bst.SWIPES_AWAY, C26808Bst.PROFILE_VIEW, C26808Bst.REACH_COUNT, C26808Bst.REPLIES, C26808Bst.SHARE_COUNT, C26808Bst.TEXT, C26808Bst.BIO_LINK_CLICK};
    public static final Integer[] A05 = {Constants.ZERO, Constants.ONE, Constants.A0C};
    public C27325C8u A00;
    public InsightsStoryViewerController A01;
    public C26808Bst[] A02;
    public WeakReference A03;
    public TextView mMetricFilterText;
    public TextView mTimeFrameFilterText;

    public final String getModuleName() {
        return "insights_story_grid";
    }

    public final void B71(View view, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        AnonymousClass1OY r4 = AnonymousClass1OY.BUSINESS_INSIGHTS;
        Context context = getContext();
        if (context != null) {
            AnonymousClass0C1 r1 = (AnonymousClass0C1) getSession();
            new C28341Li(context, r1, AnonymousClass1L8.A00(this)).A02(InsightsStoryViewerController.A00(arrayList, r1), this.A01.A01(this, r4));
        }
        this.A03 = new WeakReference(view);
    }

    public final void BJ1(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AnonymousClass5F9.A03(activity, str, 1);
            C27355CAa.A03((AnonymousClass0C1) getSession(), "top_stories", str, C14100jl.A01(getSession()));
        }
    }

    public final void BJW(List list, AnonymousClass1OY r12) {
        View view;
        if (!list.isEmpty() && getActivity() != null) {
            AnonymousClass0C1 r8 = (AnonymousClass0C1) getSession();
            boolean z = false;
            String APo = ((AnonymousClass1NJ) list.get(0)).APo();
            C13300iJ A0c = ((AnonymousClass1NJ) list.get(0)).A0c(r8);
            AnonymousClass1OY r9 = r12;
            if (r12 == AnonymousClass1OY.BUSINESS_INSIGHTS) {
                z = true;
            }
            WeakReference weakReference = this.A03;
            if (weakReference == null || weakReference.get() == null) {
                view = this.mRecyclerView;
            } else {
                view = (View) this.A03.get();
            }
            this.A01.A02(C17020pY.A00().A0Q(r8).A0J(APo, new C249816v(A0c), z, list), 0, C06220Of.A0A(view), getActivity(), r8, r9);
        }
    }

    public final void Bj2(List list) {
        super.Bj2(list);
        if (list.size() == 1) {
            this.mEmptyView.setVisibility(0);
        } else {
            this.mEmptyView.setVisibility(8);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1671136630);
        super.onCreate(bundle);
        InsightsStoryViewerController insightsStoryViewerController = new InsightsStoryViewerController(getActivity());
        this.A01 = insightsStoryViewerController;
        registerLifecycleListener(insightsStoryViewerController);
        C26808Bst[] bstArr = A04;
        C26808Bst[] bstArr2 = (C26808Bst[]) Arrays.copyOf(bstArr, bstArr.length);
        this.A02 = bstArr2;
        Arrays.sort(bstArr2, new C27298C7o(this));
        AnonymousClass0Z0.A09(1727211600, A022);
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1734230164);
        unregisterLifecycleListener(this.A01);
        super.onDestroy();
        AnonymousClass0Z0.A09(1952614741, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((ViewStub) view.findViewById(C0003R.C0005id.filterLeftViewStub)).inflate();
        ((ViewStub) view.findViewById(C0003R.C0005id.filterCenterViewStub)).inflate();
        View findViewById = view.findViewById(C0003R.C0005id.filterLeft);
        this.mMetricFilterText = (TextView) findViewById.findViewById(C0003R.C0005id.title);
        findViewById.setOnClickListener(new C8T(this));
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.filterCenter).findViewById(C0003R.C0005id.title);
        this.mTimeFrameFilterText = textView;
        textView.setOnClickListener(new C8S(this));
        C8R c8r = this.A01;
        if (c8r != null) {
            ((C8M) c8r).A06(this);
        }
    }
}
