package com.instagram.shopping.fragment.destination.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ShoppingDestinationTypeModel;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionTile;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.shopping.model.destination.home.ProductSection;
import com.instagram.shopping.model.destination.home.ShoppingHomeSection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HL;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass2KQ;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2RG;
import p000X.AnonymousClass2RN;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass5EO;
import p000X.AnonymousClass6TY;
import p000X.AnonymousClass790;
import p000X.AnonymousClass7Bk;
import p000X.AnonymousClass9OJ;
import p000X.AnonymousClass9OO;
import p000X.AnonymousClass9PU;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9QM;
import p000X.AnonymousClass9QQ;
import p000X.AnonymousClass9QR;
import p000X.AnonymousClass9R2;
import p000X.AnonymousClass9R7;
import p000X.AnonymousClass9RA;
import p000X.AnonymousClass9RB;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9TO;
import p000X.AnonymousClass9TV;
import p000X.AnonymousClass9V7;
import p000X.AnonymousClass9VB;
import p000X.AnonymousClass9W8;
import p000X.AnonymousClass9WH;
import p000X.AnonymousClass9WJ;
import p000X.AnonymousClass9WM;
import p000X.AnonymousClass9WQ;
import p000X.AnonymousClass9Ws;
import p000X.AnonymousClass9X7;
import p000X.AnonymousClass9YL;
import p000X.AnonymousClass9ZQ;
import p000X.C06270Ok;
import p000X.C06570Po;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C13150hy;
import p000X.C14090jk;
import p000X.C151446dj;
import p000X.C15890nh;
import p000X.C16170o9;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C214059Kv;
import p000X.C214299Lt;
import p000X.C214819Nu;
import p000X.C215709Rk;
import p000X.C215909Sm;
import p000X.C216169Tr;
import p000X.C216709Wf;
import p000X.C216759Wl;
import p000X.C216769Wm;
import p000X.C216789Wp;
import p000X.C216839Wv;
import p000X.C216849Ww;
import p000X.C216959Xh;
import p000X.C216969Xi;
import p000X.C216999Xl;
import p000X.C217979ac;
import p000X.C218149au;
import p000X.C218169aw;
import p000X.C218179ax;
import p000X.C218199az;
import p000X.C218289b8;
import p000X.C218909cB;
import p000X.C219489d9;
import p000X.C23300zv;
import p000X.C256319p;
import p000X.C27341Hl;
import p000X.C28051Kf;
import p000X.C29621Qp;
import p000X.C30331Tk;
import p000X.C30541Ug;
import p000X.C30611Un;
import p000X.C31241Xc;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C52362Om;
import p000X.C61622m6;
import p000X.C64902sE;

public class ShoppingHomeFragment extends C27341Hl implements AnonymousClass1I6, C30541Ug, AnonymousClass1HL, AnonymousClass1HM, AnonymousClass9RA, AnonymousClass9R2, AnonymousClass9VB, AnonymousClass9V7, C218909cB, C30331Tk {
    public C219489d9 A00;
    public AnonymousClass2RN A01;
    public AnonymousClass0C1 A02;
    public AnonymousClass9W8 A03;
    public AnonymousClass9WQ A04;
    public C216789Wp A05;
    public AnonymousClass9X7 A06;
    public AnonymousClass9ZQ A07;
    public AnonymousClass9QR A08;
    public AnonymousClass6TY A09;
    public C216169Tr A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public C11200ea A0E = new C216709Wf(this);
    public C28051Kf A0F;
    public FilterConfig A0G;
    public AnonymousClass39Z A0H;
    public C217979ac A0I;
    public AnonymousClass9TV A0J;
    public String A0K;
    public final C256319p A0L = new AnonymousClass9WH(this);
    public final C256319p A0M = new C216999Xl(this);
    public final C11200ea A0N = new C216849Ww(this);
    public final C11200ea A0O = new C216839Wv(this);
    public final AnonymousClass2KQ A0P = new C216769Wm(this);
    public final AnonymousClass2RG A0Q = new C216759Wl(this);
    public View mCategoryRibbonView;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public final AnonymousClass2Oq AP8() {
        return null;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void BFl(Product product) {
    }

    public final String getModuleName() {
        return "instagram_shopping_home";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ShoppingHomeFragment shoppingHomeFragment) {
        if (shoppingHomeFragment.mCategoryRibbonView != null) {
            if (!shoppingHomeFragment.A01.A05()) {
                RefreshableNestedScrollingParent refreshableNestedScrollingParent = shoppingHomeFragment.mRefreshableContainer;
                if (refreshableNestedScrollingParent != null) {
                    refreshableNestedScrollingParent.removeView(shoppingHomeFragment.mCategoryRibbonView);
                }
            } else if (shoppingHomeFragment.mRefreshableContainer != null && shoppingHomeFragment.mCategoryRibbonView.getParent() == null) {
                shoppingHomeFragment.mRefreshableContainer.addView(shoppingHomeFragment.mCategoryRibbonView);
                shoppingHomeFragment.mCategoryRibbonView.measure(0, 0);
            }
            int measuredHeight = shoppingHomeFragment.mCategoryRibbonView.getMeasuredHeight();
            shoppingHomeFragment.A03.Bho(measuredHeight);
            RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = shoppingHomeFragment.mRefreshableContainer;
            if (refreshableNestedScrollingParent2 != null) {
                refreshableNestedScrollingParent2.setRefreshDrawableVerticalOffset(measuredHeight);
            }
        }
    }

    public final void A01() {
        C52362Om r5 = new C52362Om(requireActivity(), this.A02);
        r5.A0B = true;
        C17510qM.A00.A0V();
        String moduleName = getModuleName();
        String str = this.A0C;
        ShoppingBrandDestinationFragment shoppingBrandDestinationFragment = new ShoppingBrandDestinationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("prior_module_name", moduleName);
        bundle.putString("shopping_session_id", str);
        shoppingBrandDestinationFragment.setArguments(bundle);
        r5.A02 = shoppingBrandDestinationFragment;
        r5.A02();
    }

    public final void A49(String str) {
        this.A0J.A05(str);
    }

    public final void A4A(ProductCollectionTile productCollectionTile, int i, int i2, String str) {
        this.A0J.A03(productCollectionTile, i, i2, str);
    }

    public final /* bridge */ /* synthetic */ void A4v(Object obj) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9RD r0 = this.A08.A03;
        if (r0 != null) {
            r0.A01(r3, (String) null, (AnonymousClass9OJ) null);
        }
    }

    public final /* bridge */ /* synthetic */ void A4w(Object obj, Object obj2) {
        AnonymousClass9RB r3 = (AnonymousClass9RB) obj;
        AnonymousClass9OJ r4 = (AnonymousClass9OJ) obj2;
        AnonymousClass9RD r0 = this.A08.A03;
        if (r0 != null) {
            r0.A01(r3, (String) null, r4);
        }
    }

    public final void AvJ(String str, String str2, String str3, int i, int i2) {
        this.A08.A05(str, str2, str3, i, i2);
    }

    public final void AvK(AnonymousClass9QQ r6) {
        MultiProductComponent multiProductComponent;
        AnonymousClass9W8 r3 = this.A03;
        r3.A01 = r6;
        for (ShoppingHomeSection shoppingHomeSection : r3.A0K) {
            if (shoppingHomeSection.A00 == AnonymousClass9Ws.PRODUCT_SECTION) {
                ProductSection productSection = shoppingHomeSection.A01.A02;
                AnonymousClass0a4.A06(productSection);
                List unmodifiableList = Collections.unmodifiableList(productSection.A01);
                if (!unmodifiableList.isEmpty() && (multiProductComponent = ((ProductFeedItem) unmodifiableList.get(0)).A02) != null) {
                    C214299Lt r1 = r3.A02;
                    if (r1 != null) {
                        r1.A00 = r3.A01;
                    }
                    AnonymousClass9R7 r0 = r3.A0D;
                    r0.A01 = multiProductComponent;
                    r0.A05();
                    return;
                }
                return;
            }
        }
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r11, String str, String str2) {
        this.A08.A04(productFeedItem, i, i2, r11, str, str2);
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        AnonymousClass9QR r3 = this.A08;
        AnonymousClass5EO r4 = new AnonymousClass5EO(r3.A0C, r3.A08.getContext());
        ProductTile productTile = productFeedItem.A03;
        if (productTile == null) {
            return false;
        }
        r4.A01(C0003R.string.flag_product, new C214059Kv(r3, productFeedItem));
        r4.A01(C0003R.string.not_interested, new AnonymousClass9OO(r3, productFeedItem, productTile));
        if (C14090jk.A00(r3.A0C) && productTile.A02 != null) {
            r4.A02(C0003R.string.thumbnail_doesnt_show_product, new AnonymousClass9PU(r3, productTile));
        }
        r4.A00().A01(r3.A08.getContext());
        return true;
    }

    public final void BFq(Product product, int i, int i2) {
        this.A08.A00(product, i, i2);
    }

    public final void BFs(Product product, String str, int i, int i2) {
        Integer num;
        AnonymousClass9QR r2 = this.A08;
        if (r2.A0B == AnonymousClass9Q3.SAVED) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        r2.A01(product, str, i, i2, num);
    }

    public final void BFw(ProductCollectionTile productCollectionTile, int i, int i2, Merchant merchant, String str) {
        this.A0J.A02(productCollectionTile, i, i2, merchant, str);
    }

    public final void BFx(ProductCollectionTile productCollectionTile, int i, int i2, String str) {
        this.A0J.A04(productCollectionTile, i, i2, str, true, false);
    }

    public final void BRf(View view) {
        C219489d9 r3 = this.A00;
        r3.A03.A00 = AnonymousClass9YL.TITLE_BUTTON;
        C219489d9.A03(r3, this, false);
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
        this.A08.A02(unavailableProduct);
    }

    public final void BT2(ProductFeedItem productFeedItem) {
        this.A08.A03(productFeedItem);
    }

    public final void BZs(View view) {
        this.A0J.A00(view);
    }

    public final void BZt(View view, ProductCollectionTile productCollectionTile, String str) {
        this.A0J.A01(view, productCollectionTile, str);
    }

    public final /* bridge */ /* synthetic */ void Ba7(View view, Object obj) {
        Long l;
        AnonymousClass9RB r8 = (AnonymousClass9RB) obj;
        C216789Wp r3 = this.A05;
        FiltersLoggingInfo A052 = this.A00.A05();
        if (!r3.A00) {
            C218149au r4 = new C218149au(r3.A02.A02("instagram_shopping_home_load_success"));
            if (r4.A0B()) {
                r4.A08("prior_module", r3.A06);
                r4.A08("prior_submodule", r3.A07);
                r4.A08("shopping_session_id", r3.A08);
                r4.A0A("filters", A052.A02());
                Refinement refinement = r3.A04;
                if (refinement != null) {
                    l = refinement.A00();
                } else {
                    l = null;
                }
                r4.A07("surface_category_id", l);
                r4.A01();
                r3.A00 = true;
            }
        }
        AnonymousClass9WQ r42 = this.A04;
        FiltersLoggingInfo A053 = this.A00.A05();
        synchronized (r42) {
            AnonymousClass00B.A01.markerAnnotate(37355527, "filters", A053.A02().toString());
            AnonymousClass9WQ.A00(r42, 37355527);
        }
        AnonymousClass9RD r0 = this.A08.A03;
        if (r0 != null) {
            r0.A00(view, r8);
        }
    }

    public final void Bel() {
        this.mRecyclerView.A0h(0);
        this.A01.Bei();
    }

    public final void Bsf() {
        AnonymousClass9W8.A00(this.A03);
    }

    public final void configureActionBar(AnonymousClass1EX r4) {
        if (this.mFragmentManager != null) {
            r4.Bo0(false);
            Bundle bundle = this.mArguments;
            if (bundle == null || bundle.getBoolean("show_back_button", true)) {
                r4.Bo6(true);
            }
            AnonymousClass2RN r1 = this.A01;
            if (r1.A04()) {
                r4.setTitle(r1.AIw());
            } else {
                r4.BlI(C0003R.string.shopping_home_default_header_title);
            }
            AnonymousClass39Z r0 = this.A0H;
            if (r0 != null) {
                r0.A01(r4);
            }
            AnonymousClass6TY r02 = this.A09;
            if (r02 != null) {
                r02.A00(r4);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        HashMap hashMap;
        String str;
        Long l;
        int A022 = AnonymousClass0Z0.A02(1570321065);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A02 = AnonymousClass0J1.A06(bundle2);
        this.A0C = AnonymousClass30T.A00(bundle2);
        this.A0B = bundle2.getString("prior_module_name");
        this.A0K = bundle2.getString("prior_submodule_name");
        Refinement refinement = (Refinement) bundle2.getParcelable("refinement");
        FilterConfig filterConfig = (FilterConfig) bundle2.getParcelable("filter_config");
        this.A0G = filterConfig;
        C216789Wp r8 = new C216789Wp(this.A02, this, this.A0B, this.A0K, this.A0C, refinement, filterConfig);
        this.A05 = r8;
        if (!r8.A05.getModuleName().equals(r8.A06)) {
            C218179ax r4 = new C218179ax(r8.A02.A02("instagram_shopping_home_entry"));
            if (r4.A0B()) {
                r4.A08("prior_module", r8.A06);
                r4.A08("prior_submodule", r8.A07);
                r4.A08("shopping_session_id", r8.A08);
                r4.A01();
            }
        } else {
            C218199az r7 = new C218199az(r8.A02.A02("instagram_shopping_home_category_switch"));
            if (r7.A0B()) {
                AnonymousClass9QM r5 = new AnonymousClass9QM();
                r5.A03("prior_module", r8.A06);
                r5.A03("prior_submodule", r8.A07);
                r5.A03("shopping_session_id", r8.A08);
                r7.A03("navigation_info", r5);
                FilterConfig filterConfig2 = r8.A03;
                Long l2 = null;
                if (filterConfig2 != null) {
                    hashMap = filterConfig2.A00();
                } else {
                    hashMap = null;
                }
                r7.A0A("filters", hashMap);
                Refinement refinement2 = r8.A04;
                if (refinement2 != null) {
                    l2 = refinement2.A00();
                }
                r7.A07("surface_category_id", l2);
                r7.A01();
            }
        }
        if (refinement != null) {
            str = refinement.A02();
        } else {
            str = null;
        }
        AnonymousClass9WQ r52 = new AnonymousClass9WQ((ShoppingDestinationTypeModel) null, str, false);
        this.A04 = r52;
        synchronized (r52) {
            AnonymousClass9WQ.A01(r52, 37355527);
        }
        this.A06 = new AnonymousClass9X7(this.A02, getContext(), this, this.A04, AnonymousClass1L8.A00(this));
        C28051Kf A002 = C28051Kf.A00();
        this.A0F = A002;
        AnonymousClass0C1 r6 = this.A02;
        this.A0A = new C216169Tr(r6, A002, new AnonymousClass9TO(r6, this, this.A0B, this.A0K, this.A0C, (ExploreTopicCluster) null, (String) null, (String) null, (String) null, (String) null, (C215709Rk) null), (C30611Un) null);
        Context context = getContext();
        FragmentActivity activity = getActivity();
        AnonymousClass1L8 A003 = AnonymousClass1L8.A00(this);
        AnonymousClass0C1 r62 = this.A02;
        AnonymousClass2RG r42 = this.A0Q;
        String moduleName = getModuleName();
        AnonymousClass2RN r20 = new AnonymousClass2RN(context, activity, this, A003, r62, this, r42, refinement, moduleName, (ExploreTopicCluster) null, this.A0C);
        this.A01 = r20;
        FilterConfig filterConfig3 = this.A0G;
        AnonymousClass9WM r15 = new AnonymousClass9WM(filterConfig3, r20);
        C219489d9 r82 = new C219489d9(getContext(), this, this, this.A02, this.A0C, filterConfig3, r15, this.A0P, r15, true, (Merchant) null, this.A0B, (ExploreTopicCluster) null, r20.A02(), (List) null, (C64902sE) null);
        this.A00 = r82;
        C215909Sm r9 = new C215909Sm(this, this.A02, this, this.A0C, this.A0B, this.A0K, AnonymousClass9Q3.SHOP_HOME);
        r9.A02 = r82;
        if (refinement != null) {
            l = refinement.A00();
        } else {
            l = null;
        }
        r9.A0D = l;
        r9.A01 = this.A0F;
        this.A08 = r9.A02();
        this.A07 = new AnonymousClass9ZQ(this.A02, getContext(), AnonymousClass1L8.A00(this), this, (String) null, false);
        this.A0J = new AnonymousClass9TV(this, this, this.A02, this.A0F, this.A0B, this.A0K, this.A0C, (String) null, (String) null);
        this.A03 = new AnonymousClass9W8(getContext(), this.A02, this, this, this.A00, this.A01, this.A06);
        C17510qM r53 = C17510qM.A00;
        FragmentActivity activity2 = getActivity();
        AnonymousClass0a4.A06(activity2);
        AnonymousClass0C1 r3 = this.A02;
        this.A0H = r53.A0a(activity2, r3, this.A0C, moduleName, "shop_home", (String) null);
        AnonymousClass0a4.A06(activity2);
        this.A09 = r53.A0Z(activity2, r3);
        AnonymousClass0C1 r43 = this.A02;
        C13150hy.A02(r43, "userSession");
        C06570Po A012 = r43.AVA(C217979ac.class, C218289b8.A00);
        C13150hy.A01(A012, "userSession.getScopedCla…veyController()\n        }");
        C217979ac r44 = (C217979ac) A012;
        this.A0I = r44;
        String str2 = this.A0C;
        C13150hy.A02(str2, "shoppingSessionId");
        r44.A00++;
        String str3 = r44.A02;
        if (str3 != null) {
            str2 = str3;
        }
        r44.A02 = str2;
        this.A06.A02();
        C23300zv A004 = C23300zv.A00(this.A02);
        A004.A02(C32981cA.class, this.A0O);
        A004.A02(C214819Nu.class, this.A0E);
        A004.A02(AnonymousClass7Bk.class, this.A0N);
        AnonymousClass1HU r32 = new AnonymousClass1HU();
        r32.A0C(this.A00);
        r32.A0C(this.A07);
        r32.A0C(this.A09);
        registerLifecycleListenerSet(r32);
        AnonymousClass9X7 r45 = this.A06;
        C15890nh r33 = new C15890nh(r45.A05);
        r33.A0C = "commerce/inbox/count/";
        r33.A09 = Constants.A0N;
        r33.A06(C216969Xi.class, false);
        C17850qu A032 = r33.A03();
        A032.A00 = new C216959Xh(r45);
        r45.A04.schedule(A032);
        AnonymousClass0Z0.A09(1536804674, A022);
    }

    public final String AVo() {
        return this.A0C;
    }

    public final C06270Ok BYN() {
        return C06270Ok.A00();
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-960834313);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup, false);
        this.mRefreshableContainer = refreshableNestedScrollingParent;
        refreshableNestedScrollingParent.setListener(new AnonymousClass9WJ(this));
        refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
        this.mRecyclerView = (RecyclerView) this.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(getContext(), 1);
        fastScrollingLinearLayoutManager.A0w(true);
        this.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A03);
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        this.mRecyclerView.A0w(new C61622m6(this.A06, C29621Qp.PRODUCT, fastScrollingLinearLayoutManager));
        this.mRecyclerView.A0w(this.A0M);
        this.mRecyclerView.A0w(this.A0L);
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.A12.add(new AnonymousClass790());
        this.mRecyclerView.setClipToPadding(false);
        this.A01.Ayj(layoutInflater, viewGroup);
        this.mCategoryRibbonView = this.A01.A00;
        A00(this);
        RecyclerView recyclerView2 = this.mRecyclerView;
        ViewGroup viewGroup2 = this.A01.A00;
        AnonymousClass0a4.A06(viewGroup2);
        recyclerView2.A0w(new C151446dj(viewGroup2));
        this.A00.Ayk(this.mRefreshableContainer);
        this.A00.A09(this.mRefreshableContainer);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = this.mRefreshableContainer;
        AnonymousClass0Z0.A09(-134898513, A022);
        return refreshableNestedScrollingParent2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-967891552);
        super.onDestroy();
        C216789Wp r4 = this.A05;
        if (!r4.A05.getModuleName().equals(r4.A06)) {
            C218169aw r2 = new C218169aw(r4.A02.A02("instagram_shopping_home_exit"));
            if (r2.A0B()) {
                r2.A08("prior_module", r4.A06);
                r2.A08("prior_submodule", r4.A07);
                r2.A08("shopping_session_id", r4.A08);
                r2.A01();
            }
        }
        C217979ac r22 = this.A0I;
        r22.A00--;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0C1 r5 = this.A02;
        C13150hy.A02(requireActivity, "activity");
        C13150hy.A02(r5, "userSession");
        if (r22.A00 == 0 && r22.A02 != null && C16170o9.A00()) {
            HashMap hashMap = new HashMap();
            hashMap.put("time_spent", String.valueOf(((float) r22.A01) / ((float) 1000)));
            String str = r22.A02;
            if (str == null) {
                C13150hy.A00();
            }
            hashMap.put("shopping_session_id", str);
            C16170o9 r1 = C16170o9.A00;
            if (r1 == null) {
                C13150hy.A00();
            }
            r1.A02(requireActivity, r5, "238008333953878", hashMap);
            r22.A01 = 0;
            r22.A02 = null;
            r22.A00 = 0;
        }
        C23300zv A002 = C23300zv.A00(this.A02);
        A002.A03(C32981cA.class, this.A0O);
        A002.A03(C214819Nu.class, this.A0E);
        A002.A03(AnonymousClass7Bk.class, this.A0N);
        AnonymousClass0Z0.A09(-1980471910, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-2018948758);
        super.onDestroyView();
        this.A00.A08();
        AnonymousClass0Z0.A09(160779972, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(2134354955);
        super.onPause();
        this.A04.A02();
        this.A01.BE0();
        this.A0I.A01 += System.currentTimeMillis();
        AnonymousClass0Z0.A09(565418559, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1539374777);
        super.onResume();
        this.A01.BJx();
        this.A0I.A01 -= System.currentTimeMillis();
        AnonymousClass0Z0.A09(2102870366, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0F.A04(C32711bj.A00(this), this.mRecyclerView);
        AnonymousClass9W8.A00(this.A03);
    }
}
