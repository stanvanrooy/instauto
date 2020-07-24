package p000X;

import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.widget.TagsInteractiveLayout;

/* renamed from: X.CPU */
public final class CPU implements AnonymousClass8TQ {
    public final /* synthetic */ Product A00;
    public final /* synthetic */ TaggingActivity A01;
    public final /* synthetic */ TagsInteractiveLayout A02;

    public final void BPc(ProductGroup productGroup) {
        ProductGroup productGroup2 = productGroup;
        if (productGroup == null || productGroup.A01().isEmpty()) {
            TaggingActivity taggingActivity = this.A01;
            Product product = this.A00;
            TagsInteractiveLayout.A01(this.A02, product, false);
            TaggingActivity.A0D(taggingActivity, product);
            return;
        }
        C17510qM r5 = C17510qM.A00;
        TaggingActivity taggingActivity2 = this.A01;
        r5.A1K(taggingActivity2.A03, taggingActivity2, taggingActivity2.A05(), productGroup2, new C27740CPj(this), taggingActivity2.getResources().getString(C0003R.string.choose_default_variant, new Object[]{((ProductVariantDimension) productGroup.A01().get(0)).A03}), false);
    }

    public CPU(TaggingActivity taggingActivity, Product product, TagsInteractiveLayout tagsInteractiveLayout) {
        this.A01 = taggingActivity;
        this.A00 = product;
        this.A02 = tagsInteractiveLayout;
    }

    public final void B3k() {
        this.A02.AET();
    }
}
