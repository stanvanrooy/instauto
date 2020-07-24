package p000X;

import java.io.StringWriter;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
public final class C37981kX {
    public static C15910nj A00(String str) {
        C15910nj r2 = new C15910nj();
        r2.A06("signed_body", C06360Ot.formatString("SIGNATURE.%s", str));
        return r2;
    }

    public static String A01(C15910nj r5, Set set, Map map) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        for (C26151Bw r2 : r5.A04()) {
            if (!set.contains(r2.A00)) {
                A05.A0H(r2.A00, r2.A01);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!set.contains(entry.getKey())) {
                A05.A0d((String) entry.getKey());
                A05.A0N((String) entry.getValue());
            }
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }
}
