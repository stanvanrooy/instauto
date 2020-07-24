package p000X;

import android.graphics.Paint;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1wM  reason: invalid class name and case insensitive filesystem */
public final class C44561wM extends C32511bO {
    public final float A00;
    public final Paint A01 = new Paint();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0049  */
    public final void BXS(ReboundViewPager reboundViewPager, View view, float f, int i) {
        float A012 = (float) C27181Gu.A01((double) f, -1.0d, 1.0d, -90.0d, 90.0d);
        view.setCameraDistance(this.A00);
        view.setTranslationX(((float) reboundViewPager.getWidth()) * f);
        int i2 = 0;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            view.setRotationY(A012);
            view.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        } else if (f < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            view.setRotationY(A012);
            view.setPivotX((float) reboundViewPager.getWidth());
        } else {
            view.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setPivotX(((float) reboundViewPager.getWidth()) / 2.0f);
            view.setPivotY(((float) reboundViewPager.getHeight()) / 2.0f);
            view.setLayerType(0, this.A01);
            if (Math.abs(f) >= 1.0f) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        view.setPivotY(((float) reboundViewPager.getHeight()) / 2.0f);
        view.setLayerType(2, this.A01);
        if (Math.abs(f) >= 1.0f) {
        }
        view.setVisibility(i2);
    }

    public final boolean Bra(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    public C44561wM(float f) {
        this.A00 = f;
    }
}
