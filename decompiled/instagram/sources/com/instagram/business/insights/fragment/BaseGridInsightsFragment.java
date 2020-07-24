package com.instagram.business.insights.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.C0003R;
import com.instagram.business.insights.controller.InsightsStoryViewerController;
import com.instagram.common.p004ui.base.IgTextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZY;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MN;
import p000X.AnonymousClass2MP;
import p000X.AnonymousClass2TH;
import p000X.AnonymousClass40t;
import p000X.AnonymousClass79U;
import p000X.AnonymousClass7KC;
import p000X.C06590Pq;
import p000X.C157086nJ;
import p000X.C193418Ps;
import p000X.C26808Bst;
import p000X.C26809Bsu;
import p000X.C27296C7m;
import p000X.C27311C8e;
import p000X.C27320C8p;
import p000X.C27324C8t;
import p000X.C27325C8u;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C29621Qp;
import p000X.C61622m6;
import p000X.C68832zy;
import p000X.C7R;
import p000X.C7U;
import p000X.C89;
import p000X.C8A;
import p000X.C8D;
import p000X.C8E;
import p000X.C8L;
import p000X.C8M;
import p000X.C8N;
import p000X.C8O;
import p000X.C8P;
import p000X.C8R;
import p000X.C8V;
import p000X.C8X;
import p000X.C8b;
import p000X.C8c;

public abstract class BaseGridInsightsFragment extends C27341Hl implements AnonymousClass1HM, C27320C8p {
    public C27355CAa A00;
    public C8R A01;
    public AnonymousClass2MG A02;
    public AnonymousClass0C1 A03;
    public WeakReference A04;
    public long A05;
    public String A06 = "";
    public String A07 = "";
    public IgTextView mEmptyView;
    public View mErrorView;
    public View mLoadingView;
    public RecyclerView mRecyclerView;
    public SwipeRefreshLayout mSwipeRefreshLayout;

    public void A02() {
        if (this instanceof C8D) {
            C8D c8d = (C8D) this;
            C27325C8u c8u = new C27325C8u(c8d.getModuleName(), true, c8d);
            c8d.A00 = c8u;
            c8u.A00 = C26808Bst.IMPRESSION_COUNT;
            Context context = c8d.getContext();
            AnonymousClass0a4.A06(context);
            LayoutInflater from = LayoutInflater.from(context);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c8d.A00);
            arrayList.add(new C7U());
            C8R c8r = c8d.A01;
            AnonymousClass0a4.A06(c8r);
            arrayList.add(new AnonymousClass2MP(C0003R.layout.empty_view, ((C8O) c8r).A07));
            c8d.A02 = new AnonymousClass2MG(from, new AnonymousClass2MN(arrayList), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        } else if (this instanceof C8E) {
            C8E c8e = (C8E) this;
            C27324C8t c8t = new C27324C8t(c8e.getModuleName(), true, c8e);
            c8e.A00 = c8t;
            c8t.A00 = C26808Bst.IMPRESSION_COUNT;
            Context context2 = c8e.getContext();
            AnonymousClass0a4.A06(context2);
            LayoutInflater from2 = LayoutInflater.from(context2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c8e.A00);
            arrayList2.add(new C7U());
            C8R c8r2 = c8e.A01;
            AnonymousClass0a4.A06(c8r2);
            arrayList2.add(new AnonymousClass2MP(C0003R.layout.empty_view, ((C8P) c8r2).A07));
            c8e.A02 = new AnonymousClass2MG(from2, new AnonymousClass2MN(arrayList2), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        } else if (this instanceof InsightsStoryGridFragment) {
            InsightsStoryGridFragment insightsStoryGridFragment = (InsightsStoryGridFragment) this;
            insightsStoryGridFragment.A00 = new C27325C8u(insightsStoryGridFragment.getModuleName(), C27296C7m.A00(Constants.ZERO).equals(insightsStoryGridFragment.A01()), insightsStoryGridFragment);
            LayoutInflater from3 = LayoutInflater.from(insightsStoryGridFragment.getContext());
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(insightsStoryGridFragment.A00);
            arrayList3.add(new C7U());
            C8R c8r3 = insightsStoryGridFragment.A01;
            AnonymousClass0a4.A06(c8r3);
            arrayList3.add(new AnonymousClass2MP(C0003R.layout.empty_view, ((C8M) c8r3).A07));
            insightsStoryGridFragment.A02 = new AnonymousClass2MG(from3, new AnonymousClass2MN(arrayList3), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        } else if (!(this instanceof InsightsPostGridFragment)) {
            C8A c8a = (C8A) this;
            String moduleName = c8a.getModuleName();
            C27324C8t c8t2 = new C27324C8t(moduleName, false, new C8V(c8a));
            C26808Bst bst = C26808Bst.IMPRESSION_COUNT;
            c8t2.A00 = bst;
            C27325C8u c8u2 = new C27325C8u(moduleName, false, new C89(c8a));
            c8u2.A00 = bst;
            LayoutInflater from4 = LayoutInflater.from(c8a.getContext());
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(c8t2);
            arrayList4.add(c8u2);
            arrayList4.add(new C7U());
            arrayList4.add(new C7R());
            c8a.A02 = new AnonymousClass2MG(from4, new AnonymousClass2MN(arrayList4), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        } else {
            InsightsPostGridFragment insightsPostGridFragment = (InsightsPostGridFragment) this;
            insightsPostGridFragment.A00 = new C27324C8t(insightsPostGridFragment.getModuleName(), C27296C7m.A00(Constants.ZERO).equals(insightsPostGridFragment.A01()), insightsPostGridFragment);
            LayoutInflater from5 = LayoutInflater.from(insightsPostGridFragment.getContext());
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(insightsPostGridFragment.A00);
            C8R c8r4 = insightsPostGridFragment.A01;
            AnonymousClass0a4.A06(c8r4);
            arrayList5.add(new AnonymousClass2MP(C0003R.layout.empty_view, ((C8L) c8r4).A07));
            insightsPostGridFragment.A02 = new AnonymousClass2MG(from5, new AnonymousClass2MN(arrayList5), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        }
    }

    public void A03() {
        if (this instanceof C8D) {
            C8D c8d = (C8D) this;
            AnonymousClass0C1 r4 = c8d.A03;
            C27355CAa cAa = c8d.A00;
            Bundle bundle = c8d.mArguments;
            AnonymousClass0a4.A06(bundle);
            c8d.A01 = new C8O(r4, cAa, bundle.getString("ARG.Grid.ProductId", ""), c8d.getString(C0003R.string.product_story_grid_page_title));
            FragmentActivity activity = c8d.getActivity();
            AnonymousClass0a4.A06(activity);
            InsightsStoryViewerController insightsStoryViewerController = new InsightsStoryViewerController(activity);
            c8d.A01 = insightsStoryViewerController;
            c8d.registerLifecycleListener(insightsStoryViewerController);
        } else if (this instanceof C8E) {
            C8E c8e = (C8E) this;
            AnonymousClass0C1 r42 = c8e.A03;
            C27355CAa cAa2 = c8e.A00;
            Bundle bundle2 = c8e.mArguments;
            AnonymousClass0a4.A06(bundle2);
            c8e.A01 = new C8P(r42, cAa2, bundle2.getString("ARG.Grid.ProductId", ""), c8e.getString(C0003R.string.product_post_grid_page_title));
        } else if (this instanceof InsightsStoryGridFragment) {
            InsightsStoryGridFragment insightsStoryGridFragment = (InsightsStoryGridFragment) this;
            insightsStoryGridFragment.A01 = new C8M(insightsStoryGridFragment.A03, insightsStoryGridFragment.A00, insightsStoryGridFragment.getString(C0003R.string.story_grid_message), insightsStoryGridFragment.A01());
        } else if (!(this instanceof InsightsPostGridFragment)) {
            C8A c8a = (C8A) this;
            Bundle bundle3 = c8a.mArguments;
            AnonymousClass0a4.A06(bundle3);
            Integer A012 = C26809Bsu.A01(bundle3.getString("ARG.Mixed.Grid.TimeFrame", C26809Bsu.A02(Constants.ONE)));
            AnonymousClass0C1 r7 = c8a.A03;
            C27355CAa cAa3 = c8a.A00;
            long j = bundle3.getLong("ARG.Mixed.Grid.Start", -1);
            long j2 = bundle3.getLong("ARG.Mixed.Grid.End", -1);
            String A022 = C26809Bsu.A02(A012);
            Integer num = Constants.ONE;
            int i = C0003R.string.mixed_grid_message_day;
            if (A012 == num) {
                i = C0003R.string.mixed_grid_message_week;
            }
            c8a.A01 = new C8N(r7, cAa3, j, j2, A022, c8a.getString(i), c8a.getString(C0003R.string.posts), c8a.getString(C0003R.string.stories));
        } else {
            InsightsPostGridFragment insightsPostGridFragment = (InsightsPostGridFragment) this;
            insightsPostGridFragment.A01 = new C8L(insightsPostGridFragment.A03, insightsPostGridFragment.A00, insightsPostGridFragment.A01());
        }
    }

    public void A05(String str, int i) {
        Integer num;
        Integer num2;
        C8L c8l;
        if (!(this instanceof C8D) && !(this instanceof C8E)) {
            if (this instanceof InsightsStoryGridFragment) {
                InsightsStoryGridFragment insightsStoryGridFragment = (InsightsStoryGridFragment) this;
                if (insightsStoryGridFragment.A01 != null) {
                    if (str.equals("ORDER")) {
                        num = Constants.ZERO;
                    } else if (str.equals("TIME_FRAME")) {
                        num = Constants.ONE;
                    }
                    switch (num.intValue()) {
                        case 0:
                            C26808Bst bst = insightsStoryGridFragment.A02[i];
                            insightsStoryGridFragment.mMetricFilterText.setText(bst.A00);
                            C8M c8m = (C8M) insightsStoryGridFragment.A01;
                            c8m.A00 = bst;
                            c8m.A08(true);
                            insightsStoryGridFragment.A00.A00 = bst;
                            break;
                        case 1:
                            Integer num3 = InsightsStoryGridFragment.A05[i];
                            insightsStoryGridFragment.mTimeFrameFilterText.setText(C26809Bsu.A00(num3));
                            C8M c8m2 = (C8M) insightsStoryGridFragment.A01;
                            c8m2.A01 = num3;
                            c8m2.A08(true);
                            break;
                    }
                    C8M c8m3 = (C8M) insightsStoryGridFragment.A01;
                    HashMap hashMap = new HashMap();
                    hashMap.put("selectedTimeframe", C26809Bsu.A02(c8m3.A01));
                    hashMap.put("selectedMetric", c8m3.A00.name());
                    insightsStoryGridFragment.A00.A06(Constants.A0C, Constants.A0u, Constants.A09, Constants.A08, hashMap, (String) null);
                    return;
                }
                return;
            } else if (this instanceof InsightsPostGridFragment) {
                InsightsPostGridFragment insightsPostGridFragment = (InsightsPostGridFragment) this;
                if (insightsPostGridFragment.A01 != null) {
                    if (str.equals("POST_TYPE")) {
                        num2 = Constants.ZERO;
                    } else if (str.equals("TIME_FRAME")) {
                        num2 = Constants.ONE;
                    } else if (str.equals("ORDER")) {
                        num2 = Constants.A0C;
                    }
                    switch (num2.intValue()) {
                        case 0:
                            Integer num4 = Constants.ZERO(5)[i];
                            insightsPostGridFragment.mTypeFilterText.setText(C8c.A00(num4));
                            insightsPostGridFragment.A02 = InsightsPostGridFragment.A00(insightsPostGridFragment, InsightsPostGridFragment.A05, num4);
                            insightsPostGridFragment.A01 = InsightsPostGridFragment.A00(insightsPostGridFragment, InsightsPostGridFragment.A04, num4);
                            C26808Bst bst2 = C8L.A04;
                            insightsPostGridFragment.mMetricFilterText.setText(bst2.A00);
                            insightsPostGridFragment.A00.A00 = bst2;
                            c8l = (C8L) insightsPostGridFragment.A01;
                            c8l.A01 = num4;
                            c8l.A00 = bst2;
                            break;
                        case 1:
                            Integer num5 = InsightsPostGridFragment.A06[i];
                            insightsPostGridFragment.mTimeFrameFilterText.setText(C26809Bsu.A00(num5));
                            c8l = (C8L) insightsPostGridFragment.A01;
                            c8l.A02 = num5;
                            break;
                        case 2:
                            C26808Bst bst3 = (C27296C7m.A00(Constants.ONE).equals(insightsPostGridFragment.A01()) ? insightsPostGridFragment.A02 : insightsPostGridFragment.A01)[i];
                            insightsPostGridFragment.mMetricFilterText.setText(bst3.A00);
                            insightsPostGridFragment.A00.A00 = bst3;
                            c8l = (C8L) insightsPostGridFragment.A01;
                            c8l.A00 = bst3;
                            break;
                        default:
                            C8L c8l2 = (C8L) insightsPostGridFragment.A01;
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("selectedTimeframe", C26809Bsu.A02(c8l2.A02));
                            hashMap2.put("selectedMetric", c8l2.A00.name());
                            hashMap2.put(C193418Ps.$const$string(147), C8c.A01(c8l2.A01));
                            insightsPostGridFragment.A00.A06(Constants.A0C, Constants.A0u, Constants.A0K, Constants.A0J, hashMap2, (String) null);
                            return;
                    }
                    c8l.A08(true);
                    C8L c8l22 = (C8L) insightsPostGridFragment.A01;
                    HashMap hashMap22 = new HashMap();
                    hashMap22.put("selectedTimeframe", C26809Bsu.A02(c8l22.A02));
                    hashMap22.put("selectedMetric", c8l22.A00.name());
                    hashMap22.put(C193418Ps.$const$string(147), C8c.A01(c8l22.A01));
                    insightsPostGridFragment.A00.A06(Constants.A0C, Constants.A0u, Constants.A0K, Constants.A0J, hashMap22, (String) null);
                    return;
                }
                return;
            } else {
                return;
            }
            throw new IllegalArgumentException(str);
        }
    }

    public final void BoK(boolean z) {
        if (z) {
            this.mLoadingView.setVisibility(0);
            this.mRecyclerView.setVisibility(8);
            return;
        }
        this.mLoadingView.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final String A01() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle.getString("ARG.Grid.SearchBase", C27296C7m.A00(Constants.ONE));
        }
        return C27296C7m.A00(Constants.ONE);
    }

    public final void A04(Integer num, Integer num2, String str, int i, int i2, String[] strArr) {
        this.A00.A06(Constants.A0C, Constants.A0B, num, num2, (Map) null, (String) null);
        String token = getSession().getToken();
        C157086nJ r3 = new C157086nJ();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        bundle.putInt(AnonymousClass40t.$const$string(47), i2);
        bundle.putStringArray(AnonymousClass40t.$const$string(45), strArr);
        bundle.putString(AnonymousClass40t.$const$string(46), str);
        r3.setArguments(bundle);
        r3.A00 = this;
        AnonymousClass2TH r1 = new AnonymousClass2TH(getSession());
        r1.A0T = false;
        r1.A0L = getString(i);
        this.A04 = new WeakReference(r1.A00().A01(getActivity(), r3));
    }

    public void Bj2(List list) {
        AnonymousClass2MG r1 = this.A02;
        C68832zy r0 = new C68832zy();
        r0.A02(list);
        r1.A06(r0);
        if (list.isEmpty()) {
            this.mEmptyView.setVisibility(0);
        } else {
            this.mEmptyView.setVisibility(8);
        }
        this.mErrorView.setVisibility(8);
        this.mSwipeRefreshLayout.setRefreshing(false);
    }

    public final void BoD() {
        this.A02.A06(new C68832zy());
        this.mErrorView.setVisibility(0);
        this.mEmptyView.setVisibility(8);
        this.mSwipeRefreshLayout.setRefreshing(false);
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.setTitle(this.A07);
        r2.Bo6(true);
    }

    public C06590Pq getSession() {
        Bundle bundle = this.mArguments;
        AnonymousClass0a4.A06(bundle);
        return AnonymousClass0J1.A06(bundle);
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1420087871);
        super.onCreate(bundle);
        this.A05 = System.currentTimeMillis();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A07 = bundle2.getString("ARG.Grid.Title", "");
            this.A06 = this.mArguments.getString("ARG.Grid.EmptyText", "");
        }
        AnonymousClass0C1 r1 = (AnonymousClass0C1) getSession();
        this.A03 = r1;
        this.A00 = new C27355CAa(r1, this);
        A03();
        C8R c8r = this.A01;
        AnonymousClass0a4.A06(c8r);
        registerLifecycleListener(c8r);
        AnonymousClass0Z0.A09(-241126634, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1105973235);
        View inflate = layoutInflater.inflate(C0003R.layout.post_grid_insights_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1965072377, A022);
        return inflate;
    }

    public void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1538187071);
        super.onDestroy();
        C8R c8r = this.A01;
        AnonymousClass0a4.A06(c8r);
        unregisterLifecycleListener(c8r);
        AnonymousClass0Z0.A09(-639462948, A022);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingView = view.findViewById(C0003R.C0005id.post_grid_loading_spinner);
        IgTextView igTextView = (IgTextView) view.findViewById(C0003R.C0005id.empty_grid_text);
        this.mEmptyView = igTextView;
        igTextView.setText(this.A06);
        this.mErrorView = view.findViewById(C0003R.C0005id.post_grid_error_view);
        view.findViewById(C0003R.C0005id.error_loading_retry).setOnClickListener(new C8b(this));
        this.mRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.post_grid_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.A0w(new C61622m6(new C8X(this), C29621Qp.INSIGHTS_GRID, linearLayoutManager));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C0003R.C0005id.post_grid_refresh_layout);
        this.mSwipeRefreshLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new C27311C8e(this));
        A02();
        this.mRecyclerView.setAdapter(this.A02);
        AnonymousClass2MG r2 = this.A02;
        C68832zy r1 = new C68832zy();
        r1.A02(new ArrayList());
        r2.A06(r1);
        C8R c8r = this.A01;
        if (c8r != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.A05;
            c8r.A04 = true;
            c8r.A05.A04(c8r.A08, (Integer) null, Constants.ONE, currentTimeMillis);
        }
    }
}
