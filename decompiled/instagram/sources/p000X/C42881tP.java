package p000X;

import java.io.StringWriter;

/* renamed from: X.1tP  reason: invalid class name and case insensitive filesystem */
public final class C42881tP {
    public static String A00(C42891tQ r4) {
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        A05.A0F("di", r4.A00);
        A05.A0F("dt", r4.A02);
        A05.A0F("ac", r4.A01);
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }

    public static C42891tQ parseFromJson(C13080hr r3) {
        C42891tQ r2 = new C42891tQ();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            if ("di".equals(A0i)) {
                r2.A00 = r3.A0I();
            } else if ("dt".equals(A0i)) {
                r2.A02 = r3.A0I();
            } else if ("ac".equals(A0i)) {
                r2.A01 = r3.A0I();
            }
            r3.A0f();
        }
        return r2;
    }
}
