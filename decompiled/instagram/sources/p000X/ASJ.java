package p000X;

import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ASJ */
public final class ASJ implements C23544AQo {
    public final /* synthetic */ ASI A00;

    public final void onFailure() {
    }

    public ASJ(ASI asi) {
        this.A00 = asi;
    }

    public final void BJq(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    int i = jSONObject2.getInt(IgReactMediaPickerNativeModule.WIDTH);
                    int i2 = jSONObject2.getInt(IgReactMediaPickerNativeModule.HEIGHT);
                    if (i != 0 || i2 != 0) {
                        this.A00.A00.A08.put(next, new ASK((long) i, (long) i2));
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
