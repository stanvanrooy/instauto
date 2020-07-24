package p000X;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.B5L */
public final class B5L {
    public static void A00(Context context, ComponentName componentName, IllegalArgumentException illegalArgumentException) {
        int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
            throw illegalArgumentException;
        }
    }
}
