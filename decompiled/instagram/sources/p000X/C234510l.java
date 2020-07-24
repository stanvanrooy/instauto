package p000X;

import android.content.Context;

/* renamed from: X.10l  reason: invalid class name and case insensitive filesystem */
public final class C234510l {
    public final String A00;

    public static C17850qu A00(AnonymousClass0C1 r4, String str) {
        String str2;
        String A03 = C36681iR.A00(',').A03(r4.A05.A04((String) null));
        if (AnonymousClass0OZ.A00(r4).ARp() == null) {
            str2 = "";
        } else {
            str2 = AnonymousClass0OZ.A00(r4).ARp().A01;
        }
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.ONE;
        r2.A0C = "notifications/badge/";
        r2.A09("user_ids", A03);
        r2.A09("phone_id", str2);
        r2.A09("device_id", str);
        r2.A06(AnonymousClass2IL.class, false);
        return r2.A03();
    }

    public C234510l(Context context) {
        this.A00 = C05860Mt.A02.A05(context);
    }
}
