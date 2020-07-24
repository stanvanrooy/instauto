package p000X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: X.0Nt  reason: invalid class name and case insensitive filesystem */
public final class C06100Nt {
    public static void A00(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 21) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse(AnonymousClass000.A0E("package:", context.getPackageName())));
        }
        AnonymousClass1BH.A0F(intent, context);
    }

    public static boolean A01(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService("notification")).areNotificationsEnabled();
        }
        return new C16730p4(context).A03();
    }
}
