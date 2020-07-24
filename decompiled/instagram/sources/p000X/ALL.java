package p000X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.ALL */
public final class ALL implements View.OnTouchListener {
    public final /* synthetic */ AL2 A00;

    public ALL(AL2 al2) {
        this.A00 = al2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getY() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return true;
        }
        return false;
    }
}
