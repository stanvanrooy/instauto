package p000X;

import android.content.Context;

/* renamed from: X.1Bg  reason: invalid class name and case insensitive filesystem */
public final class C26011Bg {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r2.length() == 0) goto L_0x0021;
     */
    public final C26001Bf A00(C06590Pq r7) {
        boolean z;
        String A0E;
        C13150hy.A02(r7, "session");
        Class<C26001Bf> cls = C26001Bf.class;
        C26001Bf r4 = (C26001Bf) r7.AV9(cls);
        if (r4 == null) {
            Context context = StoredPreferences.A00;
            String A05 = C05210Iq.A05(r7);
            if (A05 != null) {
                z = false;
            }
            z = true;
            if (z) {
                A0E = "RoutingHeaderPrefs";
            } else {
                A0E = AnonymousClass000.A0E("RoutingHeaderPrefs_", A05);
            }
            C22560yd A00 = new C22530ya(context, A0E).A00();
            C13150hy.A01(A00, "EncryptedSharedPrefs.bui…                 .build()");
            r4 = new C26001Bf(A00);
            r7.BYi(cls, r4);
        }
        return r4;
    }
}
