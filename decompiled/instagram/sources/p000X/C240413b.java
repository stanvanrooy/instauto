package p000X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.13b  reason: invalid class name and case insensitive filesystem */
public final class C240413b implements C17690qe, C06570Po {
    public C58012fA A00;

    public final String ALl() {
        return "direct_send_failure";
    }

    public final String ALm() {
        return ".json";
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
    }

    public final String AIl(Context context) {
        String str;
        if (this.A00 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_context", this.A00.A0G());
            jSONObject.put("type", this.A00.A0d);
            String str2 = this.A00.A0q;
            if (str2 != null) {
                jSONObject.put("local_send_mutation_id", str2);
            }
            AnonymousClass4R2 r2 = this.A00.A0W;
            if (r2 != null) {
                jSONObject.put("send_error", r2.A00);
                String str3 = r2.A02;
                if (str3 != null) {
                    jSONObject.put("error_message", str3);
                }
                jSONObject.put(TraceFieldType.ErrorDomain, r2.A01);
                jSONObject.put("send_channel", r2.A03);
                jSONObject.put("auto_retry_eligible", r2.A05);
                jSONObject.put("manual_retry_eligible", r2.A06);
            }
            str = jSONObject.toString();
        } catch (JSONException e) {
            AnonymousClass0DB.A0G("DirectSendFailureBugReportLog", "Unable to create log", e);
            str = null;
        }
        this.A00 = null;
        return str;
    }
}
