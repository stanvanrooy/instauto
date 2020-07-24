package p000X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Tj  reason: invalid class name and case insensitive filesystem */
public final class C07510Tj {
    public final boolean A00;
    public final C07550Tn A01;
    public final AnonymousClass064 A02;
    public final AnonymousClass063 A03;
    public final AnonymousClass062 A04;
    public final AnonymousClass061 A05;
    public final AnonymousClass060 A06;
    public final C032005z A07;
    public final C031905y A08;
    public final boolean A09;

    public final String toString() {
        try {
            return A00(this, false).toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static JSONObject A00(C07510Tj r5, boolean z) {
        JSONObject jSONObject = new JSONObject();
        AnonymousClass062 r2 = r5.A04;
        if (r2 != null) {
            jSONObject.putOpt(r2.A00, r2.A01(z, r5.A09));
        }
        AnonymousClass060 r22 = r5.A06;
        if (r22 != null) {
            jSONObject.putOpt(r22.A00, r22.A01(z, r5.A09));
        }
        AnonymousClass064 r23 = r5.A02;
        if (r23 != null) {
            jSONObject.putOpt(r23.A00, r23.A01(z, r5.A09));
        }
        AnonymousClass061 r24 = r5.A05;
        if (r24 != null) {
            jSONObject.putOpt(r24.A00, r24.A01(z, r5.A09));
        }
        C07550Tn r4 = r5.A01;
        if (r4 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("ssr", r4.A03);
            jSONObject2.putOpt("mcd", Long.valueOf(r4.A00));
            jSONObject2.putOpt("mfcl", Long.valueOf(r4.A02));
            jSONObject2.putOpt("mcg", Long.valueOf(r4.A01));
            jSONObject.putOpt("ss", jSONObject2);
        }
        AnonymousClass063 r25 = r5.A03;
        if (r25 != null) {
            jSONObject.putOpt(r25.A03, r25.A02(r5.A09));
        }
        C031905y r26 = r5.A08;
        if (r26 != null) {
            jSONObject.putOpt(r26.A03, r26.A02(r5.A09));
        }
        C032005z r27 = r5.A07;
        if (r27 != null) {
            jSONObject.putOpt(r27.A03, r27.A02(r5.A09));
        }
        return jSONObject;
    }

    public C07510Tj(AnonymousClass062 r1, AnonymousClass060 r2, AnonymousClass064 r3, AnonymousClass061 r4, C07550Tn r5, AnonymousClass063 r6, C031905y r7, C032005z r8, boolean z, boolean z2) {
        this.A04 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A08 = r7;
        this.A07 = r8;
        this.A00 = z;
        this.A09 = z2;
    }
}
