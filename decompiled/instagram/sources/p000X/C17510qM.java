package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.base.CreationSession;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.discovery.refinement.model.Refinement;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ShoppingDestinationTypeModel;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.shopping.model.ShippingAndReturnsInfo;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0qM  reason: invalid class name and case insensitive filesystem */
public abstract class C17510qM {
    public static C17510qM A00;

    public abstract AnonymousClass395 A05(Context context, AnonymousClass0C1 r2, C13300iJ r3, String str, C27371Ho r5, String str2, String str3, ArrayList arrayList, FilterConfig filterConfig, String str4);

    public abstract CNJ A06(AnonymousClass0C1 r1, C27371Ho r2, String str, String str2, String str3);

    public abstract C219389cx A07(AnonymousClass0C1 r1, AnonymousClass0RN r2, String str, String str2, String str3);

    public abstract C122395Mj A08(AnonymousClass0C1 r1, AnonymousClass0RN r2);

    public abstract C161206uG A09(Context context, AnonymousClass0C1 r2, PendingMedia pendingMedia, CreationSession creationSession, AnonymousClass1L8 r5, C161196uF r6);

    public abstract AnonymousClass9QT A0A(AnonymousClass0C1 r1);

    public abstract AnonymousClass35Z A0B(FragmentActivity fragmentActivity, Context context, AnonymousClass0C1 r3, C27371Ho r4, String str, String str2, String str3);

    public abstract AnonymousClass35Z A0C(FragmentActivity fragmentActivity, Context context, AnonymousClass0C1 r3, C27371Ho r4, String str, String str2, String str3, boolean z);

    public abstract AnonymousClass8TL A0D(C27341Hl r1, AnonymousClass0C1 r2, String str, String str2, ProductItemWithAR productItemWithAR);

    public abstract C160266sd A0E(AnonymousClass1HD r1, AnonymousClass0C1 r2, String str, String str2, String str3, Product product, ProductArEffectMetadata productArEffectMetadata);

    public abstract C219109cV A0F(C27341Hl r1, AnonymousClass0C1 r2, String str, C26571Ea r4, C219309cp r5);

    public abstract AnonymousClass9ZQ A0G(AnonymousClass0C1 r1, Context context, AnonymousClass1L8 r3, AnonymousClass9R2 r4, String str, boolean z);

    public abstract C29021Oh A0H(C27341Hl r1, AnonymousClass0C1 r2, AnonymousClass1L8 r3, AnonymousClass1OE r4);

    public abstract AnonymousClass7LH A0I(AnonymousClass0C1 r1, String str, String str2, boolean z, boolean z2, int i);

    public abstract CNE A0J(AnonymousClass0C1 r1, String str, String str2, C27671CMp cMp, boolean z);

    public abstract C26941Fw A0K(AnonymousClass0C1 r1);

    public abstract C53042Rg A0L(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract C161956vd A0M(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3);

    public abstract C161956vd A0N(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, C161986vg r4);

    public abstract C215649Re A0O(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, AnonymousClass9Q3 r5);

    public abstract BBJ A0P(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, String str, BBO bbo);

    public abstract C213969Km A0Q(FragmentActivity fragmentActivity, Product product, AnonymousClass0C1 r3, C27371Ho r4, String str, String str2);

    public abstract C213969Km A0R(FragmentActivity fragmentActivity, String str, String str2, String str3, AnonymousClass0C1 r5, C27371Ho r6, String str4, String str5);

    public abstract AnonymousClass9FE A0S(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, C27371Ho r4, String str2, String str3, String str4, Merchant merchant);

    public abstract AnonymousClass9FE A0T(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, C27371Ho r4, String str2, String str3, String str4, C13300iJ r8);

    public abstract AnonymousClass9FE A0U(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, C27371Ho r4, String str2, String str3, String str4, String str5, String str6);

    public abstract C53802Uk A0V();

    public abstract C216629Vw A0W(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, C27371Ho r3, String str, String str2);

    public abstract C216629Vw A0X(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3);

    public abstract C169807Nr A0Y();

    public abstract AnonymousClass6TY A0Z(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract AnonymousClass39Z A0a(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3, String str4);

    public abstract C30361Tn A0b(AnonymousClass1HD r1, C27371Ho r2, AnonymousClass0C1 r3, String str, String str2, String str3, String str4, String str5);

    public abstract AnonymousClass5ET A0c(Context context, AnonymousClass0RN r2, AnonymousClass0C1 r3, C137125t6 r4, AnonymousClass1L8 r5, Reel reel, ViewStub viewStub);

    public abstract C122315Mb A0d(AnonymousClass0C1 r1);

    public abstract C105204gU A0e(AnonymousClass0C1 r1);

    public abstract C105454gt A0f(AnonymousClass0C1 r1);

    public abstract AnonymousClass9J3 A0g(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract void A0h(Activity activity, AnonymousClass0C1 r2);

    public abstract void A0i(Activity activity, AnonymousClass0C1 r2, String str);

    public abstract void A0j(Context context, Product product, ProductGroup productGroup);

    public abstract void A0k(Context context, AnonymousClass0C1 r2);

    public abstract void A0l(Context context, AnonymousClass0C1 r2, ProductGroup productGroup, String str, boolean z);

    public abstract void A0m(AnonymousClass1HD r1, AnonymousClass0C1 r2, String str);

    public abstract void A0n(AnonymousClass1HD r1, AnonymousClass0C1 r2, String str, String str2);

    public abstract void A0o(AnonymousClass1HD r1, AnonymousClass0C1 r2, String str, String str2);

    public abstract void A0p(AnonymousClass1HD r1, AnonymousClass0C1 r2, String str, String str2);

    public abstract void A0q(FragmentActivity fragmentActivity, AnonymousClass1HD r2, AnonymousClass0C1 r3, ReelMoreOptionsModel reelMoreOptionsModel);

    public abstract void A0r(FragmentActivity fragmentActivity, AnonymousClass1HD r2, AnonymousClass0C1 r3, String str, String str2, String str3, String str4, String str5);

    public abstract void A0s(FragmentActivity fragmentActivity, C27371Ho r2, AnonymousClass0C1 r3, AnonymousClass1NJ r4, C36841ih r5);

    public abstract void A0t(FragmentActivity fragmentActivity, C27371Ho r2, AnonymousClass0C1 r3, AnonymousClass1NJ r4, C36841ih r5, String str, C38691lg r7);

    public abstract void A0u(FragmentActivity fragmentActivity, C27371Ho r2, AnonymousClass0C1 r3, String str, AnonymousClass1NJ r5, C36841ih r6, C38691lg r7);

    public abstract void A0v(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract void A0w(FragmentActivity fragmentActivity, AnonymousClass0C1 r2);

    public abstract void A0x(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, C52912Qs r3, ExploreTopicCluster exploreTopicCluster, ShoppingDestinationTypeModel shoppingDestinationTypeModel, String str, Refinement refinement, String str2, String str3);

    public abstract void A0y(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, Product product);

    public abstract void A0z(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, IgFundedIncentive igFundedIncentive);

    public abstract void A10(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, C27286C7a c7a);

    public abstract void A11(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, ShippingAndReturnsInfo shippingAndReturnsInfo);

    public abstract void A12(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str);

    public abstract void A13(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str);

    public abstract void A14(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, ProductCollectionLink productCollectionLink);

    public abstract void A15(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2);

    public abstract void A16(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3, String str4);

    public abstract void A17(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3, String str4, AnonymousClass9EJ r7);

    public abstract void A18(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public abstract void A19(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7);

    public abstract void A1A(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, boolean z);

    public abstract void A1B(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, boolean z, ArrayList arrayList, ArrayList arrayList2, String str3, String str4);

    public abstract void A1C(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, String str2, boolean z, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5, ArrayList arrayList3);

    public abstract void A1D(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, String str, boolean z);

    public abstract void A1E(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, List list);

    public abstract void A1F(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, boolean z, String str, String str2, String str3);

    public abstract void A1G(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, boolean z, String str, String str2, String str3, int i, AnonymousClass1HD r8, FragmentActivity fragmentActivity2);

    public abstract void A1H(FragmentActivity fragmentActivity, AnonymousClass0C1 r2, boolean z, String str, String str2, String str3, String str4, int i, AnonymousClass1HD r9, FragmentActivity fragmentActivity2, boolean z2, boolean z3, boolean z4, ProductSourceOverrideState productSourceOverrideState);

    public abstract void A1I(FragmentActivity fragmentActivity, String str, AnonymousClass1NJ r3, AnonymousClass0C1 r4, Product product, boolean z);

    public abstract void A1J(FragmentActivity fragmentActivity, String str, AnonymousClass0C1 r3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HashMap hashMap);

    public abstract void A1K(AnonymousClass0C1 r1, Context context, AnonymousClass1AM r3, ProductGroup productGroup, C213689Jh r5, String str, boolean z);

    public abstract void A1L(AnonymousClass0C1 r1, AnonymousClass1HD r2, String str, String str2, boolean z, String str3, String str4);

    public abstract void A1M(AnonymousClass0C1 r1, FragmentActivity fragmentActivity, String str, String str2, ImageUrl imageUrl, String str3, C28681Mr r7, AnonymousClass1NJ r8);

    public abstract void A1N(AnonymousClass0C1 r1, C13300iJ r2, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, int i);

    public abstract boolean A1O(FragmentActivity fragmentActivity, C27371Ho r2, AnonymousClass0C1 r3, AnonymousClass1NJ r4, ProductMention productMention, boolean z, Product product, String str, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, AnonymousClass34Y r11);
}
