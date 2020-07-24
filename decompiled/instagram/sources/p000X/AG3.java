package p000X;

import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AG3 */
public final class AG3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CAM A00;

    public AG3(CAM cam) {
        this.A00 = cam;
    }

    public final boolean onPreDraw() {
        this.A00.A03.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        this.A00.A03.getLocationOnScreen(iArr);
        CAM cam = this.A00;
        int[] iArr2 = cam.A0J;
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        int[] iArr3 = cam.A0K;
        if (iArr3 != null) {
            float width = ((float) iArr3[0]) / ((float) cam.A03.getWidth());
            CAM cam2 = this.A00;
            float height = ((float) cam2.A0K[1]) / ((float) cam2.A03.getHeight());
            this.A00.A03.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A00.A03.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A00.A03.setScaleX(width);
            this.A00.A03.setScaleY(height);
        }
        this.A00.A03.setTranslationX((float) i);
        this.A00.A03.setTranslationY((float) i2);
        AnonymousClass1EG r2 = this.A00.A0E;
        r2.A05(0.0d, true);
        r2.A07(this.A00);
        r2.A03(1.0d);
        return true;
    }
}
