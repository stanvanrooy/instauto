package com.instagram.shopping.fragment.destination.productcollection;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.merchantfeed.MerchantWithProducts;
import com.instagram.model.shopping.productfeed.ProductCollectionHeader;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IU;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2KU;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass49Q;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass70W;
import p000X.AnonymousClass9E8;
import p000X.AnonymousClass9OJ;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9QR;
import p000X.AnonymousClass9QY;
import p000X.AnonymousClass9RA;
import p000X.AnonymousClass9RB;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9T1;
import p000X.AnonymousClass9TJ;
import p000X.AnonymousClass9TK;
import p000X.AnonymousClass9TL;
import p000X.AnonymousClass9TN;
import p000X.AnonymousClass9TQ;
import p000X.AnonymousClass9TS;
import p000X.AnonymousClass9TV;
import p000X.AnonymousClass9TZ;
import p000X.AnonymousClass9Ti;
import p000X.AnonymousClass9Tx;
import p000X.AnonymousClass9U3;
import p000X.AnonymousClass9U4;
import p000X.AnonymousClass9U5;
import p000X.AnonymousClass9U6;
import p000X.AnonymousClass9U7;
import p000X.AnonymousClass9U9;
import p000X.AnonymousClass9UH;
import p000X.AnonymousClass9UI;
import p000X.AnonymousClass9UJ;
import p000X.AnonymousClass9UK;
import p000X.AnonymousClass9UL;
import p000X.AnonymousClass9UM;
import p000X.AnonymousClass9UP;
import p000X.AnonymousClass9UR;
import p000X.AnonymousClass9UW;
import p000X.AnonymousClass9V7;
import p000X.AnonymousClass9V9;
import p000X.AnonymousClass9VB;
import p000X.AnonymousClass9VP;
import p000X.AnonymousClass9VY;
import p000X.AnonymousClass9WK;
import p000X.C06270Ok;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C120125Dh;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C13510ie;
import p000X.C15890nh;
import p000X.C16160o8;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C18980sj;
import p000X.C215509Qo;
import p000X.C215709Rk;
import p000X.C215809Rz;
import p000X.C215909Sm;
import p000X.C216039Ta;
import p000X.C216069Td;
import p000X.C216179Ts;
import p000X.C216209Tv;
import p000X.C217349Yx;
import p000X.C23300zv;
import p000X.C256319p;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28051Kf;
import p000X.C28691Ms;
import p000X.C29621Qp;
import p000X.C30331Tk;
import p000X.C30671Ut;
import p000X.C31241Xc;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C36721iV;
import p000X.C43791v5;
import p000X.C466820l;
import p000X.C52362Om;
import p000X.C52892Qp;
import p000X.C52902Qq;
import p000X.C52922Qt;
import p000X.C55092a3;
import p000X.C61622m6;

public class ProductCollectionFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, AnonymousClass2KU, AnonymousClass1HM, AnonymousClass9RA, C217349Yx, C215509Qo, AnonymousClass9VB, AnonymousClass9V7, C52922Qt, C30331Tk {
    public AnonymousClass9Q3 A00;
    public AnonymousClass0C1 A01;
    public AnonymousClass9TJ A02;
    public AnonymousClass9Tx A03;
    public AnonymousClass9TL A04;
    public AnonymousClass9U5 A05;
    public AnonymousClass9T1 A06;
    public AnonymousClass9QR A07;
    public C216069Td A08;
    public AnonymousClass9WK A09;
    public AnonymousClass2Oq A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F = false;
    public int A0G;
    public C28051Kf A0H;
    public ExploreTopicCluster A0I;
    public AnonymousClass1NJ A0J;
    public AnonymousClass39Z A0K;
    public AnonymousClass9TN A0L;
    public AnonymousClass9TK A0M;
    public AnonymousClass9TV A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public boolean A0T = false;
    public boolean A0U = false;
    public final C256319p A0V = new AnonymousClass9TQ(this);
    public final C11200ea A0W = new C216039Ta(this);
    public final C11200ea A0X = new C216179Ts(this);
    public final AnonymousClass9E8 A0Y = new AnonymousClass9U3(this);
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void BFl(Product product) {
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        return false;
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ProductCollectionFragment productCollectionFragment, String str, String str2, String str3) {
        productCollectionFragment.A04.A03(str, str2);
        FragmentActivity activity = productCollectionFragment.getActivity();
        AnonymousClass0a4.A06(activity);
        C52362Om r3 = new C52362Om(activity, productCollectionFragment.A01);
        r3.A0B = true;
        C52892Qp A002 = C18980sj.A00.A00();
        C52902Qq A022 = C52902Qq.A02(productCollectionFragment.A01, str, str2, productCollectionFragment.getModuleName());
        A022.A09 = str3;
        A022.A0B = productCollectionFragment.A0S;
        A022.A04 = productCollectionFragment.A0P;
        r3.A02 = A002.A02(A022.A03());
        r3.A02();
    }

    private boolean A01() {
        if (this.A00 != AnonymousClass9Q3.PRODUCT_COLLECTION || !((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.PRODUCT_COLLECTION_LOCAL_CACHING, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return false;
        }
        return true;
    }

    public final void A02(String str) {
        String str2;
        C216069Td r2 = this.A08;
        switch (r2.A01.ordinal()) {
            case 5:
            case 6:
                str2 = "shopping_product_collection_page";
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                str2 = "shopping_editorial_mention";
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                str2 = "shopping_incentive_mention";
                break;
            default:
                str2 = null;
                break;
        }
        String A002 = r2.A00();
        if (str2 != null && A002 != null) {
            A00(this, str, str2, A002);
        }
    }

    public final void A2p(Merchant merchant) {
        this.A0L.A2p(merchant);
    }

    public final void A3X(Merchant merchant, int i) {
        this.A0M.A03(merchant, i);
    }

    public final void A3Y(AnonymousClass9VY r2, Integer num) {
        this.A0M.A05(r2, num);
    }

    public final void A49(String str) {
        this.A0N.A05(str);
    }

    public final void A4A(ProductCollectionTile productCollectionTile, int i, int i2, String str) {
        this.A0N.A03(productCollectionTile, i, i2, str);
    }

    public final /* bridge */ /* synthetic */ void A4v(Object obj) {
        AnonymousClass9RB r4 = (AnonymousClass9RB) obj;
        AnonymousClass9QR r0 = this.A07;
        String str = this.A0C;
        AnonymousClass9RD r02 = r0.A03;
        if (r02 != null) {
            r02.A01(r4, str, (AnonymousClass9OJ) null);
        }
    }

    public final /* bridge */ /* synthetic */ void A4w(Object obj, Object obj2) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9OJ r4 = (AnonymousClass9OJ) obj2;
        AnonymousClass9QR r0 = this.A07;
        String str = this.A0C;
        AnonymousClass9RD r02 = r0.A03;
        if (r02 != null) {
            r02.A01(r3, str, r4);
        }
    }

    public final void ACD(AnonymousClass9VP r2, int i) {
        this.A0M.A02(r2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0092, code lost:
        r0 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
        r2.A09("merchant_id", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0099, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009f, code lost:
        r2.A0C = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        return r2;
     */
    public final C15890nh AFz() {
        String str;
        C15890nh r2 = new C15890nh(this.A01);
        r2.A09 = Constants.A0N;
        r2.A06(AnonymousClass9Ti.class, false);
        C216069Td r3 = this.A08;
        AnonymousClass9Q3 r6 = r3.A01;
        switch (r6.ordinal()) {
            case 1:
                r2.A0C = C06360Ot.formatString("commerce/products/checkout/", new Object[0]);
                return r2;
            case 5:
                String str2 = r3.A08;
                AnonymousClass0a4.A06(str2);
                r2.A0C = C06360Ot.formatString("commerce/product_collections/collection_page/%s/", str2);
                r2.A09("prior_module", r3.A07);
                String str3 = r3.A0B;
                if (str3 != null) {
                    r2.A09("ads_tracking_token", str3);
                    return r2;
                }
                break;
            case 6:
                r2.A0C = "commerce/product_collections/ads_collection_page/";
                r2.A09("ads_tracking_token", r3.A0B);
                return r2;
            case 7:
                str = "save/products/reconsideration/from_followed_brands_feed/";
                break;
            case 8:
                str = "save/products/reconsideration/from_saved_posts_feed/";
                break;
            case 9:
                str = "save/products/reconsideration/from_liked_posts_feed/";
                break;
            case C120125Dh.VIEW_TYPE_BANNER:
                r2.A0C = "commerce/reconsideration/recently_viewed_products_feed/";
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                String str4 = r3.A03;
                AnonymousClass0a4.A06(str4);
                r2.A0E("commerce/editorial/%s/", str4);
                return r2;
            case C120125Dh.VIEW_TYPE_BADGE:
                str = "commerce/destination/drops/";
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                String str5 = r3.A04;
                AnonymousClass0a4.A06(str5);
                r2.A0E("commerce/incentive/%s/", str5);
                break;
            default:
                throw new IllegalStateException("Unexpected type: " + r6);
        }
    }

    public final AnonymousClass2Oq AP8() {
        if (this.A00 != AnonymousClass9Q3.EDITORIAL || !this.A0U) {
            return null;
        }
        return this.A0A;
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void AvJ(String str, String str2, String str3, int i, int i2) {
        this.A07.A05(str, str2, str3, i, i2);
    }

    public final void AyN(Merchant merchant) {
        this.A0L.AyN(merchant);
    }

    public final void BBW(MerchantWithProducts merchantWithProducts, String str, int i) {
        this.A0M.A04(merchantWithProducts, str, i);
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r11, String str, String str2) {
        this.A07.A04(productFeedItem, i, i2, r11, str, str2);
    }

    public final void BFq(Product product, int i, int i2) {
        this.A07.A00(product, i, i2);
    }

    public final void BFs(Product product, String str, int i, int i2) {
        Integer num;
        AnonymousClass9QR r2 = this.A07;
        if (r2.A0B == AnonymousClass9Q3.SAVED) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        r2.A01(product, str, i, i2, num);
    }

    public final void BFw(ProductCollectionTile productCollectionTile, int i, int i2, Merchant merchant, String str) {
        this.A0N.A02(productCollectionTile, i, i2, merchant, str);
    }

    public final void BFx(ProductCollectionTile productCollectionTile, int i, int i2, String str) {
        this.A0N.A04(productCollectionTile, i, i2, str, false, false);
    }

    public final void BMx(C43791v5 r11, boolean z) {
        AnonymousClass9Tx r4 = this.A03;
        synchronized (r4) {
            for (Integer intValue : r4.A04) {
                AnonymousClass00B r1 = r4.A00;
                int intValue2 = intValue.intValue();
                r1.markerPoint(intValue2, AnonymousClass0IU.A00(97));
                r4.A00.markerEnd(intValue2, 3);
            }
            r4.A04.clear();
        }
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A06.Bse();
        AnonymousClass9TL r5 = this.A04;
        switch (r5.A05.ordinal()) {
            case C120125Dh.VIEW_TYPE_SPINNER:
                AnonymousClass9UI r3 = new AnonymousClass9UI(r5.A03.A02("instagram_shopping_editorial_load_failure"));
                Long l = r5.A06;
                AnonymousClass0a4.A06(l);
                r3.A07("editorial_id", l);
                r3.A08("prior_module", r5.A0A);
                r3.A08("m_pk", r5.A08);
                ExploreTopicCluster exploreTopicCluster = r5.A04;
                if (exploreTopicCluster != null) {
                    r3.A08("topic_cluster_id", exploreTopicCluster.A05);
                    r3.A08("topic_cluster_title", r5.A04.A07);
                    r3.A08("topic_cluster_type", r5.A04.A01.A00);
                }
                r3.A01();
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                AnonymousClass9UL r32 = new AnonymousClass9UL(r5.A03.A02("instagram_shopping_incentive_collection_load_failure"));
                Long l2 = r5.A07;
                AnonymousClass0a4.A06(l2);
                r32.A07("incentive_id", l2);
                r32.A08("prior_module", r5.A0A);
                r32.A08("prior_submodule", r5.A0B);
                r32.A01();
                break;
        }
        AnonymousClass9U4 r2 = (AnonymousClass9U4) r11.A00;
        if (this.A00 != AnonymousClass9Q3.INCENTIVE || r2 == null || !C55092a3.A00(r2.mStatusCode)) {
            AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
            return;
        }
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r6 = this.A01;
        String str = this.A0S;
        String str2 = this.A0C;
        String str3 = this.A0Q;
        AnonymousClass2OA r22 = new AnonymousClass2OA(activity);
        r22.A07(C0003R.string.seller_funded_incentive_expiration_dialog_title);
        r22.A0M(activity.getString(C0003R.string.seller_funded_incentive_expiration_dialog_message, new Object[]{str3}));
        r22.A0A(C0003R.string.f118ok, new AnonymousClass70W(activity));
        r22.A0N(activity.getString(C0003R.string.view_shop_label), new AnonymousClass49Q(activity, r6, str2, this, str));
        r22.A0E(new AnonymousClass9U7(activity));
        r22.A03().show();
    }

    public final void BN0() {
        AnonymousClass9Tx r4 = this.A03;
        synchronized (r4) {
            for (Integer intValue : r4.A04) {
                r4.A00.markerPoint(intValue.intValue(), AnonymousClass0IU.A00(24));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void BN1(C28691Ms r7, boolean z, boolean z2) {
        String str;
        AnonymousClass9U4 r72 = (AnonymousClass9U4) r7;
        AnonymousClass9Tx r4 = this.A03;
        synchronized (r4) {
            for (Integer intValue : r4.A04) {
                r4.A00.markerPoint(intValue.intValue(), AnonymousClass0IU.A00(27));
            }
        }
        boolean z3 = z;
        if (z) {
            AnonymousClass9TL r3 = this.A04;
            switch (r3.A05.ordinal()) {
                case 5:
                case 6:
                    AnonymousClass9UR r1 = new AnonymousClass9UR(r3.A03.A02("instagram_shopping_product_collection_page_load_success"));
                    if (r1.A0B()) {
                        r1.A03("navigation_info", AnonymousClass9TL.A01(r3, (String) null));
                        r1.A03("collections_logging_info", r3.A02);
                        r1.A08("merchant_id", r3.A09);
                        r1.A03("ads_tracking_info", AnonymousClass9TL.A00(r3));
                        r1.A01();
                        break;
                    }
                    break;
                case C120125Dh.VIEW_TYPE_SPINNER:
                    AnonymousClass9UJ r12 = new AnonymousClass9UJ(r3.A03.A02("instagram_shopping_editorial_load_success"));
                    Long l = r3.A06;
                    AnonymousClass0a4.A06(l);
                    r12.A07("editorial_id", l);
                    r12.A08("prior_module", r3.A0A);
                    r12.A08("m_pk", r3.A08);
                    ExploreTopicCluster exploreTopicCluster = r3.A04;
                    if (exploreTopicCluster != null) {
                        r12.A08("topic_cluster_id", exploreTopicCluster.A05);
                        r12.A08("topic_cluster_title", r3.A04.A07);
                        r12.A08("topic_cluster_type", r3.A04.A01.A00);
                    }
                    r12.A01();
                    break;
                case C120125Dh.VIEW_TYPE_LINK:
                    AnonymousClass9UM r13 = new AnonymousClass9UM(r3.A03.A02("instagram_shopping_incentive_collection_load_success"));
                    Long l2 = r3.A07;
                    AnonymousClass0a4.A06(l2);
                    r13.A07("incentive_id", l2);
                    r13.A08("prior_module", r3.A0A);
                    r13.A08("prior_submodule", r3.A0B);
                    r13.A01();
                    break;
            }
        }
        this.A02.A0K(r72.A02, r72.A00, r72.A01, r72.A01, z3);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        this.A06.Bse();
        AnonymousClass9U9 r0 = r72.A01;
        if (!(r0 == null || (str = r0.A03) == null)) {
            this.A0B = str;
            BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) getActivity();
            AnonymousClass0a4.A06(baseFragmentActivity);
            baseFragmentActivity.AFO().A0E();
        }
        if (A01()) {
            AnonymousClass9U5 r2 = this.A05;
            String str2 = this.A0E;
            AnonymousClass0a4.A06(str2);
            String str3 = this.A0D;
            C13150hy.A02(str2, "collectionId");
            C13150hy.A02(str3, "priorModule");
            C13150hy.A02(r72, "response");
            r2.A00.put(str2, r72.A02);
            r2.A01.put(str2, r72.A00);
            r2.A02.put(AnonymousClass000.A03(str2, '_', str3), r72.A01);
        }
        if (!this.A0F) {
            this.A0F = true;
        }
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
        this.A07.A02(unavailableProduct);
    }

    public final void BT2(ProductFeedItem productFeedItem) {
        this.A07.A03(productFeedItem);
    }

    public final void BZZ(View view) {
        this.A0L.BZZ(view);
    }

    public final void BZk(View view, Merchant merchant) {
        this.A0M.A01(view, merchant);
    }

    public final void BZl(View view) {
        this.A0M.A00(view);
    }

    public final void BZs(View view) {
        this.A0N.A00(view);
    }

    public final void BZt(View view, ProductCollectionTile productCollectionTile, String str) {
        this.A0N.A01(view, productCollectionTile, str);
    }

    public final /* bridge */ /* synthetic */ void Ba7(View view, Object obj) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9RD r0 = this.A07.A03;
        if (r0 != null) {
            r0.A00(view, r3);
        }
    }

    public final void Bsf() {
        this.A02.A0J();
    }

    public final void configureActionBar(AnonymousClass1EX r6) {
        TextView textView;
        String str;
        String str2;
        C13300iJ r0;
        if (this.mFragmentManager != null) {
            r6.Bo6(true);
            if (this.A0T) {
                r6.Bg9(C0003R.C0004drawable.instagram_x_outline_24);
            }
            r6.Bo0(true);
            C216069Td r3 = this.A08;
            String str3 = this.A0B;
            AnonymousClass9Q3 r2 = r3.A01;
            if ((r2 == AnonymousClass9Q3.PRODUCT_COLLECTION || r2 == AnonymousClass9Q3.PRODUCT_INSTANT_COLLECTION) && (str2 = r3.A06) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                if (r3.A05 != null) {
                    r0 = C13510ie.A00(r3.A02).A02(r3.A05);
                } else {
                    r0 = null;
                }
                if (r0 != null && r0.A0s()) {
                    C466820l.A03(r3.A00, spannableStringBuilder, true);
                }
                r6.BlJ(spannableStringBuilder);
            } else {
                if ((r2 == AnonymousClass9Q3.SAVED || r2 == AnonymousClass9Q3.RECENTLY_VIEWED) && r3.A06 != null) {
                    View Bgz = r6.Bgz(C0003R.layout.contextual_feed_title, 0, 0);
                    ((TextView) Bgz.findViewById(C0003R.C0005id.feed_type)).setText(r3.A09);
                    textView = (TextView) Bgz.findViewById(C0003R.C0005id.feed_title);
                    str = r3.A06;
                } else if ((r2 == AnonymousClass9Q3.EDITORIAL || r2 == AnonymousClass9Q3.DROPS) && str3 != null) {
                    r6.setTitle(str3);
                } else if (r2 == AnonymousClass9Q3.PRODUCTS_FROM_FOLLOWED_BRANDS || r2 == AnonymousClass9Q3.PRODUCTS_FROM_LIKED_MEDIA || r2 == AnonymousClass9Q3.PRODUCTS_FROM_SAVED_MEDIA) {
                    View Bgz2 = r6.Bgz(C0003R.layout.contextual_feed_title, 0, 0);
                    ((TextView) Bgz2.findViewById(C0003R.C0005id.feed_type)).setText(r3.A09);
                    textView = (TextView) Bgz2.findViewById(C0003R.C0005id.feed_title);
                    str = r3.A0A;
                } else {
                    r6.setTitle(r3.A09);
                }
                textView.setText(str);
            }
            AnonymousClass39Z r02 = this.A0K;
            if (r02 != null) {
                r02.A01(r6);
            }
        }
    }

    public final String getModuleName() {
        AnonymousClass9Q3 r2 = this.A08.A01;
        switch (r2.ordinal()) {
            case 1:
                return "instagram_shopping_home_checkout_product_feed";
            case 7:
            case 8:
            case 9:
                return r2.toString();
            case C120125Dh.VIEW_TYPE_BANNER:
                return "recently_viewed_products";
            case C120125Dh.VIEW_TYPE_SPINNER:
                return "instagram_shopping_editorial";
            case C120125Dh.VIEW_TYPE_BADGE:
                return "shopping_drops_explore_destination";
            case C120125Dh.VIEW_TYPE_LINK:
                return "instagram_shopping_incentive_collection";
            default:
                return "instagram_shopping_product_collection";
        }
    }

    public final boolean isEmpty() {
        return this.A02.isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x02e2, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r3.A02, p000X.AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x02e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x03f7  */
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        int A022 = AnonymousClass0Z0.A02(441683205);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A0S = AnonymousClass30T.A00(bundle2);
        this.A0D = bundle2.getString("prior_module_name");
        Merchant merchant = (Merchant) bundle2.getParcelable("merchant");
        if (merchant != null) {
            string = merchant.A02;
        } else {
            string = bundle2.getString("merchant_id");
        }
        this.A0C = string;
        if (merchant != null) {
            string2 = merchant.A03;
        } else {
            string2 = bundle2.getString("merchant_username");
        }
        this.A0Q = string2;
        this.A0R = bundle2.getString("prior_submodule_name");
        String string3 = bundle2.getString("product_feed_type");
        if (AnonymousClass9Q3.A01.get(string3) != null) {
            this.A00 = (AnonymousClass9Q3) AnonymousClass9Q3.A01.get(string3);
            String string4 = bundle2.getString("product_feed_label");
            String string5 = bundle2.getString("product_feed_subtitle");
            ProductFeedResponse productFeedResponse = (ProductFeedResponse) bundle2.getParcelable("product_feed");
            if (productFeedResponse != null) {
                str = productFeedResponse.AQs();
            } else {
                str = null;
            }
            this.A0G = bundle2.getInt("product_feed_index");
            this.A0E = bundle2.getString("product_collection_id");
            C215709Rk A002 = C215709Rk.A00(bundle2.getString("product_collection_type"));
            String string6 = bundle2.getString("editorial_id");
            String string7 = bundle2.getString("incentive_id");
            this.A0U = bundle2.getBoolean("is_sponsored", false);
            this.A0I = (ExploreTopicCluster) bundle2.getParcelable("topic_cluster");
            this.A0O = bundle2.getString("viewer_session_id");
            this.A0T = bundle2.getBoolean("is_modal");
            this.A0P = bundle2.getString("media_id");
            ProductCollectionHeader productCollectionHeader = (ProductCollectionHeader) bundle2.getParcelable("product_collection_header");
            Context context = getContext();
            AnonymousClass0C1 r6 = this.A01;
            String str3 = this.A0D;
            AnonymousClass9Q3 r9 = this.A00;
            String str4 = this.A0E;
            String str5 = this.A0C;
            AnonymousClass0C1 r30 = r6;
            String str6 = str3;
            AnonymousClass9Q3 r32 = r9;
            String str7 = str4;
            this.A08 = new C216069Td(context, r30, str6, r32, str7, string4, string5, str5, this.A0Q, string6, string7, C30671Ut.A0C(r6, this.A0P));
            String str8 = string6;
            C215709Rk r33 = A002;
            AnonymousClass9TL r16 = new AnonymousClass9TL(this, this.A01, this.A00, this.A0S, this.A0D, this.A0R, this.A0E, A002, this.A0C, string6, string7, this.A0P, this.A0I);
            this.A04 = r16;
            r16.A02();
            this.A03 = new AnonymousClass9Tx(this.A00, this.A0E, this.A0C);
            if (this.A0P != null) {
                AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A01).A02(this.A0P);
                this.A0J = A023;
                if (A023 != null) {
                    this.A0A = AnonymousClass2Oq.GONE;
                } else {
                    C17850qu A032 = C16160o8.A03(this.A0P, this.A01);
                    A032.A00 = new C215809Rz(this);
                    schedule(A032);
                }
            }
            this.A09 = new AnonymousClass9WK(getContext(), AnonymousClass1L8.A00(this), this.A01, this, str);
            AnonymousClass0C1 r5 = this.A01;
            C13150hy.A02(r5, "userSession");
            this.A05 = (AnonymousClass9U5) r5.AVA(AnonymousClass9U5.class, AnonymousClass9UW.A00);
            this.A06 = new AnonymousClass9V9(this.A09, this);
            C28051Kf A003 = C28051Kf.A00();
            this.A0H = A003;
            AnonymousClass9TZ r92 = new AnonymousClass9TZ(this);
            C216209Tv r8 = new C216209Tv(this);
            C215909Sm r162 = new C215909Sm(this, this.A01, this, this.A0S, this.A0D, this.A0R, this.A00);
            r162.A0K = this.A0E;
            r162.A06 = r33;
            r162.A0C = r92;
            r162.A0B = r8;
            r162.A0M = this.A0U;
            r162.A04 = this.A0J;
            r162.A01 = A003;
            r162.A03 = this.A0I;
            r162.A0F = this.A0O;
            r162.A0H = this.A0C;
            r162.A0E = str8;
            r162.A0G = this.A0P;
            r162.A08 = this;
            this.A07 = r162.A02();
            FragmentActivity requireActivity = requireActivity();
            AnonymousClass0C1 r93 = this.A01;
            C28051Kf r82 = this.A0H;
            String str9 = this.A0D;
            String str10 = this.A0R;
            AnonymousClass0C1 r18 = r93;
            C28051Kf r20 = r82;
            String str11 = str9;
            String str12 = str10;
            this.A0L = new AnonymousClass9TN(requireActivity, r18, this, r20, str11, str12, this.A0S, Constants.A0C, this.A0E, r33, this.A0J);
            AnonymousClass0C1 r94 = this.A01;
            C28051Kf r7 = this.A0H;
            String str13 = this.A0D;
            String str14 = this.A0R;
            this.A0M = new AnonymousClass9TK(this, this, r94, r7, str13, str14, this.A0S, Constants.A0N, (String) null, (String) null, this.A0E, r33, (ExploreTopicCluster) null, (String) null, (String) null, (String) null);
            AnonymousClass0C1 r10 = this.A01;
            C28051Kf r95 = this.A0H;
            String str15 = this.A0D;
            String str16 = this.A0R;
            String str17 = this.A0S;
            this.A0N = new AnonymousClass9TV(this, this, r10, r95, str15, str16, str17, this.A0C, this.A0P);
            Context context2 = getContext();
            AnonymousClass9WK r96 = this.A09;
            AnonymousClass9WK r19 = r96;
            AnonymousClass9TJ r163 = new AnonymousClass9TJ(context2, this, r19, new C36721iV(), this, this.A01, this.A0Q, this.A00, this.A06, this.A03, productCollectionHeader);
            this.A02 = r163;
            if (productFeedResponse != null) {
                if (14 - this.A08.A01.ordinal() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    r163.A0L(productFeedResponse.A00());
                    this.A02.A0J();
                }
            }
            C216069Td r3 = this.A08;
            AnonymousClass9Q3 r2 = r3.A01;
            if (r2 == AnonymousClass9Q3.DROPS || r2 == AnonymousClass9Q3.EDITORIAL || r2 == AnonymousClass9Q3.PRODUCT_COLLECTION || r2 == AnonymousClass9Q3.PRODUCT_INSTANT_COLLECTION) {
                z = true;
            }
            z = false;
            if (z) {
                C17510qM r22 = C17510qM.A00;
                FragmentActivity activity = getActivity();
                AnonymousClass0a4.A06(activity);
                AnonymousClass0C1 r4 = this.A01;
                String str18 = this.A0S;
                String moduleName = getModuleName();
                switch (this.A08.A01.ordinal()) {
                    case 5:
                    case 6:
                        str2 = "product_collection_page";
                        break;
                    case C120125Dh.VIEW_TYPE_SPINNER:
                        str2 = "editorial";
                        break;
                    case C120125Dh.VIEW_TYPE_BADGE:
                        str2 = "drops";
                        break;
                    default:
                        str2 = null;
                        break;
                }
                AnonymousClass0a4.A06(str2);
                this.A0K = r22.A0a(activity, r4, str18, moduleName, str2, C30671Ut.A0C(r4, this.A0P));
            }
            C23300zv A004 = C23300zv.A00(this.A01);
            A004.A02(C32981cA.class, this.A0X);
            A004.A02(AnonymousClass9QY.class, this.A0W);
            AnonymousClass9Tx r42 = this.A03;
            synchronized (r42) {
                if (r42.A01 == AnonymousClass9Q3.PRODUCT_COLLECTION) {
                    if (r42.A04.contains(37355530)) {
                        r42.A00.markerEnd(37355530, 111);
                    }
                    r42.A04.add(37355530);
                    r42.A00.markerStart(37355530);
                    AnonymousClass00B r23 = r42.A00;
                    String str19 = r42.A03;
                    AnonymousClass0a4.A06(str19);
                    r23.markerAnnotate(37355530, "product_collection_id", str19);
                    String str20 = r42.A02;
                    if (str20 != null) {
                        r42.A00.markerAnnotate(37355530, "merchant_id", str20);
                    }
                }
            }
            if (A01()) {
                String str21 = this.A0E;
                AnonymousClass0a4.A06(str21);
                AnonymousClass9U5 r1 = this.A05;
                C13150hy.A02(str21, "collectionId");
                ProductFeedResponse productFeedResponse2 = (ProductFeedResponse) r1.A00.get(str21);
                AnonymousClass9U5 r12 = this.A05;
                String str22 = this.A0E;
                C13150hy.A02(str22, "collectionId");
                ProductCollectionHeader productCollectionHeader2 = (ProductCollectionHeader) r12.A01.get(str22);
                AnonymousClass9U5 r24 = this.A05;
                String str23 = this.A0E;
                String str24 = this.A0D;
                C13150hy.A02(str23, "collectionId");
                C13150hy.A02(str24, "priorModule");
                AnonymousClass9U6 r13 = (AnonymousClass9U6) r24.A02.get(AnonymousClass000.A03(str23, '_', str24));
                if (productFeedResponse2 != null) {
                    this.A02.A0K(productFeedResponse2, productCollectionHeader2, r13, (AnonymousClass9U9) null, true);
                    if (r13 == null) {
                        this.A09.A00(false, false);
                    }
                    z2 = true;
                    if (!z2) {
                        AnonymousClass9WK r34 = this.A09;
                        boolean z4 = false;
                        if (str == null) {
                            z4 = true;
                        }
                        r34.A00(z4, false);
                    }
                    this.A06.Bse();
                    AnonymousClass0Z0.A09(-150377185, A022);
                    return;
                }
            }
            z2 = false;
            if (!z2) {
            }
            this.A06.Bse();
            AnonymousClass0Z0.A09(-150377185, A022);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Cannot parse product feed type = ", string3));
    }

    public final String AVo() {
        return this.A0S;
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1632998409);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new AnonymousClass9TS(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        this.mRecyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(getContext(), 1);
        fastScrollingLinearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A02);
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        this.mRecyclerView.A0w(new C61622m6(this.A09, C29621Qp.PRODUCT, fastScrollingLinearLayoutManager));
        this.mRecyclerView.A0w(this.A0V);
        this.mRecyclerView.setClipToPadding(false);
        this.mRecyclerView.A0g(this.A0G >> 1);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(-208486726, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-219948154);
        super.onDestroy();
        AnonymousClass9TL r4 = this.A04;
        AnonymousClass9Q3 r1 = r4.A05;
        if (r1 == AnonymousClass9Q3.PRODUCT_COLLECTION || r1 == AnonymousClass9Q3.PRODUCT_INSTANT_COLLECTION) {
            AnonymousClass9UP r2 = new AnonymousClass9UP(r4.A03.A02("instagram_shopping_product_collection_page_exit"));
            if (r2.A0B()) {
                r2.A03("navigation_info", AnonymousClass9TL.A01(r4, (String) null));
                r2.A03("collections_logging_info", r4.A02);
                r2.A08("merchant_id", r4.A09);
                r2.A03("ads_tracking_info", AnonymousClass9TL.A00(r4));
                r2.A01();
            }
        }
        C23300zv A002 = C23300zv.A00(this.A01);
        A002.A03(C32981cA.class, this.A0X);
        A002.A03(AnonymousClass9QY.class, this.A0W);
        AnonymousClass0Z0.A09(-593255141, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-8683268);
        super.onDestroyView();
        ProductCollectionFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(2000921421, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(-1377056836);
        super.onPause();
        AnonymousClass9Tx r4 = this.A03;
        synchronized (r4) {
            for (Integer intValue : r4.A04) {
                r4.A00.markerEnd(intValue.intValue(), 22);
            }
            r4.A04.clear();
        }
        AnonymousClass0Z0.A09(369709597, A022);
    }

    public final void onResume() {
        AnonymousClass1AM r0;
        int A022 = AnonymousClass0Z0.A02(-1690166350);
        super.onResume();
        if (this.A0F && this.A02.isEmpty() && (r0 = this.mFragmentManager) != null) {
            r0.A0W();
        }
        AnonymousClass0Z0.A09(-1188672351, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0H.A04(C32711bj.A00(this), this.mRecyclerView);
        AnonymousClass9TL r3 = this.A04;
        switch (r3.A05.ordinal()) {
            case C120125Dh.VIEW_TYPE_SPINNER:
                AnonymousClass9UH r2 = new AnonymousClass9UH(r3.A03.A02("instagram_shopping_editorial_impression"));
                Long l = r3.A06;
                AnonymousClass0a4.A06(l);
                r2.A07("editorial_id", l);
                r2.A08("prior_module", r3.A0A);
                r2.A08("m_pk", r3.A08);
                ExploreTopicCluster exploreTopicCluster = r3.A04;
                if (exploreTopicCluster != null) {
                    r2.A08("topic_cluster_id", exploreTopicCluster.A05);
                    r2.A08("topic_cluster_title", r3.A04.A07);
                    r2.A08("topic_cluster_type", r3.A04.A01.A00);
                }
                r2.A01();
                return;
            case C120125Dh.VIEW_TYPE_LINK:
                AnonymousClass9UK r22 = new AnonymousClass9UK(r3.A03.A02("instagram_shopping_incentive_collection_entry"));
                Long l2 = r3.A07;
                AnonymousClass0a4.A06(l2);
                r22.A07("incentive_id", l2);
                r22.A08("prior_module", r3.A0A);
                r22.A08("prior_submodule", r3.A0B);
                r22.A01();
                return;
            default:
                return;
        }
    }
}
