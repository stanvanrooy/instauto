package com.instagram.shopping.fragment.destination.reconsideration;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.HashMap;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass7K7;
import p000X.AnonymousClass9OJ;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9QP;
import p000X.AnonymousClass9QR;
import p000X.AnonymousClass9RA;
import p000X.AnonymousClass9RB;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9ZN;
import p000X.AnonymousClass9ZP;
import p000X.AnonymousClass9ZR;
import p000X.AnonymousClass9ZS;
import p000X.AnonymousClass9ZU;
import p000X.AnonymousClass9ZV;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C17510qM;
import p000X.C215909Sm;
import p000X.C217379Za;
import p000X.C217409Zd;
import p000X.C217419Ze;
import p000X.C217459Zi;
import p000X.C217599Zz;
import p000X.C218089ao;
import p000X.C218099ap;
import p000X.C218229b2;
import p000X.C218449bP;
import p000X.C223109jD;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C29621Qp;
import p000X.C30331Tk;
import p000X.C30671Ut;
import p000X.C31241Xc;
import p000X.C31321Xp;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C44841wq;
import p000X.C61622m6;

public class ShoppingReconsiderationDestinationFragment extends C27341Hl implements C27371Ho, AnonymousClass1HM, AnonymousClass9RA, C218449bP, C30331Tk {
    public AnonymousClass0C1 A00;
    public AnonymousClass9ZN A01;
    public AnonymousClass9ZV A02;
    public AnonymousClass9ZR A03;
    public AnonymousClass9QR A04;
    public AnonymousClass9ZS A05;
    public String A06;
    public boolean A07;
    public C28051Kf A08;
    public AnonymousClass39Z A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final C11200ea A0G = new AnonymousClass9ZU(this);
    public final C11200ea A0H = new C217379Za(this);
    public final AnonymousClass7K7 A0I = new AnonymousClass7K7();
    public final AnonymousClass9ZP A0J = new AnonymousClass9ZP();
    public final AnonymousClass9QP A0K = new C217459Zi(this);
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return false;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AvJ(String str, String str2, String str3, int i, int i2) {
    }

    public final void BFl(Product product) {
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        return false;
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    public final void BT2(ProductFeedItem productFeedItem) {
    }

    public final String getModuleName() {
        return "instagram_shopping_reconsideration_destination";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void A4v(Object obj) {
        AnonymousClass9RB r4 = (AnonymousClass9RB) obj;
        AnonymousClass9QR r0 = this.A04;
        String str = this.A06;
        AnonymousClass9RD r02 = r0.A03;
        if (r02 != null) {
            r02.A01(r4, str, (AnonymousClass9OJ) null);
        }
    }

    public final /* bridge */ /* synthetic */ void A4w(Object obj, Object obj2) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9OJ r4 = (AnonymousClass9OJ) obj2;
        AnonymousClass9QR r0 = this.A04;
        String str = this.A06;
        AnonymousClass9RD r02 = r0.A03;
        if (r02 != null) {
            r02.A01(r3, str, r4);
        }
    }

    public final boolean AfE(C217409Zd r2) {
        return this.A05.A07(r2);
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r11, String str, String str2) {
        this.A04.A04(productFeedItem, i, i2, r11, str, "reconsideration_destination");
    }

    public final void BFq(Product product, int i, int i2) {
        this.A04.A00(product, i, i2);
    }

    public final void BFs(Product product, String str, int i, int i2) {
        Product product2 = product;
        int i3 = i;
        this.A04.A01(product2, str, i3, i2, Constants.A0C);
    }

    public final void BN3(C217409Zd r3, List list, boolean z, boolean z2) {
        RefreshableNestedScrollingParent refreshableNestedScrollingParent;
        this.A01.A04();
        AnonymousClass9ZS r0 = this.A05;
        C217409Zd r1 = C217409Zd.BAG;
        if (!r0.A08(r1)) {
            r1 = C217409Zd.WISH_LIST;
        }
        if (r3 == r1 && (refreshableNestedScrollingParent = this.mRefreshableContainer) != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
    }

    public final /* bridge */ /* synthetic */ void Ba7(View view, Object obj) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9RD r0 = this.A04.A03;
        if (r0 != null) {
            r0.A00(view, r3);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        C13300iJ A022;
        if (this.A06 == null || this.A0B == null) {
            String str = this.A0F;
            if (str == null) {
                str = requireContext().getResources().getString(C0003R.string.shopping_reconsideration_destination_default_title);
            }
            r4.setTitle(str);
        } else {
            View Bgz = r4.Bgz(C0003R.layout.contextual_feed_title, 0, 0);
            ((TextView) Bgz.findViewById(C0003R.C0005id.feed_type)).setText(this.A0B);
            String str2 = this.A0F;
            if (str2 == null) {
                str2 = Bgz.getResources().getString(C0003R.string.shopping_reconsideration_destination_default_title);
            }
            ((TextView) Bgz.findViewById(C0003R.C0005id.feed_title)).setText(str2);
        }
        r4.Bo6(true);
        if (this.A06 == null || ((A022 = C13510ie.A00(this.A00).A02(this.A06)) != null && A022.A06 == C44841wq.MULTI_ITEM_CHECKOUT)) {
            this.A09.A01(r4);
        }
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-871331838);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A0E = AnonymousClass30T.A00(bundle2);
        this.A0C = bundle2.getString("prior_module_name");
        this.A0D = bundle2.getString("prior_submodule_name");
        this.A06 = bundle2.getString("merchant_id");
        this.A0B = bundle2.getString("merchant_username");
        this.A0F = bundle2.getString(AnonymousClass0C5.$const$string(129));
        this.A0A = bundle2.getString("media_id");
        this.A07 = bundle2.getBoolean("is_checkout_only");
        AnonymousClass9ZV r6 = new AnonymousClass9ZV(this.A00, this, this.A0E, this.A0C, this.A0D, this.A06);
        this.A02 = r6;
        C218099ap r5 = new C218099ap(r6.A00.A02("instagram_shopping_reconsideration_destination_entry"));
        if (r5.A0B()) {
            r5.A03("navigation_info", AnonymousClass9ZV.A00(r6, (String) null));
            r5.A08("merchant_id", r6.A01);
            r5.A01();
        }
        this.A05 = ((C217599Zz) this.A00.AVA(C217599Zz.class, new C218229b2())).A00(this.A06);
        AnonymousClass9ZR r62 = new AnonymousClass9ZR(this.A00, getContext(), AnonymousClass1L8.A00(this), this, this.A06, this.A07);
        this.A03 = r62;
        Context context = getContext();
        AnonymousClass0C1 r52 = this.A00;
        HashMap hashMap = new HashMap();
        hashMap.put(C217409Zd.BAG, r62.A01);
        hashMap.put(C217409Zd.WISH_LIST, r62.A04);
        hashMap.put(C217409Zd.RECENTLY_VIEWED, r62.A03);
        this.A01 = new AnonymousClass9ZN(context, r52, this, hashMap, this.A0J, this.A0B, this.A07, this.A05);
        C28051Kf A002 = C28051Kf.A00();
        this.A08 = A002;
        AnonymousClass0C1 r53 = this.A00;
        C215909Sm r3 = new C215909Sm(this, r53, this, this.A0E, this.A0C, this.A0D, AnonymousClass9Q3.SHOP_HOME);
        r3.A01 = A002;
        r3.A0B = this.A0K;
        r3.A0G = this.A0A;
        r3.A04 = AnonymousClass1PZ.A00(r53).A02(this.A0A);
        this.A04 = r3.A02();
        C17510qM r2 = C17510qM.A00;
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        AnonymousClass0C1 r4 = this.A00;
        this.A09 = r2.A0a(activity, r4, this.A0E, getModuleName(), "reconsideration_destination", C30671Ut.A0C(r4, this.A0A));
        registerLifecycleListener(this.A03);
        C23300zv A003 = C23300zv.A00(this.A00);
        A003.A02(C32981cA.class, this.A0G);
        A003.A02(C223109jD.class, this.A0H);
        boolean z = false;
        if (this.A05.A04.size() == 3) {
            z = true;
        }
        if (z) {
            this.A01.A04();
        } else {
            AnonymousClass9ZR r42 = this.A03;
            r42.A01.A01();
            r42.A04.A00(true, false);
            r42.A03.A00(true, false);
        }
        AnonymousClass0Z0.A09(-431615611, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1581046125);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new C217419Ze(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(334062078, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1834849142);
        super.onDestroy();
        C23300zv A002 = C23300zv.A00(this.A00);
        A002.A03(C32981cA.class, this.A0G);
        A002.A03(C223109jD.class, this.A0H);
        AnonymousClass9ZV r3 = this.A02;
        C218089ao r2 = new C218089ao(r3.A00.A02("instagram_shopping_reconsideration_destination_exit"));
        if (r2.A0B()) {
            r2.A03("navigation_info", AnonymousClass9ZV.A00(r3, (String) null));
            r2.A08("merchant_id", r3.A01);
            r2.A01();
        }
        AnonymousClass0Z0.A09(-242256497, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1936261967);
        super.onDestroyView();
        LifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(1099738521, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        this.A08.A04(C32711bj.A00(this), this.mRecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A01.A04);
        C31321Xp r1 = new C31321Xp();
        r1.A0J();
        this.mRecyclerView.setItemAnimator(r1);
        this.mRecyclerView.A0w(new C61622m6(this.A03.A03, C29621Qp.GRID, linearLayoutManager));
        this.A0J.A03(this.A00, this.mRefreshableContainer, this.mRecyclerView, getLayoutInflater());
        this.mRecyclerView.A0w(this.A0J.A02);
        this.mRecyclerView.setClipToPadding(false);
        if (!this.A0I.A01.containsKey("ShoppingReconsiderationDestinationFragment")) {
            this.mRecyclerView.A0h(0);
        }
        this.A0I.A01("ShoppingReconsiderationDestinationFragment", this.mRecyclerView);
    }
}
