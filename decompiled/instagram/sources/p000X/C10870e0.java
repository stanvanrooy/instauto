package p000X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0e0  reason: invalid class name and case insensitive filesystem */
public abstract class C10870e0 implements C07590Tr {
    public final String A00;
    public final HashMap A01 = new HashMap();

    public final synchronized Object A00(C07580Tq r7) {
        try {
            if (!this.A01.containsKey(r7)) {
                this.A01.put(r7, r7.AZs().newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("Incorrect usage for %s type %s", new Object[]{r7.AOP(), r7.AZs()}), e);
        }
        return this.A01.get(r7);
    }

    public synchronized JSONObject A01(boolean z, boolean z2) {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.A01.entrySet()) {
            jSONObject.putOpt(((C07580Tq) entry.getKey()).AOP(), entry.getValue());
        }
        return jSONObject;
    }

    public final synchronized void A02(C07580Tq r2, Object obj) {
        this.A01.put(r2, obj);
    }

    public final String toString() {
        try {
            return A01(false, false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public C10870e0(String str) {
        this.A00 = str;
    }
}
