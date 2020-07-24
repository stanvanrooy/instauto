package p000X;

import android.view.View;
import android.view.animation.Animation;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.AJ1 */
public final class AJ1 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AKB A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public AJ1(AKB akb, View view) {
        this.A01 = akb;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animation animation) {
        C476524w A07 = C476624x.A07(this.A00);
        A07.A0N();
        C476524w A0T = A07.A0S(AJ0.A00).A0T(true);
        A0T.A0L(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1.0f);
        A0T.A0M(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, -1.0f);
        A0T.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0T.A07 = 8;
        AJ9 aj9 = new AJ9(this, A0T);
        AKB akb = this.A01;
        if (akb.A0A == null) {
            akb.A0A = new ArrayList();
        }
        akb.A0A.add(A0T);
        A0T.A09 = aj9;
        A0T.A0O();
        this.A01.A0A.remove(animation);
    }
}
