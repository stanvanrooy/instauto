package p000X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.base.CreationSession;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.ProductUntaggableReason;
import com.instagram.model.shopping.ShoppingDestinationTypeModel;
import com.instagram.model.shopping.ShoppingHelpLinkWithText;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProductCollectionLinkMetadata;
import com.instagram.model.shopping.reels.ProductCollectionReviewStatus;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.model.shopping.reels.ShoppingDestinationMetadata;
import com.instagram.model.shopping.reels.ShoppingIncentiveMetadata;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.shopping.fragment.destination.reconsideration.ShoppingReconsiderationDestinationFragment;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import com.instagram.shopping.model.ShippingAndReturnsInfo;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.0qL  reason: invalid class name and case insensitive filesystem */
public final class C17500qL extends C17510qM {
    public C53802Uk A00;
    public C169807Nr A01;

    private void A01(FragmentActivity fragmentActivity, AnonymousClass0C1 r11, C27371Ho r12, AnonymousClass2TH r13, Integer num, String str) {
        String string;
        String str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (num != null) {
            string = fragmentActivity.getResources().getQuantityString(C0003R.plurals.shopping_bag_count, num.intValue(), new Object[]{num});
        } else {
            string = fragmentActivity.getResources().getString(C0003R.string.shopping_bag_title);
        }
        if (num != null) {
            str2 = num.toString();
        } else {
            str2 = "";
        }
        r13.A03(str2, new AnonymousClass6HU(this, fragmentActivity2, r11, str, r12), string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (p000X.AnonymousClass1BX.A00(r1) != false) goto L_0x0033;
     */
    public final void A0y(FragmentActivity fragmentActivity, AnonymousClass0C1 r11, Product product) {
        String str;
        Product product2 = product;
        ProductUntaggableReason productUntaggableReason = product.A08;
        if (productUntaggableReason != null && productUntaggableReason.A04 != null && productUntaggableReason.A03 != null) {
            ShoppingHelpLinkWithText shoppingHelpLinkWithText = productUntaggableReason.A01;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            AnonymousClass2OA r2 = new AnonymousClass2OA(fragmentActivity);
            r2.A03 = productUntaggableReason.A04;
            r2.A0M(productUntaggableReason.A03);
            r2.A0P(fragmentActivity.getString(C0003R.string.f118ok), (DialogInterface.OnClickListener) null);
            if (shoppingHelpLinkWithText != null) {
                str = shoppingHelpLinkWithText.A00;
            }
            str = fragmentActivity.getString(C0003R.string.product_untaggable_help_link_title);
            r2.A0N(str, new C156306lv(this, product2, r11, fragmentActivity2, shoppingHelpLinkWithText));
            r2.A0U(true);
            r2.A03().show();
        }
    }

    public final void A1B(FragmentActivity fragmentActivity, AnonymousClass0C1 r14, String str, String str2, boolean z, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
        String str5 = str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0C1 r2 = r14;
        String str6 = str;
        A1C(fragmentActivity2, r2, str6, str5, z, arrayList, arrayList2, str3, (String) null, str4, (ArrayList) null);
    }

    public final void A1D(FragmentActivity fragmentActivity, AnonymousClass0C1 r10, String str, boolean z) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0C1 r3 = r10;
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("product_id", str);
            new C59032gv(r3, ModalActivity.class, "shopping_product_appeals", bundle, fragmentActivity2).A06(fragmentActivity);
            return;
        }
        C17510qM.A00.A0V();
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", str);
        C139165x9 r1 = new C139165x9(r10);
        r1.A03("com.instagram.shopping.product_appeals_entrypoint");
        r1.A05(hashMap);
        AnonymousClass1HD A02 = r1.A02();
        C52362Om r0 = new C52362Om(fragmentActivity, r10);
        r0.A02 = A02;
        r0.A02();
    }

    public final void A1H(FragmentActivity fragmentActivity, AnonymousClass0C1 r14, boolean z, String str, String str2, String str3, String str4, int i, AnonymousClass1HD r21, FragmentActivity fragmentActivity2, boolean z2, boolean z3, boolean z4, ProductSourceOverrideState productSourceOverrideState) {
        String str5 = str;
        boolean z5 = z;
        FragmentActivity fragmentActivity3 = fragmentActivity;
        AnonymousClass0C1 r1 = r14;
        boolean z6 = z2;
        C59032gv A002 = A00(fragmentActivity3, r1, z5, str5, str2, str3, str4, true, z6, z3, z4, productSourceOverrideState);
        int i2 = i;
        AnonymousClass1HD r12 = r21;
        if (r21 != null) {
            A002.A07(r12, i2);
            return;
        }
        FragmentActivity fragmentActivity4 = fragmentActivity2;
        if (fragmentActivity2 != null) {
            A002.A05(fragmentActivity4, i2);
            return;
        }
        throw new IllegalArgumentException("At least one of handlingFragment and handlingActivity should be not null!");
    }

    public final void A1I(FragmentActivity fragmentActivity, String str, AnonymousClass1NJ r14, AnonymousClass0C1 r15, Product product, boolean z) {
        AnonymousClass1NJ r8 = r14;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        Product product2 = product;
        AnonymousClass0C1 r2 = r15;
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            bundle.putString("media_id", r14.getId());
            bundle.putParcelable("product", product2);
            new C59032gv(r2, ModalActivity.class, "legacy_shopping_product_appeals", bundle, fragmentActivity2).A06(fragmentActivity);
            return;
        }
        C27341Hl r1 = new C160506t2(fragmentActivity2, product2, r8, new AnonymousClass4EG(C17510qM.A00.A0V(), str), r15).A00;
        C52362Om r0 = new C52362Om(fragmentActivity, r15);
        r0.A02 = r1;
        r0.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        if (r19 != false) goto L_0x000d;
     */
    public static C59032gv A00(FragmentActivity fragmentActivity, AnonymousClass0C1 r10, boolean z, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, ProductSourceOverrideState productSourceOverrideState) {
        boolean z6;
        String str5;
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        if (!z3 && !z4) {
            z6 = false;
        }
        z6 = true;
        AnonymousClass0a4.A09(z6);
        Bundle bundle = new Bundle();
        bundle.putString("prior_module_name", str);
        bundle.putBoolean("should_return_result", z2);
        bundle.putString("brand_selection_entry_point", str4);
        bundle.putString("waterfall_id", str3);
        bundle.putBoolean("show_brands_tab", z9);
        bundle.putBoolean("show_collections_tab", z8);
        bundle.putBoolean("show_catalogs_tab", z7);
        bundle.putParcelable("product_source_override_state", productSourceOverrideState);
        AnonymousClass0C1 r5 = r10;
        if (z3 || z4 || !z5) {
            if (z3 && !z4 && !z5) {
                str5 = "shopping_brand_selection";
            } else if (z3 || !z4 || z5) {
                str5 = "shopping_product_source_selection";
            } else {
                str5 = "shopping_collection_selection";
            }
            return new C59032gv(r5, ModalActivity.class, str5, bundle, fragmentActivity);
        }
        if (str2 != null) {
            bundle.putString("entry_point", str2);
        }
        if (str3 != null) {
            bundle.putString("waterfall_id", str3);
        }
        bundle.putBoolean("is_onboarding", z);
        return new C59032gv(r5, ModalActivity.class, "shopping_catalog_selection", bundle, fragmentActivity);
    }

    private void A02(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, AnonymousClass9SV r9) {
        AnonymousClass2TH r2 = new AnonymousClass2TH(r8);
        r2.A0L = fragmentActivity.getResources().getString(C0003R.string.shipping_and_returns_bottom_sheet_title);
        AnonymousClass2TI A002 = r2.A00();
        r9.A01 = new AnonymousClass9SY(this, r9, A002, r8, fragmentActivity);
        A002.A02(fragmentActivity, r9);
    }

    public final AnonymousClass395 A05(Context context, AnonymousClass0C1 r13, C13300iJ r14, String str, C27371Ho r16, String str2, String str3, ArrayList arrayList, FilterConfig filterConfig, String str4) {
        return new C159956s8(context, r13, r14, str, r16, str2, str3, arrayList, filterConfig, str4);
    }

    public final CNJ A06(AnonymousClass0C1 r7, C27371Ho r8, String str, String str2, String str3) {
        return new CNJ(r7, str, str2, str3, r8);
    }

    public final C219389cx A07(AnonymousClass0C1 r7, AnonymousClass0RN r8, String str, String str2, String str3) {
        return new C219389cx(r7, r8, str, str2, str3);
    }

    public final C122395Mj A08(AnonymousClass0C1 r2, AnonymousClass0RN r3) {
        return new C122395Mj(r2, r3);
    }

    public final C161206uG A09(Context context, AnonymousClass0C1 r9, PendingMedia pendingMedia, CreationSession creationSession, AnonymousClass1L8 r12, C161196uF r13) {
        return new C161206uG(context, r9, pendingMedia, creationSession, r12, r13);
    }

    public final AnonymousClass9QT A0A(AnonymousClass0C1 r2) {
        return new AnonymousClass9QT(r2);
    }

    public final AnonymousClass35Z A0B(FragmentActivity fragmentActivity, Context context, AnonymousClass0C1 r12, C27371Ho r13, String str, String str2, String str3) {
        return new AnonymousClass35Z(fragmentActivity, context, r12, r13, str, str2, str3, false);
    }

    public final AnonymousClass35Z A0C(FragmentActivity fragmentActivity, Context context, AnonymousClass0C1 r12, C27371Ho r13, String str, String str2, String str3, boolean z) {
        return new AnonymousClass35Z(fragmentActivity, context, r12, r13, str, str2, str3, z);
    }

    public final AnonymousClass8TL A0D(C27341Hl r7, AnonymousClass0C1 r8, String str, String str2, ProductItemWithAR productItemWithAR) {
        return new AnonymousClass8TL(r7, r8, str, str2, productItemWithAR);
    }

    public final C160266sd A0E(AnonymousClass1HD r9, AnonymousClass0C1 r10, String str, String str2, String str3, Product product, ProductArEffectMetadata productArEffectMetadata) {
        return new C160266sd(r9, r10, str, str2, str3, product, productArEffectMetadata);
    }

    public final C219109cV A0F(C27341Hl r7, AnonymousClass0C1 r8, String str, C26571Ea r10, C219309cp r11) {
        return new C219109cV(r7, r8, str, r10, r11);
    }

    public final AnonymousClass9ZQ A0G(AnonymousClass0C1 r8, Context context, AnonymousClass1L8 r10, AnonymousClass9R2 r11, String str, boolean z) {
        return new AnonymousClass9ZQ(r8, context, r10, r11, str, z);
    }

    public final C29021Oh A0H(C27341Hl r2, AnonymousClass0C1 r3, AnonymousClass1L8 r4, AnonymousClass1OE r5) {
        return new C29021Oh(r2, r3, r4, r5);
    }

    public final AnonymousClass7LH A0I(AnonymousClass0C1 r8, String str, String str2, boolean z, boolean z2, int i) {
        return new AnonymousClass7LH(r8, str, str2, z, z2, i);
    }

    public final CNE A0J(AnonymousClass0C1 r7, String str, String str2, C27671CMp cMp, boolean z) {
        return new CNE(r7, str, str2, cMp, z);
    }

    public final C26941Fw A0K(AnonymousClass0C1 r3) {
        Class<C26941Fw> cls = C26941Fw.class;
        C26941Fw r0 = (C26941Fw) r3.AV9(cls);
        if (r0 != null) {
            return r0;
        }
        C26941Fw r02 = new C26941Fw(r3);
        r3.BYi(cls, r02);
        return r02;
    }

    public final C53042Rg A0L(FragmentActivity fragmentActivity, AnonymousClass0C1 r3) {
        return new C53042Rg(fragmentActivity, r3);
    }

    public final C161956vd A0M(Context context, AnonymousClass1L8 r3, AnonymousClass0C1 r4) {
        return new C161956vd(context, r3, r4);
    }

    public final C215649Re A0O(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, String str, String str2, AnonymousClass9Q3 r11) {
        return new C215649Re(fragmentActivity, r8, str, str2, r11);
    }

    public final BBJ A0P(Context context, AnonymousClass1L8 r8, AnonymousClass0C1 r9, String str, BBO bbo) {
        return new BBJ(context, r8, r9, str, bbo);
    }

    public final C213969Km A0Q(FragmentActivity fragmentActivity, Product product, AnonymousClass0C1 r10, C27371Ho r11, String str, String str2) {
        return new C213969Km(fragmentActivity, product, r10, r11, str, str2);
    }

    public final C213969Km A0R(FragmentActivity fragmentActivity, String str, String str2, String str3, AnonymousClass0C1 r14, C27371Ho r15, String str4, String str5) {
        return new C213969Km(fragmentActivity, str, str2, str3, r14, r15, str4, str5);
    }

    public final AnonymousClass9FE A0S(FragmentActivity fragmentActivity, AnonymousClass0C1 r13, String str, C27371Ho r15, String str2, String str3, String str4, Merchant merchant) {
        Merchant merchant2 = merchant;
        return new AnonymousClass9FE(fragmentActivity, r13, str, r15, str2, str3, str4, merchant2.A02, merchant2.A03);
    }

    public final AnonymousClass9FE A0T(FragmentActivity fragmentActivity, AnonymousClass0C1 r12, String str, C27371Ho r14, String str2, String str3, String str4, C13300iJ r18) {
        return new AnonymousClass9FE(fragmentActivity, r12, str, r14, str2, str3, str4, r18.getId(), r18.AZn());
    }

    public final AnonymousClass9FE A0U(FragmentActivity fragmentActivity, AnonymousClass0C1 r12, String str, C27371Ho r14, String str2, String str3, String str4, String str5, String str6) {
        return new AnonymousClass9FE(fragmentActivity, r12, str, r14, str2, str3, str4, str5, str6);
    }

    public final C53802Uk A0V() {
        if (this.A00 == null) {
            this.A00 = new C53802Uk();
        }
        return this.A00;
    }

    public final C216629Vw A0W(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, C27371Ho r9, String str, String str2) {
        return new C216629Vw(fragmentActivity, r8, r9.getModuleName(), str, str2);
    }

    public final C216629Vw A0X(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, String str, String str2, String str3) {
        return new C216629Vw(fragmentActivity, r8, str, str2, str3);
    }

    public final C169807Nr A0Y() {
        if (this.A01 == null) {
            this.A01 = new C169807Nr();
        }
        return this.A01;
    }

    public final AnonymousClass6TY A0Z(FragmentActivity fragmentActivity, AnonymousClass0C1 r3) {
        return new AnonymousClass6TV(fragmentActivity, r3);
    }

    public final AnonymousClass39Z A0a(FragmentActivity fragmentActivity, AnonymousClass0C1 r9, String str, String str2, String str3, String str4) {
        return new AnonymousClass39Y(fragmentActivity, r9, str, str2, str3, str4);
    }

    public final C30361Tn A0b(AnonymousClass1HD r10, C27371Ho r11, AnonymousClass0C1 r12, String str, String str2, String str3, String str4, String str5) {
        return new AnonymousClass9QV(r10, r11, r12, str, str2, str3, str4, str5);
    }

    public final AnonymousClass5ET A0c(Context context, AnonymousClass0RN r10, AnonymousClass0C1 r11, C137125t6 r12, AnonymousClass1L8 r13, Reel reel, ViewStub viewStub) {
        return new AnonymousClass5ER(context, r10, r11, r12, r13, reel, viewStub);
    }

    public final C105204gU A0e(AnonymousClass0C1 r2) {
        return new C105204gU(r2);
    }

    public final C105454gt A0f(AnonymousClass0C1 r2) {
        return new C105454gt(r2);
    }

    public final AnonymousClass9J3 A0g(FragmentActivity fragmentActivity, AnonymousClass0C1 r3) {
        return new AnonymousClass9J3(fragmentActivity, r3);
    }

    public final void A0h(Activity activity, AnonymousClass0C1 r10) {
        C139165x9 r1 = new C139165x9(r10);
        r1.A03("com.instagram.shopping.screens.creator_onboarding_nux");
        r1.A04(activity.getString(C0003R.string.creator_education_nux_title));
        new C59032gv(r10, ModalActivity.class, "bloks", r1.A01(), activity).A06(activity);
    }

    public final void A0i(Activity activity, AnonymousClass0C1 r11, String str) {
        Bundle bundle = new Bundle();
        AnonymousClass0C1 r4 = r11;
        Activity activity2 = activity;
        if (((Boolean) AnonymousClass0L6.A02(r11, AnonymousClass0L7.SHOPPING_ANDROID_NEW_CREATOR_EDUCATION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            A0h(activity, r11);
            return;
        }
        bundle.putBoolean("is_standalone", true);
        bundle.putString("prior_module_name", str);
        new C59032gv(r4, ModalActivity.class, "shopping_creator_education_full_text", bundle, activity2).A06(activity);
    }

    public final void A0j(Context context, Product product, ProductGroup productGroup) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("product", product);
        bundle.putParcelable("product_group", productGroup);
        bundle.putString("bottom_sheet_content_fragment", "shopping_product_multi_variant_picker");
        bundle.putBoolean("finish_host_activity_on_dismissed", true);
        C59032gv.A03(TransparentModalActivity.class, "bottom_sheet", bundle, context);
    }

    public final void A0k(Context context, AnonymousClass0C1 r5) {
        C53742Uc r2 = new C53742Uc("https://help.instagram.com/398754794295670");
        r2.A03 = context.getResources().getString(C0003R.string.learn_more);
        SimpleWebViewActivity.A04(context, r5, r2.A00());
    }

    public final void A0l(Context context, AnonymousClass0C1 r7, ProductGroup productGroup, String str, boolean z) {
        String str2;
        Bundle bundle = new Bundle();
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r7, AnonymousClass0L7.SHOPPING_ANDROID_PRODUCT_TAGGING_FULL_VARIANT_SELECTION, "enabled", false, (AnonymousClass04H) null)).booleanValue();
        if (booleanValue) {
            str2 = "shopping_product_multi_variant_picker";
        } else {
            str2 = "shopping_product_variant_picker";
        }
        bundle.putString("bottom_sheet_content_fragment", str2);
        bundle.putParcelable("product_group", productGroup);
        bundle.putBoolean("finish_host_activity_on_dismissed", true);
        if (booleanValue) {
            bundle.putParcelable("product", (Parcelable) productGroup.A00().get(0));
        } else {
            bundle.putString("bottom_sheet_title", str);
            bundle.putBoolean("show_subtitle", z);
        }
        C59032gv.A03(TransparentModalActivity.class, "bottom_sheet", bundle, context);
    }

    public final void A0m(AnonymousClass1HD r8, AnonymousClass0C1 r9, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("prior_module_name", str);
        new C59032gv(r9, ModalActivity.class, "shopping_creator_education_nux", bundle, r8.getActivity()).A07(r8, 4);
    }

    public final void A0n(AnonymousClass1HD r8, AnonymousClass0C1 r9, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("waterfall_id", str);
        bundle.putString("prior_module_name", str2);
        new C59032gv(r9, ModalActivity.class, "shopping_shop_management_add_collection", bundle, r8.requireActivity()).A07(r8, 10);
    }

    public final void A0o(AnonymousClass1HD r8, AnonymousClass0C1 r9, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("waterfall_id", str);
        bundle.putString("prior_module_name", str2);
        new C59032gv(r9, ModalActivity.class, "shopping_shop_management_add_product", bundle, r8.requireActivity()).A07(r8, 10);
    }

    public final void A0p(AnonymousClass1HD r8, AnonymousClass0C1 r9, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("waterfall_id", str);
        bundle.putString("prior_module_name", str2);
        new C59032gv(r9, ModalActivity.class, "shopping_shop_management_edit", bundle, r8.requireActivity()).A07(r8, 9);
    }

    public final void A0s(FragmentActivity fragmentActivity, C27371Ho r18, AnonymousClass0C1 r19, AnonymousClass1NJ r20, C36841ih r21) {
        AnonymousClass1NJ r3 = r20;
        AnonymousClass0a4.A06(r3.A0w());
        boolean z = true;
        boolean z2 = false;
        if (r3.A0w().size() == 1) {
            z2 = true;
        }
        AnonymousClass0a4.A09(z2);
        AnonymousClass0C1 r14 = r19;
        AnonymousClass1NJ A0Q = r3.A0Q(r14);
        AnonymousClass0RU A012 = AnonymousClass0WN.A01(r14);
        String A002 = AnonymousClass9FK.A00(Constants.A0C);
        String A003 = AnonymousClass9PT.A00(Constants.ONE);
        C36841ih r5 = r21;
        C37111j8 r13 = new C37111j8(r14, A0Q, r5);
        if (Constants.A0C != r5.A04(r5.AHt()).A00) {
            z = false;
        }
        r13.A02 = Boolean.valueOf(z);
        C27371Ho r8 = r18;
        C36901in.A07(A012, A0Q, r8, A002, A003, (String) null, (String) null, r13, r14, (String) null);
        C213969Km A0Q2 = C17510qM.A00.A0Q(fragmentActivity, ((ProductTag) r3.A0w().get(0)).A01, r14, r8, "pill_button", (String) null);
        A0Q2.A09 = r8.getModuleName();
        A0Q2.A02 = A0Q;
        A0Q2.A08 = null;
        A0Q2.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0123, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0, p000X.AnonymousClass0L7.SHOPPING_TAGS_BAG_ENTRYPOINT, "is_enabled", false, r10)).booleanValue() == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ea, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r0, p000X.AnonymousClass0L7.SHOPPING_TAGS_BAG_ENTRYPOINT, "is_enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x01ec;
     */
    public final void A0t(FragmentActivity fragmentActivity, C27371Ho r25, AnonymousClass0C1 r26, AnonymousClass1NJ r27, C36841ih r28, String str, C38691lg r30) {
        AnonymousClass04H r10;
        boolean z;
        boolean z2;
        AnonymousClass1NJ r3 = r27;
        AnonymousClass0a4.A06(r3.A0w());
        boolean z3 = true;
        AnonymousClass0a4.A09(!r3.A0w().isEmpty());
        AnonymousClass0C1 r0 = r26;
        AnonymousClass2TH r1 = new AnonymousClass2TH(r0);
        r1.A0T = !r3.A1j(r0);
        r1.A0H = r30;
        r1.A0W = ((Boolean) AnonymousClass0L6.A00(r0, AnonymousClass0L7.BOTTOM_SHEET_LOG_NAV_EXPERIMENTS, "log_nav_on_opening_shopping_more_products", false, (AnonymousClass04H) null)).booleanValue();
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.SHOPPING_FEED_HALF_SHEET_UPDATES, "full_screen_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            r1.A00 = 1.0f;
        } else {
            r1.A02(fragmentActivity2, C0003R.dimen.shopping_bottomsheet_initial_dp_height);
        }
        AnonymousClass1NJ A0Q = r3.A0Q(r0);
        String str2 = str;
        C27371Ho r14 = r25;
        C36841ih r9 = r28;
        if (A0Q.Aho()) {
            r10 = null;
            Integer num = Constants.ZERO;
            C37141jB A02 = C37591ju.A02("tap_view_tags_list", r14);
            A02.A0B(r0, r3);
            A02.A4E = null;
            A02.A3Q = "tag_indicator_pivot";
            A02.A2w = AnonymousClass9PT.A00(num);
            A02.A3W = AnonymousClass9FK.A00(num);
            AnonymousClass9FJ.A01(r0, A02, r3, r14);
            AnonymousClass0RU A012 = AnonymousClass0WN.A01(r0);
            Integer num2 = Constants.A0C;
            String A002 = AnonymousClass9FK.A00(num2);
            String A003 = AnonymousClass9PT.A00(num2);
            C37111j8 r7 = new C37111j8(r0, A0Q, r9);
            Integer num3 = Constants.A0C;
            if (num3 != r9.A04(r9.AHt()).A00) {
                z3 = false;
            }
            r7.A02 = Boolean.valueOf(z3);
            C36901in.A07(A012, A0Q, r14, A002, A003, (String) null, (String) null, r7, r0, (String) null);
            C215669Rg.A00(r0).A01("Open more products page", r14, r0, AnonymousClass9FK.A00(num3), r3);
        } else {
            r10 = null;
            C37141jB A03 = C37591ju.A03(C37591ju.A04("tap_view_tags_list", false), r14);
            A03.A0B(r0, r3);
            A03.A4E = null;
            A03.A3Q = "tag_indicator_pivot";
            if (str != null) {
                C06270Ok A004 = C06270Ok.A00();
                A004.A09("shopping_session_id", str2);
                A03.A07(A004);
            }
            C36901in.A06(AnonymousClass0WN.A01(r0), A03, Constants.ZERO);
        }
        if (r3.A1O()) {
            A0V();
            Bundle bundle = new Bundle();
            bundle.putString("media_id", r3.getId());
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
            bundle.putString("prior_module_name", r14.getModuleName());
            bundle.putString("shopping_session_id", str2);
            CIJ cij = new CIJ();
            cij.setArguments(bundle);
            if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, r10)).booleanValue()) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                Integer A06 = C222609iI.A00(r0).A06();
                r1.A0L = ShoppingMoreProductsFragment.A00(fragmentActivity2, r3);
                A01(fragmentActivity2, r0, r14, r1, A06, str2);
            }
            r1.A0F = cij;
            AnonymousClass2TI A005 = r1.A00();
            if (z2) {
                cij.A05 = new CIN(this, fragmentActivity2, r0, r14, A005, str2);
            }
            A005.A02(fragmentActivity2, cij);
            return;
        }
        AnonymousClass1NJ r8 = r3;
        ShoppingMoreProductsFragment shoppingMoreProductsFragment = (ShoppingMoreProductsFragment) A0V().A03(r0, r14, r3, str2);
        if (r3.A1f()) {
            r1.A00 = 1.0f;
        }
        String str3 = r3.A22;
        boolean z4 = !AnonymousClass1BX.A00(str3);
        if (z4) {
            r1.A0N = str3;
            r1.A0S = true;
            r1.A0A = new AnonymousClass6GY(this, r0, shoppingMoreProductsFragment, shoppingMoreProductsFragment, r3, r9);
        }
        if (((Boolean) AnonymousClass0L6.A02(r0, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            z = true;
        }
        z = false;
        if (z) {
            A01(fragmentActivity2, r0, r14, r1, C222609iI.A00(r0).A06(), str2);
        }
        r1.A0F = shoppingMoreProductsFragment;
        r1.A0L = ShoppingMoreProductsFragment.A00(fragmentActivity2, r8);
        AnonymousClass2TI A006 = r1.A00();
        A006.A0E(z4);
        shoppingMoreProductsFragment.A03 = new C220289eS(this, A006, z, fragmentActivity2, r0, r14, str2);
        A006.A02(fragmentActivity2, shoppingMoreProductsFragment);
    }

    public final void A0u(FragmentActivity fragmentActivity, C27371Ho r7, AnonymousClass0C1 r8, String str, AnonymousClass1NJ r10, C36841ih r11, C38691lg r12) {
        AnonymousClass2TH r3 = new AnonymousClass2TH(r8);
        r3.A0T = true;
        r3.A02(fragmentActivity, C0003R.dimen.shopping_bottomsheet_initial_dp_height);
        r3.A0H = r12;
        A0V();
        AnonymousClass9EK r2 = new AnonymousClass9EK();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("products", r10.A0x());
        bundle.putString("media_id", r10.getId());
        bundle.putString("prior_module_name", r7.getModuleName());
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r8.getToken());
        bundle.putString("shopping_session_id", str);
        r2.setArguments(bundle);
        r3.A0F = r2;
        r3.A0L = fragmentActivity.getResources().getString(C0003R.string.shopping_product_upsell_all_products_in_media_bottom_sheet_title);
        r3.A00().A02(fragmentActivity, r2);
    }

    public final void A0v(FragmentActivity fragmentActivity, AnonymousClass0C1 r4) {
        C52362Om r1 = new C52362Om(fragmentActivity, r4);
        r1.A02 = new C1658575i();
        r1.A02();
    }

    public final void A0w(FragmentActivity fragmentActivity, AnonymousClass0C1 r7) {
        C25826Baa baa = new C25826Baa();
        AnonymousClass2TH r2 = new AnonymousClass2TH(r7);
        r2.A0L = fragmentActivity.getResources().getString(C0003R.string.purchase_protection_header);
        r2.A0F = baa;
        AnonymousClass2TI A002 = r2.A00();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        baa.setArguments(bundle);
        A002.A02(fragmentActivity, baa);
    }

    public final void A0z(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, IgFundedIncentive igFundedIncentive) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        bundle.putParcelableArrayList("details", new ArrayList(Collections.unmodifiableList(igFundedIncentive.A05)));
        C112074s0 r2 = new C112074s0();
        r2.setArguments(bundle);
        AnonymousClass2TH r1 = new AnonymousClass2TH(r6);
        r1.A0L = igFundedIncentive.A04;
        r1.A0F = r2;
        r1.A00().A02(fragmentActivity, r2);
    }

    public final void A11(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, ShippingAndReturnsInfo shippingAndReturnsInfo) {
        C17510qM.A00.A0V();
        AnonymousClass9SV r3 = new AnonymousClass9SV();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shipping_and_returns_info", shippingAndReturnsInfo);
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        r3.setArguments(bundle);
        A02(fragmentActivity, r6, r3);
    }

    public final void A12(FragmentActivity fragmentActivity, AnonymousClass0C1 r8, String str) {
        Bundle bundle = new Bundle();
        C05230Is.A00(r8, bundle);
        bundle.putString("prior_module_name", str);
        new C59032gv(r8, ModalActivity.class, "shopping_influencer_merchant_education", bundle, fragmentActivity).A06(fragmentActivity);
    }

    public final void A13(FragmentActivity fragmentActivity, AnonymousClass0C1 r11, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("prior_module", str);
        C139165x9 r1 = new C139165x9(r11);
        r1.A03("com.instagram.shopping.screens.mini_shop_seller_education");
        r1.A05(hashMap);
        new C59032gv(r11, ModalActivity.class, "bloks", r1.A01(), fragmentActivity).A06(fragmentActivity);
    }

    public final void A14(FragmentActivity fragmentActivity, AnonymousClass0C1 r10, String str, ProductCollectionLink productCollectionLink) {
        AnonymousClass9Q3 r7;
        String str2;
        ShoppingDestinationMetadata shoppingDestinationMetadata = productCollectionLink.A00;
        if (shoppingDestinationMetadata != null && shoppingDestinationMetadata.A01 != null) {
            r7 = AnonymousClass9Q3.INCENTIVE;
        } else if (shoppingDestinationMetadata == null || shoppingDestinationMetadata.A00 == null) {
            throw new UnsupportedOperationException(AnonymousClass000.A0E("Unsupported shopping swipe-up link: ", productCollectionLink.A02));
        } else {
            r7 = AnonymousClass9Q3.PRODUCT_COLLECTION;
        }
        C215649Re A0O = C17510qM.A00.A0O(fragmentActivity, r10, (String) null, str, r7);
        A0O.A0D = "shopping_swipe_up";
        A0O.A0I = true;
        switch (r7.ordinal()) {
            case 5:
                ProductCollectionLinkMetadata productCollectionLinkMetadata = productCollectionLink.A00.A00;
                AnonymousClass0a4.A06(productCollectionLinkMetadata);
                A0O.A0G = productCollectionLink.A01;
                A0O.A0B = productCollectionLinkMetadata.A02;
                String str3 = productCollectionLinkMetadata.A03;
                C215709Rk A002 = C215709Rk.A00(productCollectionLinkMetadata.A01);
                A0O.A0E = str3;
                A0O.A04 = A002;
                break;
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                ShoppingIncentiveMetadata shoppingIncentiveMetadata = productCollectionLink.A00.A01;
                AnonymousClass0a4.A06(shoppingIncentiveMetadata);
                C13300iJ A02 = C13510ie.A00(r10).A02(shoppingIncentiveMetadata.A01);
                if (A02 != null) {
                    str2 = A02.AZn();
                } else {
                    str2 = productCollectionLink.A01;
                }
                A0O.A0G = str2;
                A0O.A0B = shoppingIncentiveMetadata.A01;
                A0O.A09 = shoppingIncentiveMetadata.A00;
                break;
            default:
                throw new UnsupportedOperationException("Unsupported shopping swipe-up destination type: " + r7);
        }
        A0O.A00();
    }

    public final void A15(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, String str, String str2) {
        C17510qM.A00.A0V();
        AnonymousClass9SV r3 = new AnonymousClass9SV();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        bundle.putString("product_id", str);
        bundle.putString("merchant_id", str2);
        r3.setArguments(bundle);
        A02(fragmentActivity, r6, r3);
    }

    public final void A16(FragmentActivity fragmentActivity, AnonymousClass0C1 r4, String str, String str2, String str3, String str4) {
        C52362Om r1 = new C52362Om(fragmentActivity, r4);
        r1.A02 = A0V().A09(str, str2, str3, str4);
        r1.A02();
    }

    public final void A17(FragmentActivity fragmentActivity, AnonymousClass0C1 r18, String str, String str2, String str3, String str4, AnonymousClass9EJ r23) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass9YY r8 = new AnonymousClass9YY(fragmentActivity2, r18, str, str2, str3, str4, r23);
        Bundle bundle = new Bundle();
        bundle.putString(TraceFieldType.BroadcastId, r8.A04);
        bundle.putString("shopping_session_id", r8.A07);
        bundle.putString("prior_module_name", r8.A06);
        AnonymousClass9YX r4 = new AnonymousClass9YX();
        r4.setArguments(bundle);
        r4.BgF(r8.A03);
        Boolean bool = (Boolean) AnonymousClass0L6.A02(r8.A02, AnonymousClass0L7.SHOPPING_BAG, "is_enabled", false, (AnonymousClass04H) null);
        C13150hy.A01(bool, "isShoppingBagEnabled");
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            C218319bB r1 = new C218319bB(r8, r4);
            C13150hy.A02(r1, "listener");
            r4.A01 = r1;
        }
        AnonymousClass2TH r5 = new AnonymousClass2TH(r8.A02);
        r5.A0L = r8.A01.getString(C0003R.string.live_viewer_product_feed_title, new Object[]{r8.A05});
        r5.A08 = 1;
        r5.A0T = true;
        r5.A00 = 0.66f;
        r5.A0P = false;
        if (booleanValue) {
            Integer A06 = C222609iI.A00(r8.A02).A06();
            if (A06 == null) {
                A06 = 0;
            }
            C13150hy.A01(A06, "ShoppingBagEntryPointUti…emCount(userSession) ?: 0");
            int intValue = A06.intValue();
            r5.A03(String.valueOf(intValue), new C217889aT(r8, r4), C945046v.A00(r8.A01, intValue));
        }
        r5.A0F = r4;
        r8.A00 = r5.A00().A02(r8.A01, r4);
    }

    public final void A19(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        C52362Om r3 = new C52362Om(fragmentActivity, r6);
        r3.A0B = true;
        C17510qM.A00.A0V();
        ShoppingReconsiderationDestinationFragment shoppingReconsiderationDestinationFragment = new ShoppingReconsiderationDestinationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("prior_module_name", str);
        bundle.putString("prior_submodule_name", str2);
        bundle.putString("shopping_session_id", str3);
        bundle.putBoolean("is_checkout_only", z);
        bundle.putString("merchant_id", str4);
        bundle.putString("merchant_username", str5);
        bundle.putString("surface_title", str6);
        bundle.putString("media_id", str7);
        shoppingReconsiderationDestinationFragment.setArguments(bundle);
        r3.A02 = shoppingReconsiderationDestinationFragment;
        r3.A02();
    }

    public final void A1A(FragmentActivity fragmentActivity, AnonymousClass0C1 r4, String str, String str2, boolean z) {
        C52362Om r1 = new C52362Om(fragmentActivity, r4);
        if (z) {
            r1.A0B = true;
        }
        r1.A02 = A0V().A08(str, str2);
        r1.A02();
    }

    public final void A1C(FragmentActivity fragmentActivity, AnonymousClass0C1 r10, String str, String str2, boolean z, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5, ArrayList arrayList3) {
        AnonymousClass0C1 r3 = r10;
        CNE A0J = A0J(r3, str, str2, C27671CMp.A01, z);
        A0J.A04 = arrayList;
        A0J.A03 = arrayList2;
        A0J.A00 = str3;
        A0J.A01 = str4;
        A0J.A02 = str5;
        A0J.A05 = arrayList3;
        AnonymousClass1HD A002 = A0J.A00();
        C52362Om r1 = new C52362Om(fragmentActivity, r10);
        r1.A0B = true;
        r1.A02 = A002;
        r1.A02();
    }

    public final void A1E(FragmentActivity fragmentActivity, AnonymousClass0C1 r12, List list) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass0C1 r5 = r12;
        C13510ie A002 = C13510ie.A00(r12);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C13300iJ r1 = (C13300iJ) it.next();
            A002.A01(r1, false);
            arrayList.add(r1.getId());
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("user_ids", arrayList);
        new C59032gv(r5, ModalActivity.class, "shopping_home_onboarding_profile_selection", bundle, fragmentActivity).A06(fragmentActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r4, p000X.AnonymousClass0L7.SHOPPING_ANDROID_SFC_CATALOG_SEGMENTS_PRODUCT_TAGGING, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0021;
     */
    public final void A1F(FragmentActivity fragmentActivity, AnonymousClass0C1 r17, boolean z, String str, String str2, String str3) {
        boolean z2;
        AnonymousClass0C1 r4 = r17;
        boolean A0T = r4.A06.A0T();
        if (A0T) {
            z2 = true;
        }
        z2 = false;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str4 = str2;
        A00(fragmentActivity2, r4, z, str, str4, str3, (String) null, false, A0T, z2, C52952Qw.A0E(r4), (ProductSourceOverrideState) null).A06(fragmentActivity2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (((java.lang.Boolean) p000X.AnonymousClass0L6.A02(r4, p000X.AnonymousClass0L7.SHOPPING_ANDROID_SFC_CATALOG_SEGMENTS_PRODUCT_TAGGING, "enabled", false, (p000X.AnonymousClass04H) null)).booleanValue() == false) goto L_0x0021;
     */
    public final void A1G(FragmentActivity fragmentActivity, AnonymousClass0C1 r19, boolean z, String str, String str2, String str3, int i, AnonymousClass1HD r25, FragmentActivity fragmentActivity2) {
        boolean z2;
        AnonymousClass0C1 r4 = r19;
        boolean A0T = r4.A06.A0T();
        if (A0T) {
            z2 = true;
        }
        z2 = false;
        String str4 = str2;
        String str5 = str;
        FragmentActivity fragmentActivity3 = fragmentActivity;
        int i2 = i;
        boolean z3 = z;
        A1H(fragmentActivity3, r4, z3, str5, str4, str3, (String) null, i2, r25, fragmentActivity2, A0T, z2, C52952Qw.A0E(r4), (ProductSourceOverrideState) null);
    }

    public final void A1J(FragmentActivity fragmentActivity, String str, AnonymousClass0C1 r13, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap) {
        Bundle bundle = new Bundle();
        bundle.putString("shopping_session_id", str2);
        bundle.putString("prior_module_name", str3);
        bundle.putString("merchant_id", str);
        bundle.putString("entry_point", str4);
        bundle.putString("logging_token", str5);
        String str11 = str6;
        if (str6 != null) {
            bundle.putString("tracking_token", str11);
        }
        String str12 = str7;
        if (str7 != null) {
            bundle.putString("global_bag_entry_point", str12);
        }
        String str13 = str8;
        if (str8 != null) {
            bundle.putString("global_bag_prior_module", str13);
        }
        String str14 = str10;
        if (str10 != null) {
            bundle.putString("product_id_to_animate", str14);
        }
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            bundle.putSerializable("referenced_products", hashMap2);
        }
        bundle.putString("checkout_session_id", str9);
        bundle.putBoolean("is_modal", true);
        C59032gv r4 = new C59032gv(r13, ModalActivity.class, "merchant_shopping_bag", bundle, fragmentActivity);
        r4.A0A = new int[]{C0003R.anim.right_in, C0003R.anim.left_out, C0003R.anim.left_in, C0003R.anim.right_out};
        r4.A06(fragmentActivity);
    }

    public final void A1K(AnonymousClass0C1 r5, Context context, AnonymousClass1AM r7, ProductGroup productGroup, C213689Jh r9, String str, boolean z) {
        C213659Je r1 = new C213659Je(r9);
        AnonymousClass2TH r0 = new AnonymousClass2TH(r5);
        r0.A0L = str;
        AnonymousClass2TI A002 = r0.A00();
        C213649Jd r2 = new C213649Jd(this, r1, A002);
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRAS_PRODUCT_GROUP", productGroup);
        bundle.putBoolean("extra_show_subtitle", z);
        AnonymousClass9JZ r02 = new AnonymousClass9JZ();
        r02.A05 = r2;
        r02.setArguments(bundle);
        A002.A01(context, r02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void A1L(AnonymousClass0C1 r8, AnonymousClass1HD r9, String str, String str2, boolean z, String str3, String str4) {
        Activity activity;
        Bundle bundle = new Bundle();
        AnonymousClass0C1 r2 = r8;
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r8.getToken());
        bundle.putBoolean("is_transparent_modal_mode", true);
        bundle.putString("prior_module_name", str);
        bundle.putString("prior_submodule_name", str2);
        bundle.putBoolean("can_tag_from_brands", z);
        bundle.putString("tagged_business_partner", str3);
        bundle.putString("tagged_merchant_id", str4);
        try {
            activity = r9.getActivity();
        } catch (ClassCastException unused) {
            Object host = r9.getHost();
            activity = null;
            if (host instanceof Activity) {
                activity = host;
            }
        }
        if (activity != null) {
            new C59032gv(r2, TransparentModalActivity.class, "shopping_tagging_product_picker", bundle, activity).A07(r9, 3);
        }
    }

    public final void A1M(AnonymousClass0C1 r7, FragmentActivity fragmentActivity, String str, String str2, ImageUrl imageUrl, String str3, C28681Mr r13, AnonymousClass1NJ r14) {
        C52362Om r3 = new C52362Om(fragmentActivity, r7);
        r3.A0B = true;
        A0V();
        C148826Yc r5 = new C148826Yc();
        Bundle bundle = new Bundle();
        bundle.putString("shopping_session_id", str);
        bundle.putString("displayed_username", str2);
        bundle.putParcelable("profile_image_url", imageUrl);
        bundle.putString("displayed_user_id", str3);
        if (r13.A07) {
            bundle.putString("next_max_id", r13.AQs());
        }
        List<AnonymousClass1NJ> list = r13.A06;
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1NJ id : list) {
            arrayList.add(id.getId());
        }
        bundle.putStringArrayList("media_ids", arrayList);
        if (r14 != null) {
            bundle.putString("selected_media_id", r14.getId());
        }
        r5.setArguments(bundle);
        r3.A02 = r5;
        r3.A02();
    }

    public final void A1N(AnonymousClass0C1 r7, C13300iJ r8, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("signup_nav_bar_title", str);
        bundle.putString("entry_point", str3);
        bundle.putString("waterfall_id", str4);
        bundle.putString("prior_module", str2);
        bundle.putInt("signup_perf_logging_id", i);
        new C59032gv(r7, ModalActivity.class, "shopping_in_app_signup", bundle, fragmentActivity).A06(fragmentActivity);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0167, code lost:
        if (r1 == p000X.AnonymousClass230.A04) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r9.equals("shopping_swipe_up") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r9.equals("product_sticker") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (r9.equals("tags") != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (r9.equals("product_mention") == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        if (r9.equals("shopping_swipe_up") == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cb, code lost:
        if (r9.equals("product_sticker") == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r9.equals("tags") != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if (r9.equals("product_mention") == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r6.A00.A07 == p000X.AnonymousClass230.A02) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[RETURN] */
    public final boolean A1O(FragmentActivity fragmentActivity, C27371Ho r24, AnonymousClass0C1 r25, AnonymousClass1NJ r26, ProductMention productMention, boolean z, Product product, String str, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34Y r33) {
        Integer num;
        C34151eA r0;
        boolean z2;
        boolean z3;
        ProductCollectionReviewStatus productCollectionReviewStatus;
        ProductCollectionLinkMetadata productCollectionLinkMetadata;
        ProductCollectionReviewStatus productCollectionReviewStatus2;
        ProductCollectionLinkMetadata productCollectionLinkMetadata2;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        List list;
        AnonymousClass0C1 r13 = r25;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C27371Ho r12 = r24;
        String str4 = str;
        Product product2 = product;
        AnonymousClass3FC r10 = new AnonymousClass3FC(fragmentActivity2, r12, r13, z, r26, productMention, product2, str4, onShowListener, onDismissListener, r33);
        Product product3 = r10.A09;
        if (product3 == null || (str3 = r10.A0D) == null) {
            AnonymousClass1NJ r2 = r10.A07;
            if (r2 == null || !r2.A3U) {
                if (product3 != null) {
                    AnonymousClass230 r1 = product3.A07;
                    if (r1 == AnonymousClass230.REJECTED) {
                        num = Constants.A07;
                    } else if (r1 == AnonymousClass230.PENDING) {
                        num = Constants.A08;
                    }
                    if (num != Constants.ZERO) {
                        return false;
                    }
                    int intValue = num.intValue();
                    switch (intValue) {
                        case 1:
                        case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                            i = C0003R.string.product_in_review_dialog_title;
                            i3 = C0003R.string.product_in_review_dialog_message;
                            break;
                        case 2:
                            i = C0003R.string.product_rejected_dialog_title;
                            i3 = C0003R.string.product_rejected_dialog_message;
                            i2 = C0003R.string.product_rejected_dialog_remove_tag;
                            break;
                        case 3:
                            i = C0003R.string.product_in_review_dialog_title;
                            i3 = C0003R.string.reel_product_sticker_product_pending_message;
                            break;
                        case 4:
                            i = C0003R.string.product_rejected_dialog_title;
                            i3 = C0003R.string.reel_product_sticker_product_rejected_message;
                            i2 = C0003R.string.product_rejected_dialog_remove_sticker;
                            break;
                        case 5:
                            i = C0003R.string.reel_product_sticker_text_rejected_title;
                            i3 = C0003R.string.reel_product_sticker_text_rejected_message;
                            i2 = C0003R.string.product_rejected_dialog_remove_sticker;
                            break;
                        case 6:
                            i = C0003R.string.product_in_review_dialog_title;
                            i3 = C0003R.string.reel_linked_product_pending_message;
                            break;
                        case 7:
                            i = C0003R.string.product_rejected_dialog_title;
                            i3 = C0003R.string.reel_linked_product_rejected_message;
                            break;
                        case 8:
                            i = C0003R.string.reel_linked_product_collection_pending_title;
                            i3 = C0003R.string.reel_linked_product_collection_pending_message;
                            break;
                        case 9:
                            i = C0003R.string.reel_linked_product_collection_rejected_title;
                            i3 = C0003R.string.reel_linked_product_collection_rejected_message;
                            break;
                        case 10:
                            i = C0003R.string.reel_products_unapproved_title;
                            i3 = C0003R.string.reel_products_unapproved_message;
                            break;
                        case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                            i = C0003R.string.reel_products_and_collection_unapproved_title;
                            i3 = C0003R.string.reel_products_and_collection_unapproved_message;
                            break;
                        case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                            i = C0003R.string.product_mention_text_rejected_title;
                            i3 = C0003R.string.product_mention_text_rejected_message;
                            break;
                        case C120125Dh.VIEW_TYPE_LINK /*14*/:
                            i = C0003R.string.product_rejected_dialog_title;
                            i3 = C0003R.string.mentioned_product_rejected_message;
                            break;
                        case 15:
                            i = C0003R.string.generic_rejected_product_dialog_title;
                            i3 = C0003R.string.generic_rejected_product_dialog_message;
                            break;
                        case 16:
                            i = C0003R.string.generic_pending_product_dialog_title;
                            i3 = C0003R.string.generic_pending_product_dialog_message;
                            break;
                        default:
                            if (num != null) {
                                switch (intValue) {
                                    case 1:
                                        str2 = "TAGGED_PRODUCT_PENDING";
                                        break;
                                    case 2:
                                        str2 = "TAGGED_PRODUCT_REJECTED";
                                        break;
                                    case 3:
                                        str2 = "STICKER_PRODUCT_PENDING";
                                        break;
                                    case 4:
                                        str2 = "STICKER_PRODUCT_REJECTED";
                                        break;
                                    case 5:
                                        str2 = "STICKER_TEXT_REJECTED";
                                        break;
                                    case 6:
                                        str2 = "LINKED_PRODUCT_PENDING";
                                        break;
                                    case 7:
                                        str2 = "LINKED_PRODUCT_REJECTED";
                                        break;
                                    case 8:
                                        str2 = "LINKED_PRODUCT_COLLECTION_PENDING";
                                        break;
                                    case 9:
                                        str2 = "LINKED_PRODUCT_COLLECTION_REJECTED";
                                        break;
                                    case 10:
                                        str2 = "STORY_PRODUCTS_UNAPPROVED";
                                        break;
                                    case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                                        str2 = "STORY_PRODUCT_AND_COLLECTION_UNAPPROVED";
                                        break;
                                    case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                                        str2 = "PRODUCT_MENTION_TEXT_REJECTED";
                                        break;
                                    case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                                        str2 = "MENTIONED_PRODUCT_PENDING";
                                        break;
                                    case C120125Dh.VIEW_TYPE_LINK /*14*/:
                                        str2 = "MENTIONED_PRODUCT_REJECTED";
                                        break;
                                    case 15:
                                        str2 = "GENERIC_REJECTED";
                                        break;
                                    case 16:
                                        str2 = "GENERIC_PENDING";
                                        break;
                                    default:
                                        str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                        break;
                                }
                            } else {
                                str2 = "null";
                            }
                            throw new UnsupportedOperationException(AnonymousClass000.A0E("Unsupported dialog type: ", str2));
                    }
                    i2 = -1;
                    AnonymousClass2OA r22 = new AnonymousClass2OA(r10.A06);
                    r22.A07(i);
                    r22.A06(i3);
                    r22.A0D(C0003R.string.f118ok, r10.A01, Constants.ONE);
                    r22.A09(C0003R.string.default_link_text, r10.A02);
                    AnonymousClass1NJ r14 = r10.A07;
                    if (!(r14 == null || i2 == -1)) {
                        AnonymousClass0a4.A06(r14);
                        Product product4 = r10.A09;
                        if (product4 == null) {
                            List A18 = r14.A18(C34181eD.PRODUCT);
                            AnonymousClass0a4.A06(A18);
                            product4 = ((C34151eA) A18.get(0)).A03();
                        }
                        r10.A00 = new C160526t4(r10.A06, product4, r10.A07, r10.A08, r10.A0C, r10.A0B);
                        r22.A0B(i2, r10.A03, Constants.A0N);
                    }
                    Dialog A03 = r22.A03();
                    A03.setOnShowListener(r10.A05);
                    A03.setOnDismissListener(r10.A04);
                    A03.show();
                    return true;
                }
                num = Constants.ZERO;
                if (num != Constants.ZERO) {
                }
            } else {
                List A182 = r2.A18(C34181eD.PRODUCT);
                boolean z4 = false;
                if (AnonymousClass0OX.A00(A182)) {
                    r0 = null;
                } else {
                    r0 = (C34151eA) A182.get(0);
                }
                ReelProductLink A0a = r2.A0a();
                ProductCollectionLink A0Y = r2.A0Y();
                if (r0 == null || (r0.A03().A07 == AnonymousClass230.APPROVED && r0.A05() == C173377aw.APPROVED)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (A0a != null) {
                    z3 = true;
                }
                z3 = false;
                if (A0Y != null) {
                    ShoppingDestinationMetadata shoppingDestinationMetadata = A0Y.A00;
                    if (shoppingDestinationMetadata == null || (productCollectionLinkMetadata2 = shoppingDestinationMetadata.A00) == null) {
                        productCollectionReviewStatus2 = null;
                    } else {
                        productCollectionReviewStatus2 = productCollectionLinkMetadata2.A00;
                    }
                    if (!(productCollectionReviewStatus2 == null || productCollectionReviewStatus2 == ProductCollectionReviewStatus.APPROVED)) {
                        z4 = true;
                    }
                }
                if (z2 && z3) {
                    num = Constants.A02;
                    if (num != Constants.ZERO) {
                    }
                } else if (!z2 || !z4) {
                    if (!z2) {
                        if (!z3) {
                            if (z4) {
                                ShoppingDestinationMetadata shoppingDestinationMetadata2 = A0Y.A00;
                                if (shoppingDestinationMetadata2 == null || (productCollectionLinkMetadata = shoppingDestinationMetadata2.A00) == null) {
                                    productCollectionReviewStatus = null;
                                } else {
                                    productCollectionReviewStatus = productCollectionLinkMetadata.A00;
                                }
                                AnonymousClass0a4.A06(productCollectionReviewStatus);
                                switch (productCollectionReviewStatus.ordinal()) {
                                    case 1:
                                        num = Constants.A14;
                                        break;
                                    case 2:
                                        num = Constants.A15;
                                        break;
                                }
                            }
                        } else {
                            AnonymousClass0a4.A06(A0a);
                            switch (A0a.A00.A07.ordinal()) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                            }
                        }
                    } else {
                        AnonymousClass0a4.A06(r0);
                        if (r0.A05() != C173377aw.REJECTED) {
                            AnonymousClass230 r15 = r0.A03().A07;
                            if (r15 != AnonymousClass230.PENDING) {
                            }
                            num = Constants.A0N;
                            if (num != Constants.ZERO) {
                            }
                        }
                    }
                    num = Constants.ZERO;
                    if (num != Constants.ZERO) {
                    }
                } else {
                    num = Constants.A03;
                    if (num != Constants.ZERO) {
                    }
                }
            }
        } else {
            AnonymousClass0a4.A06(product3);
            AnonymousClass0a4.A06(str3);
            AnonymousClass1NJ r16 = r10.A07;
            ProductMention productMention2 = r10.A0A;
            AnonymousClass230 r8 = product3.A07;
            if (r8 == AnonymousClass230.APPROVED) {
                if (r16 != null) {
                    list = r16.A18(C34181eD.PRODUCT);
                } else {
                    list = null;
                }
                if (AnonymousClass0OX.A00(list) || ((C34151eA) list.get(0)).A05() != C173377aw.REJECTED) {
                    if (productMention2 != null && productMention2.A03 == C173377aw.REJECTED) {
                        num = Constants.A04;
                        if (num != Constants.ZERO) {
                        }
                    }
                    num = Constants.ZERO;
                    if (num != Constants.ZERO) {
                    }
                }
            } else {
                char c = 3;
                if (r8 == AnonymousClass230.REJECTED) {
                    switch (str3.hashCode()) {
                        case -904252774:
                            c = 2;
                            break;
                        case 3552281:
                            break;
                        case 550116845:
                            c = 0;
                            break;
                        case 1809155767:
                            c = 1;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 0) {
                        if (c != 1) {
                            if (c != 2) {
                                num = Constants.A0C;
                            } else {
                                num = Constants.A06;
                            }
                        }
                        num = Constants.A12;
                    }
                    num = Constants.A0Y;
                } else {
                    if (r8 == AnonymousClass230.PENDING) {
                        switch (str3.hashCode()) {
                            case -904252774:
                                c = 2;
                                break;
                            case 3552281:
                                break;
                            case 550116845:
                                c = 0;
                                break;
                            case 1809155767:
                                c = 1;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c != 0) {
                            if (c != 1) {
                                if (c != 2) {
                                    num = Constants.ONE;
                                } else {
                                    num = Constants.A05;
                                }
                            }
                            num = Constants.A0u;
                        }
                        num = Constants.A0N;
                    }
                    num = Constants.ZERO;
                }
                if (num != Constants.ZERO) {
                }
            }
        }
        num = Constants.A0j;
        if (num != Constants.ZERO) {
        }
    }

    public static final void A03(FragmentActivity fragmentActivity, AnonymousClass0C1 r7, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("entry_point", "tags");
        bundle.putString("prior_module_name", str2);
        bundle.putString("shopping_session_id", str);
        bundle.putString("tracking_token", (String) null);
        new C59032gv(r7, ModalActivity.class, "shopping_bag", bundle, fragmentActivity).A06(fragmentActivity.getApplicationContext());
    }

    public static void A04(C17500qL r10, FragmentActivity fragmentActivity, AnonymousClass0C1 r12, C27371Ho r13, AnonymousClass2TI r14, int i, String str) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        r14.A0B(Integer.toString(i), new AnonymousClass6HV(r10, fragmentActivity2, r12, str, r13), fragmentActivity2.getResources().getQuantityString(C0003R.plurals.shopping_bag_count, i, new Object[]{Integer.valueOf(i)}));
    }

    public final C161956vd A0N(Context context, AnonymousClass1L8 r3, AnonymousClass0C1 r4, C161986vg r5) {
        C161956vd A0M = A0M(context, r3, r4);
        A0M.A00 = r5;
        return A0M;
    }

    public final C122315Mb A0d(AnonymousClass0C1 r3) {
        C13150hy.A02(r3, "userSession");
        C06570Po A012 = r3.AVA(C122315Mb.class, new C122345Me(r3));
        C13150hy.A01(A012, "userSession.getScopedCla…tory(userSession)\n      }");
        return (C122315Mb) A012;
    }

    public final void A0q(FragmentActivity fragmentActivity, AnonymousClass1HD r6, AnonymousClass0C1 r7, ReelMoreOptionsModel reelMoreOptionsModel) {
        A0V();
        AnonymousClass4Yx r3 = new AnonymousClass4Yx();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        bundle.putParcelable("MORE_OPTIONS_MODEL", reelMoreOptionsModel);
        r3.setArguments(bundle);
        C52362Om r1 = new C52362Om(fragmentActivity, r7);
        r1.A02 = r3;
        r1.A07(r6, 6);
        r1.A02();
    }

    public final void A0r(FragmentActivity fragmentActivity, AnonymousClass1HD r6, AnonymousClass0C1 r7, String str, String str2, String str3, String str4, String str5) {
        A0V();
        CQ8 cq8 = new CQ8();
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r7.getToken());
        bundle.putString("prior_module", str);
        bundle.putString("TAGGED_MERCHANT_ID", str2);
        bundle.putString("TAGGED_MERCHANT_USERNAME", str3);
        bundle.putString("TAGGED_BUSINESS_PARTNER_ID", str4);
        bundle.putString("TAGGED_BUSINESS_PARTNER_USERNAME", str5);
        cq8.setArguments(bundle);
        C52362Om r1 = new C52362Om(fragmentActivity, r7);
        r1.A02 = cq8;
        r1.A07(r6, 11);
        r1.A02();
    }

    public final void A0x(FragmentActivity fragmentActivity, AnonymousClass0C1 r18, C52912Qs r19, ExploreTopicCluster exploreTopicCluster, ShoppingDestinationTypeModel shoppingDestinationTypeModel, String str, Refinement refinement, String str2, String str3) {
        C52362Om r1;
        AnonymousClass1HD A02;
        String str4 = str2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        String str5 = str3;
        AnonymousClass0C1 r12 = r18;
        Refinement refinement2 = refinement;
        if (C137235tI.A00().booleanValue() || !C140425zQ.A00(r12).booleanValue()) {
            String str6 = str;
            ExploreTopicCluster exploreTopicCluster2 = exploreTopicCluster;
            C52912Qs r2 = r19;
            if (((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.SHOPPING_EXPLORE_DEPRECATION_NON_US, "move_to_topic_cluster", false, (AnonymousClass04H) null)).booleanValue()) {
                r1 = new C52362Om(fragmentActivity2, r12);
                r1.A0B = true;
                C22080xo.A00().A02();
                A02 = C68802zv.A00(exploreTopicCluster2, refinement2, str6);
            } else {
                r1 = new C52362Om(fragmentActivity2, r12);
                r1.A0B = true;
                A02 = C17510qM.A00.A0V().A02(exploreTopicCluster2, shoppingDestinationTypeModel, refinement2, str6, str4, str5);
            }
            r1.A02 = A02;
            r1.A03 = r2;
            r1.A02();
            return;
        }
        C216629Vw r10 = new C216629Vw(fragmentActivity2, r12, str4, (String) null, str5);
        r10.A01 = refinement2;
        r10.A01();
    }

    public final void A10(FragmentActivity fragmentActivity, AnonymousClass0C1 r6, C27286C7a c7a) {
        A0V();
        C27722COq cOq = new C27722COq();
        cOq.A04 = c7a;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r6.getToken());
        cOq.setArguments(bundle);
        C52362Om r1 = new C52362Om(fragmentActivity, r6);
        r1.A0B = true;
        r1.A02 = cOq;
        r1.A02();
    }

    public final void A18(FragmentActivity fragmentActivity, AnonymousClass0C1 r18, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        String str9 = str7;
        AnonymousClass0C1 r12 = r18;
        String str10 = str8;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (C137235tI.A00().booleanValue() || !C140425zQ.A00(r12).booleanValue()) {
            String str11 = str4;
            String str12 = str6;
            ExploreTopicCluster exploreTopicCluster = new ExploreTopicCluster(str11, str12, str5, C40181oE.SHOPPING);
            String str13 = str;
            ShoppingDestinationTypeModel shoppingDestinationTypeModel = new ShoppingDestinationTypeModel(str13, str2, C216699We.A00(str3));
            String uuid = UUID.randomUUID().toString();
            C52362Om r1 = new C52362Om(fragmentActivity2, r12);
            r1.A0B = true;
            r1.A02 = C17510qM.A00.A0V().A02(exploreTopicCluster, shoppingDestinationTypeModel, (Refinement) null, uuid, str9, str10);
            r1.A02();
            return;
        }
        new C216629Vw(fragmentActivity2, r12, str9, (String) null, str10).A01();
    }
}
