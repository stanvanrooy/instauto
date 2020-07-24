package com.instagram.closefriends.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ListView;
import com.facebook.C0003R;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1ZK;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C109564nn;
import p000X.C13300iJ;
import p000X.C151836eN;
import p000X.C155936lE;
import p000X.C17850qu;
import p000X.C18980sj;
import p000X.C25007Axz;
import p000X.C27541CHg;
import p000X.C27542CHi;
import p000X.C27543CHj;
import p000X.C27544CHk;
import p000X.C27545CHl;
import p000X.C27547CHn;
import p000X.C52362Om;
import p000X.C52902Qq;
import p000X.C6Y;
import p000X.C96584Fr;
import p000X.CHX;
import p000X.CI0;
import p000X.CI2;
import p000X.CI5;
import p000X.CI6;

public class CloseFriendsListFragment extends AnonymousClass2NN implements AnonymousClass1HL, CHX, AbsListView.OnScrollListener, AnonymousClass1HM, CI6 {
    public C6Y A00;
    public C27541CHg A01;
    public C151836eN A02;
    public AnonymousClass0C1 A03;
    public AnonymousClass2Oq A04;
    public String A05;
    public C109564nn A06;
    public boolean A07;
    public final List A08 = new ArrayList();
    public EmptyStateView mEmptyStateView;
    public ListView mList;
    public C27547CHn mListRemovalAnimationShimHolder;
    public CI5 mRowRemovalAnimator;

    public final void BMg(C27541CHg cHg, C13300iJ r2, boolean z, CI0 ci0, String str, int i) {
    }

    public final void configureActionBar(AnonymousClass1EX r1) {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CloseFriendsListFragment closeFriendsListFragment) {
        AnonymousClass2Oq r0;
        C109564nn r1 = closeFriendsListFragment.A06;
        if (r1 == C109564nn.MEMBERS) {
            ArrayList<C13300iJ> arrayList = new ArrayList<>(closeFriendsListFragment.A01.A01);
            closeFriendsListFragment.A05 = closeFriendsListFragment.A05;
            ArrayList arrayList2 = new ArrayList();
            for (C13300iJ r2 : arrayList) {
                arrayList2.add(new C155936lE(r2, true));
            }
            closeFriendsListFragment.A02.A0K(arrayList2, Collections.EMPTY_LIST, closeFriendsListFragment.A05, false);
            if (arrayList.isEmpty()) {
                r0 = AnonymousClass2Oq.EMPTY;
            } else {
                r0 = AnonymousClass2Oq.GONE;
            }
            A02(closeFriendsListFragment, r0);
        } else if (r1 == C109564nn.SUGGESTIONS) {
            A01(closeFriendsListFragment);
        }
    }

    public static void A01(CloseFriendsListFragment closeFriendsListFragment) {
        AnonymousClass2Oq r0;
        ArrayList<C13300iJ> arrayList = new ArrayList<>();
        for (C13300iJ r1 : closeFriendsListFragment.A08) {
            if (!closeFriendsListFragment.A01.A03.contains(r1)) {
                arrayList.add(r1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13300iJ r12 : arrayList) {
            arrayList2.add(new C155936lE(r12, false));
        }
        closeFriendsListFragment.A02.A0K(Collections.EMPTY_LIST, arrayList2, (String) null, false);
        if (arrayList.isEmpty()) {
            r0 = AnonymousClass2Oq.EMPTY;
        } else {
            r0 = AnonymousClass2Oq.GONE;
        }
        A02(closeFriendsListFragment, r0);
        if (!closeFriendsListFragment.A07 && closeFriendsListFragment.A01.A00) {
            closeFriendsListFragment.A07 = true;
            C6Y c6y = closeFriendsListFragment.A00;
            if (c6y != null) {
                c6y.A04 = arrayList.size();
            } else {
                AnonymousClass0QD.A01("CloseFriendsListFragment", "CloseFriendsHomeWaterfall was null.");
            }
        }
    }

    public static void A02(CloseFriendsListFragment closeFriendsListFragment, AnonymousClass2Oq r1) {
        closeFriendsListFragment.A04 = r1;
        EmptyStateView emptyStateView = closeFriendsListFragment.mEmptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0M(r1);
        }
    }

    public final void BR4(AnonymousClass1ZK r19, C155936lE r20, boolean z, CI0 ci0, int i, String str) {
        CI5 ci5 = this.mRowRemovalAnimator;
        if (!ci5.A00) {
            View view = r19.itemView;
            int i2 = i;
            String str2 = str;
            C155936lE r14 = r20;
            CI0 ci02 = ci0;
            CI2 ci2 = new CI2(this, r14, ci02, i2, str2);
            ci5.A00 = true;
            ci5.A01.setEnabled(false);
            int firstVisiblePosition = ci5.A01.getFirstVisiblePosition();
            HashMap hashMap = new HashMap();
            for (int i3 = 0; i3 < ci5.A01.getChildCount(); i3++) {
                hashMap.put(Long.valueOf(ci5.A02.getItemId(firstVisiblePosition + i3)), Integer.valueOf(ci5.A01.getChildAt(i3).getTop()));
            }
            CloseFriendsListFragment closeFriendsListFragment = ci2.A03;
            if (closeFriendsListFragment.mListRemovalAnimationShimHolder == null) {
                ViewGroup viewGroup = (ViewGroup) closeFriendsListFragment.mList.getParent();
                View A002 = C27542CHi.A00(viewGroup);
                viewGroup.addView(A002, 0);
                closeFriendsListFragment.mListRemovalAnimationShimHolder = (C27547CHn) A002.getTag();
            }
            C27547CHn cHn = closeFriendsListFragment.mListRemovalAnimationShimHolder;
            C27542CHi.A01(cHn, ci2.A02, ci2.A01, ci2.A00, ci2.A04, false, ci2.A03);
            View view2 = cHn.A00;
            view2.setBackgroundColor(C019000b.A00(view2.getContext(), C0003R.color.grey_1));
            cHn.A00.setPressed(true);
            cHn.A00.setAlpha(1.0f);
            View view3 = cHn.A00;
            view3.setTranslationY((float) (view.getTop() + ci5.A01.getTop()));
            view3.setVisibility(0);
            ci5.A01.getViewTreeObserver().addOnPreDrawListener(new C27543CHj(ci5, hashMap, view3));
            this.A01.A03(r14.A02, z, ci02, i2, str2);
        }
    }

    public final void BR8(C13300iJ r5) {
        AnonymousClass1HD A022 = C18980sj.A00.A00().A02(C52902Qq.A01(this.A03, r5.getId(), "favorites_user", getModuleName()).A03());
        C52362Om r2 = new C52362Om(getActivity(), this.A03);
        r2.A0B = true;
        r2.A02 = A022;
        r2.A02();
    }

    public final void Bel() {
        this.mList.smoothScrollToPosition(0);
    }

    public final String getModuleName() {
        if (this.A06 == C109564nn.SUGGESTIONS) {
            return "favorites_home_suggestions";
        }
        return "favorites_home_list";
    }

    public final C27541CHg AVg() {
        return this.A01;
    }

    public final void Awv(C27541CHg cHg) {
        A00(this);
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        CI0 ci0;
        int A022 = AnonymousClass0Z0.A02(-1180035095);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A06 = (C109564nn) bundle2.getSerializable("tab");
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A03 = A062;
        if (this.A06 == C109564nn.MEMBERS) {
            ci0 = CI0.MEMBER;
        } else {
            ci0 = CI0.SUGGESTION;
        }
        C151836eN r4 = new C151836eN(getContext(), A062, ci0, this, (C96584Fr) null);
        this.A02 = r4;
        r4.setHasStableIds(true);
        if (this.A06 == C109564nn.MEMBERS) {
            A02(this, AnonymousClass2Oq.LOADING);
            C17850qu A012 = C25007Axz.A01(this.A03);
            A012.A00 = new C27544CHk(this);
            schedule(A012);
        } else {
            A02(this, AnonymousClass2Oq.LOADING);
            C17850qu A002 = C25007Axz.A00(this.A03);
            A002.A00 = new C27545CHl(this);
            schedule(A002);
        }
        AnonymousClass0Z0.A09(161474755, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(711164445);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C0003R.layout.layout_listview_with_empty_state, viewGroup, false);
        this.mList = (ListView) viewGroup2.findViewById(16908298);
        EmptyStateView emptyStateView = (EmptyStateView) viewGroup2.findViewById(16908292);
        this.mEmptyStateView = emptyStateView;
        emptyStateView.A0I(C0003R.string.close_friends_home_empty_state_text_v4, AnonymousClass2Oq.EMPTY);
        this.mList.setAdapter(this.A02);
        this.mRowRemovalAnimator = new CI5(this.mList, this.A02);
        AnonymousClass0Z0.A09(-515363101, A022);
        return viewGroup2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1191529289);
        super.onDestroy();
        CloseFriendsListFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1657140333, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-541206757);
        super.onPause();
        this.A01.A02(this);
        getListView().setOnScrollListener((AbsListView.OnScrollListener) null);
        AnonymousClass0Z0.A09(1584667691, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-2082023792);
        super.onResume();
        A02(this, AnonymousClass2Oq.LOADING);
        C17850qu A012 = C25007Axz.A01(this.A03);
        A012.A00 = new C27544CHk(this);
        schedule(A012);
        this.A01.A02.add(new WeakReference(this));
        getListView().setOnScrollListener(this);
        AnonymousClass0Z0.A09(1683744117, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(467290803);
        if (this.A06 == C109564nn.SUGGESTIONS) {
            C6Y c6y = this.A00;
            if (c6y != null) {
                c6y.A05 = Math.max(i + i2, c6y.A05);
            } else {
                AnonymousClass0QD.A01("CloseFriendsListFragment", "CloseFriendsHomeWaterfall was null.");
            }
        }
        AnonymousClass0Z0.A0A(-145770134, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        AnonymousClass0Z0.A0A(1060095905, AnonymousClass0Z0.A03(33770449));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = this.mEmptyStateView;
        if (emptyStateView != null) {
            emptyStateView.A0M(this.A04);
        }
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }
}
