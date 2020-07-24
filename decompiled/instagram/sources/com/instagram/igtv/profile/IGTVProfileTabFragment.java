package com.instagram.igtv.profile;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.profile.fragment.UserDetailFragment;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1P8;
import p000X.AnonymousClass2M1;
import p000X.AnonymousClass2Wo;
import p000X.AnonymousClass38X;
import p000X.AnonymousClass3BU;
import p000X.AnonymousClass3BV;
import p000X.AnonymousClass3C0;
import p000X.AnonymousClass3C6;
import p000X.AnonymousClass3D6;
import p000X.AnonymousClass3DA;
import p000X.AnonymousClass3DC;
import p000X.AnonymousClass3IC;
import p000X.AnonymousClass3ID;
import p000X.AnonymousClass3IE;
import p000X.AnonymousClass3IG;
import p000X.AnonymousClass3IJ;
import p000X.AnonymousClass3IL;
import p000X.AnonymousClass3IM;
import p000X.AnonymousClass3IR;
import p000X.AnonymousClass3IS;
import p000X.AnonymousClass3IT;
import p000X.AnonymousClass3IU;
import p000X.AnonymousClass6VC;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C156846mv;
import p000X.C163646yV;
import p000X.C163666yX;
import p000X.C164026z9;
import p000X.C1651472n;
import p000X.C1652272v;
import p000X.C17660qb;
import p000X.C17850qu;
import p000X.C17920r1;
import p000X.C23300zv;
import p000X.C256319p;
import p000X.C256419q;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C28351Lj;
import p000X.C28511Ma;
import p000X.C29091Oo;
import p000X.C29621Qp;
import p000X.C32631ba;
import p000X.C32641bb;
import p000X.C32711bj;
import p000X.C58442fx;
import p000X.C61622m6;
import p000X.C709938n;
import p000X.C710138p;
import p000X.C71593Bj;
import p000X.C71603Bk;
import p000X.C71613Bl;
import p000X.C71623Bm;

public class IGTVProfileTabFragment extends C27341Hl implements C27371Ho, AnonymousClass3BU, C29091Oo, C71593Bj, AnonymousClass3BV, C71603Bk, C71613Bl {
    public AnonymousClass0C1 A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public AnonymousClass38X A06;
    public AnonymousClass3IL A07;
    public C710138p A08;
    public String A09;
    public boolean A0A;
    public final C17920r1 A0B = new AnonymousClass3IC(this);
    public AnonymousClass3IR mIGTVUserProfileLogger;
    public C23300zv mIgEventBus;
    public C11200ea mMediaUpdateListener;
    public AnonymousClass2M1 mNavPerfLogger;
    public C256319p mOnScrollListener;
    public C709938n mPullToRefreshStopperDelegate;
    public RecyclerView mRecyclerView;
    public C256419q mScrollPerfLogger;
    public C11200ea mSeriesUpdatedEventListener;
    public AnonymousClass3IG mUserAdapter;
    public C32631ba mUserChannel;

    private void A00() {
        String str;
        this.A02 = true;
        Context context = getContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r4 = this.A00;
        C32631ba r1 = this.mUserChannel;
        String str2 = r1.A02;
        if (this.A03) {
            str = null;
        } else {
            str = r1.A05;
        }
        C17850qu A003 = AnonymousClass3DC.A00(context, r4, str2, str, r1.A03, r1.A06);
        A003.A00 = this.A0B;
        C28351Lj.A00(context, A002, A003);
    }

    public static void A02(IGTVProfileTabFragment iGTVProfileTabFragment) {
        AnonymousClass3IG r0 = iGTVProfileTabFragment.mUserAdapter;
        if (r0 != null) {
            r0.A02(true);
            iGTVProfileTabFragment.mUserAdapter.A01((C13300iJ) null, iGTVProfileTabFragment.mUserChannel);
        }
    }

    public final AnonymousClass1HD A5s() {
        return this;
    }

    public final String ASx() {
        return "profile_igtv";
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void Av2(AnonymousClass1NJ r1) {
    }

    public final void Av6(C58442fx r1, C32631ba r2, String str, String str2, List list) {
    }

    public final void BDs(int i) {
    }

    public final void BIq(int i) {
    }

    public final void BQk() {
    }

    public final void BQl() {
        this.A0A = false;
        AnonymousClass3IR.A00(this.mIGTVUserProfileLogger, "igtv_profile_tab_entry");
    }

    public final void BQq() {
        this.A0A = true;
        AnonymousClass3IR.A00(this.mIGTVUserProfileLogger, "igtv_profile_tab_exit");
    }

    public final String getModuleName() {
        return "igtv_profile";
    }

    public static void A01(IGTVProfileTabFragment iGTVProfileTabFragment) {
        FragmentActivity activity;
        AnonymousClass3IL r2 = iGTVProfileTabFragment.A07;
        if (r2 != null && (activity = iGTVProfileTabFragment.getActivity()) != null && r2.A00 != null) {
            AnonymousClass3IL.A00(r2, activity, AnonymousClass1L8.A00(activity));
        }
    }

    public final void A68() {
        C32631ba r1;
        if (this.A02 || (r1 = this.mUserChannel) == null || (!r1.A0A && r1.A03(this.A00) != 0)) {
            C709938n r0 = this.mPullToRefreshStopperDelegate;
            if (r0 != null) {
                r0.BqS();
                return;
            }
            return;
        }
        A00();
    }

    public final void Av1(C58442fx r5) {
        C17660qb.A00.A0D(getActivity(), this.A00, AnonymousClass1L8.A00(this), r5);
    }

    public final void Av4(C58442fx r11, boolean z, String str, String str2, List list) {
        AnonymousClass3D6 A082 = C17660qb.A00.A08(this.A00);
        A082.A04(Collections.singletonList(this.mUserChannel));
        AnonymousClass3C0.A03(this.A00, (AnonymousClass0RN) this.mParentFragment, "tap_igtv", AnonymousClass3C6.A01(this.A09), this.A01, (String) null, (String) null, "igtv_tab");
        this.mIGTVUserProfileLogger.A01(r11.APe(), str, str2, list);
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r6 = this.A00;
        AnonymousClass1NJ APe = r11.APe();
        C32631ba r8 = this.mUserChannel;
        C163646yV r5 = new C163646yV(new C28511Ma(Constants.A0A), System.currentTimeMillis());
        r5.A03 = C163666yX.PROFILE;
        r5.A09 = r8.A02;
        r5.A0A = APe.getId();
        r5.A0G = true;
        r5.A0M = true;
        r5.A0H = true;
        r5.A0I = true;
        r5.A00(activity, r6, A082);
    }

    public final void BGg(C709938n r2) {
        this.mPullToRefreshStopperDelegate = r2;
        if (!this.A02 && this.mUserChannel != null) {
            this.A03 = true;
            A00();
        }
    }

    public final void BLL(boolean z) {
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new C71623Bm(recyclerView, z));
    }

    public final void BMT(C1652272v r5) {
        new C164026z9(r5.A00, r5.A01, this.A01).A00(getActivity(), this.A00, AnonymousClass6VC.A00(Constants.A0A));
    }

    public final void BVt() {
        this.A07.A01(getActivity());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        View view2 = view;
        super.onViewCreated(view2, bundle);
        FragmentActivity activity = getActivity();
        Context context = getContext();
        Bundle bundle2 = this.mArguments;
        this.A01 = bundle2.getString(MemoryDumpUploadJob.EXTRA_USER_ID);
        this.mRecyclerView = (RecyclerView) view2.findViewById(C0003R.C0005id.igtv_profile_tab_recycler_view);
        C28051Kf A002 = C28021Kc.A00();
        AnonymousClass3ID r11 = new AnonymousClass3ID(this.A00, this, this, A002, new AnonymousClass3IE(this));
        A002.A04(C32711bj.A00(this), this.mRecyclerView);
        this.mNavPerfLogger = AnonymousClass3DA.A00(31785000, context, this, this.A00);
        C256419q A012 = AnonymousClass3DA.A01(23592990, activity, this.A00, this, Constants.ONE);
        this.mScrollPerfLogger = A012;
        registerLifecycleListener(A012);
        this.mUserAdapter = new AnonymousClass3IG(activity, this.A00, r11, this, new AnonymousClass3IJ(), this, this.mNavPerfLogger, this, (C156846mv) null, (C1651472n) null);
        AnonymousClass0C1 r1 = this.A00;
        this.A07 = new AnonymousClass3IL(r1, this.A01, this);
        C13300iJ A022 = C13510ie.A00(r1).A02(this.A01);
        if (A022 != null) {
            AnonymousClass3IG r12 = this.mUserAdapter;
            Boolean bool = A022.A0q;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            r12.A02(z);
            this.mNavPerfLogger.A00.A02();
        } else {
            AnonymousClass0QD.A01("igtv_series_user_not_in_cache", AnonymousClass000.A0J("For IGTV Series, expected user ", this.A01, " to be in cache."));
        }
        String string = bundle2.getString("user_full_name");
        this.A09 = bundle2.getString("logging_follow_status");
        AnonymousClass3D6 r7 = new AnonymousClass3D6(this.A00);
        AnonymousClass38X r0 = ((UserDetailFragment) this.mParentFragment).A0L;
        this.A06 = r0;
        C32631ba r02 = r0.A00;
        if (r02 != null) {
            this.mUserChannel = r02;
            this.mNavPerfLogger.A00.A02();
        } else {
            String str = this.A01;
            C32631ba r2 = (C32631ba) r7.A05.get(AnonymousClass2Wo.A04(str));
            if (r2 == null) {
                r2 = new C32631ba(AnonymousClass2Wo.A04(str), C32641bb.USER, string);
                r7.A02(r2);
            }
            this.mUserChannel = r2;
        }
        GridLayoutManager A003 = AnonymousClass3IM.A00(context, this.mUserAdapter);
        this.mRecyclerView.setLayoutManager(A003);
        this.mRecyclerView.setAdapter(this.mUserAdapter);
        AnonymousClass3IM.A01(context, this.mRecyclerView);
        C61622m6 r13 = new C61622m6(this, C29621Qp.IGTV_CHANNEL, A003);
        this.mOnScrollListener = r13;
        this.mRecyclerView.A0w(r13);
        this.mRecyclerView.A0w(this.mScrollPerfLogger);
        this.mUserAdapter.A01((C13300iJ) null, this.mUserChannel);
        AnonymousClass0C1 r03 = this.A00;
        this.mIGTVUserProfileLogger = new AnonymousClass3IR(this, r03);
        C23300zv A004 = C23300zv.A00(r03);
        this.mIgEventBus = A004;
        AnonymousClass3IS r14 = new AnonymousClass3IS(this);
        this.mMediaUpdateListener = r14;
        this.mSeriesUpdatedEventListener = new AnonymousClass3IT(this);
        A004.A02(AnonymousClass1P8.class, r14);
        this.mIgEventBus.A02(AnonymousClass3IU.class, this.mSeriesUpdatedEventListener);
        UserDetailFragment userDetailFragment = (UserDetailFragment) this.mParentFragment;
        AnonymousClass0a4.A07(userDetailFragment.A0b, "Missing Tab Data Provider");
        C710138p r04 = userDetailFragment.A0b.A0C.A0J;
        this.A08 = r04;
        r04.A00(this);
        A68();
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1117567183);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(-1570417159, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(2112467557);
        View inflate = layoutInflater.inflate(C0003R.layout.igtv_profile_tab, viewGroup, false);
        AnonymousClass0Z0.A09(1785749339, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1805287803);
        if (!this.A0A) {
            AnonymousClass3IR.A00(this.mIGTVUserProfileLogger, "igtv_profile_tab_exit");
        }
        this.A06.A00 = this.mUserChannel;
        this.mRecyclerView.A0V();
        this.A08.A04.remove(this);
        this.mIgEventBus.A03(AnonymousClass1P8.class, this.mMediaUpdateListener);
        this.mIgEventBus.A03(AnonymousClass3IU.class, this.mSeriesUpdatedEventListener);
        IGTVProfileTabFragmentLifecycleUtil.cleanupReferences(this);
        unregisterLifecycleListener(this.mScrollPerfLogger);
        super.onDestroyView();
        AnonymousClass0Z0.A09(1962937848, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-645039909);
        super.onPause();
        this.mScrollPerfLogger.BE0();
        AnonymousClass0Z0.A09(-1325366983, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-2108271187);
        super.onResume();
        if (this.A05) {
            this.A05 = false;
            A02(this);
        }
        if (this.A04) {
            this.A04 = false;
            A01(this);
        }
        AnonymousClass0Z0.A09(408707893, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }
}
