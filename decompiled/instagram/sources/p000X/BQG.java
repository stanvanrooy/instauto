package p000X;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.BQG */
public final class BQG extends AnonymousClass0O9 {
    public final /* synthetic */ AnonymousClass12K A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BQG(AnonymousClass12K r2, String str) {
        super(578);
        this.A00 = r2;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    public final void run() {
        AWC awc;
        String string;
        BQB bqb;
        C33401cr r5 = (C33401cr) this.A00.A06.get();
        if (r5 != null) {
            String str = this.A01;
            synchronized (r5) {
                if (str != null) {
                    if (!str.isEmpty()) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("bd");
                            if (jSONObject != null) {
                                if (jSONObject.has("rt")) {
                                    BQK bqk = (BQK) BQK.A01.get(Integer.valueOf(jSONObject.getInt("rt")));
                                    if (bqk == null) {
                                        bqk = BQK.BENIGN_IGNORE;
                                    }
                                    C33401cr.A00(r5, bqk);
                                    if (!bqk.equals(C33401cr.A07)) {
                                        C33401cr.A07 = bqk;
                                        BQQ bqq = C33401cr.A05;
                                        if (bqq != null) {
                                            bqq.A00(bqk);
                                        }
                                    }
                                }
                                JSONArray jSONArray = jSONObject.getJSONArray("ch");
                                if (jSONObject.has("slp")) {
                                    awc = (AWC) AWC.A01.get(Integer.valueOf(jSONObject.getInt("slp")));
                                    if (awc == null) {
                                        awc = AWC.DEFAULT;
                                    }
                                } else {
                                    awc = AWC.DEFAULT;
                                }
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    if (jSONObject2.has("id") && (string = jSONObject2.getString("id")) != null && !string.isEmpty()) {
                                        BQC.A04(r5.A01, C25582BQo.A00(Constants.ONE), string);
                                        if (!(!BQC.A06(C33401cr.A07) || r5.A02.get() == null || (bqb = r5.A00) == null)) {
                                            bqb.A00(Constants.ONE, C33401cr.A07, string, awc);
                                        }
                                    }
                                }
                            }
                        } catch (JSONException unused) {
                        } catch (Throwable th) {
                            C54802Yz.A00(th);
                        }
                    }
                }
            }
        } else {
            return;
        }
        return;
    }
}
