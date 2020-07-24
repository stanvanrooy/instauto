package com.instagram.shopping.fragment.destination.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.HashMap;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass9RA;
import p000X.AnonymousClass9ZP;
import p000X.AnonymousClass9a2;
import p000X.C06590Pq;
import p000X.C17510qM;
import p000X.C217479Zk;
import p000X.C217529Zr;
import p000X.C217539Zs;
import p000X.C217559Zu;
import p000X.C217609a0;
import p000X.C217619a1;
import p000X.C217629a3;
import p000X.C217659a6;
import p000X.C218499bU;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C29621Qp;
import p000X.C32711bj;
import p000X.C61622m6;

public class ShoppingBrandDestinationFragment extends C27341Hl implements AnonymousClass0RN, C27371Ho, AnonymousClass1HM, AnonymousClass9RA {
    public AnonymousClass0C1 A00;
    public C217479Zk A01;
    public C217609a0 A02;
    public C217559Zu A03;
    public C217529Zr A04;
    public String A05;
    public String A06;
    public C28051Kf A07;
    public AnonymousClass39Z A08;
    public final AnonymousClass9ZP A09 = new AnonymousClass9ZP();
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final String getModuleName() {
        return "instagram_shopping_brands";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    /* renamed from: A00 */
    public final void A4v(C217539Zs r5) {
        C217629a3 r0;
        C217529Zr r3 = this.A04;
        C218499bU r2 = new C218499bU(r5.A01.A02, r5.A00);
        if (C217619a1.FOLLOWED == r5.A02) {
            r0 = C217629a3.FOLLOWING;
        } else {
            r0 = C217629a3.SUGGESTED;
        }
        r3.A00(r2, r0);
    }

    public final boolean A01(C217619a1 r3) {
        C217479Zk r1 = this.A01;
        if (r1.A04.get(r3) == null || !(!((C217659a6) r1.A04.get(r3)).A02.isEmpty())) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ void A4w(Object obj, Object obj2) {
        A4v((C217539Zs) obj);
    }

    public final /* bridge */ /* synthetic */ void Ba7(View view, Object obj) {
        C217529Zr r2 = this.A04;
        r2.A00.A03(view, r2.A01.A00(((C217539Zs) obj).A01.A02));
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.shopping_brands_page_title);
        r2.Bo6(true);
        this.A08.A01(r2);
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1030997653);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass11J.A00(bundle2);
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A05 = bundle2.getString("prior_module_name");
        this.A06 = AnonymousClass30T.A00(this.mArguments);
        Context context = getContext();
        AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r6 = this.A00;
        C217559Zu r3 = new C217559Zu(context, A002, r6, this);
        this.A03 = r3;
        Context context2 = getContext();
        HashMap hashMap = new HashMap();
        hashMap.put(C217619a1.FOLLOWED, r3.A00);
        hashMap.put(C217619a1.RECOMMENDED, r3.A01);
        this.A01 = new C217479Zk(context2, r6, this, hashMap, this.A09);
        C217559Zu r32 = this.A03;
        r32.A00(C217619a1.FOLLOWED, true);
        r32.A00(C217619a1.RECOMMENDED, true);
        C17510qM r2 = C17510qM.A00;
        FragmentActivity activity = getActivity();
        AnonymousClass11J.A00(activity);
        AnonymousClass0C1 r4 = this.A00;
        String str = this.A06;
        this.A08 = r2.A0a(activity, r4, str, getModuleName(), "brand_destination", (String) null);
        C28051Kf A003 = C28051Kf.A00();
        this.A07 = A003;
        this.A04 = new C217529Zr(r4, this, str, A003);
        this.A02 = new C217609a0(this.A00, this, this.A06, this.A05);
        this.A01.A01();
        AnonymousClass0Z0.A09(-1176004273, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(557302255);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new AnonymousClass9a2(this));
        AnonymousClass0Z0.A09(-245236610, A022);
        return refreshableNestedScrollingParent;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass1E1.A07(this.mRefreshableContainer, C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A01.A01);
        this.mRecyclerView.A0w(new C61622m6(this.A03.A01, C29621Qp.LIST, linearLayoutManager));
        this.A09.A03(this.A00, this.mRefreshableContainer, this.mRecyclerView, getLayoutInflater());
        this.mRecyclerView.A0w(this.A09.A02);
        this.A07.A04(C32711bj.A00(this), this.mRecyclerView);
    }
}
