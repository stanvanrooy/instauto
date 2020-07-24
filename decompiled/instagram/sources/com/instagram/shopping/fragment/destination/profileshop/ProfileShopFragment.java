package com.instagram.shopping.fragment.destination.profileshop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.p004ui.widget.recyclerview.FastScrollingLinearLayoutManager;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductCollectionTileHscroll;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.shopping.api.destination.profileshop.ProfileShopSurfaceCustomization;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass00B;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0IU;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1DW;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1HU;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass1NR;
import p000X.AnonymousClass1OY;
import p000X.AnonymousClass230;
import p000X.AnonymousClass2KQ;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass38W;
import p000X.AnonymousClass39Z;
import p000X.AnonymousClass3BU;
import p000X.AnonymousClass3BV;
import p000X.AnonymousClass5AS;
import p000X.AnonymousClass5F9;
import p000X.AnonymousClass6N1;
import p000X.AnonymousClass6N2;
import p000X.AnonymousClass9E6;
import p000X.AnonymousClass9E8;
import p000X.AnonymousClass9QM;
import p000X.AnonymousClass9QQ;
import p000X.AnonymousClass9R2;
import p000X.AnonymousClass9Sb;
import p000X.AnonymousClass9T1;
import p000X.AnonymousClass9TG;
import p000X.AnonymousClass9W9;
import p000X.AnonymousClass9WF;
import p000X.AnonymousClass9WI;
import p000X.AnonymousClass9WK;
import p000X.AnonymousClass9WN;
import p000X.AnonymousClass9WT;
import p000X.AnonymousClass9WY;
import p000X.AnonymousClass9Wa;
import p000X.AnonymousClass9Y8;
import p000X.AnonymousClass9YE;
import p000X.AnonymousClass9YJ;
import p000X.AnonymousClass9YK;
import p000X.AnonymousClass9Z6;
import p000X.AnonymousClass9ZQ;
import p000X.C019000b;
import p000X.C06360Ot;
import p000X.C06570Po;
import p000X.C06590Pq;
import p000X.C108234lU;
import p000X.C11200ea;
import p000X.C13150hy;
import p000X.C13300iJ;
import p000X.C13380iR;
import p000X.C13510ie;
import p000X.C147806Tl;
import p000X.C15890nh;
import p000X.C17020pY;
import p000X.C17510qM;
import p000X.C214829Nv;
import p000X.C215239Pk;
import p000X.C215819Sa;
import p000X.C215869Sh;
import p000X.C215879Si;
import p000X.C215939Sp;
import p000X.C216249Ua;
import p000X.C216679Wc;
import p000X.C217009Xm;
import p000X.C217049Xq;
import p000X.C217059Xr;
import p000X.C217319Yu;
import p000X.C217339Yw;
import p000X.C217349Yx;
import p000X.C217769aH;
import p000X.C217809aL;
import p000X.C218009ag;
import p000X.C218019ah;
import p000X.C218269b6;
import p000X.C218279b7;
import p000X.C218419bM;
import p000X.C218459bQ;
import p000X.C218909cB;
import p000X.C219489d9;
import p000X.C219649dQ;
import p000X.C219859dl;
import p000X.C219959dv;
import p000X.C23300zv;
import p000X.C256319p;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C27665CMj;
import p000X.C28051Kf;
import p000X.C28691Ms;
import p000X.C29621Qp;
import p000X.C30671Ut;
import p000X.C31241Xc;
import p000X.C31341Xr;
import p000X.C32711bj;
import p000X.C32981cA;
import p000X.C33831dZ;
import p000X.C34071dx;
import p000X.C36721iV;
import p000X.C43791v5;
import p000X.C52362Om;
import p000X.C52922Qt;
import p000X.C53742Uc;
import p000X.C53962Ve;
import p000X.C61622m6;
import p000X.C64902sE;
import p000X.C709938n;
import p000X.C710138p;
import p000X.C71623Bm;

public class ProfileShopFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, AnonymousClass1HK, AnonymousClass3BU, AnonymousClass1HM, AnonymousClass3BV, C217349Yx, AnonymousClass9R2, C52922Qt {
    public C219489d9 A00;
    public FilterConfig A01;
    public ProductFeedResponse A02;
    public C709938n A03;
    public AnonymousClass0C1 A04;
    public AnonymousClass9W9 A05;
    public C215869Sh A06;
    public AnonymousClass9T1 A07;
    public C215819Sa A08;
    public AnonymousClass38W A09;
    public C217339Yw A0A;
    public AnonymousClass9WK A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public List A0I;
    public boolean A0J = false;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public C28051Kf A0N;
    public C710138p A0O;
    public AnonymousClass9ZQ A0P;
    public AnonymousClass39Z A0Q;
    public C13300iJ A0R;
    public String A0S;
    public String A0T;
    public final C256319p A0U = new C217009Xm(this);
    public final C11200ea A0V = new C215939Sp(this);
    public final C11200ea A0W = new C217049Xq(this);
    public final C219959dv A0X = new AnonymousClass9YK(this);
    public final AnonymousClass2KQ A0Y = new AnonymousClass9WN(this);
    public final C219859dl A0Z = new AnonymousClass9Z6(this);
    public final C218909cB A0a = new AnonymousClass9Y8(this);
    public final AnonymousClass9E8 A0b = new AnonymousClass9WI(this);
    public final C218459bQ A0c = new C218459bQ(this);
    public final C218419bM A0d = new C218419bM(this);
    public final C215879Si A0e = new C215879Si(this);
    public final C64902sE A0f = new C217059Xr(this);
    public C61622m6 mAutoLoadMoreHelper;
    public LinearLayoutManager mLinearLayoutManager;
    public FrameLayout mProfileShopContainer;
    public RecyclerView mRecyclerView;
    public RefreshableNestedScrollingParent mRefreshableContainer;

    public static void A05(ProfileShopFragment profileShopFragment, FilterConfig filterConfig, String str) {
        Bundle bundle = (Bundle) profileShopFragment.mArguments.clone();
        bundle.putBoolean("hide_collections", true);
        if (filterConfig != null) {
            bundle.putParcelable("filter_config", filterConfig);
        } else {
            C219489d9 r2 = profileShopFragment.A00;
            bundle.putStringArrayList("filter_ids", C219649dQ.A00(r2.A09).A01(r2.A0A));
            bundle.putParcelable("product_feed", profileShopFragment.A02);
        }
        bundle.putParcelable("surface_customization", profileShopFragment.A05.A04);
        bundle.putString("surface_subtitle", str);
        C52362Om r22 = new C52362Om(profileShopFragment.getActivity(), profileShopFragment.A04);
        r22.A08(new ProfileShopFragment(), bundle);
        r22.A02();
    }

    public final AnonymousClass1HD A5s() {
        return this;
    }

    public final String ASx() {
        return "profile_shop";
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return true;
    }

    public final void BDs(int i) {
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private Integer A01() {
        if (this.A04.A06.getId().equals(this.A0C)) {
            return Constants.ONE;
        }
        return Constants.ZERO;
    }

    private void A02() {
        if (this.A0J || this.A0B.AgL() || !this.A05.isEmpty()) {
            C216679Wc.A00(this.A04).A03("from_cache");
            AnonymousClass9W9.A03(this.A05);
        } else {
            C216679Wc.A00(this.A04).A03("from_network");
            this.A0B.A00(true, false);
        }
        this.A07.Bse();
    }

    private void A03() {
        FrameLayout frameLayout;
        if (!this.A05.A0J()) {
            C219489d9 r1 = this.A00;
            if (!this.A0K) {
                frameLayout = this.mProfileShopContainer;
            } else {
                frameLayout = this.mRefreshableContainer;
            }
            AnonymousClass0a4.A06(frameLayout);
            r1.A09(frameLayout);
        }
    }

    public static void A06(ProfileShopFragment profileShopFragment, String str, AnonymousClass230 r7) {
        if (r7 != AnonymousClass230.REJECTED || !((Boolean) AnonymousClass0L6.A02(profileShopFragment.A04, AnonymousClass0L7.SHOPPING_PRODUCT_APPEALS_EXPANSION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            C53742Uc r2 = new C53742Uc("https://help.instagram.com/1944109912526524");
            r2.A03 = profileShopFragment.requireContext().getString(C0003R.string.learn_more);
            SimpleWebViewActivity.A04(profileShopFragment.requireContext(), profileShopFragment.A04, r2.A00());
            return;
        }
        C17510qM.A00.A1D(profileShopFragment.requireActivity(), profileShopFragment.A04, str, false);
    }

    public final void A07() {
        C53962Ve.A00(this.A04, this, this.A0H, this.A0E, "profile_shop_empty");
        C17510qM.A00.A0o(this, this.A04, this.A0H, getModuleName());
    }

    public final C15890nh AFz() {
        boolean z;
        AnonymousClass0C1 r6 = this.A04;
        String str = this.A0C;
        String str2 = this.A0S;
        boolean z2 = false;
        if (A00() != C13380iR.NONE) {
            z2 = true;
        }
        if (this.A0L || (!this.A0K && !((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.MINISHOP_CONSUMPTION, "show_collections_in_shop_tab", false, (AnonymousClass04H) null)).booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass9Wa r4 = new AnonymousClass9Wa(this.A00);
        C15890nh r3 = new C15890nh(r6);
        r3.A09 = Constants.A0N;
        r3.A0C = C06360Ot.formatString("commerce/%s/business_product_feed_with_filters/", str);
        r3.A0C("include_unapproved_products", z2);
        r3.A0C("should_show_collections", !z);
        r3.A06(AnonymousClass9WY.class, false);
        r4.ApB(r3);
        String A0C2 = C30671Ut.A0C(r6, str2);
        if (A0C2 != null) {
            r3.A09("ads_tracking_token", A0C2);
        }
        return r3;
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void AvK(AnonymousClass9QQ r4) {
        MultiProductComponent multiProductComponent;
        AnonymousClass9W9 r2 = this.A05;
        if (r2 != null) {
            r2.A00 = r4;
            if (r2.A0N.A03() > 0 && (multiProductComponent = ((ProductFeedItem) r2.A0N.A04(0)).A02) != null) {
                r2.A0E.A01 = multiProductComponent;
                AnonymousClass9W9.A03(r2);
            }
        }
    }

    public final void BGg(C709938n r3) {
        this.A03 = r3;
        this.A0B.A00(true, true);
    }

    public final void BIq(int i) {
        this.mRecyclerView.post(new AnonymousClass9YE(this, i));
    }

    public final void BLL(boolean z) {
        RecyclerView recyclerView = this.mRecyclerView;
        recyclerView.post(new C71623Bm(recyclerView, z));
    }

    public final void BMx(C43791v5 r6, boolean z) {
        C216679Wc A002 = C216679Wc.A00(this.A04);
        synchronized (A002) {
            for (Integer intValue : A002.A00) {
                AnonymousClass00B r1 = AnonymousClass00B.A01;
                int intValue2 = intValue.intValue();
                r1.markerPoint(intValue2, AnonymousClass0IU.A00(97));
                AnonymousClass00B.A01.markerEnd(intValue2, 3);
            }
            A002.A00.clear();
        }
        AnonymousClass5F9.A01(getActivity(), C0003R.string.could_not_refresh_feed, 0);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        C709938n r0 = this.A03;
        if (r0 != null) {
            r0.BqS();
        }
        this.A07.Bse();
    }

    public final void BN0() {
        C216679Wc A002 = C216679Wc.A00(this.A04);
        synchronized (A002) {
            C216679Wc.A02(A002, 37355526);
        }
        C216679Wc A003 = C216679Wc.A00(this.A04);
        synchronized (A003) {
            for (Integer intValue : A003.A00) {
                AnonymousClass00B.A01.markerPoint(intValue.intValue(), AnonymousClass0IU.A00(24));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void BN1(C28691Ms r13, boolean z, boolean z2) {
        int i;
        C217319Yu r132 = (C217319Yu) r13;
        C216679Wc A002 = C216679Wc.A00(this.A04);
        synchronized (A002) {
            for (Integer intValue : A002.A00) {
                AnonymousClass00B.A01.markerPoint(intValue.intValue(), AnonymousClass0IU.A00(27));
            }
        }
        this.A02 = r132.A02;
        if (z) {
            this.A00.A0B(r132.A03, false);
            String moduleName = getModuleName();
            C219489d9 r9 = this.A00;
            ProductCollectionTileHscroll productCollectionTileHscroll = r132.A00;
            ProductCollectionTileHscroll productCollectionTileHscroll2 = r132.A01;
            synchronized (A002) {
                AnonymousClass00B r8 = AnonymousClass00B.A01;
                int i2 = 0;
                if (productCollectionTileHscroll != null) {
                    i = ImmutableList.A09(productCollectionTileHscroll.A01).size();
                } else {
                    i = 0;
                }
                int i3 = i + 0;
                if (productCollectionTileHscroll2 != null) {
                    i2 = ImmutableList.A09(productCollectionTileHscroll2.A01).size();
                }
                int i4 = i3 + i2;
                for (Integer intValue2 : A002.A00) {
                    int intValue3 = intValue2.intValue();
                    r8.markerAnnotate(intValue3, "container_module", moduleName);
                    for (Map.Entry entry : r9.A05().A02().entrySet()) {
                        r8.markerAnnotate(intValue3, (String) entry.getKey(), (String) entry.getValue());
                    }
                    r8.markerAnnotate(intValue3, "collections_count", i4);
                }
            }
            AnonymousClass9W9 r1 = this.A05;
            r1.A0N.A06();
            AnonymousClass9W9.A03(r1);
            AnonymousClass9W9 r6 = this.A05;
            boolean z3 = false;
            if (r132.A03 != null) {
                z3 = true;
            }
            if (z3) {
                r6.A07.A00(r6.A06.getResources().getDimensionPixelSize(C0003R.dimen.button_height));
            } else {
                r6.A07.A00(0);
            }
            C217339Yw r4 = this.A0A;
            if (r4 != null) {
                boolean z4 = false;
                if (r132.A00 != null) {
                    z4 = true;
                }
                if (r4.A00 <= 1) {
                    Boolean bool = r4.A02;
                    if (bool != null) {
                        z4 = bool.booleanValue();
                    }
                    r4.A02 = Boolean.valueOf(z4);
                }
            }
        }
        synchronized (A002) {
            C216679Wc.A01(A002, 37355526);
        }
        AnonymousClass9W9 r62 = this.A05;
        ProductCollectionTileHscroll productCollectionTileHscroll3 = r132.A01;
        ProductCollectionTileHscroll productCollectionTileHscroll4 = r132.A00;
        if (productCollectionTileHscroll3 != null) {
            r62.A03 = productCollectionTileHscroll3;
        }
        if (productCollectionTileHscroll4 != null) {
            r62.A01 = productCollectionTileHscroll4;
        }
        ProfileShopSurfaceCustomization profileShopSurfaceCustomization = r132.A02;
        if (profileShopSurfaceCustomization != null) {
            r62.A04 = profileShopSurfaceCustomization;
        }
        AnonymousClass38W r0 = this.A09;
        if (r0 != null) {
            if (productCollectionTileHscroll3 != null) {
                r0.A01 = productCollectionTileHscroll3;
            }
            if (productCollectionTileHscroll4 != null) {
                r0.A00 = productCollectionTileHscroll4;
            }
        }
        this.mAutoLoadMoreHelper.A04 = !r62.A0J();
        r62.A0N.A0F(r132.A02.A00());
        AnonymousClass9W9.A03(r62);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.mRefreshableContainer;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setRefreshing(false);
        }
        C709938n r02 = this.A03;
        if (r02 != null) {
            r02.BqS();
        }
        this.A07.Bse();
        if (!this.A0J) {
            this.A0J = true;
        }
        A03();
    }

    public final void BQk() {
        Merchant merchant;
        C13300iJ A022 = C13510ie.A00(this.A04).A02(this.A0C);
        if (A022 != null) {
            merchant = new Merchant(A022);
        } else {
            merchant = null;
        }
        if (merchant != null) {
            AnonymousClass0C1 r6 = this.A04;
            String str = this.A0G;
            String str2 = this.A0E;
            String str3 = this.A0F;
            C218009ag r2 = new C218009ag(AnonymousClass0QT.A00(r6, this).A02("instagram_shopping_profile_shop_entry"));
            if (r2.A0B()) {
                r2.A06("is_checkout_enabled", Integer.valueOf(merchant.A00() ? 1 : 0));
                r2.A08("merchant_id", merchant.A02);
                r2.A08("shopping_session_id", str);
                r2.A08(MemoryDumpUploadJob.EXTRA_USER_ID, r6.A04());
                r2.A08("prior_module", str2);
                r2.A08("prior_submodule", str3);
                r2.A04(AnonymousClass0C5.$const$string(98), false);
                r2.A01();
            }
        }
        C216679Wc A002 = C216679Wc.A00(this.A04);
        synchronized (A002) {
            C216679Wc.A02(A002, 37355525);
        }
    }

    public final void BQq() {
        this.A00.A08();
        AnonymousClass38W r1 = this.A09;
        if (r1 != null) {
            r1.A04 = ImmutableList.A09(this.A00.A0A);
        }
    }

    public final void configureActionBar(AnonymousClass1EX r14) {
        C13300iJ r4;
        if (this.mFragmentManager != null) {
            AnonymousClass1EX r5 = r14;
            r14.Bo6(true);
            r14.Bo0(true);
            if (!this.A0K || (r4 = this.A0R) == null) {
                r14.setTitle(this.A0T);
            } else {
                AnonymousClass9E6.A00(r14, getContext(), r4, this.A0b, this.mArguments.getString("surface_subtitle"));
            }
            if (this.A0K) {
                if (A00() != C13380iR.NONE) {
                    C33831dZ r1 = new C33831dZ();
                    r1.A02 = C0003R.C0004drawable.instagram_settings_outline_24;
                    r1.A01 = C0003R.string.shop_management_setting_button_content_description;
                    r1.A05 = new C217769aH(this);
                    ImageView A4J = r14.A4J(r1.A00());
                    if (A00() == C13380iR.ADD_HIDE_COLLECTIONS && !C27665CMj.A00(this.A04).getBoolean("has_seen_mini_shop_shop_management_nux", false)) {
                        A4J.post(new C108234lU(this, A4J));
                        C27665CMj.A00(this.A04).edit().putBoolean("has_seen_mini_shop_shop_management_nux", true).apply();
                    }
                }
                if (((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                    this.A0Q.A01(r14);
                    return;
                }
                return;
            }
            C13300iJ r0 = this.A0R;
            if (r0 != null) {
                C147806Tl.A04(r5, getActivity(), this.A04, this, this.A0G, this.A0C, r0.ASv(), "shopping_product_feed");
            }
        }
    }

    public final String getModuleName() {
        if (this.A0K) {
            return "instagram_shopping_mini_shop_storefront";
        }
        return AnonymousClass1DW.A00(Constants.A0N);
    }

    public final boolean isEmpty() {
        return this.A05.isEmpty();
    }

    public final boolean onBackPressed() {
        C217339Yw r1 = this.A0A;
        if (r1 == null) {
            return false;
        }
        r1.A00--;
        return false;
    }

    public final void onCreate(Bundle bundle) {
        Merchant merchant;
        C216249Ua r4;
        int A022 = AnonymousClass0Z0.A02(-909887144);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        this.A04 = AnonymousClass0J1.A06(bundle2);
        this.A0G = AnonymousClass30T.A00(bundle2);
        this.A0E = bundle2.getString("prior_module_name");
        this.A0F = bundle2.getString("entry_point");
        this.A0C = bundle2.getString("displayed_user_id");
        this.A0T = bundle2.getString("displayed_username");
        this.A0S = bundle2.getString("media_id");
        C13300iJ A023 = C13510ie.A00(this.A04).A02(this.A0C);
        this.A0R = A023;
        if (A023 != null) {
            merchant = new Merchant(A023);
        } else {
            merchant = null;
        }
        this.A0I = bundle2.getStringArrayList("pinned_product_ids");
        this.A0L = bundle2.getBoolean("hide_collections");
        this.A02 = (ProductFeedResponse) bundle2.getParcelable("product_feed");
        this.A0H = UUID.randomUUID().toString();
        this.A0K = bundle2.getBoolean("is_mini_shop", false);
        AnonymousClass0C1 r7 = this.A04;
        this.A08 = new C215819Sa(r7, this.A0H, this.A0E, this);
        if (A00() != C13380iR.NONE) {
            this.A06 = new C215869Sh(this.A0e, r7, getContext(), AnonymousClass1L8.A00(this));
        }
        FilterConfig filterConfig = (FilterConfig) bundle2.getParcelable("filter_config");
        this.A01 = filterConfig;
        this.A00 = new C219489d9(getContext(), this, this, this.A04, this.A0G, filterConfig, this.A0X, this.A0Y, this.A0Z, true, merchant, this.A0E, (ExploreTopicCluster) null, (String) null, bundle2.getStringArrayList("filter_ids"), this.A0f);
        C17510qM r3 = C17510qM.A00;
        FragmentActivity activity = getActivity();
        AnonymousClass0C1 r5 = this.A04;
        this.A0Q = r3.A0a(activity, r5, this.A0G, getModuleName(), "profile", C30671Ut.A0C(r5, this.A0S));
        AnonymousClass9ZQ r2 = new AnonymousClass9ZQ(this.A04, getContext(), AnonymousClass1L8.A00(this), this, this.A0C, false);
        this.A0P = r2;
        r2.A01();
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A02(C32981cA.class, this.A0W);
        A002.A02(C214829Nv.class, this.A0V);
        AnonymousClass1HU r32 = new AnonymousClass1HU();
        r32.A0C(this.A00);
        r32.A0C(this.A0P);
        registerLifecycleListenerSet(r32);
        AnonymousClass6N2.A01(new AnonymousClass6N2(C215239Pk.A00(this.A04).A00), "recent", new AnonymousClass6N1(this.A0C, this.A0T));
        if (this.A0K) {
            AnonymousClass0C1 r9 = this.A04;
            String str = this.A0E;
            String str2 = this.A0F;
            String str3 = this.A0G;
            String str4 = this.A0C;
            String str5 = this.A0S;
            C13150hy.A02(this, "insightsHost");
            C13150hy.A02(r9, "userSession");
            C13150hy.A02(str, "priorModule");
            C13150hy.A02(str2, "priorSubmodule");
            C13150hy.A02(str3, "shoppingSessionId");
            C13150hy.A02(str4, "merchantId");
            C218019ah r6 = new C218019ah(AnonymousClass0QT.A00(r9, this).A02("instagram_shopping_mini_shop_storefront_entry"));
            C13150hy.A01(r6, "InstagramShoppingMiniSho…erSession, insightsHost))");
            if (r6.A0B()) {
                r6.A07("merchant_id", AnonymousClass5AS.A01(str4).A00);
                AnonymousClass9QM r42 = new AnonymousClass9QM();
                r42.A03("prior_module", str);
                r42.A03("prior_submodule", str2);
                r42.A03("shopping_session_id", str3);
                r6.A03("navigation_info", r42);
                if (str5 == null) {
                    r4 = null;
                } else {
                    r4 = new C216249Ua();
                    r4.A03("m_pk", str5);
                    r4.A03("tracking_token", C30671Ut.A0C(r9, str5));
                }
                r6.A03("ads_tracking_info", r4);
                r6.A01();
            }
            AnonymousClass0C1 r43 = this.A04;
            C13150hy.A02(r43, "userSession");
            C06570Po A012 = r43.AVA(C217339Yw.class, C218279b7.A00);
            C13150hy.A01(A012, "userSession.getScopedCla…veyController()\n        }");
            C217339Yw r62 = (C217339Yw) A012;
            this.A0A = r62;
            String str6 = this.A0C;
            String str7 = this.A0T;
            String str8 = this.A0G;
            C13150hy.A02(str6, "merchantId");
            C13150hy.A02(str7, "merchantName");
            C13150hy.A02(str8, "shoppingSessionId");
            r62.A00++;
            String str9 = r62.A03;
            if (str9 != null) {
                str6 = str9;
            }
            r62.A03 = str6;
            String str10 = r62.A04;
            if (str10 == null) {
                str10 = str7;
            }
            r62.A04 = str10;
            String str11 = r62.A05;
            if (str11 == null) {
                str11 = str8;
            }
            r62.A05 = str11;
            C216679Wc A003 = C216679Wc.A00(this.A04);
            synchronized (A003) {
                C216679Wc.A02(A003, 37355525);
            }
        }
        AnonymousClass0Z0.A09(451065281, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0187, code lost:
        if (r8.A06.A07 != p000X.C13340iN.ELIGIBLE) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c1, code lost:
        if (p000X.C27665CMj.A00(r2).getInt(r4, 0) < 3) goto L_0x01c3;
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        ProfileShopFragment profileShopFragment;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        View findViewById;
        int A022 = AnonymousClass0Z0.A02(1191501792);
        C36721iV r0 = null;
        if (!this.A0K) {
            AnonymousClass38W r2 = ((UserDetailFragment) this.mParentFragment).A0p;
            this.A09 = r2;
            str = r2.A03;
            r0 = r2.A02;
            List list = r2.A04;
            List list2 = list;
            if (list != null) {
                this.A00.A0A(list2);
            }
        } else {
            ProductFeedResponse productFeedResponse = this.A02;
            if (productFeedResponse != null) {
                str = productFeedResponse.AQs();
                r0 = new C36721iV();
                r0.A0F(this.A02.A00());
            } else {
                str = null;
            }
        }
        if (this.A0B == null) {
            this.A0B = new AnonymousClass9WK(getContext(), AnonymousClass1L8.A00(this), this.A04, this, str, this.A0I);
        }
        if (r0 == null) {
            r0 = new C36721iV();
            AnonymousClass38W r22 = this.A09;
            if (r22 != null) {
                r22.A02 = r0;
            }
        }
        boolean z3 = false;
        if (A01() == Constants.ONE) {
            z3 = true;
        }
        AnonymousClass0C1 r9 = this.A04;
        this.A07 = new AnonymousClass9TG(r9, this.A0B, getContext(), this, z3, !this.A0K, this.A00);
        if (this.A0N == null || this.A05 == null) {
            C28051Kf A002 = C28051Kf.A00();
            this.A0N = A002;
            String str4 = this.A0G;
            C13300iJ A023 = C13510ie.A00(r9).A02(this.A0C);
            String str5 = this.A0T;
            String str6 = this.A0C;
            String str7 = this.A0E;
            profileShopFragment = this;
            AnonymousClass9Sb r19 = new AnonymousClass9Sb(this, r9, A002, str4, A023, str5, str6, this, str7, this.A0F, !this.A0K, this, this, this.A00, this.A0S);
            ProfileShopSurfaceCustomization profileShopSurfaceCustomization = (ProfileShopSurfaceCustomization) requireArguments().getParcelable("surface_customization");
            Context context = getContext();
            AnonymousClass9WK r14 = profileShopFragment.A0B;
            AnonymousClass0C1 r8 = profileShopFragment.A04;
            String str8 = profileShopFragment.A0C;
            String str9 = profileShopFragment.A0T;
            boolean z4 = true;
            if (profileShopFragment.A0K && profileShopFragment.A01() == Constants.ONE) {
                z = true;
            }
            z = false;
            if (z) {
                boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r8, AnonymousClass0L7.SHOPPING_MINI_SHOP_SELLER_EDUCATION, "megaphone_v2_enabled", false, (AnonymousClass04H) null)).booleanValue();
                AnonymousClass0C1 r23 = profileShopFragment.A04;
                if (booleanValue) {
                    str2 = "has_handled_mini_shop_shop_seller_education_v2";
                } else {
                    str2 = "has_handled_mini_shop_shop_seller_education";
                }
                if (!C27665CMj.A00(r23).getBoolean(str2, false)) {
                    AnonymousClass0C1 r24 = profileShopFragment.A04;
                    if (booleanValue) {
                        str3 = "mini_shop_shop_seller_education_seen_count_v2";
                    } else {
                        str3 = "mini_shop_shop_seller_education_seen_count";
                    }
                }
            }
            z4 = false;
            String str10 = str8;
            String str11 = str9;
            AnonymousClass0C1 r21 = r8;
            C36721iV r18 = r0;
            AnonymousClass9WK r17 = r14;
            profileShopFragment.A05 = new AnonymousClass9W9(context, r17, r18, r19, this, r21, str10, str11, z4, !profileShopFragment.A0K, profileShopFragment.A00, profileShopFragment.A07, profileShopFragment.A09, profileShopFragment.A0a, profileShopFragment.A0c, profileShopFragment.A0d, A00(), profileShopSurfaceCustomization);
        } else {
            profileShopFragment = this;
        }
        if (profileShopFragment.A0K) {
            A02();
        }
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!profileShopFragment.A0K) {
            z2 = false;
            FrameLayout frameLayout = (FrameLayout) layoutInflater2.inflate(C0003R.layout.layout_profile_shop, viewGroup2, false);
            profileShopFragment.mProfileShopContainer = frameLayout;
            findViewById = frameLayout.findViewById(C0003R.C0005id.recycler_view);
        } else {
            z2 = false;
            RefreshableNestedScrollingParent refreshableNestedScrollingParent = (RefreshableNestedScrollingParent) layoutInflater2.inflate(C0003R.layout.layout_refreshable_recyclerview, viewGroup2, false);
            profileShopFragment.mRefreshableContainer = refreshableNestedScrollingParent;
            refreshableNestedScrollingParent.setListener(new C217809aL(profileShopFragment));
            refreshableNestedScrollingParent.setRenderer(new C31241Xc(refreshableNestedScrollingParent, false));
            findViewById = profileShopFragment.mRefreshableContainer.findViewById(C0003R.C0005id.recycler_view);
        }
        profileShopFragment.mRecyclerView = (RecyclerView) findViewById;
        FastScrollingLinearLayoutManager fastScrollingLinearLayoutManager = new FastScrollingLinearLayoutManager(getContext(), 1);
        profileShopFragment.mLinearLayoutManager = fastScrollingLinearLayoutManager;
        fastScrollingLinearLayoutManager.A0w(true);
        profileShopFragment.mRecyclerView.setLayoutManager(fastScrollingLinearLayoutManager);
        profileShopFragment.mRecyclerView.setAdapter(profileShopFragment.A05);
        profileShopFragment.mRecyclerView.setItemAnimator((C31341Xr) null);
        C61622m6 r5 = new C61622m6(profileShopFragment.A0B, C29621Qp.PRODUCT, profileShopFragment.mLinearLayoutManager);
        profileShopFragment.mAutoLoadMoreHelper = r5;
        r5.A04 = !profileShopFragment.A05.A0J();
        profileShopFragment.mRecyclerView.A0w(r5);
        profileShopFragment.mRecyclerView.A0w(profileShopFragment.A0U);
        profileShopFragment.mRecyclerView.setClipToPadding(z2);
        View view = profileShopFragment.mRefreshableContainer;
        if (view == null) {
            view = profileShopFragment.mProfileShopContainer;
        }
        AnonymousClass0Z0.A09(-449656570, A022);
        return view;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.A0K) {
            AnonymousClass0C1 r2 = this.A04;
            if (!r2.A04().equals(this.A0C) && !C27665CMj.A00(r2).getBoolean("has_shown_mini_shop_legal_dialog", false) && ((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.MINISHOP_LEGAL_NUX, "is_enabled", true, (AnonymousClass04H) null)).booleanValue()) {
                if (((Boolean) AnonymousClass0L6.A02(this.A04, AnonymousClass0L7.MINISHOP_LEGAL_NUX, "is_v2", false, (AnonymousClass04H) null)).booleanValue()) {
                    AnonymousClass9WT.A00(requireActivity(), this.A04, this, this.A0E, this.A0F, this.A0G, this.A0C, this.A0S);
                } else {
                    FragmentActivity requireActivity = requireActivity();
                    AnonymousClass0C1 r9 = this.A04;
                    String str = this.A0E;
                    String str2 = this.A0F;
                    String str3 = this.A0G;
                    String str4 = this.A0C;
                    String str5 = this.A0S;
                    C13150hy.A02(requireActivity, "fragmentActivity");
                    C13150hy.A02(r9, "userSession");
                    C13150hy.A02(this, "insightsHost");
                    C13150hy.A02(str, "priorModule");
                    C13150hy.A02(str2, "priorSubmodule");
                    C13150hy.A02(str3, "shoppingSessionId");
                    C13150hy.A02(str4, "merchantId");
                    String string = requireActivity.getString(C0003R.string.mini_shop_legal_nux_body_primary);
                    C13150hy.A01(string, "fragmentActivity.getStri…p_legal_nux_body_primary)");
                    Boolean bool = (Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.MINISHOP_LEGAL_NUX, "should_use_new_content", false, (AnonymousClass04H) null);
                    C13150hy.A01(bool, "L.ig_minishop_legal_nux.…getAndExpose(userSession)");
                    boolean booleanValue = bool.booleanValue();
                    int i = C0003R.string.mini_shop_legal_nux_body_secondary;
                    if (booleanValue) {
                        i = C0003R.string.mini_shop_legal_nux_body_secondary_updated;
                    }
                    String string2 = requireActivity.getString(i);
                    C13150hy.A01(string2, "fragmentActivity.getStri…legal_nux_body_secondary)");
                    String A0J2 = AnonymousClass000.A0J(string, "\n\n", string2);
                    Boolean bool2 = (Boolean) AnonymousClass0L6.A02(r9, AnonymousClass0L7.MINISHOP_LEGAL_NUX, "should_show_subtitle", false, (AnonymousClass04H) null);
                    C13150hy.A01(bool2, "L.ig_minishop_legal_nux.…getAndExpose(userSession)");
                    if (bool2.booleanValue()) {
                        A0J2 = AnonymousClass000.A0J(requireActivity.getString(C0003R.string.mini_shop_legal_nux_subtitle), "\n\n", A0J2);
                    }
                    AnonymousClass2OA r10 = new AnonymousClass2OA(requireActivity);
                    r10.A0H(C019000b.A03(requireActivity, C0003R.C0004drawable.instagram_shopping_signup_assets_shopping_icon));
                    r10.A03 = requireActivity.getString(C0003R.string.mini_shop_legal_nux_title);
                    r10.A0M(A0J2);
                    r10.A0A(C0003R.string.f118ok, C218269b6.A00);
                    String str6 = str2;
                    String str7 = str;
                    AnonymousClass0C1 r17 = r9;
                    r10.A0N(requireActivity.getString(C0003R.string.default_link_text), new AnonymousClass9YJ(requireActivity, this, r17, str7, str6, str3, str4));
                    r10.A03().show();
                    String str8 = str3;
                    String str9 = str2;
                    String str10 = str;
                    AnonymousClass0C1 r11 = r9;
                    AnonymousClass9WF.A01(this, r11, str10, str9, str8, str4, str5);
                }
                C27665CMj.A00(this.A04).edit().putBoolean("has_shown_mini_shop_legal_dialog", true).apply();
            }
        }
        if (!this.A0K) {
            UserDetailFragment userDetailFragment = (UserDetailFragment) this.mParentFragment;
            AnonymousClass0a4.A07(userDetailFragment.A0b, "Missing Tab Data Provider");
            C710138p r0 = userDetailFragment.A0b.A0C.A0J;
            this.A0O = r0;
            r0.A00(this);
        }
        this.A0N.A04(C32711bj.A00(this), this.mRecyclerView);
    }

    private C13380iR A00() {
        if (A01() == Constants.ONE) {
            return this.A04.A06.A08;
        }
        return C13380iR.NONE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == p000X.C13380iR.ADD_HIDE_COLLECTIONS) goto L_0x000d;
     */
    public static void A04(ProfileShopFragment profileShopFragment) {
        boolean z;
        C13380iR A002 = profileShopFragment.A00();
        if (A002 != C13380iR.ADD_HIDE) {
            z = false;
        }
        z = true;
        if (z) {
            C53962Ve.A01(profileShopFragment.A04, profileShopFragment, profileShopFragment.A0H, profileShopFragment.A0E, "profile_shop");
            C17510qM.A00.A0p(profileShopFragment, profileShopFragment.A04, profileShopFragment.A0H, profileShopFragment.getModuleName());
        } else if (A002 == C13380iR.ADD) {
            profileShopFragment.A07();
        }
    }

    public final String AVo() {
        return this.A0G;
    }

    public final void BQl() {
        A02();
        AnonymousClass1NR r0 = ((UserDetailFragment) this.mParentFragment).A0k;
        r0.A05.remove(QPTooltipAnchor.SHOP);
        A03();
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((i == 10 || i == 9) && i2 == 1002) {
            this.A0B.A00(true, false);
        }
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(969974164);
        super.onDestroy();
        AnonymousClass38W r1 = this.A09;
        if (r1 != null) {
            r1.A03 = this.A0B.A00.A01;
        }
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A03(C32981cA.class, this.A0W);
        A002.A03(C214829Nv.class, this.A0V);
        AnonymousClass0Z0.A09(-1874677428, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(902789942);
        super.onDestroyView();
        C710138p r0 = this.A0O;
        if (r0 != null) {
            r0.A04.remove(this);
        }
        ProfileShopFragmentLifecycleUtil.cleanupReferences(this);
        this.A00.A08();
        AnonymousClass0Z0.A09(890995026, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1811962855);
        super.onPause();
        C216679Wc A002 = C216679Wc.A00(this.A04);
        synchronized (A002) {
            for (Integer intValue : A002.A00) {
                AnonymousClass00B.A01.markerEnd(intValue.intValue(), 22);
            }
            A002.A00.clear();
        }
        C217339Yw r4 = this.A0A;
        if (r4 != null) {
            String str = this.A0C;
            C13150hy.A02(str, "merchantId");
            if (str.equals(r4.A03)) {
                r4.A01 += System.currentTimeMillis();
            }
        }
        AnonymousClass0Z0.A09(-381350720, A022);
    }

    public final void onResume() {
        AnonymousClass1OY r1;
        int A022 = AnonymousClass0Z0.A02(1243904146);
        super.onResume();
        A03();
        C34071dx A0T2 = C17020pY.A00().A0T(getActivity());
        if (A0T2 != null && A0T2.A0a() && ((r1 = A0T2.A0D) == AnonymousClass1OY.SHOP_PROFILE || r1 == AnonymousClass1OY.SAVE_PRODUCT)) {
            A0T2.A0R();
        }
        C217339Yw r4 = this.A0A;
        if (r4 != null) {
            String str = this.A0C;
            C13150hy.A02(str, "merchantId");
            if (str.equals(r4.A03)) {
                r4.A01 -= System.currentTimeMillis();
            }
        }
        AnonymousClass0Z0.A09(-1014834406, A022);
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }
}
