package p000X;

import com.instagram.model.shopping.Product;

/* renamed from: X.CN9 */
public final class CN9 implements CS3 {
    public final /* synthetic */ CP8 A00;

    public CN9(CP8 cp8) {
        this.A00 = cp8;
    }

    public final void BFz(Product product, C27702CNw cNw) {
        if (!product.A0C()) {
            CNC cnc = this.A00.A02;
            C17510qM.A00.A0y(cnc.A00.requireActivity(), cnc.A00.A02, product);
            return;
        }
        this.A00.A02.A00(product, cNw);
    }
}
