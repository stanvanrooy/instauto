package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.CZA */
public final class CZA {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public float A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public View A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public IgTextView A05;
    public TouchInterceptorFrameLayout A06;
    public C31801Zz A07;
    public C32151ag A08;
    public RoundedCornerConstraintLayout A09;
    public BY9[] A0A;

    public final float A00() {
        float height = (float) (((double) this.A03.getChildAt(1).getHeight()) * 2.5d);
        if (this.A00 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            View childAt = this.A03.getChildAt(0);
            this.A00 = ((float) childAt.getHeight()) + ((float) ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin);
        }
        return height + this.A00;
    }
}
