package p000X;

import java.io.StringWriter;

/* renamed from: X.1Eh  reason: invalid class name and case insensitive filesystem */
public final class C26641Eh implements C26651Ei {
    public final Object BWp(String str) {
        C13080hr A0A = C12890hY.A00.A0A(str);
        A0A.A0p();
        return AnonymousClass1FZ.parseFromJson(A0A);
    }

    public final String BfT(Object obj) {
        C26731Fa r9 = (C26731Fa) obj;
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (r9.A00 != null) {
            A05.A0d("pending_likes");
            A05.A0S();
            for (AnonymousClass2F6 r4 : r9.A00) {
                if (r4 != null) {
                    A05.A0T();
                    A05.A0G("creation_time", r4.A00);
                    String str = r4.A03;
                    if (str != null) {
                        A05.A0H("media_id", str);
                    }
                    String str2 = r4.A02;
                    if (str2 != null) {
                        A05.A0H("like_intention", str2);
                    }
                    A05.A0I("is_double_tap_media", r4.A06);
                    String str3 = r4.A01;
                    if (str3 != null) {
                        A05.A0H("analytics_module_name", str3);
                    }
                    if (r4.A05 != null) {
                        A05.A0d("module_values_list");
                        A05.A0S();
                        for (String str4 : r4.A05) {
                            if (str4 != null) {
                                A05.A0g(str4);
                            }
                        }
                        A05.A0P();
                    }
                    String str5 = r4.A04;
                    if (str5 != null) {
                        A05.A0H("radio_type", str5);
                    }
                    A05.A0Q();
                }
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }
}
