package p000X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.11u  reason: invalid class name and case insensitive filesystem */
public final class C237811u extends C237311p {
    public final void A01(int i, Context context) {
        try {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.setFlags(16);
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", C237311p.A00(context).getClassName());
            boolean z = false;
            if (i != 0) {
                z = true;
            }
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z);
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", context.getPackageName());
            context.sendBroadcast(intent);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }

    public final boolean A02(Context context, String str) {
        return str.equals("com.sonyericsson.home");
    }
}
