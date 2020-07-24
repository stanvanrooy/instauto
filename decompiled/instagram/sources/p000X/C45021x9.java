package p000X;

import android.content.Context;
import android.util.BoostFramework;
import org.json.JSONObject;

/* renamed from: X.1x9  reason: invalid class name and case insensitive filesystem */
public final class C45021x9 implements C12430gj {
    public static boolean A01;
    public static boolean A02;
    public final Context A00;

    public final int ASC() {
        return 1;
    }

    public final int ASD() {
        return 1;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String A0E = AnonymousClass000.A0E(A01 ? "perfHint" : "", A02 ? "useContext" : "");
            jSONObject.put("name", "qualcomm");
            jSONObject.put("framework", "BoostFramework");
            jSONObject.put("extra", A0E);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public C45021x9(Context context) {
        this.A00 = context;
    }

    public final C12390gf AAF(C12450gl r5, C51762Ma r6) {
        BoostFramework boostFramework;
        int[] AGt = r5.AGt(r6);
        if (AGt == null || AGt.length == 0) {
            return null;
        }
        if (A02) {
            boostFramework = new BoostFramework(this.A00);
        } else {
            boostFramework = new BoostFramework();
        }
        return new C89793ur(boostFramework, r6.A01, AGt);
    }
}
