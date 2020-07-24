package com.instagram.direct.inbox.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.p009ui.widget.search.SearchController;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0TX;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HH;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NW;
import p000X.AnonymousClass1OC;
import p000X.AnonymousClass1X4;
import p000X.AnonymousClass28B;
import p000X.AnonymousClass2M0;
import p000X.AnonymousClass2MG;
import p000X.AnonymousClass2MJ;
import p000X.AnonymousClass2MK;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass31A;
import p000X.AnonymousClass338;
import p000X.AnonymousClass339;
import p000X.AnonymousClass3LX;
import p000X.AnonymousClass469;
import p000X.AnonymousClass48A;
import p000X.AnonymousClass4A2;
import p000X.AnonymousClass67D;
import p000X.AnonymousClass67G;
import p000X.C04280Di;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C08100Vq;
import p000X.C105304ge;
import p000X.C108684mG;
import p000X.C109634nv;
import p000X.C109644nw;
import p000X.C109654nx;
import p000X.C109674nz;
import p000X.C109684o0;
import p000X.C109694o2;
import p000X.C109724o5;
import p000X.C109744o7;
import p000X.C17640qZ;
import p000X.C256219o;
import p000X.C256419q;
import p000X.C27341Hl;
import p000X.C28351Lj;
import p000X.C31341Xr;
import p000X.C36261hl;
import p000X.C59032gv;
import p000X.C67692xg;
import p000X.C67712xi;
import p000X.C67852xw;
import p000X.C692231l;
import p000X.C697433m;
import p000X.C697533n;

public class DirectSearchInboxFragment extends C27341Hl implements AnonymousClass31A, AnonymousClass2M0, AnonymousClass1HM {
    public C109634nv A00;
    public int A01;
    public int A02;
    public RectF A03;
    public AnonymousClass0QT A04;
    public C692231l A05;
    public C697433m A06;
    public C109744o7 A07;
    public DirectThreadKey A08;
    public AnonymousClass1OC A09;
    public AnonymousClass0C1 A0A;
    public String A0B;
    public boolean A0C;
    public TouchInterceptorFrameLayout mTouchInterceptorFrameLayout;

    public final AnonymousClass1HH AMB() {
        return this;
    }

    public final void BQ1(DirectShareTarget directShareTarget, String str, int i, View view, C105304ge r5) {
    }

    public final void Bdg() {
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        r4.Bnz(false);
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        A002.A0C = true;
        A002.A06 = AnonymousClass1BA.A01(getContext(), C0003R.attr.statusBarBackgroundColor);
        r4.BmE(A002.A00());
    }

    public final String getModuleName() {
        return "DIRECT_SEARCH_INBOX_FRAGMENT";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void A00(Bundle bundle) {
        bundle.putString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID", this.A0B);
        bundle.putParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY", this.A08);
        bundle.putParcelable(AnonymousClass0C5.$const$string(5), this.A03);
        C59032gv r1 = new C59032gv(this.A0A, ModalActivity.class, "direct_search_inbox_see_all_fragment", bundle, getActivity());
        r1.A08(this);
        r1.A0A = ModalActivity.A04;
        r1.A07(this, 289);
    }

    public final void BMr(int i, DirectShareTarget directShareTarget, String str, C105304ge r22) {
        int A002;
        int A003;
        DirectShareTarget directShareTarget2 = directShareTarget;
        DirectThreadKey directThreadKey = directShareTarget2.A00;
        if (directThreadKey == null) {
            AnonymousClass0QD.A02("DirectSearchInboxFragment", "thread key should never be null");
            return;
        }
        C109744o7 r1 = this.A07;
        if (r1 != null) {
            r1.A01(directShareTarget2);
        }
        int i2 = i;
        if (this.A06 != null) {
            C67712xi r12 = this.A00.A02;
            if (r12 == null) {
                A003 = 0;
            } else {
                A003 = C06360Ot.A00(r12.ATP().trim());
            }
            long j = (long) A003;
            this.A06.A02(this.A0A, directShareTarget2, j, (long) i2);
            this.A06.A01(this.A0A, directShareTarget2, j);
        } else {
            AnonymousClass0C1 r11 = this.A0A;
            C109634nv r122 = this.A00;
            long j2 = (long) i2;
            C67712xi r13 = r122.A02;
            if (r13 == null) {
                A002 = 0;
            } else {
                A002 = C06360Ot.A00(r13.ATP().trim());
            }
            AnonymousClass3LX.A0E(r11, r122, directThreadKey, j2, (long) A002);
        }
        AnonymousClass48A.A00(getContext(), this.A0A, this.A04, getActivity(), directShareTarget2.A05(), directThreadKey.A00, this.A0B, this, str, getModuleName(), new AnonymousClass4A2(this));
    }

    public final TouchInterceptorFrameLayout AYj() {
        return this.mTouchInterceptorFrameLayout;
    }

    public final void BQ2(DirectShareTarget directShareTarget, RectF rectF, String str) {
        Context context = getContext();
        boolean isResumed = isResumed();
        AnonymousClass0C1 r2 = this.A0A;
        AnonymousClass48A.A01(context, isResumed, r2, getActivity(), AnonymousClass469.A03(r2, directShareTarget), rectF, str, this.A08, this.A0B, this.A03, this);
        getActivity().onBackPressed();
    }

    public final void afterOnResume() {
        super.afterOnResume();
        this.A09.BL4();
        if (this.A0C) {
            C109634nv r2 = this.A00;
            if (r2.A02 == null) {
                Context context = r2.A07;
                C67712xi A002 = C108684mG.A00(context, r2.A0D, new C28351Lj(context, r2.A08), "raven", true, r2.A04, "direct_user_search_keypressed");
                r2.A02 = A002;
                A002.BiZ(r2.A00);
            }
            r2.A03.A02(false, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A0C = false;
        }
        AnonymousClass1X4.A02(getActivity(), AnonymousClass1BA.A01(getContext(), C0003R.attr.statusBarBackgroundColor));
    }

    public final C06590Pq getSession() {
        return this.A0A;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 289 && i2 == -1) {
            getActivity().onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(445880360);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A0A = A062;
        this.A04 = AnonymousClass0QT.A00(A062, this);
        this.A03 = (RectF) bundle2.getParcelable(AnonymousClass0C5.$const$string(5));
        this.A0B = bundle2.getString("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_SESSION_ID");
        this.A08 = (DirectThreadKey) bundle2.getParcelable("DirectInboxFragment.DIRECT_VISUAL_MESSAGE_REPLAY_THREAD_KEY");
        this.A01 = bundle2.getInt("DirectInboxSearchFragment.DIRECT_CONTAINER_MARGIN_BOTTOM_PX");
        int intValue = ((Integer) AnonymousClass0L6.A02(this.A0A, AnonymousClass0L7.DIRECT_RECENT_SEARCHES, "limit", -1, (AnonymousClass04H) null)).intValue();
        this.A02 = intValue;
        if (intValue > 0) {
            this.A07 = C109744o7.A00(this.A0A);
        }
        C17640qZ r3 = C17640qZ.A00;
        AnonymousClass0C1 r6 = this.A0A;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.DIRECT_INBOX_SEARCH;
        AnonymousClass1NW A032 = r3.A03();
        A032.A03 = new C109654nx(this);
        A032.A05 = new C109644nw(this);
        AnonymousClass1OC A092 = r3.A09(this, this, r6, quickPromotionSlot, A032.A00());
        this.A09 = A092;
        registerLifecycleListener(A092);
        if (((Boolean) AnonymousClass0L6.A02(this.A0A, AnonymousClass0L7.DIRECT_INBOX_SEARCH_LOGGING_REWRITE, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C697433m r5 = (C697433m) this.A0A.AVA(C697433m.class, new C697533n());
            this.A06 = r5;
            AnonymousClass0C1 r4 = this.A0A;
            C109674nz r32 = new C109674nz(AnonymousClass0QT.A00(r4, r5.A03).A02("direct_inbox_search_start"));
            if (r32.A0B()) {
                boolean z = false;
                if (r5.A01 != null) {
                    z = true;
                }
                if (z) {
                    r5.A00(r4, 0);
                }
                String uuid = UUID.randomUUID().toString();
                r5.A01 = uuid;
                r32.A08("session_id", uuid);
                r32.A01();
            }
        }
        AnonymousClass0Z0.A09(1947264495, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AnonymousClass2MK r6;
        int A022 = AnonymousClass0Z0.A02(1100834305);
        this.mTouchInterceptorFrameLayout = new TouchInterceptorFrameLayout(getContext());
        this.A09.BL4();
        C692231l r3 = new C692231l(requireContext());
        this.A05 = r3;
        registerLifecycleListener(r3);
        C109634nv r10 = new C109634nv(getContext(), this.A0A, AnonymousClass1L8.A00(this), this.A01, this.A02, this, this, this.A06, this);
        this.A00 = r10;
        FragmentActivity activity = getActivity();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.mTouchInterceptorFrameLayout;
        AnonymousClass1OC r7 = this.A09;
        C36261hl r2 = new C36261hl(new C256419q(activity, r10.A0D, C109694o2.A00, 23592971));
        r10.A01 = r2;
        registerLifecycleListener(r2);
        AnonymousClass2MJ A002 = AnonymousClass2MG.A00(activity);
        A002.A03.addAll(C17640qZ.A00.A0C(r10.A0D, r7));
        if (((Boolean) AnonymousClass0L6.A02(r10.A0D, AnonymousClass0L7.DIRECT_INBOX_SCROLL_PERF_IMPROVEMENTS, "new_layout_for_search_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r6 = new AnonymousClass338(r10.A0A, r10.A0D, r10.A04);
        } else {
            r6 = new AnonymousClass339(r10.A0A, r10.A0D, r10.A04);
        }
        A002.A01(r6);
        A002.A01(new AnonymousClass0TX());
        A002.A01(new C08100Vq(r10.A07, r10));
        A002.A01(new C04280Di());
        AnonymousClass2MG A003 = A002.A00();
        Context context = r10.A07;
        AnonymousClass0C1 r8 = r10.A0D;
        AnonymousClass28B r72 = r10.A09;
        DirectSearchInboxFragment directSearchInboxFragment = r10.A0C;
        int i = r10.A06;
        boolean z = r10.A0E;
        boolean z2 = false;
        if (r10.A0B != null) {
            z2 = true;
        }
        r10.A00 = new C109724o5(context, r8, r72, A003, directSearchInboxFragment, i, z, z2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        SearchController searchController = new SearchController((Activity) activity, (ViewGroup) touchInterceptorFrameLayout, -1, r10.A05, (AnonymousClass67D) r10, false, (AnonymousClass67G) null, true, (C256219o) r10.A01);
        searchController.A02 = A003;
        searchController.mViewHolder.A01.setLayoutManager(linearLayoutManager);
        searchController.mViewHolder.A01.setAdapter(A003);
        searchController.mViewHolder.A01.setItemAnimator((C31341Xr) null);
        searchController.mViewHolder.A01.setHasFixedSize(true);
        searchController.A03 = new C109684o0(searchController, linearLayoutManager);
        r10.A03 = searchController;
        registerLifecycleListener(searchController);
        if (r10.A0F) {
            r10.A03.A06 = true;
        }
        this.A0C = true;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.mTouchInterceptorFrameLayout;
        AnonymousClass0Z0.A09(2047316844, A022);
        return touchInterceptorFrameLayout2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(93204761);
        super.onDestroyView();
        this.mTouchInterceptorFrameLayout = null;
        unregisterLifecycleListener(this.A05);
        C109634nv r1 = this.A00;
        if (r1 != null) {
            C67712xi r0 = r1.A02;
            if (r0 != null) {
                r0.BiZ((C67692xg) null);
            }
            r1.A01 = null;
            this.A00 = null;
        }
        AnonymousClass0Z0.A09(833059175, A022);
    }
}
