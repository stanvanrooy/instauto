package com.instagram.brandedcontent.violation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass6C2;
import p000X.AnonymousClass6OY;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C151896eT;
import p000X.C151916eW;
import p000X.C151926eX;
import p000X.C151936eY;
import p000X.C151946eZ;
import p000X.C151956ea;
import p000X.C151966eb;
import p000X.C151976ec;
import p000X.C151986ed;
import p000X.C151996ee;
import p000X.C152376fH;
import p000X.C15890nh;
import p000X.C17020pY;
import p000X.C17640qZ;
import p000X.C23300zv;
import p000X.C27371Ho;
import p000X.C28341Li;
import p000X.C29081On;
import p000X.C29091Oo;
import p000X.C34071dx;
import p000X.C58312fj;
import p000X.C62432nh;

public final class BrandedContentNotificationFragment extends AnonymousClass2NN implements C29081On, C27371Ho, AnonymousClass1HK, C29091Oo, AnonymousClass1HM {
    public C151926eX A00;
    public AnonymousClass6C2 A01;
    public AnonymousClass1OC A02;
    public AnonymousClass0C1 A03;
    public C62432nh A04;
    public C28341Li A05;
    public EmptyStateView A06;
    public final C11200ea A07 = new C151946eZ(this);

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void Aix() {
        A00(this, false);
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(BrandedContentNotificationFragment brandedContentNotificationFragment, boolean z) {
        C28341Li r3 = brandedContentNotificationFragment.A05;
        C15890nh r2 = new C15890nh(brandedContentNotificationFragment.A03);
        r2.A09 = Constants.A0N;
        r2.A0C = "business/branded_content/news/inbox/";
        r2.A06(C151936eY.class, false);
        r3.A02(r2.A03(), new C151916eW(brandedContentNotificationFragment, z));
    }

    public static void A01(BrandedContentNotificationFragment brandedContentNotificationFragment, boolean z) {
        AnonymousClass2Oq r0;
        EmptyStateView emptyStateView = brandedContentNotificationFragment.A06;
        if (emptyStateView != null) {
            if (brandedContentNotificationFragment.AgL()) {
                r0 = AnonymousClass2Oq.LOADING;
            } else if (brandedContentNotificationFragment.AfR()) {
                r0 = AnonymousClass2Oq.ERROR;
            } else if (z) {
                r0 = AnonymousClass2Oq.EMPTY;
            } else {
                r0 = AnonymousClass2Oq.GONE;
            }
            emptyStateView.A0M(r0);
        }
    }

    public final void A68() {
        if (this.A05.A04()) {
            A00(this, false);
        }
    }

    public final boolean Abq() {
        return !this.A00.isEmpty();
    }

    public final boolean Abs() {
        return this.A05.A03();
    }

    public final boolean AfR() {
        if (this.A05.A00 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean AgL() {
        if (this.A05.A00 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        r5.setTitle(C152376fH.A02.A01(getContext(), this.A03, (C58312fj) null));
        r5.BmB(C0003R.C0004drawable.instagram_arrow_back_24, new C151986ed(this));
    }

    public final boolean onBackPressed() {
        this.mFragmentManager.A0W();
        return true;
    }

    public final boolean AgJ() {
        if (!AgL() || Abq()) {
            return true;
        }
        return false;
    }

    public final String getModuleName() {
        return "com.instagram.brandedcontent.violation.BrandedContentNotificationFragment";
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(491197481);
        super.onCreate(bundle);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(this.mArguments);
        this.A03 = A062;
        this.A05 = new C28341Li(getContext(), A062, AnonymousClass1L8.A00(this));
        this.A01 = new AnonymousClass6C2(getActivity(), this, this.A03, getContext(), this, this);
        C17640qZ r4 = C17640qZ.A00;
        AnonymousClass0C1 r7 = this.A03;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.BRANDED_CONTENT_AND_SHOPPING_ACTIVITY_FEED;
        AnonymousClass1NW A032 = r4.A03();
        A032.A03 = new C151956ea(this);
        A032.A05 = new C151966eb(this);
        AnonymousClass1OC A0A = r4.A0A(this, this, r7, quickPromotionSlot, A032.A00());
        this.A02 = A0A;
        registerLifecycleListener(A0A);
        this.A00 = new C151926eX(getContext(), this.A03, this, this.A01, this.A02);
        this.A04 = new C62432nh(this.A03, Constants.ONE, 8, (C29091Oo) this);
        setListAdapter(this.A00);
        C23300zv.A00(this.A03).A02(AnonymousClass6OY.class, this.A07);
        AnonymousClass0Z0.A09(431464754, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1323298771);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_refreshablelistview_with_empty_state, viewGroup, false);
        AnonymousClass0Z0.A09(-829315736, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(2086598607);
        super.onDestroyView();
        unregisterLifecycleListener(this.A02);
        AnonymousClass0Z0.A09(-2072535485, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-426319776);
        super.onPause();
        C23300zv.A00(this.A03).A03(AnonymousClass6OY.class, this.A07);
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T != null) {
            A0T.A0T();
        }
        AnonymousClass0Z0.A09(1901992911, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-44930994);
        super.onResume();
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T != null && A0T.A0a()) {
            getListView().getViewTreeObserver().addOnGlobalLayoutListener(new C151896eT(this));
        }
        AnonymousClass0Z0.A09(-1484916373, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EmptyStateView emptyStateView = (EmptyStateView) getListView().getEmptyView();
        emptyStateView.A0H(C0003R.C0004drawable.loadmore_icon_refresh_compound, AnonymousClass2Oq.ERROR);
        AnonymousClass2Oq r1 = AnonymousClass2Oq.EMPTY;
        emptyStateView.A0H(C0003R.C0004drawable.branded_content_badge, r1);
        emptyStateView.A0J(C0003R.string.branded_content, r1);
        emptyStateView.A0I(C0003R.string.branded_content_notification_empty_state_description, r1);
        emptyStateView.A0K(new C151976ec(this), AnonymousClass2Oq.ERROR);
        emptyStateView.A0F();
        this.A06 = emptyStateView;
        getListView().setOnScrollListener(this.A04);
        ((RefreshableListView) getListView()).setupAndEnableRefresh(new C151996ee(this));
        A00(this, true);
        this.A02.BL4();
    }
}
