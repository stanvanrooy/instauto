package p000X;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.13d  reason: invalid class name and case insensitive filesystem */
public final class C240613d implements C17690qe, C06570Po {
    public C58012fA A00;
    public C66112uw A01;

    public final String ALl() {
        return "direct_visual_message_log";
    }

    public final String ALm() {
        return ".json";
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0077, code lost:
        if (r2.A0T().A01.isEmpty() == false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087 A[Catch:{ JSONException -> 0x00d6 }] */
    public final String AIl(Context context) {
        String str;
        String str2;
        boolean z;
        C61412ll r0;
        if (this.A00 == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message_id", this.A00.A0H());
            jSONObject.put("thread_id", this.A01.AY5());
            jSONObject.put("thread_oldest_unseen_visual_message_cursor", this.A01.AR3());
            jSONObject.put("thread_unseen_visual_message_server_count", this.A01.AZT());
            AnonymousClass1NJ A0E = this.A00.A0E();
            boolean z2 = true;
            if (A0E != null) {
                jSONObject.put("media_id", A0E.getId());
                jSONObject.put("media_type", A0E.APx());
                if (A0E.AiO()) {
                    A0E.A0e();
                    if (A0E.A0e().A09 != null) {
                    }
                    z = false;
                    jSONObject.put("has_url_info", z);
                    r0 = this.A00.A0P;
                    if (r0 != null) {
                        jSONObject.put("is_visual_media_url_stale", r0.A00());
                    }
                } else {
                    if (A0E.A0T() != null) {
                    }
                    z = false;
                    jSONObject.put("has_url_info", z);
                    r0 = this.A00.A0P;
                    if (r0 != null) {
                    }
                }
                z = true;
                jSONObject.put("has_url_info", z);
                r0 = this.A00.A0P;
                if (r0 != null) {
                }
            }
            jSONObject.put("seen_count", this.A00.A06());
            jSONObject.put("message_timestamp", this.A00.A07());
            boolean z3 = false;
            if (this.A00.A0P != null) {
                z3 = true;
            }
            jSONObject.put("has_uploaded_media", z3);
            if (this.A00.A0b == null) {
                z2 = false;
            }
            jSONObject.put("has_pending_media", z2);
            C58012fA r1 = this.A00;
            C61412ll r02 = r1.A0P;
            if (r02 != null) {
                str2 = r02.A07;
            } else {
                str2 = r1.A0v;
            }
            jSONObject.put("view_mode", str2);
            str = jSONObject.toString();
        } catch (JSONException e) {
            AnonymousClass0DB.A0G("DirectVisualMessageBugReportLogger", "Unable to log", e);
            str = null;
        }
        this.A01 = null;
        this.A00 = null;
        return str;
    }
}
