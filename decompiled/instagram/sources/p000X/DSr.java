package p000X;

/* renamed from: X.DSr */
public final class DSr {
    public static DSs parseFromJson(C13080hr r4) {
        DSs dSs = new DSs();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            String str = null;
            if ("emoji".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dSs.A03 = str;
            } else if ("text".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dSs.A05 = str;
            } else if ("expires_at".equals(A0i)) {
                dSs.A01 = r4.A0J();
            } else if ("published_at".equals(A0i)) {
                dSs.A02 = r4.A0J();
            } else if ("status_type".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dSs.A06 = str;
            } else if ("id".equals(A0i)) {
                if (r4.A0g() != C13120hv.VALUE_NULL) {
                    str = r4.A0t();
                }
                dSs.A04 = str;
            } else if ("status_key".equals(A0i)) {
                dSs.A00 = r4.A0I();
            } else if ("should_notify".equals(A0i)) {
                dSs.A07 = r4.A0O();
            } else {
                AnonymousClass1N4.A01(dSs, A0i, r4);
            }
            r4.A0f();
        }
        return dSs;
    }
}
