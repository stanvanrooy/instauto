package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;

/* renamed from: X.CN8 */
public final class CN8 implements CS4 {
    public final /* synthetic */ CP8 A00;

    public CN8(CP8 cp8) {
        this.A00 = cp8;
    }

    public final void BFy(View view, ProductGroup productGroup, C27702CNw cNw) {
        CNB cnb = this.A00.A02.A00;
        cnb.A01.A04();
        Context context = cnb.getContext();
        AnonymousClass0a4.A06(context);
        Resources resources = context.getResources();
        ProductGroup productGroup2 = productGroup;
        if (((Boolean) AnonymousClass0L6.A02(cnb.A02, AnonymousClass0L7.SHOPPING_ANDROID_PRODUCT_TAGGING_FULL_VARIANT_SELECTION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            cnb.A09.A04(new AnonymousClass9KG(new AnonymousClass9KF((Product) productGroup.A00().get(0))), new CN6(cnb, productGroup, cNw, resources));
        } else {
            C17510qM.A00.A1K(cnb.A02, cnb.getContext(), cnb.mFragmentManager, productGroup2, new CN7(cnb, productGroup, cNw), resources.getString(C0003R.string.choose_default_variant, new Object[]{((ProductVariantDimension) productGroup.A01().get(0)).A03}), false);
        }
        C06220Of.A0E(cnb.mView);
    }
}
