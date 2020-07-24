package p000X;

import com.hisi.perfhub.PerfHub;
import org.json.JSONObject;

/* renamed from: X.1xF  reason: invalid class name and case insensitive filesystem */
public final class C45071xF implements C12430gj {
    public final int ASC() {
        return 7;
    }

    public final int ASD() {
        return 8;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "huawei");
            jSONObject.put("framework", "PerfHub");
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
            AGt[0] = 4;
        } else {
            AGt[0] = 8;
        }
        return new C30726DiF(new PerfHub(), r6.A01, AGt);
    }
}
