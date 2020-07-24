package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0rt  reason: invalid class name and case insensitive filesystem */
public final class C18460rt extends C18470ru {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0161, code lost:
        if (r3.equals("start_website_report") != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x016d, code lost:
        if (r3.equals("shopping_product_variant_picker") == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0179, code lost:
        if (r3.equals("value_picker") == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0185, code lost:
        if (r3.equals("shopping_product_multi_variant_picker") == false) goto L_0x002c;
     */
    public final void A00(AnonymousClass0C1 r18, FragmentActivity fragmentActivity, Bundle bundle) {
        String str;
        C13300iJ A0c;
        AnonymousClass2TI A00;
        AnonymousClass7KI r0;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("bottom_sheet_content_fragment");
        if (string != null) {
            AnonymousClass0C1 r13 = r18;
            AnonymousClass2TH r1 = new AnonymousClass2TH(r13);
            r1.A0L = bundle2.getString("bottom_sheet_title");
            char c = 0;
            r1.A0R = bundle2.getBoolean("finish_host_activity_on_dismissed", false);
            switch (string.hashCode()) {
                case -409684267:
                    break;
                case 184574863:
                    c = 1;
                    break;
                case 724050716:
                    c = 3;
                    break;
                case 1682498069:
                    c = 2;
                    break;
                default:
                    c = 65535;
                    break;
            }
            FragmentActivity fragmentActivity2 = fragmentActivity;
            if (c == 0) {
                AnonymousClass1NJ A02 = AnonymousClass1PZ.A00(r13).A02(bundle2.getString("media_id"));
                if (A02 == null || !A02.Aho()) {
                    str = "PLACEHOLDER";
                } else {
                    str = C30671Ut.A02(r13, A02);
                }
                if (A02 == null) {
                    A0c = null;
                } else {
                    A0c = A02.A0c(r13);
                }
                String string2 = bundle2.getString(IgReactNavigatorModule.URL);
                String string3 = bundle2.getString("initial_url");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IgReactNavigatorModule.URL, string2);
                } catch (JSONException unused) {
                }
                AnonymousClass2WV r12 = new AnonymousClass2WV(bundle2.getBundle("tracking"));
                C25072AzA azA = new C25072AzA(this, r12);
                A00 = r1.A00();
                C22200y0.A00.A01();
                String moduleName = azA.getModuleName();
                C146056Mg r7 = C146056Mg.CHEVRON_BUTTON;
                AnonymousClass6MW r14 = AnonymousClass6MW.IN_APP_BROWSER;
                AnonymousClass6MX r02 = AnonymousClass6MX.AD;
                C25023AyH ayH = new C25023AyH(this, r12, r13, azA, string2, string3);
                String jSONObject2 = jSONObject.toString();
                CJH cjh = new CJH();
                cjh.A02 = r13;
                cjh.A03 = A0c;
                cjh.A09 = str;
                cjh.A0B = moduleName;
                cjh.A07 = ayH;
                cjh.A04 = r7;
                cjh.A05 = r14;
                cjh.A06 = r02;
                cjh.A0C = false;
                cjh.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                cjh.A01 = A00;
                cjh.A0A = jSONObject2;
                r0 = cjh.A00();
            } else if (c == 1) {
                ProductGroup productGroup = (ProductGroup) bundle2.getParcelable("product_group");
                if (productGroup != null) {
                    boolean z = bundle2.getBoolean("show_subtitle");
                    A00 = r1.A00();
                    C17510qM.A00.A0V();
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("EXTRAS_PRODUCT_GROUP", productGroup);
                    bundle3.putBoolean("extra_show_subtitle", z);
                    bundle3.putBoolean("extra_is_modal", true);
                    AnonymousClass1HD r03 = new AnonymousClass9JZ();
                    r03.setArguments(bundle3);
                    r0 = r03;
                } else {
                    return;
                }
            } else if (c == 2) {
                ProductGroup productGroup2 = (ProductGroup) bundle2.getParcelable("product_group");
                A00 = r1.A00();
                AnonymousClass9J3 A0g = C17510qM.A00.A0g(fragmentActivity2, r13);
                AnonymousClass9KG r3 = new AnonymousClass9KG(new AnonymousClass9KF((Product) bundle2.getParcelable("product")));
                if (productGroup2 != null) {
                    AnonymousClass9JE r2 = A0g.A04;
                    r2.A00 = productGroup2;
                    r2.A01 = new HashSet(productGroup2.A00());
                    r2.A02.clear();
                }
                A0g.A01 = true;
                A0g.A00 = A00;
                r0 = AnonymousClass9J3.A00(A0g, r3, (AnonymousClass9JW) null);
            } else if (c == 3) {
                AnonymousClass7KI r04 = new AnonymousClass7KI();
                r04.setArguments(bundle2.getBundle(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS));
                r1.A0F = r04;
                A00 = r1.A00();
                r0 = r04;
            } else {
                throw new IllegalStateException("No valid bottom sheet content fragment specified");
            }
            A00.A02(fragmentActivity2, r0);
            return;
        }
        throw new IllegalStateException("No bottom sheet content fragment specified");
    }
}
