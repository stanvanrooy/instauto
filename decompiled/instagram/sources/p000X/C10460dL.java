package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0dL  reason: invalid class name and case insensitive filesystem */
public final class C10460dL {
    public static final AnonymousClass0Sw A03 = AnonymousClass0Sw.A00();
    public AtomicLong A00 = new AtomicLong(300000);
    public final SharedPreferences A01;
    public final C10930e7 A02;

    public final synchronized long A00(String str) {
        long j;
        C10470dM A002;
        j = -1;
        String str2 = null;
        try {
            str2 = this.A01.getString(str, (String) null);
        } catch (ClassCastException e) {
            AnonymousClass0DB.A0P("NotificationDeliveryStoreSharedPreferences", e, "fail to read notifId %s", str);
        }
        if (!(str2 == null || (A002 = C10470dM.A00(str2)) == null)) {
            j = A002.A00 - A002.A01;
        }
        this.A01.edit().remove(str).apply();
        return j;
    }

    public C10460dL(Context context, String str, C10930e7 r6) {
        this.A01 = AnonymousClass0T6.A00.A00(context, new AnonymousClass0T8(AnonymousClass000.A0E("rti.mqtt.fbns_notification_store_", str)).A00, false);
        this.A02 = r6;
    }
}
