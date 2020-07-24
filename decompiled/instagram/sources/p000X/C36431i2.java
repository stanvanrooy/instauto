package p000X;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: X.1i2  reason: invalid class name and case insensitive filesystem */
public final class C36431i2 extends C019000b {
    public static View A09(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i);
        }
        View findViewById = activity.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void A0A(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !AnonymousClass2WT.A00(activity)) {
            activity.recreate();
        }
    }

    public static void A0B(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C11800fh) {
                ((C11800fh) activity).Bti(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof C11790fg) {
            AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), new AnonymousClass72R(strArr, activity, i), 442050154);
        }
    }

    public static boolean A0C(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }
}
