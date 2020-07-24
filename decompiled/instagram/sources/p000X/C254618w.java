package p000X;

import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.Map;

/* renamed from: X.18w  reason: invalid class name and case insensitive filesystem */
public final class C254618w {
    public final AnonymousClass0RN A00;

    public final void A00(C06590Pq r4, Integer num, Map map) {
        String str;
        String str2;
        C43761v2 r2 = new C43761v2(AnonymousClass0QT.A00(r4, this.A00).A02("push_notification_setting"));
        if (num == Constants.ZERO) {
            str = "enabled";
        } else {
            str = "disabled";
        }
        r2.A08(RealtimeProtocol.USERS_ACCOUNT_STATUS, str);
        if (map != null) {
            str2 = map.toString();
        } else {
            str2 = null;
        }
        r2.A08("extra_setting_data", str2);
        r2.A01();
    }

    public C254618w(AnonymousClass0RN r1) {
        this.A00 = r1;
    }
}
