package p000X;

import android.content.Context;
import com.lge.loader.power.ILGPowerManagerLoader;
import com.lge.systemservice.core.LGContext;
import org.json.JSONObject;

/* renamed from: X.1x5  reason: invalid class name and case insensitive filesystem */
public final class C44981x5 implements C12430gj {
    public final ILGPowerManagerLoader A00;

    public final C12390gf AAF(C12450gl r2, C51762Ma r3) {
        return null;
    }

    public final int ASC() {
        return 9;
    }

    public final int ASD() {
        return 16;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "lge");
            jSONObject.put("framework", "LGPowerManagerLoader");
            jSONObject.put("extra", "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C44981x5(Context context) {
        ILGPowerManagerLoader iLGPowerManagerLoader;
        try {
            iLGPowerManagerLoader = (ILGPowerManagerLoader) new LGContext(context).getLGSystemService("lgpowermanagerhelper");
        } catch (Exception unused) {
            iLGPowerManagerLoader = null;
        }
        this.A00 = iLGPowerManagerLoader;
    }
}
