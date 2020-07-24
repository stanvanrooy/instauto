package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import org.json.JSONObject;

/* renamed from: X.0gi  reason: invalid class name and case insensitive filesystem */
public final class C12420gi implements C12430gj {
    public final C12390gf AAF(C12450gl r2, C51762Ma r3) {
        return null;
    }

    public final int ASC() {
        return 0;
    }

    public final int ASD() {
        return 0;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", NetInfoModule.CONNECTION_TYPE_NONE);
            jSONObject.put("framework", "");
            jSONObject.put("extra", "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
