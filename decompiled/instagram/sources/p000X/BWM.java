package p000X;

import org.json.JSONObject;

/* renamed from: X.BWM */
public final class BWM extends C698433w implements C194368Ts {
    public final JSONObject BrP() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bytes", this.A00);
        jSONObject.put("ondisk", this.A02);
        jSONObject.put("entries", this.A01);
        return jSONObject;
    }

    public BWM(long j, long j2, long j3) {
        super(j, j2, j3);
    }

    public BWM(C698433w r8) {
        this(r8.A00, r8.A02, r8.A01);
    }
}
