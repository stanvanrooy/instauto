package p000X;

import android.text.TextUtils;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Map;

/* renamed from: X.B06 */
public final class B06 {
    public static B08 A00(AnonymousClass0C1 r4, AutofillData autofillData) {
        B08 b08 = new B08();
        if (autofillData != null) {
            B07 b07 = new B07();
            Map A01 = autofillData.A01();
            b07.A07 = (String) A01.get("given-name");
            b07.A06 = (String) A01.get("family-name");
            b07.A02 = (String) A01.get("address-line1");
            b07.A03 = (String) A01.get("address-line2");
            b07.A00 = (String) A01.get("address-level1");
            b07.A01 = (String) A01.get("address-level2");
            b07.A08 = (String) A01.get("postal-code");
            b07.A04 = (String) A01.get("country");
            b07.A05 = (String) A01.get(IgReactPurchaseExperienceBridgeModule.EMAIL);
            b07.A09 = (String) A01.get("tel");
            b08.A00 = b07;
        }
        B0A b0a = new B0A();
        b08.A01 = b0a;
        b0a.A00 = AnonymousClass1BD.A00(r4);
        return b08;
    }

    public static void A01(C17850qu r2) {
        C05700Lp.A00().ADc(new C25071Az9(r2));
    }

    public static void A02(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
