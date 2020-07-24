package p000X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.0go  reason: invalid class name and case insensitive filesystem */
public final class C12480go extends C12470gn {
    public final /* synthetic */ C12360gc A00;

    public C12480go(C12360gc r1) {
        this.A00 = r1;
    }

    public final C12390gf A00(int i, C51762Ma r5) {
        if (r5 != null) {
            C12360gc r2 = this.A00;
            if (r2.A02) {
                C12390gf AAF = r2.A01.AAF(r2.A00, r5);
                if (AAF == null) {
                    return C12360gc.A06;
                }
                return AAF;
            }
        }
        return C12360gc.A06;
    }

    public final void A03(Context context) {
        C12360gc.A00(this.A00, context);
    }

    public final C51762Ma A01(int i, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("timeout");
        int optInt2 = jSONObject.optInt("frequency");
        C51762Ma r0 = new C51762Ma();
        r0.A03 = optInt2;
        r0.A01 = optInt;
        return r0;
    }
}
