package p000X;

import java.io.StringWriter;

/* renamed from: X.0iV  reason: invalid class name and case insensitive filesystem */
public final class C13420iV {
    public static String A00(C13300iJ r3) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        C13150hy.A02(r3, "value");
        C13150hy.A02(A05, "gen");
        C13210i4.A00(A05, C13490ic.A00(r3));
        A05.close();
        return stringWriter.toString();
    }
}
