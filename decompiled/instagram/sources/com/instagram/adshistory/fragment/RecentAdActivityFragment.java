package com.instagram.adshistory.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.p009ui.emptystaterow.EmptyStateView;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I1;
import p000X.AnonymousClass1I2;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1LO;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1RA;
import p000X.AnonymousClass1VH;
import p000X.AnonymousClass1WD;
import p000X.AnonymousClass252;
import p000X.AnonymousClass2NN;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6RH;
import p000X.AnonymousClass6RK;
import p000X.AnonymousClass6RM;
import p000X.AnonymousClass6TG;
import p000X.AnonymousClass6YO;
import p000X.AnonymousClass6Z6;
import p000X.AnonymousClass6Z9;
import p000X.AnonymousClass6ZE;
import p000X.AnonymousClass6ZF;
import p000X.AnonymousClass6ZH;
import p000X.AnonymousClass6ZI;
import p000X.AnonymousClass6ZL;
import p000X.AnonymousClass6ZM;
import p000X.AnonymousClass6ZO;
import p000X.AnonymousClass6ZP;
import p000X.AnonymousClass6ZQ;
import p000X.AnonymousClass6ZR;
import p000X.AnonymousClass6ZT;
import p000X.AnonymousClass6ZU;
import p000X.C06590Pq;
import p000X.C152026eh;
import p000X.C256119n;
import p000X.C27301Hh;
import p000X.C27371Ho;
import p000X.C27411Hs;
import p000X.C28351Lj;
import p000X.C29091Oo;
import p000X.C29631Qq;
import p000X.C29671Qu;
import p000X.C30521Ue;
import p000X.C30691Uv;
import p000X.C30701Uw;
import p000X.C43041tf;
import p000X.C62432nh;

public final class RecentAdActivityFragment extends AnonymousClass2NN implements C27371Ho, AnonymousClass1HL, C29091Oo, AbsListView.OnScrollListener, AnonymousClass1HM, C30521Ue {
    public C152026eh A00;
    public AnonymousClass6Z6 A01;
    public AnonymousClass6Z9 A02;
    public AnonymousClass6ZQ A03;
    public AnonymousClass6ZO A04;
    public AnonymousClass6RH A05;
    public AnonymousClass1WD A06;
    public AnonymousClass0C1 A07;
    public EmptyStateView A08;
    public RefreshableListView A09;
    public C62432nh A0A;
    public AnonymousClass1VH A0B;
    public C29631Qq A0C;
    public final AnonymousClass1I1 A0D = new AnonymousClass1I1();

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void BZo(AbsListView.OnScrollListener onScrollListener) {
    }

    public final void Bs9(AbsListView.OnScrollListener onScrollListener) {
    }

    public final String getModuleName() {
        return "recent_ad_activity";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0.isEmpty() == false) goto L_0x0022;
     */
    public final void A01(AnonymousClass6ZH r5, AnonymousClass6ZI r6) {
        ImmutableList A092;
        ImmutableList A093;
        ImmutableList A094;
        ImmutableList A095;
        boolean z = false;
        this.A09.setIsLoading(false);
        List list = r5.A02;
        if (list != null) {
            A092 = ImmutableList.A09(list);
        } else {
            A092 = ImmutableList.A09(new ArrayList());
        }
        if (A092.isEmpty()) {
            List list2 = r6.A02;
            if (list2 != null) {
                A095 = ImmutableList.A09(list2);
            } else {
                A095 = ImmutableList.A09(new ArrayList());
            }
        }
        z = true;
        if (z || !ImmutableList.A09(this.A04.A00.A00).isEmpty()) {
            AnonymousClass6Z6 r3 = this.A01;
            List list3 = r5.A02;
            if (list3 != null) {
                A093 = ImmutableList.A09(list3);
            } else {
                A093 = ImmutableList.A09(new ArrayList());
            }
            List list4 = r6.A02;
            if (list4 != null) {
                A094 = ImmutableList.A09(list4);
            } else {
                A094 = ImmutableList.A09(new ArrayList());
            }
            r3.A02.A0F(A093);
            r3.A01.A03.A01.clear();
            AnonymousClass6RM.A00(A094, r3.A01.A03, r3.A03);
            r3.A00();
            return;
        }
        this.A08.A0M(AnonymousClass2Oq.EMPTY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.AgL() != false) goto L_0x0011;
     */
    public final void A68() {
        boolean z;
        AnonymousClass6ZF r2 = this.A02.A01;
        if (r2.Abs()) {
            z = true;
        }
        z = false;
        if (z) {
            r2.Aix();
        }
    }

    public final void A00() {
        AnonymousClass5F9.A01(getContext(), C0003R.string.request_error, 1);
        this.A09.setIsLoading(false);
        this.A08.A0M(AnonymousClass2Oq.ERROR);
    }

    public final void Bel() {
        C43041tf.A00(this, getListView());
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.ad_activity);
        r2.Bo6(true);
        r2.BmP(this);
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(582242501);
        super.onCreate(bundle);
        this.A07 = AnonymousClass0J1.A06(this.mArguments);
        this.A02 = new AnonymousClass6Z9(this.A07, this, new C28351Lj(getContext(), AnonymousClass1L8.A00(this)));
        this.A0A = new C62432nh(this.A07, Constants.ONE, 3, (C29091Oo) this);
        AnonymousClass6RH r3 = new AnonymousClass6RH(getContext(), this.A07, AnonymousClass1OY.ADS_HISTORY, this, this, this);
        this.A05 = r3;
        AnonymousClass1WD r2 = new AnonymousClass1WD(r3, this.A07, this, getContext(), (AnonymousClass1LO) null, false, Constants.A0j, (AnonymousClass252) null, false, (AnonymousClass1I2) null, (C27411Hs) null);
        this.A06 = r2;
        r2.Bkk(new AnonymousClass6RK(this));
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r4 = this.A07;
        AnonymousClass6ZO r6 = new AnonymousClass6ZO(activity, r4, new AnonymousClass6ZT(new ArrayList(), true));
        this.A04 = r6;
        this.A00 = new C152026eh(r4, r6, new AnonymousClass6ZP(this), this);
        AnonymousClass6ZQ A002 = AnonymousClass6ZQ.A00(this.A07);
        this.A03 = A002;
        A002.A00 = new AnonymousClass6ZU(this);
        A002.A06.A05(this, new AnonymousClass6ZE(this));
        AnonymousClass6Z6 r22 = new AnonymousClass6Z6(getContext(), this.A07, this, this.A05, this.A04, this.A06, this.A00, this.A02.A01, new AnonymousClass6ZR(this));
        this.A01 = r22;
        setListAdapter(r22);
        AnonymousClass1RA r62 = new AnonymousClass1RA(this, new C27301Hh(getContext()), this.A01, this.A0D);
        AnonymousClass6TG A003 = AnonymousClass6TG.A00();
        AnonymousClass1LO r42 = new AnonymousClass1LO(this, false, getContext(), this.A07);
        C30691Uv r7 = new C30691Uv(getContext(), this, this.mFragmentManager, this.A01, this, this.A07);
        r7.A0F = A003;
        r7.A09 = r62;
        r7.A01 = r42;
        r7.A08 = new C30701Uw();
        this.A0B = r7.A00();
        C29671Qu r43 = new C29671Qu(this, this, this.A07);
        C29631Qq r32 = new C29631Qq(this.A07, this.A01);
        this.A0C = r32;
        r32.A01();
        this.A0D.A0B(this.A0A);
        this.A0D.A0B(this.A0B);
        AnonymousClass1HU r23 = new AnonymousClass1HU();
        r23.A0C(this.A0B);
        r23.A0C(this.A0C);
        r23.A0C(r43);
        registerLifecycleListenerSet(r23);
        AnonymousClass0Z0.A09(1105004566, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-531080578);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_feed, viewGroup, false);
        AnonymousClass0Z0.A09(50868675, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1084427867);
        super.onDestroy();
        this.A0D.A0C(this.A0A);
        this.A0A = null;
        this.A0D.A0C(this.A0B);
        this.A0B = null;
        AnonymousClass0Z0.A09(561999681, A022);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A032 = AnonymousClass0Z0.A03(-509172115);
        if (this.A01.Aey()) {
            if (C256119n.A04(absListView)) {
                this.A01.Aq6();
            }
            AnonymousClass0Z0.A0A(2016119336, A032);
        }
        this.A0D.onScroll(absListView, i, i2, i3);
        AnonymousClass0Z0.A0A(2016119336, A032);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A032 = AnonymousClass0Z0.A03(927604066);
        if (!this.A01.Aey()) {
            this.A0D.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0Z0.A0A(-955506479, A032);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        this.A09 = refreshableListView;
        refreshableListView.setupAndEnableRefresh(new AnonymousClass6ZM(this));
        EmptyStateView emptyStateView = (EmptyStateView) refreshableListView.getEmptyView();
        this.A08 = emptyStateView;
        emptyStateView.A0K(new AnonymousClass6ZL(this), AnonymousClass2Oq.ERROR);
        EmptyStateView emptyStateView2 = this.A08;
        AnonymousClass6YO r0 = new AnonymousClass6YO(this);
        AnonymousClass2Oq r2 = AnonymousClass2Oq.EMPTY;
        emptyStateView2.A0L(r0, r2);
        this.A08.A0H(C0003R.C0004drawable.f51xd37eab2e, r2);
        this.A08.A0J(C0003R.string.ad_activity_empty_state_title, r2);
        this.A08.A0I(C0003R.string.ad_activity_empty_state_description, r2);
        this.A08.A0G(C0003R.string.ad_activity_empty_state_button_text, r2);
        this.A08.A0M(AnonymousClass2Oq.LOADING);
        this.A09.setOnScrollListener(this);
        this.A02.A02();
    }
}
