package p000X;

import org.json.JSONObject;

/* renamed from: X.0gp  reason: invalid class name and case insensitive filesystem */
public final class C12490gp extends C12470gn {
    public final C12390gf A00(int i, C51762Ma r4) {
        if (r4 == null) {
            return C12370gd.A00;
        }
        return new C45141xM(r4.A03);
    }

    public final C51762Ma A01(int i, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("priority");
        C51762Ma r0 = new C51762Ma();
        r0.A03 = optInt;
        return r0;
    }
}
