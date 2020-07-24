package p000X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.ARM */
public final class ARM implements View.OnTouchListener {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A01;
    public final /* synthetic */ BrowserLiteFragment A02;

    public ARM(BrowserLiteFragment browserLiteFragment) {
        this.A02 = browserLiteFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A00 = motionEvent.getY();
        } else if (action == 1 && this.A01 == 2 && Math.abs(motionEvent.getY() - this.A00) > 10.0f) {
            this.A02.A04++;
        }
        this.A01 = motionEvent.getAction();
        return false;
    }
}
