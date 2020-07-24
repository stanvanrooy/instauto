package com.instagram.shopping.fragment.destination.wishlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass1TY;
import p000X.AnonymousClass2KX;
import p000X.AnonymousClass2TX;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass35Z;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass8XH;
import p000X.AnonymousClass8XJ;
import p000X.AnonymousClass9KF;
import p000X.AnonymousClass9KG;
import p000X.AnonymousClass9OJ;
import p000X.AnonymousClass9Q0;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9Q7;
import p000X.AnonymousClass9QM;
import p000X.AnonymousClass9QP;
import p000X.AnonymousClass9RA;
import p000X.AnonymousClass9RB;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9RJ;
import p000X.AnonymousClass9Sr;
import p000X.AnonymousClass9T0;
import p000X.AnonymousClass9T1;
import p000X.AnonymousClass9T3;
import p000X.AnonymousClass9T4;
import p000X.AnonymousClass9T6;
import p000X.AnonymousClass9WD;
import p000X.AnonymousClass9WK;
import p000X.C06220Of;
import p000X.C06270Ok;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C13150hy;
import p000X.C15890nh;
import p000X.C167067Bc;
import p000X.C17020pY;
import p000X.C17430qE;
import p000X.C17510qM;
import p000X.C195188Xa;
import p000X.C213539Ir;
import p000X.C213969Km;
import p000X.C215289Pq;
import p000X.C215309Ps;
import p000X.C215319Pt;
import p000X.C215899Sl;
import p000X.C215909Sm;
import p000X.C215919Sn;
import p000X.C215949Sq;
import p000X.C215959Ss;
import p000X.C215969St;
import p000X.C215989Sv;
import p000X.C216009Sx;
import p000X.C216029Sz;
import p000X.C216109Th;
import p000X.C216219Tw;
import p000X.C217349Yx;
import p000X.C223859kV;
import p000X.C23300zv;
import p000X.C26351Cx;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C28121Km;
import p000X.C28691Ms;
import p000X.C29621Qp;
import p000X.C30231Ta;
import p000X.C30311Ti;
import p000X.C30661Us;
import p000X.C31241Xc;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C34071dx;
import p000X.C36721iV;
import p000X.C43791v5;
import p000X.C51522Kz;
import p000X.C61622m6;
import p000X.C62442ni;

public class WishListFeedFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, C30311Ti, AnonymousClass1HM, AnonymousClass9RA, C217349Yx, C62442ni, C223859kV, AnonymousClass2KX {
    public AnonymousClass0C1 A00;
    public C215949Sq A01;
    public AnonymousClass9T1 A02;
    public AnonymousClass9WD A03;
    public C215899Sl A04;
    public AnonymousClass9WK A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public C28051Kf A0A;
    public C215319Pt A0B;
    public AnonymousClass39Z A0C;
    public String A0D;
    public final C11200ea A0E = new AnonymousClass9Sr(this);
    public final C11200ea A0F = new C216009Sx(this);
    public final C11200ea A0G = new C215919Sn(this);
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AvJ(String str, String str2, String str3, int i, int i2) {
    }

    public final void B2G() {
    }

    public final void B2I() {
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        return false;
    }

    public final void BFq(Product product, int i, int i2) {
    }

    public final void BN0() {
    }

    public final void BVk(C215309Ps r1) {
    }

    public final void BVz(C215309Ps r1) {
    }

    public final String getModuleName() {
        return "instagram_shopping_save_product_collection";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    /* renamed from: A00 */
    public final void A4w(AnonymousClass9RB r6, AnonymousClass9OJ r7) {
        AnonymousClass9RD r4 = this.A04.A0A;
        C28121Km r3 = r4.A00;
        String A002 = r6.A00();
        C30231Ta A003 = AnonymousClass1TY.A00(r6, r7, r6.A00());
        A003.A00(r4.A01);
        r3.A01(A002, A003.A02());
    }

    public final boolean A01() {
        if (this.A01.A06.A03() != 1 || this.A05.Abs()) {
            return false;
        }
        return true;
    }

    public final void A3E(IgFundedIncentive igFundedIncentive) {
        AnonymousClass9WD r0 = this.A03;
        r0.A01.A01(r0.A00.getModuleName(), igFundedIncentive.A03);
    }

    public final void A48(C215309Ps r3, ProductFeedItem productFeedItem, AnonymousClass9Q0 r5) {
        this.A0B.A06.A03(productFeedItem, ((MultiProductComponent) r3).A00(), r5);
    }

    public final void A4B(C215309Ps r3, int i) {
        this.A0B.A06.A04(r3, ((MultiProductComponent) r3).A00(), i);
    }

    public final /* bridge */ /* synthetic */ void A4v(Object obj) {
        A4w((AnonymousClass9RB) obj, (AnonymousClass9OJ) null);
    }

    public final void ACC(C215309Ps r2, int i) {
        AnonymousClass0a4.A09(r2 instanceof MultiProductComponent);
        AnonymousClass0a4.A06((Object) null);
    }

    public final C15890nh AFz() {
        String str;
        C15890nh r2 = new C15890nh(this.A00);
        r2.A09 = Constants.A0N;
        if (this.A09) {
            str = "save/products/reconsideration/wish_list_collections_feed/";
        } else {
            str = "save/products/context_feed/";
        }
        r2.A0C = str;
        r2.A06(C216109Th.class, false);
        return r2;
    }

    public final void B08(String str) {
        this.A01.A0J(str);
        this.A03.A01(str);
        this.A03.A02(str);
    }

    public final void B7D(IgFundedIncentive igFundedIncentive, IgFundedIncentiveBannerButton igFundedIncentiveBannerButton) {
        this.A03.A00(igFundedIncentive, igFundedIncentiveBannerButton, (String) null);
    }

    public final void BFl(Product product) {
        C215899Sl r3 = this.A04;
        if (product.A07() == null || product.A07().isEmpty()) {
            C215899Sl.A00(r3, product);
        } else {
            r3.A01.A04(new AnonymousClass9KG(new AnonymousClass9KF(product)), new C215959Ss(r3, product));
        }
    }

    public final void BFm(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r15, String str, C215309Ps r17, int i3, String str2) {
        Product product;
        C215319Pt r3 = this.A0B;
        ProductTile productTile = productFeedItem.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem.A00;
        }
        AnonymousClass9RJ A002 = r3.A04.A00(productFeedItem, i, i2);
        A002.A01(r17);
        A002.A02(str2, Integer.valueOf(i3));
        A002.A00();
        C17510qM r4 = C17510qM.A00;
        FragmentActivity activity = r3.A00.getActivity();
        AnonymousClass0a4.A06(activity);
        C213969Km A0Q = r4.A0Q(activity, product, r3.A03, r3.A02, str, r3.A09);
        A0Q.A09 = r3.A08;
        ExploreTopicCluster exploreTopicCluster = r3.A01;
        String str3 = r3.A07;
        A0Q.A01 = exploreTopicCluster;
        A0Q.A0C = str3;
        A0Q.A02();
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r16, String str, String str2) {
        Product product;
        C215899Sl r0 = this.A04;
        ProductTile productTile = productFeedItem.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem.A00;
        }
        AnonymousClass8XH.A02(r0.A04, r0.A05, product.getId(), i, i2, true);
        AnonymousClass9RJ A002 = r0.A06.A00(productFeedItem, i, i2);
        String str3 = str;
        if (str != null) {
            A002.A01.A08("submodule", str3);
        }
        A002.A00();
        r0.A02 = r0.A08.A01();
        C17510qM r3 = C17510qM.A00;
        FragmentActivity activity = r0.A03.getActivity();
        AnonymousClass0a4.A06(activity);
        C213969Km A0Q = r3.A0Q(activity, product, r0.A05, r0.A04, "shopping_product_collection", r0.A0C);
        A0Q.A09 = r0.A0B;
        A0Q.A0F = r0.A02;
        A0Q.A02();
    }

    public final void BFr(C215309Ps r9, Product product, int i, int i2, AnonymousClass9QP r13) {
        C215319Pt r3 = this.A0B;
        C17510qM.A00.A0A(r3.A03).A00(r3.A00.getContext(), product, new AnonymousClass9Q7(r3, r9, i, i2, r13));
    }

    public final void BFs(Product product, String str, int i, int i2) {
        Integer num;
        C215899Sl r1 = this.A04;
        AnonymousClass35Z r3 = r1.A07;
        String str2 = product.A02.A02;
        if (r1.A08.A01()) {
            num = Constants.ONE;
        } else {
            num = Constants.A0C;
        }
        r3.A00(product, str2, (AnonymousClass1NJ) null, num).A00();
    }

    public final void BFt(C215309Ps r2, Product product, C195188Xa r4) {
        this.A0B.A01(r2, product, r4);
    }

    public final /* bridge */ /* synthetic */ void BN1(C28691Ms r8, boolean z, boolean z2) {
        C215949Sq r2;
        List A002;
        C36721iV r0;
        C216219Tw r82 = (C216219Tw) r8;
        if (z) {
            C215949Sq r1 = this.A01;
            r1.A06.A06();
            r1.A07.A06();
            C215949Sq.A01(r1);
        }
        IgFundedIncentive igFundedIncentive = r82.A00;
        if (igFundedIncentive != null) {
            C215949Sq r02 = this.A01;
            r02.A00 = igFundedIncentive;
            C215949Sq.A01(r02);
        }
        if (this.A09) {
            this.A08 = false;
            r2 = this.A01;
            A002 = r82.A02.A00();
            r2.A07.A06();
            r0 = r2.A07;
        } else {
            if (!this.A05.Abs() && ((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.WISHLIST_RECONSIDERATION, "show_reconsideration_hscrolls", false, (AnonymousClass04H) null)).booleanValue()) {
                this.A09 = true;
                this.A08 = true;
                this.A05.A00(false, false);
            }
            r2 = this.A01;
            A002 = r82.A02.A00();
            r0 = r2.A06;
        }
        r0.A0F(A002);
        C215949Sq.A01(r2);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A02.Bse();
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass0C1 r12 = this.A00;
            AnonymousClass2TX r03 = AnonymousClass2TX.PRODUCT_AUTO_COLLECTION;
            String str = r03.A01;
            String str2 = r03.A00;
            String str3 = this.A06;
            AnonymousClass8XJ r13 = new AnonymousClass8XJ(AnonymousClass0QT.A00(r12, this).A02("instagram_individual_collection_load_success"));
            r13.A08("collection_id", str);
            r13.A08("collection_name", str2);
            r13.A08("prior_module", str3);
            r13.A01();
        }
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
        C215899Sl r1 = this.A04;
        AnonymousClass8XH.A02(r1.A04, r1.A05, unavailableProduct.getId(), i, i2, false);
        C167067Bc.A00(unavailableProduct, r1.A03.getActivity(), r1.A05, r1.A04, r1.A0C, r1.A0B, "shopping_saved_product");
    }

    public final void BT2(ProductFeedItem productFeedItem) {
        C215899Sl r1 = this.A04;
        UnavailableProduct unavailableProduct = productFeedItem.A01;
        AnonymousClass0a4.A06(unavailableProduct);
        C17430qE.A00.A08(unavailableProduct.A01, unavailableProduct.A00.A02, r1.A05, r1.A04, r1.A0B, r1.A03.getContext(), false, new C216029Sz(r1, productFeedItem));
    }

    public final void BVn(C215309Ps r3, AnonymousClass9Q3 r4, int i) {
        this.A0B.A02(r3, r4, i, (Merchant) null);
    }

    public final void BVy(C215309Ps r2) {
        this.A0B.A00(r2);
    }

    public final void BZd(View view, IgFundedIncentive igFundedIncentive) {
        AnonymousClass9WD r0 = this.A03;
        r0.A01.A00(view, r0.A00.getModuleName(), igFundedIncentive.A03);
    }

    public final void BZr(View view, ProductFeedItem productFeedItem, String str) {
        this.A0B.A06.A01(view, productFeedItem, str);
    }

    public final void BZu(View view, C215309Ps r4) {
        this.A0B.A06.A02(view, r4, ((MultiProductComponent) r4).A00());
    }

    public final /* bridge */ /* synthetic */ void Ba7(View view, Object obj) {
        this.A04.A0A.A00(view, (AnonymousClass9RB) obj);
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        if (this.mFragmentManager != null) {
            r4.Bo6(true);
            r4.Bo0(true);
            View Bgz = r4.Bgz(C0003R.layout.contextual_feed_title, 0, 0);
            ((TextView) Bgz.findViewById(C0003R.C0005id.feed_type)).setText(C0003R.string.saved_feed);
            ((TextView) Bgz.findViewById(C0003R.C0005id.feed_title)).setText(C0003R.string.save_home_product_collection_name);
            AnonymousClass39Z r0 = this.A0C;
            if (r0 != null) {
                r0.A01(r4);
            }
        }
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final String AVo() {
        return this.A0D;
    }

    public final void B2H() {
        ((C26351Cx) getActivity()).AHp().BpO(Constants.ZERO, Constants.A0j);
    }

    public final void BMx(C43791v5 r4, boolean z) {
        AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A02.Bse();
    }

    public final C06270Ok BYP() {
        return C06270Ok.A00();
    }

    public final C06590Pq getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1984987144);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A00 = AnonymousClass0J1.A06(bundle2);
        this.A0D = AnonymousClass30T.A00(bundle2);
        String string = bundle2.getString("prior_module_name");
        this.A06 = string;
        AnonymousClass0C1 r3 = this.A00;
        String str = this.A0D;
        C13150hy.A02(this, "insightsHost");
        C13150hy.A02(r3, "userSession");
        C13150hy.A02(string, "priorModule");
        C13150hy.A02(str, "shoppingSessionId");
        AnonymousClass9T3 r32 = new AnonymousClass9T3(AnonymousClass0QT.A00(r3, this).A02("instagram_shopping_wishlist_entry"));
        C13150hy.A01(r32, "InstagramShoppingWishlis…erSession, insightsHost))");
        if (r32.A0B()) {
            AnonymousClass9QM r4 = new AnonymousClass9QM();
            r4.A03("prior_module", string);
            r4.A03("shopping_session_id", str);
            r32.A03("navigation_info", r4);
            r32.A01();
        }
        AnonymousClass9WK r42 = new AnonymousClass9WK(getContext(), AnonymousClass1L8.A00(this), this.A00, this, (String) null);
        this.A05 = r42;
        this.A02 = new C215989Sv(r42, getContext(), this);
        C28051Kf A002 = C28051Kf.A00();
        this.A0A = A002;
        this.A03 = new AnonymousClass9WD(getActivity(), this.A00, this, A002, this.A0D);
        C215969St r6 = new C215969St(this);
        AnonymousClass0C1 r5 = this.A00;
        String str2 = this.A0D;
        C215909Sm r7 = new C215909Sm(this, r5, this, str2, this.A06, (String) null, AnonymousClass9Q3.SAVED);
        r7.A01 = this.A0A;
        r7.A0A = this;
        r7.A09 = this;
        r7.A0C = r6;
        C30661Us A003 = C215909Sm.A00(r7);
        AnonymousClass0C1 r9 = r7.A07;
        C27371Ho r10 = r7.A05;
        C28051Kf r11 = r7.A01;
        AnonymousClass0a4.A06(r11);
        AnonymousClass9RD r8 = new AnonymousClass9RD(r9, r10, r11, r7.A0L, r7.A0I, (String) null, C215909Sm.A01(r7), (String) null, (ExploreTopicCluster) null, (String) null, A003);
        AnonymousClass1HD r102 = r7.A00;
        AnonymousClass0C1 r112 = r7.A07;
        C27371Ho r72 = r7.A05;
        String str3 = r7.A0L;
        String str4 = r7.A0I;
        C215289Pq r43 = r7.A0C;
        WishListFeedFragment wishListFeedFragment = r7.A09;
        AnonymousClass0a4.A06(wishListFeedFragment);
        this.A04 = new C215899Sl(r102, r112, r72, str3, str4, r43, wishListFeedFragment, r8, A003);
        this.A0B = r7.A03();
        this.A01 = new C215949Sq(getContext(), this, this.A05, this.A00, this.A02);
        C23300zv A004 = C23300zv.A00(this.A00);
        A004.A02(C32981cA.class, this.A0G);
        A004.A02(AnonymousClass9T6.class, this.A0F);
        A004.A02(AnonymousClass9T4.class, this.A0E);
        this.A05.A00(true, false);
        this.A02.Bse();
        if (((Boolean) AnonymousClass0L6.A02(this.A00, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass39Z A0a = C17510qM.A00.A0a(getActivity(), this.A00, this.A0D, getModuleName(), "wish_list", (String) null);
            this.A0C = A0a;
            registerLifecycleListener(A0a);
        }
        AnonymousClass0Z0.A09(1521225881, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-2076361187);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new AnonymousClass9T0(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        this.mRecyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(linearLayoutManager);
        this.mRecyclerView.setAdapter(this.A01);
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        this.mRecyclerView.A0w(new C61622m6(this.A05, C29621Qp.PRODUCT, linearLayoutManager));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.product_feed_half_margin);
        C06220Of.A0X(this.mRecyclerView, dimensionPixelSize, dimensionPixelSize);
        this.mRecyclerView.setClipToPadding(false);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(1672513038, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1650950438);
        super.onDestroy();
        C23300zv A002 = C23300zv.A00(this.A00);
        A002.A03(C32981cA.class, this.A0G);
        A002.A03(AnonymousClass9T6.class, this.A0F);
        A002.A03(AnonymousClass9T4.class, this.A0E);
        AnonymousClass39Z r0 = this.A0C;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
        }
        AnonymousClass0Z0.A09(181832436, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1564559347);
        super.onDestroyView();
        WishListFeedFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(16392404, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-220896419);
        super.onPause();
        C215899Sl r1 = this.A04;
        C51522Kz r0 = r1.A00;
        if (r0 != null) {
            C213539Ir.A02(r0);
            r1.A00 = null;
        }
        AnonymousClass0Z0.A09(1970468112, A022);
    }

    public final void onResume() {
        AnonymousClass1OY r1;
        int A022 = AnonymousClass0Z0.A02(2076459789);
        super.onResume();
        C34071dx A0T = C17020pY.A00().A0T(getActivity());
        if (A0T != null && A0T.A0a() && ((r1 = A0T.A0D) == AnonymousClass1OY.SHOP_PROFILE || r1 == AnonymousClass1OY.SAVE_PRODUCT)) {
            A0T.A0R();
        }
        AnonymousClass0Z0.A09(972404127, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A.A04(C32711bj.A00(this), this.mRecyclerView);
    }

    public final void BVu(C215309Ps r1, Merchant merchant) {
    }
}
