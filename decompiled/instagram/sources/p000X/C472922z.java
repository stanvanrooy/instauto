package p000X;

import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductTag;

/* renamed from: X.22z  reason: invalid class name and case insensitive filesystem */
public final class C472922z {
    public static ProductTag parseFromJson(C13080hr r3) {
        ProductTag productTag = new ProductTag(new Product());
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("product".equals(A0i)) {
                productTag.A01 = C44861wt.parseFromJson(r3);
            } else if ("hide_tag".equals(A0i)) {
                productTag.A00 = r3.A0I();
            } else {
                AnonymousClass1XY.A00(productTag, A0i, r3);
            }
            r3.A0f();
        }
        return productTag;
    }
}
