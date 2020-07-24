package p000X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ASG */
public final class ASG implements C23544AQo {
    public final /* synthetic */ ASC A00;

    public final void onFailure() {
    }

    public ASG(ASC asc) {
        this.A00 = asc;
    }

    public final void BJq(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("text_and_dom");
                String string2 = jSONObject.getString("text_only");
                String string3 = jSONObject.getString("dom_only");
                ASD asd = this.A00.A05;
                asd.A03 = string;
                asd.A05 = string2;
                asd.A04 = string3;
            } catch (JSONException unused) {
            }
        }
    }
}
