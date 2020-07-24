package p000X;

import android.view.View;
import android.view.animation.RotateAnimation;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AJ0 */
public final class AJ0 {
    public static final AnonymousClass1EA A00 = AnonymousClass1EA.A00(5.0d, 10.0d);

    public static RotateAnimation A00() {
        RotateAnimation rotateAnimation = new RotateAnimation(-15.0f, 20.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(7);
        rotateAnimation.setDuration(200);
        return rotateAnimation;
    }

    public static C476524w A01(View view) {
        C476524w A07 = C476624x.A07(view);
        A07.A0N();
        C476524w A0T = A07.A0S(A00).A0T(true);
        A0T.A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        A0T.A0L(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, -1.0f);
        A0T.A0M(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, -1.0f);
        return A0T;
    }

    public static void A02(View view) {
        C476524w A07 = C476624x.A07(view);
        A07.A0N();
        C476524w A0T = A07.A0P(0.5f).A0T(true);
        A0T.A0G(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0T.A07 = 8;
        A0T.A0O();
    }

    public static void A03(View view, C476824z r3) {
        C476524w A07 = C476624x.A07(view);
        A07.A0N();
        C476524w A0T = A07.A0P(0.5f).A0T(true);
        A0T.A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        A0T.A09 = r3;
        A0T.A0O();
    }

    public static void A04(View view, C476824z r5) {
        C476524w A07 = C476624x.A07(view);
        A07.A0N();
        C476524w A0S = A07.A0S(A00);
        A0S.A0L(1.0f, 0.5f, (float) (view.getWidth() >> 1));
        A0S.A0M(1.0f, 0.5f, (float) (view.getHeight() >> 1));
        A0S.A0D(view.getTranslationX() + ((float) (view.getWidth() >> 2)));
        A0S.A0E(view.getTranslationY() + ((float) (view.getHeight() >> 2)));
        A0S.A09 = r5;
        A0S.A0O();
    }
}
