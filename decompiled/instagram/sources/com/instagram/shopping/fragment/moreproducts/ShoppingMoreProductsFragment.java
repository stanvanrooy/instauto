package com.instagram.shopping.fragment.moreproducts;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1NJ;
import p000X.AnonymousClass1PZ;
import p000X.AnonymousClass2NR;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass35Z;
import p000X.AnonymousClass3AO;
import p000X.AnonymousClass8XV;
import p000X.AnonymousClass9DM;
import p000X.AnonymousClass9FJ;
import p000X.AnonymousClass9FK;
import p000X.AnonymousClass9PT;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9TN;
import p000X.C06270Ok;
import p000X.C06360Ot;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C15890nh;
import p000X.C17510qM;
import p000X.C17850qu;
import p000X.C213969Km;
import p000X.C215379Qa;
import p000X.C215389Qb;
import p000X.C215409Qd;
import p000X.C215419Qe;
import p000X.C215459Qi;
import p000X.C215469Qj;
import p000X.C215479Qk;
import p000X.C215509Qo;
import p000X.C215529Qq;
import p000X.C215549Qs;
import p000X.C215559Qt;
import p000X.C215569Qu;
import p000X.C215619Ra;
import p000X.C215709Rk;
import p000X.C219489d9;
import p000X.C23300zv;
import p000X.C26571Ea;
import p000X.C27341Hl;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C30341Tl;
import p000X.C30541Ug;
import p000X.C30661Us;
import p000X.C30671Ut;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C37141jB;
import p000X.C37591ju;
import p000X.C51312Ke;

public class ShoppingMoreProductsFragment extends C27341Hl implements AnonymousClass1I6, C30541Ug, C51312Ke, C30341Tl, C215509Qo {
    public AnonymousClass1NJ A00;
    public AnonymousClass0C1 A01;
    public C215379Qa A02;
    public C215569Qu A03;
    public AnonymousClass9TN A04;
    public String A05;
    public List A06;
    public List A07;
    public boolean A08;
    public long A09;
    public C28051Kf A0A;
    public C30661Us A0B;
    public AnonymousClass35Z A0C;
    public AnonymousClass9RD A0D;
    public String A0E;
    public final C11200ea A0F = new C215469Qj(this);
    public final C11200ea A0G = new C215409Qd(this);
    public final AnonymousClass2NR A0H = new AnonymousClass2NR();
    public View mContainerView;
    public RecyclerView mRecyclerView;
    public C26571Ea mShopsEntryPointViewStubHolder;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final void BFl(Product product) {
    }

    public final boolean BFp(ProductFeedItem productFeedItem, int i, int i2) {
        return false;
    }

    public final void BFq(Product product, int i, int i2) {
    }

    public final String A01() {
        if (this.A08) {
            return A00(getContext(), this.A00);
        }
        return this.A02.A01.getResources().getString(C0003R.string.shopping_more_products_section_title);
    }

    public final void A2p(Merchant merchant) {
        this.A04.A2p(merchant);
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void AyN(Merchant merchant) {
        this.A04.AyN(merchant);
    }

    public final void BFn(ProductFeedItem productFeedItem, int i, int i2, C06270Ok r20, String str, String str2) {
        Product product;
        String str3;
        ProductFeedItem productFeedItem2 = productFeedItem;
        ProductTile productTile = productFeedItem2.A03;
        if (productTile != null) {
            product = productTile.A00;
        } else {
            product = productFeedItem2.A00;
        }
        boolean contains = this.A07.contains(product);
        if (contains) {
            str3 = "tags";
        } else {
            str3 = "more_from_this_business";
        }
        AnonymousClass1NJ A0Q = this.A00.A0Q(this.A01);
        if (A0Q.Aho()) {
            AnonymousClass0C1 r7 = this.A01;
            String id = product.getId();
            String str4 = this.A05;
            AnonymousClass1NJ r5 = this.A00;
            C37141jB A022 = C37591ju.A02("product_card_tap", this);
            A022.A0B(r7, r5);
            A022.A4G = id;
            A022.A4E = str4;
            A022.A3Q = str2;
            Integer num = Constants.ZERO;
            A022.A2w = AnonymousClass9PT.A00(num);
            A022.A3W = AnonymousClass9FK.A00(num);
            AnonymousClass9FJ.A01(r7, A022, r5, this);
        } else {
            this.A0B.A00(productFeedItem2, i, i2).A00();
        }
        C213969Km A0Q2 = C17510qM.A00.A0Q(getActivity(), product, this.A01, this, str3, this.A0E);
        A0Q2.A09 = this.A05;
        A0Q2.A0G = true;
        if (A0Q.A1f()) {
            A0Q2.A0E = true;
        }
        if (contains || A0Q.A1f()) {
            A0Q2.A02 = A0Q;
            A0Q2.A08 = null;
            C215459Qi r1 = new C215459Qi(this);
            A0Q2.A0H = true;
            A0Q2.A07 = r1;
        }
        if (contains) {
            AnonymousClass0C1 r12 = this.A01;
            A0Q2.A04 = AnonymousClass9DM.A00(r12, A0Q, this.A00.A0B(r12), product);
        }
        A0Q2.A02();
    }

    public final void BFs(Product product, String str, int i, int i2) {
        AnonymousClass1NJ r1;
        AnonymousClass35Z r3 = this.A0C;
        String str2 = product.A02.A02;
        if (this.A07.contains(product)) {
            r1 = this.A00;
        } else {
            r1 = null;
        }
        AnonymousClass8XV A002 = r3.A00(product, str2, r1, Constants.ZERO);
        A002.A06 = str;
        A002.A00();
    }

    public final void BZZ(View view) {
        this.A04.BZZ(view);
    }

    public final String getModuleName() {
        return StringFormatUtil.formatStrLocaleSafe("tags_list_%s", (Object) this.A05);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0Z0.A02(-1996123487);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A01 = AnonymousClass0J1.A06(bundle2);
        this.A0E = AnonymousClass30T.A00(bundle2);
        this.A07 = bundle2.getParcelableArrayList(AnonymousClass0C5.$const$string(130));
        String string = bundle2.getString("media_id");
        AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A01).A02(string);
        AnonymousClass11J.A00(A023);
        this.A00 = A023;
        this.A05 = bundle2.getString("prior_module_name");
        this.A0H.A00(bundle2);
        this.A0A = C28021Kc.A00();
        C30661Us r7 = new C30661Us(this.A01, this, this.A0E, string, (String) null, this.A05, (String) null, (ExploreTopicCluster) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C219489d9) null, (Long) null);
        this.A0B = r7;
        AnonymousClass0C1 r6 = this.A01;
        C28051Kf r4 = this.A0A;
        AnonymousClass9RD r18 = new AnonymousClass9RD(r6, this, r4, this.A0E, this.A05, (String) null, (String) null, string, (ExploreTopicCluster) null, (String) null, r7);
        this.A0D = r18;
        C215379Qa r5 = new C215379Qa(getContext(), this.A01, this.A00, this, this, r18);
        this.A02 = r5;
        List list = this.A07;
        r5.A04.clear();
        r5.A04.addAll(list);
        r5.notifyDataSetChanged();
        this.A0C = C17510qM.A00.A0C(getActivity(), getContext(), this.A01, this, this.A0E, getModuleName(), (String) null, true);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0C1 r52 = this.A01;
        C28051Kf r42 = this.A0A;
        String str2 = this.A05;
        this.A04 = new AnonymousClass9TN(requireActivity, r52, this, r42, str2, (String) null, this.A0E, Constants.ONE, (String) null, (C215709Rk) null, this.A00);
        if (!this.A00.A1j(this.A01)) {
            C15890nh r3 = new C15890nh(this.A01);
            r3.A0C = C06360Ot.formatString("commerce/media/%s/related_products/", this.A00.A0u());
            r3.A09 = Constants.A0N;
            r3.A06(C215619Ra.class, false);
            r3.A09("prior_module", this.A05);
            AnonymousClass1NJ r2 = this.A00;
            if (r2.Aho()) {
                str = C30671Ut.A0A(this.A01, r2);
            } else {
                str = null;
            }
            r3.A0A("ads_tracking_token", str);
            C17850qu A032 = r3.A03();
            A032.A00 = new C215419Qe(this);
            schedule(A032);
            C215379Qa r22 = this.A02;
            r22.A00 = true;
            r22.notifyDataSetChanged();
        }
        C23300zv A002 = C23300zv.A00(this.A01);
        A002.A02(C32981cA.class, this.A0G);
        A002.A02(AnonymousClass3AO.class, this.A0F);
        AnonymousClass0Z0.A09(230497104, A022);
    }

    public static String A00(Context context, AnonymousClass1NJ r3) {
        Resources resources = context.getResources();
        boolean AiO = r3.AiO();
        int i = C0003R.string.shopping_tagged_products_section_title_photo;
        if (AiO) {
            i = C0003R.string.shopping_tagged_products_section_title_video;
        }
        return resources.getString(i);
    }

    public final String AVo() {
        return this.A0E;
    }

    public final C06270Ok BYN() {
        C06270Ok A002 = C06270Ok.A00();
        this.A0H.A02(A002);
        return A002;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-488034455);
        this.mContainerView = layoutInflater.inflate(C0003R.layout.shopping_more_products_fragment, viewGroup, false);
        this.A0A.A04(C32711bj.A00(this), this.mContainerView);
        this.mShopsEntryPointViewStubHolder = new C26571Ea((ViewStub) this.mContainerView.findViewById(C0003R.C0005id.more_products_shops_entry_point_stub));
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.SHOPPING_FEED_HALF_SHEET_UPDATES, "sticky_cta_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            AnonymousClass11J.A02(!this.A07.isEmpty());
            Merchant merchant = ((Product) this.A07.get(0)).A02;
            View findViewById = this.mShopsEntryPointViewStubHolder.A01().findViewById(C0003R.C0005id.shops_entry_point);
            C215549Qs r6 = new C215549Qs(findViewById);
            Resources resources = getResources();
            boolean A1f = this.A00.A0Q(this.A01).A1f();
            int i = C0003R.string.shop_on_profile_row_continue_shopping;
            if (A1f) {
                i = C0003R.string.shop_on_profile_row_view_all_products;
            }
            C215529Qq.A01(r6, new C215559Qt(merchant, resources.getString(i), merchant.A03), this);
            this.A04.A2p(merchant);
            this.A04.BZZ(findViewById);
        }
        this.mRecyclerView = (RecyclerView) this.mContainerView.findViewById(C0003R.C0005id.more_products_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
        gridLayoutManager.A23(new C215479Qk(this));
        this.mRecyclerView.setLayoutManager(gridLayoutManager);
        this.mRecyclerView.setAdapter(this.A02);
        if (this.A03 != null) {
            this.mRecyclerView.A0w(new C215389Qb(this, gridLayoutManager));
        }
        this.mRecyclerView.setItemAnimator((C31341Xr) null);
        View view = this.mContainerView;
        AnonymousClass0Z0.A09(198947167, A022);
        return view;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(648876521);
        C23300zv A002 = C23300zv.A00(this.A01);
        A002.A03(C32981cA.class, this.A0G);
        A002.A03(AnonymousClass3AO.class, this.A0F);
        super.onDestroy();
        AnonymousClass0Z0.A09(-349888486, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-907910798);
        super.onDestroyView();
        ShoppingMoreProductsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0Z0.A09(341167547, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1721854133);
        super.onPause();
        AnonymousClass1NJ r1 = this.A00;
        if (r1 != null && r1.A0Q(this.A01).Aho()) {
            AnonymousClass1NJ r4 = this.A00;
            long currentTimeMillis = System.currentTimeMillis() - this.A09;
            AnonymousClass0C1 r12 = this.A01;
            C37141jB A023 = C37591ju.A02("tags_list_end", this);
            A023.A0B(r12, r4);
            A023.A1t = currentTimeMillis;
            AnonymousClass9FJ.A01(r12, A023, r4, this);
        }
        AnonymousClass0Z0.A09(-759774084, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1049845941);
        super.onResume();
        this.A09 = System.currentTimeMillis();
        C215379Qa r0 = this.A02;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
        AnonymousClass0Z0.A09(-1666942313, A022);
    }
}
