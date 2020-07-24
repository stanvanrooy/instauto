package p000X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.11p  reason: invalid class name and case insensitive filesystem */
public abstract class C237311p {
    public abstract void A01(int i, Context context);

    public abstract boolean A02(Context context, String str);

    public static final ComponentName A00(Context context) {
        return new ComponentName(context, context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
    }
}
