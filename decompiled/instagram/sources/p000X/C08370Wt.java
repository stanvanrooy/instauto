package p000X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.0Wt  reason: invalid class name and case insensitive filesystem */
public final class C08370Wt {
    public final Context A00;
    public final C08360Ws A01;

    public static void A00(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra("extra_notification_id");
        if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra)) {
            Intent intent2 = new Intent("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
            intent2.setPackage(stringExtra);
            intent2.putExtra("extra_notification_id", stringExtra2);
            intent2.putExtra("extra_processor_completed", true);
            new AnonymousClass0UR(context).A04(intent2, stringExtra);
        }
    }

    public C08370Wt(Context context, C08360Ws r2) {
        this.A00 = context;
        this.A01 = r2;
    }
}
