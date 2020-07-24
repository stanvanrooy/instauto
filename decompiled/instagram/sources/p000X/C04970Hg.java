package p000X;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Hg  reason: invalid class name and case insensitive filesystem */
public final class C04970Hg {
    public AnonymousClass0P4 A00 = AnonymousClass0P4.A00("instagram_android_fad", (AnonymousClass0RN) null);
    public String A01;
    public final C06590Pq A02;

    public final void A00(String str, long j) {
        this.A00.A0F(str, Long.valueOf(j));
    }

    public final void A01(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (str.equals("contents")) {
            this.A01 = str2;
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject(str2);
                } catch (JSONException e) {
                    AnonymousClass0QD.A08("IgAppStateReporter_missing_status", AnonymousClass000.A0E("bad json in appstate reporter. json string: ", str2), e, 1);
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (opt != null) {
                            if (opt instanceof Double) {
                                this.A00.A0C(next, (Double) opt);
                            } else if (opt instanceof Integer) {
                                this.A00.A0E(next, (Integer) opt);
                            } else if (opt instanceof Float) {
                                this.A00.A0D(next, (Float) opt);
                            } else if (opt instanceof Long) {
                                this.A00.A0F(next, (Long) opt);
                            } else if (opt instanceof Boolean) {
                                this.A00.A0A(next, (Boolean) opt);
                            } else {
                                this.A00.A0G(next, opt.toString());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.A00.A0G(str, str2);
    }

    public C04970Hg(C06590Pq r3) {
        this.A02 = r3;
    }
}
