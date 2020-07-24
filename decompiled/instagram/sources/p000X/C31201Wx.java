package p000X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.1Wx  reason: invalid class name and case insensitive filesystem */
public final class C31201Wx {
    public static final C31221Wz A01(Context context) {
        Activity parent;
        C31221Wz A01;
        if (context != null) {
            Activity activity = (Activity) AnonymousClass0PK.A01(context, Activity.class);
            if (activity != null && (parent = activity.getParent()) != null && (A01 = A01(parent)) != null) {
                return A01;
            }
            if (!(activity instanceof C11840fl)) {
                activity = null;
            }
            C11840fl r1 = (C11840fl) activity;
            if (r1 != null) {
                return r1.AGw();
            }
        }
        return null;
    }

    public static final AnonymousClass1AM A00(Activity activity) {
        C13150hy.A02(activity, "activity");
        if (activity instanceof FragmentActivity) {
            AnonymousClass1AM A05 = ((FragmentActivity) activity).A05();
            C13150hy.A01(A05, "activity.supportFragmentManager");
            return A05;
        }
        throw new UnsupportedOperationException(AnonymousClass000.A0E("Activity not support ", activity.getClass().getName()));
    }
}
