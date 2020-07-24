package p000X;

import java.util.Map;

/* renamed from: X.1ou  reason: invalid class name and case insensitive filesystem */
public final class C40591ou {
    public final AnonymousClass0C1 A00;
    public final String A01;

    public static void A00(C06270Ok r2, String str, Object obj) {
        if (obj instanceof String) {
            r2.A09(str, (String) obj);
        } else if (obj instanceof Integer) {
            r2.A07(str, (Integer) obj);
        } else if (obj instanceof Long) {
            r2.A08(str, (Long) obj);
        } else if (obj instanceof Boolean) {
            r2.A05(str, (Boolean) obj);
        } else if (obj instanceof Double) {
            r2.A00.A03(str, (Double) obj);
        } else if (obj instanceof Map) {
            C06270Ok A002 = C06270Ok.A00();
            for (Map.Entry value : ((Map) obj).entrySet()) {
                A00(A002, str, value.getValue());
            }
        }
    }

    public C40591ou(AnonymousClass0C1 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }
}
