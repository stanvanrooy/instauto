package p000X;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0Pg  reason: invalid class name and case insensitive filesystem */
public final class C06490Pg {
    public static ObjectAnimator A00(View view) {
        Keyframe ofFloat = Keyframe.ofFloat(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.5f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.53f, 1.0f);
        ofFloat2.setInterpolator(new DecelerateInterpolator(0.5f));
        Keyframe ofFloat3 = Keyframe.ofFloat(0.67f, 1.0f);
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 0.5f);
        ofFloat4.setInterpolator(new AccelerateInterpolator(0.5f));
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4}), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, new Keyframe[]{ofFloat, ofFloat2, ofFloat3, ofFloat4})});
        ofPropertyValuesHolder.setDuration(1500);
        ofPropertyValuesHolder.setRepeatCount(-1);
        return ofPropertyValuesHolder;
    }
}
