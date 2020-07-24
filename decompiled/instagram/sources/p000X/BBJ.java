package p000X;

import android.content.Context;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BBJ */
public final class BBJ {
    public final BBO A00;
    public final String A01;
    public final Context A02;
    public final AnonymousClass1L8 A03;
    public final AnonymousClass0C1 A04;

    public final void A00(List list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("page_id", this.A01);
            jSONObject.put("product_ids", new JSONArray(list));
        } catch (JSONException e) {
            AnonymousClass0QD.A01("ProductCrossTaggingEligibilityHelperImpl", AnonymousClass000.A0E(AnonymousClass40t.$const$string(2), e.getMessage()));
        }
        BBK bbk = new BBK(jSONObject.toString());
        AnonymousClass25V A002 = AnonymousClass25V.A00(this.A04);
        A002.A03(bbk);
        C17850qu A022 = A002.A02(Constants.ONE);
        A022.A00 = new BBL(this);
        C28351Lj.A00(this.A02, this.A03, A022);
        this.A00.BJM();
    }

    public BBJ(Context context, AnonymousClass1L8 r2, AnonymousClass0C1 r3, String str, BBO bbo) {
        this.A02 = context;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = str;
        this.A00 = bbo;
    }
}
