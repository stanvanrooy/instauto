package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.CS5 */
public final class CS5 implements View.OnClickListener {
    public final /* synthetic */ CSA A00;

    public CS5(CSA csa) {
        this.A00 = csa;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-427845891);
        CSA csa = this.A00;
        csa.A00.A04();
        AnonymousClass5EO r2 = new AnonymousClass5EO(csa.A01, csa.requireContext());
        r2.A02(C0003R.string.shop_management_add_products, new C27810CSc(csa));
        r2.A02(C0003R.string.shop_management_add_collections, new CS7(csa));
        r2.A00().A00(csa.requireContext());
        AnonymousClass0Z0.A0C(400649823, A05);
    }
}
