package p000X;

import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.shopping.Product;

/* renamed from: X.0uj  reason: invalid class name and case insensitive filesystem */
public final class C20210uj extends C19410tR implements C19460tW {
    public static final C17120pi A02 = new C20220uk();
    public DirectForwardingParams A00;
    public AnonymousClass4JU A01;

    public final String A01() {
        return "send_product_share_message";
    }

    public final C58022fB A03() {
        return C58022fB.SHOPPING_PRODUCT;
    }

    public final /* bridge */ /* synthetic */ Object A04() {
        return this.A01;
    }

    public final DirectForwardingParams AM6() {
        return this.A00;
    }

    public C20210uj() {
    }

    public C20210uj(AnonymousClass3LQ r7, DirectThreadKey directThreadKey, Product product, Long l, long j, DirectForwardingParams directForwardingParams) {
        super(r7, directThreadKey, l, j);
        this.A01 = new AnonymousClass4JU(product);
        this.A00 = directForwardingParams;
    }
}
