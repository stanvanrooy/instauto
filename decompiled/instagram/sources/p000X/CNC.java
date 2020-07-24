package p000X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.CNC */
public final class CNC {
    public final /* synthetic */ CNB A00;

    public CNC(CNB cnb) {
        this.A00 = cnb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        if ("recently added".equalsIgnoreCase(r11.A01) == false) goto L_0x004e;
     */
    public final void A00(Product product, C27702CNw cNw) {
        String str;
        boolean z;
        C23300zv A002 = C23300zv.A00(this.A00.A02);
        CNB cnb = this.A00;
        A002.BXT(new CNR(cnb.A07, cnb.A0D, product));
        CNB cnb2 = this.A00;
        cnb2.A04.A02(product, cNw, cnb2.A08.A00);
        CNB cnb3 = this.A00;
        ProductSource productSource = cnb3.A08.A00;
        CNN cnn = cnb3.A05;
        if (productSource == null || (str = productSource.A01) == null) {
            str = "-1";
        }
        String id = product.getId();
        int i = cnb3.A00;
        boolean z2 = false;
        if (i > 0) {
            z2 = true;
        }
        if (!"product_list_header".equalsIgnoreCase(cNw.A03)) {
            z = true;
        }
        z = false;
        CNP cnp = new CNP(cnn.A00.A02("instagram_recently_added_product_tag_results"));
        if (cnp.A0B()) {
            cnp.A08("catalog_id", str);
            cnp.A04("has_recently_added_section", Boolean.valueOf(z2));
            cnp.A04("has_clicked_on_recently_added", Boolean.valueOf(z));
            cnp.A07("num_recently_added", Long.valueOf((long) i));
            cnp.A08("prior_module", cnn.A02);
            cnp.A08("a_pk", cnn.A01.A04());
            cnp.A08("pk", id);
            cnp.A01();
        }
        CNB cnb4 = this.A00;
        if (cnb4.A0H) {
            FragmentActivity activity = cnb4.getActivity();
            AnonymousClass0a4.A06(activity);
            Intent intent = new Intent();
            intent.putExtra("selected_product", product);
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        cnb4.A0I = false;
        FragmentActivity activity2 = cnb4.getActivity();
        AnonymousClass0a4.A06(activity2);
        activity2.onBackPressed();
    }
}
