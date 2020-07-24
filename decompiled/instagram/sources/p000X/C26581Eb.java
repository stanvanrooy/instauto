package p000X;

import android.app.Activity;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: X.1Eb  reason: invalid class name and case insensitive filesystem */
public final class C26581Eb {
    public static void A00(Activity activity, int i) {
        String str;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT != 26 || activity.getApplicationInfo().targetSdkVersion <= 26 || (!A01(activity, 16842840) && !A01(activity, 16842839) && !A01(activity, 16843763))) {
            try {
                activity.setRequestedOrientation(i);
            } catch (IllegalStateException e) {
                if ("Only fullscreen activities can request orientation".equals(e.getMessage())) {
                    Object[] objArr = new Object[1];
                    Class<?> cls = activity.getClass();
                    try {
                        str = (String) cls.getDeclaredField("__redex_internal_original_name").get(cls);
                    } catch (NoSuchFieldException unused) {
                        str = cls.getName();
                    } catch (Exception e2) {
                        throw new Error(e2);
                    }
                    objArr[0] = str;
                    AnonymousClass0DB.A0R("FixedOrientationCompat", e, "%s hit fixed orientation exception", objArr);
                    return;
                }
                throw e;
            }
        }
    }

    public static boolean A01(Activity activity, int i) {
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type != 18 || typedValue.data == 0) {
            return false;
        }
        return true;
    }
}
