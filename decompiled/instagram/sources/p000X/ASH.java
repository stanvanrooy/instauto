package p000X;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ASH */
public final class ASH implements C23544AQo {
    public final /* synthetic */ ASC A00;

    public final void onFailure() {
    }

    public ASH(ASC asc) {
        this.A00 = asc;
    }

    public final void BJq(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.A00.A09.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            } catch (JSONException unused) {
            }
        }
    }
}
