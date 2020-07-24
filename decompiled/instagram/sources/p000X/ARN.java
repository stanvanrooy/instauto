package p000X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.ARN */
public final class ARN implements View.OnTouchListener {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public final /* synthetic */ BrowserLiteFragment A02;

    public ARN(BrowserLiteFragment browserLiteFragment) {
        this.A02 = browserLiteFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getScrollY() <= 10) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A00 = motionEvent.getX();
                this.A01 = motionEvent.getY();
                return false;
            } else if (action == 2 && motionEvent.getY() - this.A01 >= 10.0f) {
                if (Math.abs(motionEvent.getX() - this.A00) * 2.0f < Math.abs(motionEvent.getY() - this.A01)) {
                    BrowserLiteFragment browserLiteFragment = this.A02;
                    browserLiteFragment.A8u(6, browserLiteFragment.A0N);
                }
            }
        }
        return false;
    }
}
