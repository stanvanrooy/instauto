package p000X;

import com.facebook.react.modules.dialog.DialogModule;
import org.json.JSONObject;

/* renamed from: X.AP5 */
public final class AP5 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final String toString() {
        return AnonymousClass000.A0E("SkuDetails:", this.A02);
    }

    public AP5(String str) {
        this.A02 = str;
        JSONObject jSONObject = new JSONObject(str);
        this.A01 = jSONObject.optString("productId");
        jSONObject.optString("type");
        this.A00 = jSONObject.optString("price");
        jSONObject.optLong("price_amount_micros");
        jSONObject.optString("price_currency_code");
        jSONObject.optString(DialogModule.KEY_TITLE);
        jSONObject.optString("description");
        jSONObject.optString("freeTrialPeriod");
    }
}
