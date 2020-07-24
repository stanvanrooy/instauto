package p000X;

import java.io.StringWriter;

/* renamed from: X.1Ez  reason: invalid class name and case insensitive filesystem */
public final class C26721Ez implements C26651Ei {
    public AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ Object BWp(String str) {
        return AnonymousClass1HE.parseFromJson(AnonymousClass0IY.A00(this.A00, str));
    }

    public final String BfT(Object obj) {
        AnonymousClass1HF r7 = (AnonymousClass1HF) obj;
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (r7.A00 != null) {
            A05.A0d("votes");
            A05.A0S();
            for (C120875Gi r2 : r7.A00) {
                if (r2 != null) {
                    A05.A0T();
                    String str = r2.A02;
                    if (str != null) {
                        A05.A0H("media_id", str);
                    }
                    String str2 = r2.A04;
                    if (str2 != null) {
                        A05.A0H("slider_id", str2);
                    }
                    if (r2.A00 != null) {
                        A05.A0d("vote");
                        C120845Gf.A00(A05, r2.A00);
                    }
                    String str3 = r2.A03;
                    if (str3 != null) {
                        A05.A0H("reel_viewer_module_name", str3);
                    }
                    String str4 = r2.A01;
                    if (str4 != null) {
                        A05.A0H("media_delivery_class", str4);
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

    public C26721Ez(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }
}
