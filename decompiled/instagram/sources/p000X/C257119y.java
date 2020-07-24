package p000X;

import android.text.TextUtils;

/* renamed from: X.19y  reason: invalid class name and case insensitive filesystem */
public final class C257119y implements C257019x {
    public static final C257119y A00 = new C257119y();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r4.endsWith(p000X.AnonymousClass000.A0E(".", r1)) == false) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    public final void BX7(AnonymousClass1C4 r6, String str) {
        AnonymousClass434 r2;
        if (!TextUtils.isEmpty(str)) {
            String host = r6.A04.getHost();
            if (!TextUtils.isEmpty(host)) {
                if (host.endsWith("ak.instagram.com")) {
                    r2 = AnonymousClass434.AKAMAI;
                } else {
                    String[] strArr = AnonymousClass40N.A00;
                    String str2 = strArr[0];
                    if (!host.equals(str2) && !host.endsWith(AnonymousClass000.A0E(".", str2))) {
                        String str3 = strArr[1];
                        if (!host.equals(str3)) {
                        }
                    }
                    r2 = AnonymousClass434.IGCDN;
                }
                if (r2 != null) {
                    if (r2.equals(AnonymousClass434.AKAMAI)) {
                        r6.A01("Pragma", "akamai-x-cache-on, akamai-x-cache-remote-on, akamai-x-get-client-ip");
                    } else {
                        r6.A01("X-FB-Debug", "True");
                        r6.A01("X-FB-Origin-Debug", "True");
                    }
                    r6.A06.put("Cdn", r2);
                }
                r6.A06.put("InstagramTraceEnabled", true);
                r6.A06.put("InstagramTraceToken", str);
            }
            r2 = null;
            if (r2 != null) {
            }
            r6.A06.put("InstagramTraceEnabled", true);
            r6.A06.put("InstagramTraceToken", str);
        }
    }
}
