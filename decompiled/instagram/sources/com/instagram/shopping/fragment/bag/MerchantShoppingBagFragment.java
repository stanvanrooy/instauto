package com.instagram.shopping.fragment.bag;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.payments.CurrencyAmountInfo;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.model.payments.common.ProductItem;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductCheckoutProperties;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.payments.checkout.model.CheckoutData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.shopping.adapter.bag.merchant.PinnedLinearLayoutManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1I6;
import p000X.AnonymousClass2MI;
import p000X.AnonymousClass30T;
import p000X.AnonymousClass35Z;
import p000X.AnonymousClass6MO;
import p000X.AnonymousClass7K7;
import p000X.AnonymousClass7KK;
import p000X.AnonymousClass7KL;
import p000X.AnonymousClass7KP;
import p000X.AnonymousClass7KQ;
import p000X.AnonymousClass7KR;
import p000X.AnonymousClass9DN;
import p000X.AnonymousClass9EB;
import p000X.AnonymousClass9EC;
import p000X.AnonymousClass9EG;
import p000X.AnonymousClass9EH;
import p000X.AnonymousClass9J3;
import p000X.AnonymousClass9N4;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9RD;
import p000X.AnonymousClass9T4;
import p000X.AnonymousClass9j5;
import p000X.AnonymousClass9j9;
import p000X.C05000Hl;
import p000X.C05700Lp;
import p000X.C06220Of;
import p000X.C06590Pq;
import p000X.C11200ea;
import p000X.C17510qM;
import p000X.C194508Uj;
import p000X.C213539Ir;
import p000X.C215929So;
import p000X.C220369ea;
import p000X.C220499en;
import p000X.C220669f5;
import p000X.C222459i1;
import p000X.C222479i4;
import p000X.C222489i6;
import p000X.C222499i7;
import p000X.C222519i9;
import p000X.C222569iE;
import p000X.C222599iH;
import p000X.C222609iI;
import p000X.C222639iL;
import p000X.C222679iP;
import p000X.C222719iT;
import p000X.C222759iX;
import p000X.C222949it;
import p000X.C222999j0;
import p000X.C223009j1;
import p000X.C223029j3;
import p000X.C223069j8;
import p000X.C223089jB;
import p000X.C223109jD;
import p000X.C223129jF;
import p000X.C223159jI;
import p000X.C223179jK;
import p000X.C223219jO;
import p000X.C223269jU;
import p000X.C223329ja;
import p000X.C223369je;
import p000X.C223379jf;
import p000X.C223389jg;
import p000X.C223679kA;
import p000X.C23300zv;
import p000X.C27341Hl;
import p000X.C27371Ho;
import p000X.C28021Kc;
import p000X.C28051Kf;
import p000X.C30661Us;
import p000X.C31321Xp;
import p000X.C40811pI;
import p000X.C51312Ke;
import p000X.C51522Kz;
import p000X.C59232hF;

public class MerchantShoppingBagFragment extends C27341Hl implements AnonymousClass1I6, C27371Ho, C51312Ke, AnonymousClass1HM, AnonymousClass9EG {
    public int A00;
    public C51522Kz A01;
    public IgFundedIncentive A02;
    public MultiProductComponent A03;
    public AnonymousClass0C1 A04;
    public C222459i1 A05;
    public AnonymousClass9j5 A06;
    public C222489i6 A07;
    public C223029j3 A08 = C223029j3.LOADING;
    public AnonymousClass35Z A09;
    public C223129jF A0A;
    public AnonymousClass9EH A0B;
    public C194508Uj A0C;
    public C222639iL A0D;
    public C215929So A0E;
    public AnonymousClass9RD A0F;
    public AnonymousClass9J3 A0G;
    public AnonymousClass7KL A0H;
    public Runnable A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public Map A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final AnonymousClass2MI A0b = new C222759iX(this);
    public final C11200ea A0c = new C222949it(this);
    public final C11200ea A0d = new C220369ea(this);
    public final C11200ea A0e = new AnonymousClass7KP(this);
    public final AnonymousClass7K7 A0f = new AnonymousClass7K7();
    public final C222479i4 A0g = new C222479i4(this);
    public RecyclerView mRecyclerView;

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AtV() {
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.Bo6(true);
        r2.BlI(C0003R.string.shopping_bag_title);
    }

    public final String getModuleName() {
        return "instagram_shopping_merchant_bag";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static CheckoutLaunchParams A00(MerchantShoppingBagFragment merchantShoppingBagFragment) {
        String str;
        ArrayList arrayList;
        ImageUrl imageUrl;
        MerchantShoppingBagFragment merchantShoppingBagFragment2 = merchantShoppingBagFragment;
        C222609iI.A00(merchantShoppingBagFragment2.A04).A05.A07();
        C222639iL r2 = merchantShoppingBagFragment2.A0D;
        if (r2 == null || r2.A01 == 0) {
            return null;
        }
        List<C220669f5> list = r2.A09;
        boolean z = true;
        AnonymousClass0a4.A0A(!list.isEmpty());
        if (((C220669f5) list.get(0)).A02.A00 == null) {
            z = false;
        }
        AnonymousClass0a4.A0A(z);
        ProductCheckoutProperties productCheckoutProperties = ((C220669f5) list.get(0)).A02.A00.A03;
        AnonymousClass0a4.A06(productCheckoutProperties);
        AnonymousClass9N4 A002 = AnonymousClass9N4.A00();
        AnonymousClass0C1 r22 = merchantShoppingBagFragment2.A04;
        A002.A01 = r22;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = A002.A00;
        if (igReactPurchaseExperienceBridgeModule != null) {
            igReactPurchaseExperienceBridgeModule.mUserSession = r22;
        }
        ArrayList arrayList2 = new ArrayList();
        for (C220669f5 r0 : list) {
            Product product = r0.A02.A00;
            AnonymousClass0a4.A06(product);
            arrayList2.add(product);
        }
        A002.A03 = arrayList2;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule2 = A002.A00;
        if (igReactPurchaseExperienceBridgeModule2 != null) {
            igReactPurchaseExperienceBridgeModule2.mProducts = arrayList2;
        }
        AnonymousClass0C1 r8 = merchantShoppingBagFragment2.A04;
        Merchant merchant = merchantShoppingBagFragment2.A0D.A02;
        String str2 = merchantShoppingBagFragment2.A0Q;
        String str3 = merchantShoppingBagFragment2.A0J;
        String moduleName = merchantShoppingBagFragment2.getModuleName();
        String str4 = merchantShoppingBagFragment2.A0U;
        String str5 = merchantShoppingBagFragment2.A0L;
        String str6 = merchantShoppingBagFragment2.A0N;
        String str7 = merchantShoppingBagFragment2.A0K;
        String str8 = merchantShoppingBagFragment2.A0R;
        String str9 = merchantShoppingBagFragment2.A0M;
        AnonymousClass0a4.A06(str9);
        String str10 = merchantShoppingBagFragment2.A0P;
        AnonymousClass0a4.A06(str10);
        ArrayList arrayList3 = new ArrayList();
        for (C220669f5 A022 : list) {
            arrayList3.add(C222519i9.A02(A022));
        }
        String str11 = productCheckoutProperties.A05;
        String str12 = productCheckoutProperties.A04;
        C223069j8 r02 = new C223069j8();
        r02.A06 = str2;
        r02.A01 = str5;
        r02.A03 = str6;
        r02.A00 = str7;
        r02.A07 = str8;
        r02.A02 = str9;
        r02.A05 = str10;
        r02.A09 = str4;
        boolean booleanValue = ((Boolean) AnonymousClass9DN.A00(r8, new C05000Hl("use_checkout_shimmer_loading", AnonymousClass0L7.RN_CHECKOUT_SHIMMER_LOADING, false, (String[]) null, (AnonymousClass04H) null))).booleanValue();
        if (booleanValue) {
            try {
                arrayList = new ArrayList();
                for (C220669f5 r7 : list) {
                    ProductItem A023 = C222519i9.A02(r7);
                    Product product2 = r7.A02.A00;
                    AnonymousClass0a4.A06(product2);
                    ImageInfo A012 = product2.A01();
                    String str13 = A023.A03;
                    int i = A023.A00;
                    CurrencyAmountInfo currencyAmountInfo = A023.A01;
                    String str14 = A023.A02;
                    String str15 = product2.A0I;
                    if (A012 != null) {
                        imageUrl = A012.A01();
                    } else {
                        imageUrl = null;
                    }
                    arrayList.add(new C223329ja(str13, i, currencyAmountInfo, str14, str15, imageUrl));
                }
            } catch (IOException unused) {
                AnonymousClass0QD.A02(moduleName, "Unable to launch checkout");
                str = null;
            }
        } else {
            arrayList = C222519i9.A03(arrayList3);
        }
        str = C222569iE.A00(C222519i9.A00(arrayList, true, false, str2, str11, str12, r02, merchant, booleanValue));
        return new CheckoutLaunchParams(str11, str12, str3, arrayList3, str, false);
    }

    public static void A03(MerchantShoppingBagFragment merchantShoppingBagFragment) {
        C222719iT r0;
        if (merchantShoppingBagFragment.A0I == null) {
            AnonymousClass9j5 r9 = merchantShoppingBagFragment.A06;
            C222639iL r8 = merchantShoppingBagFragment.A0D;
            C222479i4 r7 = merchantShoppingBagFragment.A0g;
            if (r8 == null || Collections.unmodifiableList(r8.A06).isEmpty()) {
                r9.A00.setVisibility(8);
            } else {
                boolean z = false;
                r9.A00.setVisibility(0);
                C222719iT r2 = r8.A03;
                CurrencyAmountInfo currencyAmountInfo = r8.A05.A00;
                if (currencyAmountInfo == null) {
                    r0 = null;
                } else {
                    r0 = currencyAmountInfo.A01;
                }
                C222999j0 r5 = new C222999j0(r2, r0, r8.A01);
                C223219jO r4 = r9.A03;
                Context context = r4.A00.getContext();
                TextView textView = r4.A02;
                Resources resources = context.getResources();
                int i = r5.A00;
                textView.setText(resources.getQuantityString(C0003R.plurals.shopping_bag_subtotal_title_text, i, new Object[]{Integer.valueOf(i)}));
                C222719iT r1 = r5.A01;
                if (r1 == null) {
                    r4.A01.setVisibility(8);
                } else if (r1.compareTo(r5.A02) <= 0) {
                    r4.A01.setVisibility(0);
                    r4.A01.setText(context.getString(C0003R.string.free_shipping));
                } else {
                    C222719iT r3 = r5.A01;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(C0003R.string.merchant_shopping_bag_subtotal_amount_to_free_shipping, new Object[]{new C222719iT(r3.A01, r3.A02.subtract(r5.A02.A02), r3.A00).toString()}));
                    r4.A01.setVisibility(0);
                    r4.A01.setText(spannableStringBuilder);
                }
                r4.A00.setText(r5.A02.toString());
                View view = r9.A01;
                if (!r8.A08 && !r8.A09.isEmpty()) {
                    z = true;
                }
                view.setEnabled(z);
                r9.A01.setOnClickListener(new C222499i7(r7));
                TextView textView2 = r9.A02;
                Context context2 = textView2.getContext();
                String string = context2.getResources().getString(C0003R.string.payment_security);
                Drawable A012 = C40811pI.A01(context2, C0003R.C0004drawable.instagram_lock_filled_12, C0003R.color.igds_secondary_icon);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int length = spannableStringBuilder2.length();
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(C0003R.dimen.merchant_bag_lock_icon_size);
                A012.setBounds(0, 0, (A012.getIntrinsicWidth() * dimensionPixelSize) / A012.getIntrinsicHeight(), dimensionPixelSize);
                C59232hF r22 = new C59232hF(A012);
                r22.A02 = Constants.ZERO;
                r22.A01 = context2.getResources().getDimensionPixelSize(C0003R.dimen.merchant_bag_icon_margin_end);
                spannableStringBuilder2.append("c");
                spannableStringBuilder2.setSpan(r22, length, length + 1, 33);
                spannableStringBuilder2.append(string);
                textView2.setText(spannableStringBuilder2);
            }
            boolean z2 = false;
            if (merchantShoppingBagFragment.A06.A00.getVisibility() == 0) {
                z2 = true;
            }
            if (!z2 || merchantShoppingBagFragment.A00 != 0) {
                C222459i1 r32 = merchantShoppingBagFragment.A05;
                r32.A00 = new C223269jU("footer_gap_view_model_key", merchantShoppingBagFragment.A00);
                C222459i1.A00(r32);
                C222459i1 r72 = merchantShoppingBagFragment.A05;
                C223029j3 r6 = merchantShoppingBagFragment.A08;
                C222639iL r52 = merchantShoppingBagFragment.A0D;
                C194508Uj r42 = merchantShoppingBagFragment.A0C;
                MultiProductComponent multiProductComponent = merchantShoppingBagFragment.A03;
                String str = merchantShoppingBagFragment.A0S;
                IgFundedIncentive igFundedIncentive = merchantShoppingBagFragment.A02;
                AnonymousClass2MI r02 = merchantShoppingBagFragment.A0b;
                r72.A04 = r6;
                r72.A06 = r52;
                r72.A05 = r42;
                r72.A03 = multiProductComponent;
                r72.A07 = str;
                r72.A02 = igFundedIncentive;
                r72.A01 = r02;
                C222459i1.A00(r72);
            } else {
                merchantShoppingBagFragment.mView.getViewTreeObserver().addOnGlobalLayoutListener(new C222679iP(merchantShoppingBagFragment));
            }
            if (merchantShoppingBagFragment.A0S != null && merchantShoppingBagFragment.A0D != null) {
                C223179jK r33 = new C223179jK(merchantShoppingBagFragment);
                merchantShoppingBagFragment.A0I = r33;
                merchantShoppingBagFragment.mView.postDelayed(r33, 500);
            }
        }
    }

    public static void A04(MerchantShoppingBagFragment merchantShoppingBagFragment, C223029j3 r13, C222639iL r14) {
        C223029j3 r1;
        C222639iL r0;
        String A002;
        CheckoutLaunchParams A003;
        if (merchantShoppingBagFragment.mView != null) {
            C222639iL r02 = merchantShoppingBagFragment.A0D;
            if (!(r02 == null || r14 == null || r02.A08 == r14.A08)) {
                merchantShoppingBagFragment.A00 = 0;
            }
            merchantShoppingBagFragment.A0D = r14;
            if (!(merchantShoppingBagFragment.A0C != null || r14 == null || merchantShoppingBagFragment.A0V == null)) {
                merchantShoppingBagFragment.A0C = new C194508Uj(Collections.unmodifiableList(r14.A06), merchantShoppingBagFragment.A0V.keySet());
            }
            C222639iL r12 = merchantShoppingBagFragment.A0D;
            if (r12 != null && merchantShoppingBagFragment.A03 == null) {
                merchantShoppingBagFragment.A03 = r12.A00();
            }
            merchantShoppingBagFragment.A02 = C222609iI.A00(merchantShoppingBagFragment.A04).A00;
            if (!merchantShoppingBagFragment.A0Z && r13 == (r1 = C223029j3.LOADED) && (r0 = merchantShoppingBagFragment.A0D) != null && !r0.A08) {
                merchantShoppingBagFragment.A0Z = true;
                if (r13 == r1) {
                    C222489i6 r5 = merchantShoppingBagFragment.A07;
                    String str = merchantShoppingBagFragment.A0Q;
                    String str2 = merchantShoppingBagFragment.A0J;
                    Integer A062 = C222609iI.A00(merchantShoppingBagFragment.A04).A06();
                    AnonymousClass0a4.A06(A062);
                    int intValue = A062.intValue();
                    String str3 = merchantShoppingBagFragment.A0M;
                    AnonymousClass0a4.A06(str3);
                    String str4 = merchantShoppingBagFragment.A0P;
                    AnonymousClass0a4.A06(str4);
                    C222639iL r4 = merchantShoppingBagFragment.A0D;
                    AnonymousClass0a4.A06(r4);
                    C223369je r3 = new C223369je(r5.A00.A02("instagram_shopping_merchant_bag_load_success"));
                    CurrencyAmountInfo currencyAmountInfo = r4.A05.A00;
                    r3.A08("shopping_session_id", r5.A06);
                    r3.A08("merchant_id", str);
                    r3.A08("merchant_bag_entry_point", r5.A04);
                    r3.A08("merchant_bag_prior_module", r5.A05);
                    r3.A08("checkout_session_id", str2);
                    r3.A07("global_bag_id", Long.valueOf(Long.parseLong(str3)));
                    r3.A07("merchant_bag_id", Long.valueOf(Long.parseLong(str4)));
                    r3.A07("total_item_count", Long.valueOf((long) intValue));
                    r3.A07("item_count", Long.valueOf((long) r4.A00));
                    r3.A0A("product_merchant_ids", C222489i6.A01(str, r4));
                    r3.A0A("subtotal_quantities", C222489i6.A02(r4.A09));
                    r3.A07("subtotal_item_count", Long.valueOf((long) r4.A01));
                    r3.A08("subtotal_amount", C222489i6.A00(r4.A03));
                    boolean z = false;
                    if (currencyAmountInfo != null && currencyAmountInfo.A01.compareTo(r4.A03) <= 0) {
                        z = true;
                    }
                    r3.A04("is_free_shipping_reached", Boolean.valueOf(z));
                    r3.A08("currency", r4.A03.A01);
                    r3.A08(AnonymousClass0C5.$const$string(83), r4.A03.A01);
                    r3.A08("global_bag_entry_point", r5.A02);
                    r3.A08("global_bag_prior_module", r5.A03);
                    if (currencyAmountInfo == null) {
                        A002 = null;
                    } else {
                        A002 = C222489i6.A00(currencyAmountInfo.A01);
                    }
                    r3.A08("free_shipping_order_value", A002);
                    r3.A01();
                    if (((Boolean) AnonymousClass0L6.A03(merchantShoppingBagFragment.A04, AnonymousClass0L7.PREFETCH_CHECKOUT_INFO_FROM_BAG, "enabled", false, (AnonymousClass04H) null)).booleanValue() && (A003 = A00(merchantShoppingBagFragment)) != null) {
                        C223679kA r03 = new C223679kA();
                        r03.A00 = A003;
                        C223009j1.A00().A01(new CheckoutData(r03), merchantShoppingBagFragment.A04, merchantShoppingBagFragment.requireActivity());
                    }
                } else if (r13 == C223029j3.FAILED) {
                    C222489i6 r6 = merchantShoppingBagFragment.A07;
                    String str5 = merchantShoppingBagFragment.A0Q;
                    String str6 = merchantShoppingBagFragment.A0J;
                    String str7 = merchantShoppingBagFragment.A0M;
                    String str8 = merchantShoppingBagFragment.A0P;
                    C223379jf r32 = new C223379jf(r6.A00.A02("instagram_shopping_merchant_bag_load_failure"));
                    r32.A08("merchant_id", str5);
                    String str9 = r6.A04;
                    AnonymousClass0a4.A06(str9);
                    r32.A08("merchant_bag_entry_point", str9);
                    String str10 = r6.A05;
                    AnonymousClass0a4.A06(str10);
                    r32.A08("merchant_bag_prior_module", str10);
                    r32.A08("checkout_session_id", str6);
                    r32.A08("shopping_session_id", r6.A06);
                    r32.A08("global_bag_entry_point", r6.A02);
                    r32.A08("global_bag_prior_module", r6.A03);
                    if (str7 != null) {
                        r32.A07("global_bag_id", Long.valueOf(Long.parseLong(str7)));
                    }
                    if (str8 != null) {
                        r32.A07("merchant_bag_id", Long.valueOf(Long.parseLong(str8)));
                    }
                    r32.A01();
                }
            }
            if (r13 != C223029j3.FAILED || r14 == null) {
                merchantShoppingBagFragment.A08 = r13;
            } else {
                merchantShoppingBagFragment.A08 = C223029j3.LOADED;
            }
            A03(merchantShoppingBagFragment);
        }
    }

    public final boolean AhU() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || !recyclerView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final void AtY(int i, int i2) {
        this.A0Y = i;
        if (isAdded()) {
            A01();
        }
        AnonymousClass9EH r0 = this.A0B;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1991446770);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A04 = AnonymousClass0J1.A06(bundle2);
        this.A0T = AnonymousClass30T.A00(bundle2);
        this.A0Q = bundle2.getString("merchant_id");
        String string = bundle2.getString("entry_point");
        AnonymousClass0a4.A06(string);
        this.A0K = string;
        this.A0O = bundle2.getString("logging_token");
        this.A0U = bundle2.getString("tracking_token");
        this.A0R = bundle2.getString("prior_module_name");
        this.A0a = bundle2.getBoolean("is_modal");
        this.A0J = bundle2.getString("checkout_session_id");
        this.A0V = (HashMap) bundle2.getSerializable("referenced_products");
        if (this.A0J == null) {
            this.A0J = UUID.randomUUID().toString();
        }
        this.A0S = bundle2.getString("product_id_to_animate");
        this.A0L = bundle2.getString("global_bag_entry_point");
        this.A0N = bundle2.getString("global_bag_prior_module");
        C17510qM r9 = C17510qM.A00;
        FragmentActivity activity = getActivity();
        Context context = getContext();
        AnonymousClass0C1 r7 = this.A04;
        this.A09 = r9.A0B(activity, context, r7, this, this.A0T, this.A0R, (String) null);
        this.A0G = new AnonymousClass9J3(activity, r7);
        C28051Kf A002 = C28021Kc.A00();
        registerLifecycleListener(new AnonymousClass9j9(A002, this));
        this.A0F = new AnonymousClass9RD(this.A04, this, A002, this.A0T, this.A0R, (String) null, AnonymousClass9Q3.BAG.toString(), (String) null, (ExploreTopicCluster) null, (String) null, (C30661Us) null);
        this.A0E = new C215929So(this.A04, this, A002);
        AnonymousClass1HD r72 = this.mParentFragment;
        if (r72 instanceof AnonymousClass6MO) {
            AnonymousClass0a4.A06(r72);
            this.A0A = new AnonymousClass9EC(this, (AnonymousClass6MO) r72, this, this.A04);
        } else {
            this.A0A = new AnonymousClass9EB(this, this, this.A04, new AnonymousClass7KR(this), new AnonymousClass7KQ(this));
        }
        AnonymousClass0C1 r92 = this.A04;
        this.A07 = new C222489i6(this, r92, this.A0K, this.A0R, this.A0L, this.A0N, this.A0T);
        C222599iH r73 = C222609iI.A00(r92).A05;
        this.A0M = r73.A01;
        String str = (String) r73.A0A.get(this.A0Q);
        this.A0P = str;
        C222489i6 r93 = this.A07;
        String str2 = this.A0Q;
        String str3 = this.A0J;
        String str4 = this.A0M;
        C223389jg r5 = new C223389jg(r93.A01.A02("instagram_shopping_merchant_bag_entry"));
        r5.A08("merchant_id", str2);
        String str5 = r93.A04;
        AnonymousClass0a4.A06(str5);
        r5.A08("merchant_bag_entry_point", str5);
        String str6 = r93.A05;
        AnonymousClass0a4.A06(str6);
        r5.A08("merchant_bag_prior_module", str6);
        r5.A08("checkout_session_id", str3);
        r5.A08("shopping_session_id", r93.A06);
        r5.A08("global_bag_entry_point", r93.A02);
        r5.A08("global_bag_prior_module", r93.A03);
        if (str4 != null) {
            r5.A07("global_bag_id", Long.valueOf(Long.parseLong(str4)));
        }
        if (str != null) {
            r5.A07("merchant_bag_id", Long.valueOf(Long.parseLong(str)));
        }
        r5.A01();
        AnonymousClass0Z0.A09(1892382220, A022);
    }

    private void A01() {
        this.A06.A00.setTranslationY(Math.min(((float) C06220Of.A08(requireContext())) * 0.34f, (float) this.A0Y) * -1.0f);
    }

    public static /* synthetic */ void A02() {
        C223009j1 A002 = C223009j1.A00();
        if (!A002.A02) {
            A002.A02 = true;
        }
    }

    public final String AVo() {
        return this.A0J;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-400067244);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_merchant_bag_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(1169077569, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1368110735);
        super.onDestroyView();
        this.mRecyclerView = null;
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A03(C223109jD.class, this.A0c);
        A002.A03(AnonymousClass9T4.class, this.A0d);
        A002.A03(AnonymousClass7KK.class, this.A0e);
        AnonymousClass0Z0.A09(2026407485, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(977935227);
        super.onPause();
        C222609iI.A00(this.A04).A05.A07();
        this.A0f.A00();
        C51522Kz r0 = this.A01;
        if (r0 != null) {
            C213539Ir.A02(r0);
            this.A01 = null;
        }
        AnonymousClass0Z0.A09(1723604802, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-1557464426);
        super.onResume();
        A01();
        if (this.A0X) {
            this.A0X = false;
            if (this.A0a) {
                getActivity().finish();
            } else {
                AnonymousClass1HD r1 = this.mParentFragment;
                if (r1 instanceof AnonymousClass6MO) {
                    ((AnonymousClass6MO) r1).A09.A05();
                } else {
                    this.mFragmentManager.A0W();
                }
            }
        }
        AnonymousClass0Z0.A09(874326642, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A06 = new AnonymousClass9j5((ViewGroup) view.findViewById(C0003R.C0005id.merchant_bag_footer_container));
        this.A05 = new C222459i1(getContext(), this.A04, this.A0g, getModuleName(), this.A0f, this.A0V);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C0003R.C0005id.recycler_view);
        this.mRecyclerView = recyclerView;
        recyclerView.setImportantForAccessibility(2);
        PinnedLinearLayoutManager pinnedLinearLayoutManager = new PinnedLinearLayoutManager(getContext(), new C223089jB(this));
        pinnedLinearLayoutManager.A01 = C220499en.class;
        pinnedLinearLayoutManager.A03 = "product_collection";
        pinnedLinearLayoutManager.A00 = C223269jU.class;
        pinnedLinearLayoutManager.A02 = "footer_gap_view_model_key";
        this.mRecyclerView.setLayoutManager(pinnedLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.A05.A09);
        C31321Xp r1 = new C31321Xp();
        r1.A0J();
        this.mRecyclerView.setItemAnimator(r1);
        if (!this.A0f.A01.containsKey("MerchantShoppingBagFragment")) {
            this.mRecyclerView.A0h(0);
        }
        this.A0f.A01("MerchantShoppingBagFragment", this.mRecyclerView);
        C222639iL A042 = C222609iI.A00(this.A04).A04(this.A0Q);
        if (A042 == null) {
            A04(this, C223029j3.LOADING, (C222639iL) null);
        } else {
            A04(this, C223029j3.LOADED, A042);
        }
        C23300zv A002 = C23300zv.A00(this.A04);
        A002.A02(C223109jD.class, this.A0c);
        A002.A02(AnonymousClass9T4.class, this.A0d);
        A002.A02(AnonymousClass7KK.class, this.A0e);
        if (((Boolean) AnonymousClass9DN.A00(this.A04, new C05000Hl("preload_rn_bridge", AnonymousClass0L7.CHECKOUT_PRELOAD_RN_BRIDGE, false, (String[]) null, (AnonymousClass04H) null))).booleanValue()) {
            C05700Lp.A00().ADc(new C223159jI(this));
        }
    }

    public final void BgF(AnonymousClass9EH r1) {
        this.A0B = r1;
    }
}
