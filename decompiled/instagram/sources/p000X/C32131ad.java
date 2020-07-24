package p000X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1ad  reason: invalid class name and case insensitive filesystem */
public final class C32131ad {
    public static int A00 = 2131231510;

    public static void A00(View view, int i, boolean z) {
        if (view == null) {
            return;
        }
        if (z && view.getVisibility() == 0) {
            return;
        }
        if (z || view.getVisibility() == 0) {
            view.clearAnimation();
            float alpha = view.getAlpha();
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            if (z) {
                f = 1.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, f);
            alphaAnimation.setDuration((long) i);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            alphaAnimation.setAnimationListener(new C49522Co(view, z));
            view.startAnimation(alphaAnimation);
        }
    }
}
