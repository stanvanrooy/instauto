package p000X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.0gq  reason: invalid class name and case insensitive filesystem */
public final class C12500gq extends C12470gn {
    public final Context A00;

    public final C12390gf A00(int i, C51762Ma r4) {
        return new C45151xN(this.A00, r4);
    }

    public C12500gq(Context context) {
        this.A00 = context;
    }

    public final C51762Ma A01(int i, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("timeoutInMillis");
        C51762Ma r0 = new C51762Ma();
        r0.A01 = optInt;
        return r0;
    }
}
