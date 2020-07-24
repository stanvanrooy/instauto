package p000X;

import android.database.Cursor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BBC */
public final class BBC implements BBI {
    public final Object apply(Object obj) {
        try {
            String string = ((Cursor) obj).getString(1);
            AnonymousClass0CW.A01(string);
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("profile");
            return new BBD(new BBE(jSONObject2.getString("uid"), jSONObject2.getString("name"), jSONObject2.getString("profile_pic_url")), jSONObject.getString("access_token"));
        } catch (JSONException e) {
            throw new BBF((Throwable) e);
        }
    }
}
