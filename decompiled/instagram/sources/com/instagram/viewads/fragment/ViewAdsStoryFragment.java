package com.instagram.viewads.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelChainingConfig;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import com.instagram.reels.store.ReelStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0Z1;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HO;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1UY;
import p000X.AnonymousClass1UZ;
import p000X.AnonymousClass1W5;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass5VB;
import p000X.AnonymousClass5VX;
import p000X.C06590Pq;
import p000X.C124495Va;
import p000X.C124505Vb;
import p000X.C124515Vc;
import p000X.C124525Vd;
import p000X.C124545Vg;
import p000X.C124565Vi;
import p000X.C124625Vo;
import p000X.C15890nh;
import p000X.C17020pY;
import p000X.C17710qg;
import p000X.C256119n;
import p000X.C27301Hh;
import p000X.C27371Ho;
import p000X.C28341Li;
import p000X.C28591Mi;
import p000X.C28691Ms;
import p000X.C29081On;
import p000X.C29091Oo;
import p000X.C33971dn;
import p000X.C34071dx;
import p000X.C43041tf;
import p000X.C43791v5;
import p000X.C59012gt;
import p000X.C62082ms;
import p000X.C62432nh;

public class ViewAdsStoryFragment extends AnonymousClass2NN implements C29081On, C27371Ho, C28591Mi, AnonymousClass1HL, C29091Oo, AbsListView.OnScrollListener, AnonymousClass1W5, AnonymousClass1HO, C124625Vo {
    public AnonymousClass1UY A00;
    public AnonymousClass0C1 A01;
    public EmptyStateView A02;
    public AnonymousClass5VX A03;
    public String A04;
    public String A05;
    public boolean A06;
    public int A07;
    public C27301Hh A08;
    public C28341Li A09;
    public final AnonymousClass1I1 A0A = new AnonymousClass1I1();
    public C124565Vi mHideAnimationCoordinator;

    public final boolean Ago() {
        return true;
    }

    public final boolean AhS() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void Aix() {
        A01(this, false);
    }

    public final void B4J(C17710qg r1) {
    }

    public final void B4K() {
    }

    public final void B4l(Reel reel, C59012gt r2) {
    }

    public final void BHS(Reel reel) {
    }

    public final void BHt(Reel reel) {
    }

    public final String getModuleName() {
        return "view_ads_story";
    }

    public static void A01(ViewAdsStoryFragment viewAdsStoryFragment, boolean z) {
        String str;
        viewAdsStoryFragment.A06 = z;
        C28341Li r4 = viewAdsStoryFragment.A09;
        if (z) {
            str = null;
        } else {
            str = r4.A01;
        }
        AnonymousClass0C1 r5 = viewAdsStoryFragment.A01;
        String str2 = viewAdsStoryFragment.A05;
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.ONE;
        r3.A0C = "ads/view_ads/";
        r3.A09("target_user_id", str2);
        r3.A09("ig_user_id", r5.A04());
        r3.A09("page_type", "49");
        r3.A0A("next_max_id", str);
        r3.A06(C124495Va.class, false);
        r4.A02(r3.A03(), viewAdsStoryFragment);
    }

    public final void A68() {
        if (this.A09.A04()) {
            A01(this, false);
        }
    }

    public final boolean Abq() {
        return !this.A03.isEmpty();
    }

    public final boolean Abs() {
        return this.A09.A03();
    }

    public final boolean AfR() {
        if (this.A09.A00 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean AgL() {
        if (this.A09.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void AsA(Reel reel, List list, C124545Vg r16, int i, int i2, int i3, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel A0G = C17020pY.A00().A0Q(this.A01).A0G((String) it.next());
            if (A0G != null) {
                arrayList.add(A0G);
            }
        }
        if (this.A00 == null) {
            this.A00 = new AnonymousClass1UY(this.A01, new AnonymousClass1UZ(this), this);
        }
        AnonymousClass1UY r5 = this.A00;
        r5.A0A = this.A04;
        r5.A04 = new C124565Vi(getActivity(), getListView(), this.A03, this);
        r5.A0B = this.A01.A04();
        r5.A05(r16, reel, arrayList, arrayList, AnonymousClass1OY.VIEW_ADS, i3, (ReelChainingConfig) null);
    }

    public final void B4I(C43791v5 r4) {
        AnonymousClass0Z1.A00(this.A03, -857725858);
        AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
        A00();
    }

    public final /* bridge */ /* synthetic */ void B4M(C28691Ms r13) {
        List<C33971dn> emptyList;
        String str;
        C124525Vd r132 = (C124525Vd) r13;
        if (this.A06) {
            AnonymousClass5VX r1 = this.A03;
            r1.A01.A06();
            r1.A04.clear();
            r1.A03.clear();
            r1.A02.clear();
            r1.A00();
        }
        ReelStore A0Q = C17020pY.A00().A0Q(this.A01);
        List list = r132.A01;
        if (list != null) {
            emptyList = Collections.unmodifiableList(list);
        } else {
            emptyList = Collections.emptyList();
        }
        ArrayList<Reel> arrayList = new ArrayList<>();
        for (C33971dn r12 : emptyList) {
            if (r12 == null || !r12.A04(A0Q.A0A)) {
                if (r12 != null) {
                    str = r12.A02(A0Q.A0A);
                } else {
                    str = "NULL";
                }
                AnonymousClass0QD.A01("invalid_ad_reel_response_item", str);
            } else {
                Reel A0F = A0Q.A0F(r12, false);
                if (A0F.A07(A0Q.A0A) > 0) {
                    arrayList.add(A0F);
                }
            }
        }
        Collections.sort(arrayList, new C62082ms());
        AnonymousClass5VX r4 = this.A03;
        AnonymousClass0C1 r3 = this.A01;
        for (Reel reel : arrayList) {
            if (!reel.A0l(r3)) {
                r4.A01.A0A(new AnonymousClass5VB(reel.A0C(r3, 0), reel, -1, -1, Constants.A0C));
            }
        }
        r4.A00();
        A00();
    }

    public final void Bel() {
        if (this.mView != null) {
            C43041tf.A00(this, getListView());
        }
    }

    private void A00() {
        EmptyStateView emptyStateView;
        AnonymousClass2Oq r0;
        RefreshableListView refreshableListView = (RefreshableListView) getListViewSafe();
        if (refreshableListView == null) {
            return;
        }
        if (AgL()) {
            this.A02.A0M(AnonymousClass2Oq.LOADING);
            refreshableListView.setIsLoading(true);
            return;
        }
        if (AfR()) {
            emptyStateView = this.A02;
            r0 = AnonymousClass2Oq.ERROR;
        } else {
            emptyStateView = this.A02;
            r0 = AnonymousClass2Oq.EMPTY;
        }
        emptyStateView.A0M(r0);
        refreshableListView.setIsLoading(false);
    }

    public final C27301Hh AMt() {
        return this.A08;
    }

    public final boolean AgJ() {
        if (AgL()) {
            return !this.A03.isEmpty();
        }
        return true;
    }

    public final void B4L() {
        A00();
    }

    public final void B4N(C28691Ms r1) {
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(282264841);
        super.onCreate(bundle);
        Context context = getContext();
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A05 = bundle2.getString("ViewAds.TARGET_USER_ID");
        this.A09 = new C28341Li(getContext(), this.A01, AnonymousClass1L8.A00(this));
        this.A07 = getResources().getDimensionPixelSize(C0003R.dimen.top_tabbar_height);
        C27301Hh r1 = new C27301Hh(getContext());
        this.A08 = r1;
        this.A0A.A0B(r1);
        this.A0A.A0B(new C62432nh(this.A01, Constants.ONE, 3, (C29091Oo) this));
        AnonymousClass5VX r0 = new AnonymousClass5VX(context, this, this);
        this.A03 = r0;
        setListAdapter(r0);
        this.A04 = UUID.randomUUID().toString();
        AnonymousClass0Z0.A09(130348160, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-394484762);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_feed, viewGroup, false);
        AnonymousClass0Z0.A09(1901502455, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1139922311);
        super.onDestroy();
        this.mHideAnimationCoordinator = null;
        AnonymousClass0Z0.A09(1830729678, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1764421678);
        super.onPause();
        this.A08.A0C(getScrollingViewProxy());
        AnonymousClass0Z0.A09(-1538139854, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-473008700);
        super.onResume();
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T != null && A0T.A0a()) {
            A0T.A0V(getListView());
        }
        AnonymousClass0Z0.A09(912527731, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-486162731);
        if (this.A03.A00) {
            if (C256119n.A04(absListView)) {
                this.A03.A00 = false;
            }
            AnonymousClass0Z0.A0A(-1955786878, A032);
        }
        this.A0A.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(-1955786878, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(-1010479518);
        if (!this.A03.A00) {
            this.A0A.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0Z0.A0A(-1838169095, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A08.A0D(getScrollingViewProxy(), this.A03, this.A07);
        getListView().setOnScrollListener(this);
        EmptyStateView emptyStateView = (EmptyStateView) getListView().getEmptyView();
        this.A02 = emptyStateView;
        emptyStateView.A0K(new C124515Vc(this), AnonymousClass2Oq.ERROR);
        EmptyStateView emptyStateView2 = this.A02;
        C124505Vb r0 = new C124505Vb(this);
        AnonymousClass2Oq r2 = AnonymousClass2Oq.EMPTY;
        emptyStateView2.A0K(r0, r2);
        EmptyStateView emptyStateView3 = this.A02;
        emptyStateView3.A0H(C0003R.C0004drawable.f51xd37eab2e, r2);
        emptyStateView3.A0J(C0003R.string.view_ads_empty_state_title, r2);
        emptyStateView3.A0I(C0003R.string.view_ads_story_empty_state_description, r2);
        emptyStateView3.A0G(C0003R.string.view_ads_empty_state_button_text, r2);
        this.A02.A0F();
        A01(this, true);
    }
}
