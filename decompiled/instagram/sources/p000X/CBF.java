package p000X;

import com.instagram.feed.media.Media__JsonHelper;
import java.io.StringWriter;

/* renamed from: X.CBF */
public final class CBF implements C26651Ei {
    public final /* synthetic */ CBH A00;

    public CBF(CBH cbh) {
        this.A00 = cbh;
    }

    public final /* bridge */ /* synthetic */ Object BWp(String str) {
        return CBG.parseFromJson(AnonymousClass0IY.A00(this.A00.A01, str));
    }

    public final String BfT(Object obj) {
        CBM cbm = (CBM) obj;
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (cbm.A00 != null) {
            A05.A0d("top_items");
            A05.A0S();
            for (AnonymousClass1NJ r0 : cbm.A00) {
                if (r0 != null) {
                    Media__JsonHelper.A01(A05, r0);
                }
            }
            A05.A0P();
        }
        A05.A0Q();
        A05.close();
        return stringWriter.toString();
    }
}
