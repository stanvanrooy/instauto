package p000X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.11r  reason: invalid class name and case insensitive filesystem */
public final class C237511r extends C237311p {
    public final void A01(int i, Context context) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", C237311p.A00(context).getClassName());
        bundle.putInt("badgenumber", i);
        try {
            context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }

    public final boolean A02(Context context, String str) {
        if (Build.VERSION.SDK_INT < 21 || !str.equals("com.huawei.android.launcher")) {
            return false;
        }
        return true;
    }
}
