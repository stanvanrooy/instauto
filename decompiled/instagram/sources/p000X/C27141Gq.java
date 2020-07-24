package p000X;

import android.app.Activity;
import android.os.Build;
import com.facebook.forker.Process;

/* renamed from: X.1Gq  reason: invalid class name and case insensitive filesystem */
public final class C27141Gq {
    public static int A00;
    public static int A01;
    public static C35491gS A02;

    public static int A00(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            return activity.getWindow().getNavigationBarColor();
        }
        return -1;
    }

    public static void A01(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            while (activity.getParent() != null) {
                activity = activity.getParent();
            }
            activity.getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
            activity.getWindow().setNavigationBarColor(i);
        }
    }
}
