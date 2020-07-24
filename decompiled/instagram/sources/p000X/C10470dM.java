package p000X;

import android.content.Intent;
import org.json.JSONObject;

/* renamed from: X.0dM  reason: invalid class name and case insensitive filesystem */
public final class C10470dM extends AnonymousClass0VF {
    public long A00;
    public final long A01;

    public static C10470dM A00(Object obj) {
        try {
            String str = (String) obj;
            if (str.length() > 50000) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C10470dM(Intent.parseUri(jSONObject.getString("key_intent"), 0), jSONObject.getString("key_notifid"), jSONObject.getLong("key_timestamp_received"), jSONObject.getLong("key_timestamp_last_retried"));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String A01() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_intent", this.A00.toUri(0));
            jSONObject.putOpt("key_notifid", this.A01);
            jSONObject.putOpt("key_timestamp_received", Long.valueOf(this.A01));
            jSONObject.putOpt("key_timestamp_last_retried", Long.valueOf(this.A00));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public C10470dM(Intent intent, String str, long j, long j2) {
        super(intent, str);
        this.A01 = j;
        this.A00 = j2;
    }
}
