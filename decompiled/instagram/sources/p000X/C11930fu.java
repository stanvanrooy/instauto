package p000X;

import java.util.regex.Matcher;

/* renamed from: X.0fu  reason: invalid class name and case insensitive filesystem */
public final class C11930fu extends C11940fv {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003b A[RETURN] */
    public static double A00(String str) {
        double d;
        long j;
        C17300q0 r5;
        if (str != null) {
            Matcher matcher = C17300q0.A02.matcher(str);
            if (matcher.find()) {
                d = Double.parseDouble(matcher.group(1));
                j = Long.parseLong(matcher.group(2));
                r5 = new C17300q0(d, j);
                if (System.currentTimeMillis() - r5.A01 >= 86400000) {
                    return r5.A00;
                }
                return -1.0d;
            }
        }
        d = -1.0d;
        j = 0;
        r5 = new C17300q0(d, j);
        if (System.currentTimeMillis() - r5.A01 >= 86400000) {
        }
    }

    public final double A01() {
        C05950Nc r1 = C15710nP.A00().A00;
        if (r1.A01) {
            return r1.A00;
        }
        return A00(C05760Lv.A01.A00.getString("cm_last_bandwidth", (String) null));
    }

    public final double A02() {
        C05950Nc r1 = C15710nP.A00().A01;
        if (r1.A01) {
            return r1.A00;
        }
        return A00(C05760Lv.A01.A00.getString("cm_last_latency", (String) null));
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(210838562);
        long currentTimeMillis = System.currentTimeMillis();
        C05760Lv r7 = C05760Lv.A01;
        String r3 = new C17300q0(A01(), currentTimeMillis).toString();
        r7.A00.edit().putString("cm_last_bandwidth", r3).putString("cm_last_latency", new C17300q0(A02(), currentTimeMillis).toString()).apply();
        AnonymousClass0Z0.A0A(-482068977, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-612318126, AnonymousClass0Z0.A03(-734121363));
    }
}
