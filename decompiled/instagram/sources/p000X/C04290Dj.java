package p000X;

import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0Dj  reason: invalid class name and case insensitive filesystem */
public final class C04290Dj {
    public final Map A00;

    public final void A00(Writer writer) {
        String str;
        try {
            HashMap hashMap = new HashMap();
            synchronized (this.A00) {
                hashMap.putAll(this.A00);
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            str = jSONObject.toString();
        } catch (OutOfMemoryError unused) {
            str = "{}";
        }
        writer.append(str);
    }

    public C04290Dj() {
        this.A00 = new HashMap();
    }

    public C04290Dj(C04290Dj r5) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        synchronized (hashMap) {
            synchronized (r5.A00) {
                this.A00.putAll(r5.A00);
            }
        }
    }
}
