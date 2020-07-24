package p000X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Sh  reason: invalid class name and case insensitive filesystem */
public final class C07240Sh {
    public int A00 = 0;
    public long A01;
    public AnonymousClass0TQ A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07 = new ArrayList(50);
    public UUID A08;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("seq", this.A00);
            jSONObject.put("time", String.format((Locale) null, "%.3f", new Object[]{Double.valueOf(((double) this.A01) / 1000.0d)}));
            jSONObject.putOpt("app_id", this.A03);
            jSONObject.putOpt("app_ver", this.A04);
            jSONObject.putOpt("build_num", this.A05);
            jSONObject.putOpt("device_id", this.A02.get());
            jSONObject.putOpt("session_id", this.A08);
            jSONObject.putOpt("uid", this.A06);
            if (this.A07 != null) {
                JSONArray jSONArray = new JSONArray();
                for (C07180Sb A002 : this.A07) {
                    jSONArray.put(A002.A00());
                }
                jSONObject.put("data", jSONArray);
            }
            jSONObject.put("log_type", "client_event");
            return jSONObject.toString();
        } catch (JSONException e) {
            AnonymousClass0DB.A0N("AnalyticsSession", e, "Failed to serialize");
            return "";
        }
    }
}
