package com.instagram.shopping.fragment.destination.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass2UZ;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass9WK;
import p000X.C06590Pq;
import p000X.C13300iJ;
import p000X.C146776Pc;
import p000X.C17510qM;
import p000X.C217529Zr;
import p000X.C218559ba;
import p000X.C218589be;
import p000X.C218629bi;
import p000X.C218729bs;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C29621Qp;
import p000X.C31241Xc;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C52002Na;
import p000X.C52362Om;
import p000X.C61622m6;
import p000X.C63532pd;

public class ShoppingDirectoryDestinationFragment extends C27341Hl implements C27371Ho, AnonymousClass1HM, C63532pd {
    public static final String A09 = Integer.toString(20);
    public C52002Na A00;
    public AnonymousClass0C1 A01;
    public C218559ba A02;
    public AnonymousClass9WK A03;
    public AnonymousClass9WK A04;
    public C217529Zr A05;
    public String A06;
    public C28051Kf A07;
    public String A08;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "instagram_shopping_directory";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ShoppingDirectoryDestinationFragment shoppingDirectoryDestinationFragment, C13300iJ r8, String str) {
        C17510qM.A00.A0T(shoppingDirectoryDestinationFragment.getActivity(), shoppingDirectoryDestinationFragment.A01, "shopping_shops_destination", shoppingDirectoryDestinationFragment, shoppingDirectoryDestinationFragment.A06, shoppingDirectoryDestinationFragment.A08, str, r8).A02();
    }

    public final void B63(AnonymousClass1NJ r4, int i) {
        C52362Om r2 = new C52362Om(getActivity(), this.A01);
        C146776Pc A0T = AnonymousClass2UZ.A00().A0T(r4.APo());
        A0T.A0C = true;
        A0T.A06 = getModuleName();
        r2.A02 = A0T.A01();
        r2.A02();
    }

    public final boolean B64(View view, MotionEvent motionEvent, AnonymousClass1NJ r4, int i) {
        return this.A00.BS6(view, motionEvent, r4, i);
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.shopping_directory_title);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        AnonymousClass1AM r5;
        int A022 = AnonymousClass0Z0.A02(-43164816);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass11J.A00(bundle2);
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A06 = AnonymousClass30T.A00(bundle2);
        this.A08 = bundle2.getString("prior_module_name");
        this.A03 = new AnonymousClass9WK(getContext(), AnonymousClass1L8.A00(this), this.A01, new C218589be(this), (String) null);
        AnonymousClass9WK r7 = new AnonymousClass9WK(getContext(), AnonymousClass1L8.A00(this), this.A01, new C218629bi(this), (String) null);
        this.A04 = r7;
        this.A02 = new C218559ba(getContext(), this.A01, this, this, this.A03, r7);
        this.A03.A00(true, false);
        this.A04.A00(true, false);
        C218559ba.A01(this.A02);
        Context context = getContext();
        AnonymousClass1HD r1 = this.mParentFragment;
        if (r1 == null) {
            r5 = this.mFragmentManager;
        } else {
            r5 = r1.mFragmentManager;
        }
        C52002Na r2 = new C52002Na(context, this, r5, false, this.A01, this, (AnonymousClass1I6) null, this.A02);
        this.A00 = r2;
        registerLifecycleListener(r2);
        C28051Kf A002 = C28051Kf.A00();
        this.A07 = A002;
        this.A05 = new C217529Zr(this.A01, this, this.A06, A002);
        AnonymousClass0Z0.A09(-1073241949, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(813198712);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new C218729bs(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        this.mRecyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        this.mRecyclerView.A0w(new C61622m6(this.A03, C29621Qp.GRID, linearLayoutManager));
        this.mRecyclerView.setAdapter(this.A02);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(-1311119949, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(472508159);
        super.onDestroyView();
        ShoppingDirectoryDestinationFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(-326194872, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A07.A04(C32711bj.A00(this), this.mRefreshableContainer);
    }
}
