package p000X;

import com.facebook.AccessToken;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0jp  reason: invalid class name and case insensitive filesystem */
public final class C14140jp {
    public final String A00;

    public final AccessToken A00() {
        String string;
        if (!C14190ju.A00(this.A00, Constants.A0o).contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = C14190ju.A00(this.A00, Constants.A0o).getString("access_token", (String) null)) != null) {
            String string2 = C14190ju.A00(this.A00, Constants.A0o).getString(MemoryDumpUploadJob.EXTRA_USER_ID, (String) null);
            C14110jm.A00(this.A00).A03(new AccessToken(string, string2));
            C14190ju.A00(string2, Constants.A0o).edit().remove("access_token").remove("access_expires").remove("last_access_update").apply();
        }
        String string3 = C14190ju.A00(this.A00, Constants.A0o).getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(string3);
                if (jSONObject.getInt("version") > 1) {
                    return null;
                }
                String string4 = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                Integer A002 = C42241s0.A00(jSONObject.getString("source"));
                String string5 = jSONObject.getString("application_id");
                String string6 = jSONObject.getString(MemoryDumpUploadJob.EXTRA_USER_ID);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getString(i2));
                }
                return new AccessToken(string4, string5, string6, arrayList, arrayList2, A002, date, date2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public C14140jp(String str) {
        this.A00 = str;
    }
}
