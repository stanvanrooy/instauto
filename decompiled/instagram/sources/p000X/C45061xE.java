package p000X;

import android.iawareperf.UniPerf;
import org.json.JSONObject;

/* renamed from: X.1xE  reason: invalid class name and case insensitive filesystem */
public final class C45061xE implements C12430gj {
    public final int ASC() {
        return 6;
    }

    public final int ASD() {
        return 8;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "huawei");
            jSONObject.put("framework", "UniPerf");
            jSONObject.put("extra", "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final C12390gf AAF(C12450gl r5, C51762Ma r6) {
        int[] AGt = r5.AGt(r6);
        if (AGt == null || AGt.length == 0) {
            return null;
        }
        if (AGt[0] >= 90) {
            AGt[0] = 4099;
        } else {
            AGt[0] = 4112;
        }
        return new C30725DiE(UniPerf.getInstance(), r6.A01, AGt);
    }
}
