package com.instagram.business.insights.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.C0003R;
import com.instagram.modal.ModalActivity;
import java.util.ArrayList;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZY;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MN;
import p000X.AnonymousClass47k;
import p000X.AnonymousClass79U;
import p000X.AnonymousClass7KC;
import p000X.C06590Pq;
import p000X.C18980sj;
import p000X.C27310C8d;
import p000X.C27318C8n;
import p000X.C27341Hl;
import p000X.C27355CAa;
import p000X.C29621Qp;
import p000X.C51312Ke;
import p000X.C52902Qq;
import p000X.C59032gv;
import p000X.C61622m6;
import p000X.C68832zy;
import p000X.C7U;
import p000X.C83;
import p000X.C88;
import p000X.C8I;
import p000X.C8Y;

public class ProductCreatorsListFragment extends C27341Hl implements C51312Ke, C88 {
    public C27355CAa A00;
    public C8I A01;
    public AnonymousClass2MG A02;
    public String A03;
    public AnonymousClass0C1 A04;
    public View mErrorView;
    public View mLoadingView;
    public RecyclerView mRecyclerView;
    public SwipeRefreshLayout mSwipeRefreshLayout;

    public final void A01(boolean z) {
        if (z) {
            this.mLoadingView.setVisibility(0);
            this.mRecyclerView.setVisibility(8);
            return;
        }
        this.mLoadingView.setVisibility(8);
        this.mRecyclerView.setVisibility(0);
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final String getModuleName() {
        return "product_insights_creators_list";
    }

    public static void A00(ProductCreatorsListFragment productCreatorsListFragment, boolean z) {
        C8I c8i = productCreatorsListFragment.A01;
        if (c8i != null) {
            synchronized (c8i) {
                ProductCreatorsListFragment productCreatorsListFragment2 = c8i.A00;
                if (productCreatorsListFragment2 != null) {
                    productCreatorsListFragment2.A01(z);
                }
                c8i.A02 = null;
                c8i.A03.clear();
                C8I.A00(c8i);
            }
        }
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final void BGA(String str) {
        this.A00.A06(Constants.A0C, Constants.A0F, Constants.A03, Constants.A0L, (Map) null, this.A03);
        if (getActivity() != null) {
            C59032gv r3 = new C59032gv(this.A04, ModalActivity.class, "profile", C18980sj.A00.A00().A00(C52902Qq.A01(this.A04, str, "product_insights", getModuleName()).A03()), getActivity());
            r3.A0A = ModalActivity.A05;
            r3.A06(getActivity());
        }
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1337941536);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle2);
        this.A04 = A06;
        this.A00 = new C27355CAa(A06, this);
        String string = this.mArguments.getString("ARG.Grid.ProductId");
        this.A03 = string;
        C8I c8i = new C8I(this.A04, this.A00, string, getString(C0003R.string.product_creators_list_page_title));
        this.A01 = c8i;
        AnonymousClass0a4.A06(c8i);
        registerLifecycleListener(c8i);
        AnonymousClass0Z0.A09(1173660973, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1641740318);
        View inflate = layoutInflater.inflate(C0003R.layout.product_creators_list_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1949120109, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-2124658709);
        super.onDestroy();
        C8I c8i = this.A01;
        AnonymousClass0a4.A06(c8i);
        unregisterLifecycleListener(c8i);
        AnonymousClass0Z0.A09(-92651657, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLoadingView = view.findViewById(C0003R.C0005id.creators_list_loading_spinner);
        this.mErrorView = view.findViewById(C0003R.C0005id.creators_list_error_view);
        view.findViewById(C0003R.C0005id.error_loading_retry).setOnClickListener(new C27310C8d(this));
        this.mRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.creators_list_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.A0w(new C61622m6(new C8Y(this), C29621Qp.LIST, linearLayoutManager));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C0003R.C0005id.creators_list_refresh_layout);
        this.mSwipeRefreshLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new C27318C8n(this));
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        LayoutInflater from = LayoutInflater.from(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7U());
        arrayList.add(new C83(getModuleName(), this));
        AnonymousClass2MG r3 = new AnonymousClass2MG(from, new AnonymousClass2MN(arrayList), AnonymousClass0ZY.A00(), false, false, (AnonymousClass79U) null, (AnonymousClass7KC) null);
        this.A02 = r3;
        this.mRecyclerView.setAdapter(r3);
        AnonymousClass2MG r2 = this.A02;
        C68832zy r1 = new C68832zy();
        r1.A02(new ArrayList());
        r2.A06(r1);
        C8I c8i = this.A01;
        if (c8i != null) {
            synchronized (c8i) {
                c8i.A04 = true;
                C8I.A01(c8i, Constants.A03, Constants.A0L, Constants.ONE);
            }
            C8I c8i2 = this.A01;
            synchronized (c8i2) {
                c8i2.A00 = this;
                if (this != null) {
                    int i = AnonymousClass47k.A00[c8i2.A01.intValue()];
                    if (i == 1 || i == 2) {
                        A01(true);
                    } else if (i == 3 || i == 4) {
                        c8i2.A02();
                    } else {
                        c8i2.B2m((Throwable) null);
                    }
                }
            }
        }
    }
}
