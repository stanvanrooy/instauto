package p000X;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Sb  reason: invalid class name and case insensitive filesystem */
public final class C07180Sb {
    public final String A00;
    public final String A01;
    public final Map A02 = new HashMap();
    public final long A03;

    public final JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.A01);
            jSONObject.put("time", String.format((Locale) null, "%.3f", new Object[]{Double.valueOf(((double) this.A03) / 1000.0d)}));
            jSONObject.putOpt("module", this.A00);
            if (!this.A02.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : this.A02.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put("extra", jSONObject2);
                return jSONObject;
            }
        } catch (JSONException e) {
            AnonymousClass0DB.A0N("AnalyticsEvent", e, "Failed to serialize");
        }
        return jSONObject;
    }

    public C07180Sb(String str, String str2) {
        C07410Sz.A00(str);
        C07410Sz.A00(str2);
        this.A03 = System.currentTimeMillis();
        this.A01 = str;
        this.A00 = str2;
    }

    public final void A01(Map map) {
        String obj;
        for (Map.Entry entry : map.entrySet()) {
            String obj2 = entry.getKey().toString();
            if (entry.getValue() == null) {
                obj = "";
            } else {
                obj = entry.getValue().toString();
            }
            this.A02.put(obj2, obj);
        }
    }

    public final String toString() {
        return A00().toString();
    }
}
