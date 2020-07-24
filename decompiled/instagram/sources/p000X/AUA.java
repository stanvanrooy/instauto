package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.browser.lite.views.BrowserLiteGestureDelegateView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AUA */
public final class AUA extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ BrowserLiteGestureDelegateView A00;

    public AUA(BrowserLiteGestureDelegateView browserLiteGestureDelegateView) {
        this.A00 = browserLiteGestureDelegateView;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        if ((browserLiteGestureDelegateView.A04 == Constants.A0C && browserLiteGestureDelegateView.A03.getWebViewScrollY() > 0) || f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return false;
        }
        this.A00.A03.A04(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true, (Runnable) null, (double) f2);
        this.A00.A06 = true;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int webViewScrollY = this.A00.A03.getWebViewScrollY();
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView = this.A00;
        if (browserLiteGestureDelegateView.A04 == Constants.A0C && browserLiteGestureDelegateView.A02.getTranslationY() == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (webViewScrollY <= 0 || this.A00.A05) {
                if (!this.A00.A03.A05.AfL()) {
                    BrowserLiteGestureDelegateView browserLiteGestureDelegateView2 = this.A00;
                    if (browserLiteGestureDelegateView2.A05 && (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || webViewScrollY > 0)) {
                        browserLiteGestureDelegateView2.A03.setWebViewScrollY((int) Math.max(((float) webViewScrollY) + f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
                        this.A00.A05 = true;
                        return false;
                    }
                }
            }
            return false;
        }
        BrowserLiteGestureDelegateView browserLiteGestureDelegateView3 = this.A00;
        browserLiteGestureDelegateView3.A05 = true;
        if (!browserLiteGestureDelegateView3.A07) {
            float translationY = browserLiteGestureDelegateView3.A02.getTranslationY() - (f2 * 0.5f);
            this.A00.A03.A04(translationY, false, (Runnable) null, 0.0d);
            if (translationY <= ((float) this.A00.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
