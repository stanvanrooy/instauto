package p000X;

import com.instagram.feed.media.Media__JsonHelper;
import java.io.StringWriter;

/* renamed from: X.15t  reason: invalid class name and case insensitive filesystem */
public final class C247215t implements C17120pi {
    public final void BfU(C13460iZ r4, Object obj) {
        C247115s r5 = (C247115s) obj;
        r4.A0T();
        String str = r5.A01;
        if (str != null) {
            if (str.isEmpty()) {
                AnonymousClass1NJ r2 = r5.A00;
                StringWriter stringWriter = new StringWriter();
                C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                Media__JsonHelper.A01(A05, r2);
                A05.close();
                str = stringWriter.toString();
            }
            r4.A0H("media_json", str);
        }
        r4.A0Q();
    }

    public final Object BWo(C13080hr r2) {
        return C100574Wg.parseFromJson(r2);
    }
}
