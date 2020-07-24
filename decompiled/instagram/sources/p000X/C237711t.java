package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.11t  reason: invalid class name and case insensitive filesystem */
public final class C237711t extends C237311p {
    public static final Uri A00 = Uri.parse("content://com.smartisanos.launcher.badge");

    public final void A01(int i, Context context) {
        Bundle bundle = new Bundle();
        bundle.putInt("badge_num", i);
        try {
            context.getContentResolver().call(A00, "updateMessageBadge", (String) null, bundle);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }

    public final boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 23 || !str.equals("com.smartisanos.launcher")) {
            return false;
        }
        return true;
    }
}
