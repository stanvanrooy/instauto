package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AUK */
public final class AUK extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AUJ A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public AUK(AUJ auj) {
        this.A00 = auj;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double max;
        AUJ auj = this.A00;
        Integer num = auj.A00;
        if (num == Constants.A0N) {
            return false;
        }
        if (num == Constants.A0C) {
            max = Math.min((double) f2, -2000.0d);
        } else {
            max = Math.max((double) f2, 2000.0d);
        }
        AUJ.A00(auj, max);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        AUJ auj = this.A00;
        if (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            num = Constants.A0C;
        } else {
            num = Constants.ZERO;
        }
        auj.A00 = num;
        float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, auj.A02.getTranslationY() - f2);
        AUJ auj2 = this.A00;
        if (Float.compare(max, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0) {
            auj2.A00 = Constants.A0N;
        }
        auj2.A02.setTranslationY(max);
        return true;
    }
}
