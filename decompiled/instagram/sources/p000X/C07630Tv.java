package p000X;

import android.text.TextUtils;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public abstract class C07630Tv {
    public final List A00 = new LinkedList();

    public abstract C07650Tx A00();

    public abstract void A01();

    public abstract void A02();

    public final synchronized void A03(JSONObject jSONObject) {
        for (C07640Tw r2 : this.A00) {
            try {
                String AQS = r2.AQS();
                if (!TextUtils.isEmpty(AQS)) {
                    jSONObject.put("host_name_v6", AQS);
                }
                String AFr = r2.AFr();
                if (!TextUtils.isEmpty(AFr)) {
                    jSONObject.put("analytics_endpoint", AFr);
                }
            } catch (JSONException unused) {
            }
        }
    }
}
