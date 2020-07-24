package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.B0F */
public enum B0F {
    ;

    public String A00(AutofillData autofillData) {
        Map A012;
        String str;
        if (this instanceof B0E) {
            A012 = autofillData.A01();
            str = "tel";
        } else if (this instanceof B0I) {
            A012 = autofillData.A01();
            str = IgReactPurchaseExperienceBridgeModule.EMAIL;
        } else if (this instanceof B0C) {
            ArrayList arrayList = new ArrayList();
            String str2 = (String) autofillData.A01().get("address-level2");
            if (str2 != null) {
                arrayList.add(str2);
            }
            ArrayList arrayList2 = new ArrayList();
            String str3 = (String) autofillData.A01().get("address-level1");
            if (str3 != null) {
                arrayList2.add(str3);
            }
            String str4 = (String) autofillData.A01().get("postal-code");
            if (str4 != null) {
                arrayList2.add(str4);
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(TextUtils.join(" ", arrayList2));
            }
            if (!arrayList.isEmpty()) {
                return TextUtils.join(", ", arrayList);
            }
            return null;
        } else if (!(this instanceof B0D)) {
            A012 = autofillData.A01();
            str = "name";
        } else {
            String str5 = (String) autofillData.A01().get("address-line1");
            if (str5 == null) {
                return null;
            }
            String str6 = (String) autofillData.A01().get("address-line2");
            return str6 != null ? AnonymousClass000.A0J(str5, " ", str6) : str5;
        }
        return (String) A012.get(str);
    }

    public String A01(AutofillData autofillData, Context context) {
        Resources resources;
        int i;
        if (this instanceof B0E) {
            resources = context.getResources();
            i = C0003R.string.__external__tel;
        } else if (this instanceof B0I) {
            resources = context.getResources();
            i = C0003R.string.__external__email;
        } else if ((this instanceof B0C) || (this instanceof B0D)) {
            resources = context.getResources();
            i = C0003R.string.__external__address_line_1;
        } else {
            resources = context.getResources();
            i = C0003R.string.__external__name;
        }
        return resources.getString(i);
    }
}
