package p000X;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.AMV */
public final class AMV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AMN A00;

    public AMV(AMN amn) {
        this.A00 = amn;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A00.A01.getLayoutParams();
        layoutParams.weight = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        layoutParams.width = ((Integer) valueAnimator.getAnimatedValue(IgReactMediaPickerNativeModule.WIDTH)).intValue();
        if (this.A00.A03) {
            layoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue("margin")).intValue();
        } else {
            layoutParams.rightMargin = ((Integer) valueAnimator.getAnimatedValue("margin")).intValue();
        }
        this.A00.A01.setLayoutParams(layoutParams);
    }
}
