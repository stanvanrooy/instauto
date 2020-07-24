package p000X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.1Zw  reason: invalid class name and case insensitive filesystem */
public final class C31771Zw {
    public static Interpolator A00(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new AnonymousClass9GW(f, f2, f3, f4);
    }
}
