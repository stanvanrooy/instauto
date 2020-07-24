package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* renamed from: X.11x  reason: invalid class name and case insensitive filesystem */
public final class C238111x extends C237311p {
    public final boolean A02(Context context, String str) {
        return true;
    }

    public final void A01(int i, Context context) {
        String str;
        if ("com.sec.android.app.launcher".equals(C06460Pd.A02(context))) {
            boolean z = false;
            if (Build.VERSION.SDK_INT > 23) {
                z = true;
            }
            if (z) {
                str = "com.sec.intent.action.BADGE_COUNT_UPDATE";
                Intent intent = new Intent(str);
                intent.putExtra("badge_count", i);
                intent.putExtra("badge_count_package_name", context.getPackageName());
                intent.putExtra("badge_count_class_name", C237311p.A00(context).getClassName());
                context.sendBroadcast(intent);
            }
        }
        str = "android.intent.action.BADGE_COUNT_UPDATE";
        try {
            Intent intent2 = new Intent(str);
            intent2.putExtra("badge_count", i);
            intent2.putExtra("badge_count_package_name", context.getPackageName());
            intent2.putExtra("badge_count_class_name", C237311p.A00(context).getClassName());
            context.sendBroadcast(intent2);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }
}
