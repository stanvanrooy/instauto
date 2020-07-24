package p000X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.1x3  reason: invalid class name and case insensitive filesystem */
public final class C44961x3 implements C12430gj {
    public final Context A00;

    public final int ASC() {
        return 8;
    }

    public final int ASD() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", "qualcomm");
            jSONObject.put("framework", "QPerformance");
            jSONObject.put("extra", C44931x0.A02 ? "useContext" : "");
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C44961x3(Context context) {
        this.A00 = context;
    }

    public final C12390gf AAF(C12450gl r5, C51762Ma r6) {
        C44931x0 r2;
        int[] AGt = r5.AGt(r6);
        if (AGt == null || AGt.length == 0) {
            return null;
        }
        if (C44931x0.A02) {
            r2 = new C44931x0(this.A00);
        } else {
            r2 = new C44931x0();
        }
        return new C45201xS(r2, r6.A01, AGt);
    }
}
