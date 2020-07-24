package p000X;

import android.view.animation.Interpolator;

/* renamed from: X.1Xj  reason: invalid class name and case insensitive filesystem */
public final class C31271Xj implements Interpolator {
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
