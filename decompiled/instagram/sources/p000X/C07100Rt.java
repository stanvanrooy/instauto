package p000X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.0Rt  reason: invalid class name and case insensitive filesystem */
public final class C07100Rt {
    public static AnonymousClass1C4 A00(C26141Bv r4, String str, String str2) {
        AnonymousClass1BZ r3 = new AnonymousClass1BZ();
        r3.A02 = str;
        r3.A01 = Constants.ONE;
        r3.A00 = r4;
        if (str2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C17190pp("X-Logging-DynoStatsTags", str2));
            r3.A05.clear();
            r3.A05.addAll(arrayList);
        }
        return r3.A00();
    }

    public static AnonymousClass1C4 A01(File file, String str, String str2, String str3, StringBuilder sb) {
        String A05;
        C15910nj r5 = new C15910nj();
        r5.A06("format", "json");
        r5.A06("sent_time", AnonymousClass0VL.A01(System.currentTimeMillis()));
        r5.A06("access_token", str);
        if (file.getName().endsWith(".gz")) {
            r5.A06("cmethod", "deflate");
            String name = file.getName();
            AnonymousClass0a4.A09(true);
            r5.A00.put("cmsg", new AnonymousClass29I(file, name, "application/octet-stream"));
        } else {
            if (sb == null) {
                A05 = AnonymousClass0P6.A05(file, new StringBuilder());
            } else {
                A05 = AnonymousClass0P6.A05(file, sb);
            }
            AnonymousClass0VL.A03(r5, A05);
        }
        return A00(r5.A00(), str2, str3);
    }
}
