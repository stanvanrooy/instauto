package p000X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.StringWriter;

/* renamed from: X.1Ex  reason: invalid class name and case insensitive filesystem */
public final class C26711Ex implements C26651Ei {
    public final /* synthetic */ AnonymousClass0C1 A00;

    public C26711Ex(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object BWp(String str) {
        return AnonymousClass1G8.parseFromJson(AnonymousClass0IY.A00(this.A00, str));
    }

    public final String BfT(Object obj) {
        AnonymousClass1G9 r9 = (AnonymousClass1G9) obj;
        StringWriter stringWriter = new StringWriter();
        C13460iZ A05 = C12890hY.A00.A05(stringWriter);
        A05.A0T();
        if (r9.A00 != null) {
            A05.A0d("pending_comments");
            A05.A0S();
            for (AnonymousClass6UV r4 : r9.A00) {
                if (r4 != null) {
                    A05.A0T();
                    A05.A0G("creation_time", r4.A02);
                    if (r4.A03 != null) {
                        A05.A0d(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                        C29161Ov.A00(A05, r4.A03);
                    }
                    String str = r4.A04;
                    if (str != null) {
                        A05.A0H("container_module", str);
                    }
                    String str2 = r4.A05;
                    if (str2 != null) {
                        A05.A0H("radio_type", str2);
                    }
                    A05.A0I("is_carousel_bumped_post", r4.A06);
                    A05.A0F("feed_position", r4.A01);
                    A05.A0F("carousel_index", r4.A00);
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
