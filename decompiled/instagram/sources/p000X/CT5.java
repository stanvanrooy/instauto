package p000X;

import android.content.DialogInterface;
import com.instagram.model.shopping.Product;

/* renamed from: X.CT5 */
public final class CT5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Product A00;
    public final /* synthetic */ CSA A01;
    public final /* synthetic */ C27702CNw A02;

    public CT5(CSA csa, Product product, C27702CNw cNw) {
        this.A01 = csa;
        this.A00 = product;
        this.A02 = cNw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A01.A06.A01(this.A00, this.A02, true);
    }
}
