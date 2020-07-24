package p000X;

import org.json.JSONObject;

/* renamed from: X.BWN */
public final class BWN implements C194368Ts {
    public final long A00;
    public final long A01;
    public final long A02;
    public final /* synthetic */ BWL A03;

    public BWN(BWL bwl, long j, long j2, long j3) {
        this.A03 = bwl;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = j3;
    }

    public final JSONObject BrP() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", this.A01);
        jSONObject.put("data", this.A02);
        jSONObject.put("cache", this.A00);
        return jSONObject;
    }
}
