package com.instagram.shopping.fragment.bag;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.merchantfeed.MerchantWithProducts;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.shopping.adapter.bag.merchant.PinnedLinearLayoutManager;
import com.instagram.shopping.model.destination.ShoppingExploreDeeplinkModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass2KU;
import p000X.AnonymousClass2Oq;
import p000X.AnonymousClass2PB;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass6MO;
import p000X.AnonymousClass7K7;
import p000X.AnonymousClass9EE;
import p000X.AnonymousClass9EF;
import p000X.AnonymousClass9EG;
import p000X.AnonymousClass9EH;
import p000X.AnonymousClass9J3;
import p000X.AnonymousClass9KF;
import p000X.AnonymousClass9KG;
import p000X.AnonymousClass9NM;
import p000X.AnonymousClass9OJ;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9RB;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9TK;
import p000X.AnonymousClass9VH;
import p000X.AnonymousClass9VP;
import p000X.AnonymousClass9VY;
import p000X.AnonymousClass9VZ;
import p000X.AnonymousClass9j9;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C12810hQ;
import p000X.C15890nh;
import p000X.C16180oA;
import p000X.C17510qM;
import p000X.C176687gc;
import p000X.C17850qu;
import p000X.C195828Zo;
import p000X.C195838Zp;
import p000X.C213539Ir;
import p000X.C215709Rk;
import p000X.C215929So;
import p000X.C220499en;
import p000X.C220519ep;
import p000X.C222469i2;
import p000X.C222489i6;
import p000X.C222599iH;
import p000X.C222609iI;
import p000X.C222659iN;
import p000X.C222689iQ;
import p000X.C222879im;
import p000X.C222969ix;
import p000X.C223019j2;
import p000X.C223029j3;
import p000X.C223079jA;
import p000X.C223139jG;
import p000X.C223149jH;
import p000X.C223189jL;
import p000X.C223239jQ;
import p000X.C223249jR;
import p000X.C223259jS;
import p000X.C223449jm;
import p000X.C223459jn;
import p000X.C223469jo;
import p000X.C223589k1;
import p000X.C223719kE;
import p000X.C23300zv;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C30661Us;
import p000X.C31321Xp;
import p000X.C32711bj;
import p000X.C51312Ke;
import p000X.C62442ni;
import p000X.C68832zy;
import p000X.C95214Aj;

public class ShoppingBagFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, C51312Ke, AnonymousClass2KU, AnonymousClass1HM, C62442ni, C195838Zp, AnonymousClass9EG, C220519ep {
    public IgFundedIncentive A00;
    public MultiProductComponent A01;
    public AnonymousClass0C1 A02;
    public C222469i2 A03;
    public C222489i6 A04;
    public C223029j3 A05 = C223029j3.LOADING;
    public C215929So A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public C222879im A0B = C222879im.NONE;
    public PinnedLinearLayoutManager A0C;
    public C223249jR A0D;
    public AnonymousClass9EH A0E;
    public ShoppingExploreDeeplinkModel A0F;
    public AnonymousClass9RD A0G;
    public AnonymousClass9TK A0H;
    public AnonymousClass9J3 A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public final C11200ea A0P = new C223139jG(this);
    public final C28051Kf A0Q = C28051Kf.A00();
    public final AnonymousClass7K7 A0R = new AnonymousClass7K7();
    public C26571Ea mProductCollectionStub;
    public RecyclerView mRecyclerView;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c0, code lost:
        if (r1 != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01eb, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r12.A02, p000X.AnonymousClass0L7.SHOPPING_BAG_NULL_STATE_V1, "suggested_merchants_hscroll_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x01ed;
     */
    public static void A03(ShoppingBagFragment shoppingBagFragment, C223029j3 r13, C223019j2 r14) {
        ArrayList<Merchant> arrayList;
        boolean z;
        boolean z2;
        List list;
        MultiProductComponent multiProductComponent;
        if (r14 != null) {
            List<C223239jQ> unmodifiableList = Collections.unmodifiableList(r14.A02);
            shoppingBagFragment.A09 = unmodifiableList;
            shoppingBagFragment.A0M = new ArrayList();
            arrayList = new ArrayList<>();
            for (C223239jQ r4 : unmodifiableList) {
                arrayList.add(r4.A01);
                shoppingBagFragment.A07 = r4.A02;
                shoppingBagFragment.A0M.add(r4.A03);
            }
            if (Collections.unmodifiableList(r14.A03).isEmpty()) {
                multiProductComponent = null;
            } else {
                multiProductComponent = (MultiProductComponent) Collections.unmodifiableList(r14.A03).get(0);
            }
            shoppingBagFragment.A01 = multiProductComponent;
            if (shoppingBagFragment.A04()) {
                A02(shoppingBagFragment, C222879im.PRODUCT_COLLECTION);
            }
            shoppingBagFragment.A00 = r14.A00;
            shoppingBagFragment.A0F = r14.A01;
        } else {
            arrayList = null;
        }
        C223029j3 r1 = C223029j3.FAILED;
        if (r13 != r1 || r14 == null) {
            shoppingBagFragment.A05 = r13;
        } else {
            shoppingBagFragment.A05 = C223029j3.LOADED;
        }
        if (!shoppingBagFragment.A0N && r13 != C223029j3.LOADING) {
            shoppingBagFragment.A0N = true;
            if (r13 == r1 && r14 == null) {
                C222489i6 r42 = shoppingBagFragment.A04;
                C223459jn r3 = new C223459jn(r42.A00.A02("instagram_shopping_bag_index_load_failure"));
                String str = r42.A02;
                AnonymousClass0a4.A06(str);
                r3.A08("global_bag_entry_point", str);
                String str2 = r42.A03;
                AnonymousClass0a4.A06(str2);
                r3.A08("global_bag_prior_module", str2);
                r3.A08("shopping_session_id", r42.A06);
                r3.A01();
            } else if (r13 == C223029j3.LOADED && r14 != null) {
                Integer A062 = C222609iI.A00(shoppingBagFragment.A02).A06();
                AnonymousClass0a4.A06(A062);
                int intValue = A062.intValue();
                C222489i6 r10 = shoppingBagFragment.A04;
                AnonymousClass0a4.A06(arrayList);
                String str3 = shoppingBagFragment.A07;
                List<String> list2 = shoppingBagFragment.A0M;
                AnonymousClass0a4.A06(list2);
                C223449jm r43 = new C223449jm(r10.A00.A02("instagram_shopping_bag_index_load_success"));
                String str4 = r10.A02;
                AnonymousClass0a4.A06(str4);
                r43.A08("global_bag_entry_point", str4);
                String str5 = r10.A03;
                AnonymousClass0a4.A06(str5);
                r43.A08("global_bag_prior_module", str5);
                r43.A07("total_item_count", Long.valueOf((long) intValue));
                ArrayList arrayList2 = new ArrayList();
                for (Merchant merchant : arrayList) {
                    arrayList2.add(merchant.A02);
                }
                r43.A09("merchant_ids", arrayList2);
                r43.A08("shopping_session_id", r10.A06);
                if (str3 != null) {
                    r43.A07("global_bag_id", Long.valueOf(Long.parseLong(str3)));
                }
                if (!list2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (String parseLong : list2) {
                        arrayList3.add(Long.valueOf(Long.parseLong(parseLong)));
                    }
                    r43.A09("merchant_bag_ids", arrayList3);
                }
                r43.A01();
                List list3 = shoppingBagFragment.A09;
                if (list3 == null || list3.size() != 1 || !((Boolean) AnonymousClass0L6.A02(shoppingBagFragment.A02, AnonymousClass0L7.SHOPPING_BAG_OPTIMIZATION, "should_push_into_single_merchant_bag", false, (AnonymousClass04H) null)).booleanValue()) {
                    if (intValue == 0 && (!C16180oA.A00(shoppingBagFragment.A02).A0k())) {
                        AnonymousClass9NM.A01(shoppingBagFragment, shoppingBagFragment.getActivity(), shoppingBagFragment.A02, shoppingBagFragment.A08, "");
                    }
                    List list4 = shoppingBagFragment.A09;
                    if (list4 != null) {
                        boolean isEmpty = list4.isEmpty();
                        z = true;
                    }
                    z = false;
                    if (!z && !shoppingBagFragment.A04() && ((list = shoppingBagFragment.A0A) == null || list.isEmpty())) {
                        z2 = true;
                    }
                    z2 = false;
                    if (z2) {
                        C223719kE r32 = new C223719kE(shoppingBagFragment);
                        C15890nh r2 = new C15890nh(shoppingBagFragment.A02);
                        r2.A09 = Constants.A0N;
                        r2.A0C = "commerce/bag/suggested_brands/";
                        r2.A06(AnonymousClass9VH.class, false);
                        r2.A0B = "shopping_suggested_brands_cache";
                        r2.A01 = 3600000;
                        r2.A08 = Constants.A0C;
                        C17850qu A032 = r2.A03();
                        A032.A00 = new C222689iQ(r32);
                        C12810hQ.A01(A032);
                    }
                } else {
                    shoppingBagFragment.A0O = true;
                    A01(shoppingBagFragment, ((C223239jQ) shoppingBagFragment.A09.get(0)).A01, (String) null);
                    return;
                }
            }
        }
        A00(shoppingBagFragment);
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AtV() {
    }

    public final void B2G() {
    }

    public final void B2I() {
    }

    public final void BBY(Merchant merchant) {
        A01(this, merchant, (String) null);
    }

    public final void BT2(ProductFeedItem productFeedItem) {
    }

    public final String getModuleName() {
        return "instagram_shopping_bag_index";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(ShoppingBagFragment shoppingBagFragment) {
        if (shoppingBagFragment.mView != null) {
            C222469i2 r4 = shoppingBagFragment.A03;
            C223029j3 r7 = shoppingBagFragment.A05;
            List list = shoppingBagFragment.A09;
            MultiProductComponent multiProductComponent = shoppingBagFragment.A01;
            IgFundedIncentive igFundedIncentive = shoppingBagFragment.A00;
            List list2 = shoppingBagFragment.A0A;
            C222879im r0 = shoppingBagFragment.A0B;
            r4.A03 = r7;
            r4.A04 = list;
            r4.A01 = multiProductComponent;
            r4.A00 = igFundedIncentive;
            r4.A05 = list2;
            r4.A02 = r0;
            C68832zy r5 = new C68832zy();
            if (list != null) {
                if (igFundedIncentive != null) {
                    AnonymousClass0a4.A06(igFundedIncentive);
                    r5.A01(new C223589k1(igFundedIncentive.A02, r4.A06.getString(C0003R.string.see_details)));
                }
                if (r4.A04.isEmpty()) {
                    AnonymousClass2PB r72 = r4.A0B;
                    C222879im r6 = r4.A02;
                    C222879im r3 = C222879im.NONE;
                    boolean z = true;
                    boolean z2 = false;
                    if (r6 != r3) {
                        z2 = true;
                    }
                    r72.A0D = z2;
                    boolean z3 = false;
                    if (r6 == r3) {
                        z3 = true;
                    }
                    r72.A0C = z3;
                    if (r6 == r3) {
                        z = false;
                    }
                    r72.A0E = z;
                    r5.A01(new C95214Aj(r72, AnonymousClass2Oq.EMPTY));
                } else {
                    r5.A01(r4.A08);
                    for (C223239jQ r1 : r4.A04) {
                        Merchant merchant = r1.A01;
                        Resources resources = r4.A06.getResources();
                        int i = r1.A00;
                        r5.A01(new C195828Zo(merchant, resources.getQuantityString(C0003R.plurals.shopping_bag_num_items, i, new Object[]{Integer.valueOf(i)}), true));
                    }
                    r5.A01(r4.A07);
                }
                C222879im r62 = r4.A02;
                switch (r62.ordinal()) {
                    case 0:
                        MultiProductComponent multiProductComponent2 = r4.A01;
                        if (multiProductComponent2 != null) {
                            r5.A01(new C220499en(r62.A01, multiProductComponent2, true));
                            break;
                        }
                        break;
                    case 1:
                        List list3 = r4.A05;
                        if (list3 != null) {
                            r5.A01(new AnonymousClass9VZ(r62.A01, list3));
                            break;
                        }
                        break;
                    case 2:
                        r5.A01(new C176687gc(r62.A01));
                        break;
                }
            } else if (r7 == C223029j3.LOADING) {
                r5.A01(new C95214Aj(r4.A0D, AnonymousClass2Oq.LOADING));
            } else if (r7 == C223029j3.FAILED) {
                r5.A01(new C95214Aj(r4.A0C, AnonymousClass2Oq.ERROR));
            }
            r4.A09.A06(r5);
        }
    }

    public static void A01(ShoppingBagFragment shoppingBagFragment, Merchant merchant, String str) {
        shoppingBagFragment.A0D.ApS(merchant, shoppingBagFragment.A08, shoppingBagFragment.A0K, shoppingBagFragment.A0J, shoppingBagFragment.A0L, str, shoppingBagFragment.A0E);
    }

    public static void A02(ShoppingBagFragment shoppingBagFragment, C222879im r5) {
        shoppingBagFragment.A0B = r5;
        Class cls = r5.A00;
        if (r5 != C222879im.NONE && cls != null) {
            PinnedLinearLayoutManager pinnedLinearLayoutManager = shoppingBagFragment.A0C;
            String str = r5.A01;
            pinnedLinearLayoutManager.A01 = cls;
            pinnedLinearLayoutManager.A03 = str;
            pinnedLinearLayoutManager.A00 = null;
            pinnedLinearLayoutManager.A02 = null;
        }
    }

    private boolean A04() {
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent == null || multiProductComponent.ASr().A00().isEmpty()) {
            return false;
        }
        return true;
    }

    public final void A3X(Merchant merchant, int i) {
        this.A0H.A03(merchant, i);
    }

    public final void A3Y(AnonymousClass9VY r2, Integer num) {
        this.A0H.A05(r2, num);
    }

    public final void A4u(ProductFeedItem productFeedItem, AnonymousClass9OJ r5) {
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent != null) {
            this.A0G.A01(new AnonymousClass9RB(productFeedItem, multiProductComponent.getId()), (String) null, r5);
        }
    }

    public final void ACD(AnonymousClass9VP r2, int i) {
        this.A0H.A02(r2, i);
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void ArE(Product product) {
        C222599iH r0 = C222609iI.A00(this.A02).A05;
        int i = r0.A00;
        int i2 = r0.A02;
        boolean z = false;
        if (i == i2) {
            z = true;
        }
        if (z) {
            C213539Ir.A03(new C222969ix(this.A02).AQ5(getContext()), 0);
        } else if (product.A07() == null || product.A07().isEmpty()) {
            C222609iI.A00(this.A02).A05.A0C(product.A02.A02, product, new C222659iN(this, product, product));
        } else {
            AnonymousClass9J3 r2 = this.A0I;
            AnonymousClass9KF r02 = new AnonymousClass9KF(product);
            r02.A00();
            r2.A04(new AnonymousClass9KG(r02), new C223149jH(this, product));
        }
    }

    public final void AtY(int i, int i2) {
        AnonymousClass9EH r0 = this.A0E;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final void B2H() {
        ShoppingExploreDeeplinkModel shoppingExploreDeeplinkModel = this.A0F;
        AnonymousClass0a4.A06(shoppingExploreDeeplinkModel);
        C17510qM.A00.A0x(getActivity(), this.A02, new C223189jL(this, shoppingExploreDeeplinkModel), shoppingExploreDeeplinkModel.A00, shoppingExploreDeeplinkModel.A01, (String) null, (Refinement) null, getModuleName(), this.A08);
    }

    public final void BBW(MerchantWithProducts merchantWithProducts, String str, int i) {
        this.A0H.A04(merchantWithProducts, str, i);
    }

    public final void BFo(Product product) {
        this.A0D.ApU(product, this.A08, this.A0K, "shopping_bag_product_collection");
    }

    public final void BT1(UnavailableProduct unavailableProduct, int i, int i2) {
        this.A0D.ApY(unavailableProduct.A00, this.A08, this.A0K, this.A0J, "unavailable_product_card");
    }

    public final void BZk(View view, Merchant merchant) {
        this.A0H.A01(view, merchant);
    }

    public final void BZl(View view) {
        this.A0H.A00(view);
    }

    public final void Ba6(View view, ProductFeedItem productFeedItem) {
        MultiProductComponent multiProductComponent = this.A01;
        if (multiProductComponent != null) {
            this.A0G.A00(view, new AnonymousClass9RB(productFeedItem, multiProductComponent.getId()));
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-788203539);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A02 = AnonymousClass0J1.A06(bundle2);
        this.A08 = AnonymousClass30T.A00(bundle2);
        this.A0K = bundle2.getString("prior_module_name");
        String string = bundle2.getString("entry_point");
        AnonymousClass0a4.A06(string);
        this.A0J = string;
        this.A0L = bundle2.getString("tracking_token");
        this.A03 = new C222469i2(this.A02, getContext(), getModuleName(), this, this.A0R);
        this.A0I = new AnonymousClass9J3(getActivity(), this.A02);
        C28051Kf A002 = C28021Kc.A00();
        registerLifecycleListener(new AnonymousClass9j9(A002, this));
        AnonymousClass0C1 r4 = this.A02;
        String str = this.A08;
        this.A0G = new AnonymousClass9RD(r4, this, A002, str, this.A0K, (String) null, AnonymousClass9Q3.BAG.toString(), (String) null, (ExploreTopicCluster) null, (String) null, (C30661Us) null);
        this.A06 = new C215929So(this.A02, this, A002);
        AnonymousClass0C1 r9 = this.A02;
        C28051Kf r10 = this.A0Q;
        String str2 = this.A0K;
        this.A0H = new AnonymousClass9TK(this, this, r9, r10, str2, (String) null, this.A08, Constants.A0C, this.A0J, str2, (String) null, (C215709Rk) null, (ExploreTopicCluster) null, (String) null, (String) null, (String) null);
        AnonymousClass1HD r3 = this.mParentFragment;
        if (r3 instanceof AnonymousClass6MO) {
            this.A0D = new AnonymousClass9EF(this, (AnonymousClass6MO) r3, this, this.A02);
        } else {
            this.A0D = new AnonymousClass9EE(this, this, this.A02);
        }
        C222489i6 r6 = new C222489i6(this, this.A02, (String) null, (String) null, this.A0J, this.A0K, this.A08);
        this.A04 = r6;
        C223469jo r2 = new C223469jo(r6.A01.A02("instagram_shopping_bag_index_entry"));
        String str3 = r6.A02;
        AnonymousClass0a4.A06(str3);
        r2.A08("global_bag_entry_point", str3);
        String str4 = r6.A03;
        AnonymousClass0a4.A06(str4);
        r2.A08("global_bag_prior_module", str4);
        r2.A08("shopping_session_id", r6.A06);
        r2.A01();
        AnonymousClass0Z0.A09(1715270904, A022);
    }

    public final String AVo() {
        return this.A08;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.shopping_bag_title);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1816818821);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_recyclerview, viewGroup, false);
        AnonymousClass0Z0.A09(-155692768, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-319403539);
        super.onDestroy();
        C23300zv.A00(this.A02).A03(C223259jS.class, this.A0P);
        AnonymousClass0Z0.A09(1076475523, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-44583857);
        super.onDestroyView();
        ShoppingBagFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(372517343, A022);
    }

    public final void onResume() {
        AnonymousClass1AM r1;
        int A022 = AnonymousClass0Z0.A02(-1992395161);
        super.onResume();
        if (this.A0O && (r1 = this.mFragmentManager) != null && !(this.mParentFragment instanceof AnonymousClass6MO)) {
            this.A0O = false;
            r1.A0W();
        }
        AnonymousClass0Z0.A09(-1797022250, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r1 != false) goto L_0x0035;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C222879im r0;
        C223029j3 r02;
        List list;
        super.onViewCreated(view, bundle);
        this.mRecyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.A0Q.A04(C32711bj.A00(this), this.mRecyclerView);
        this.A0C = new PinnedLinearLayoutManager(getContext(), new C223079jA(this));
        List list2 = this.A09;
        if (list2 != null) {
            boolean isEmpty = list2.isEmpty();
            z = true;
        }
        z = false;
        if (!z && !A04() && (list = this.A0A) != null && !list.isEmpty()) {
            r0 = C222879im.MERCHANT_HSCROLL;
        } else if (A04()) {
            r0 = C222879im.PRODUCT_COLLECTION;
        } else {
            r0 = C222879im.NONE;
        }
        A02(this, r0);
        this.mRecyclerView.setLayoutManager(this.A0C);
        this.mRecyclerView.setAdapter(this.A03.A09);
        this.mRecyclerView.setImportantForAccessibility(2);
        C31321Xp r1 = new C31321Xp();
        r1.A0J();
        this.mRecyclerView.setItemAnimator(r1);
        if (!this.A0R.A01.containsKey("ShoppingBagFragment")) {
            this.mRecyclerView.A0h(0);
        }
        this.A0R.A01("ShoppingBagFragment", this.mRecyclerView);
        C223019j2 A032 = C222609iI.A00(this.A02).A03();
        if (A032 == null) {
            r02 = C223029j3.LOADING;
        } else {
            r02 = C223029j3.LOADED;
        }
        A03(this, r02, A032);
        if (this.A09 == null) {
            C222609iI.A00(this.A02).A07();
        }
        C23300zv.A00(this.A02).A02(C223259jS.class, this.A0P);
    }

    public final void BBV(Merchant merchant) {
        BBY(merchant);
    }

    public final void BBX(Merchant merchant) {
        BBY(merchant);
    }

    public final void BBZ(Merchant merchant) {
        BBY(merchant);
    }

    public final void BgF(AnonymousClass9EH r1) {
        this.A0E = r1;
    }
}
