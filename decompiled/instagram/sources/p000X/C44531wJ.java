package p000X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1wJ  reason: invalid class name and case insensitive filesystem */
public final class C44531wJ extends C32511bO {
    public Integer A00 = Constants.ZERO;
    public final float A01;

    public static float A00(float f) {
        return (float) C27181Gu.A01((double) f, -1.0d, 1.0d, -90.0d, 90.0d);
    }

    public final boolean Bra(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006f  */
    public final void BXS(ReboundViewPager reboundViewPager, View view, float f, int i) {
        Integer num;
        float round = ((float) Math.round(f * 1000.0f)) / 1000.0f;
        view.setCameraDistance(this.A01);
        view.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        view.setTranslationX(((float) reboundViewPager.getWidth()) * round);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        float A02 = C06420Oz.A02(Math.abs(round), 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.8f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, true);
        C163376y4 r4 = (C163376y4) view.getTag();
        ImageView AJB = r4.AJB();
        if (round > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && round < 1.0f) {
            if (this.A00 == Constants.ZERO) {
                view.setRotationY(A00(round));
                view.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
            AJB.setAlpha(A02);
            num = Constants.ZERO;
            int i2 = 4;
            if (AJB.getAlpha() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            }
            AJB.setVisibility(i2);
            r4.Bft(num);
        } else if (round >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || round <= -1.0f) {
            if (round == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                if (this.A00 == Constants.ZERO) {
                    view.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view.setPivotX(((float) reboundViewPager.getWidth()) / 2.0f);
                    view.setPivotY(((float) reboundViewPager.getHeight()) / 2.0f);
                }
                AJB.setAlpha(A02);
                num = Constants.ONE;
            } else {
                if (this.A00 == Constants.ZERO) {
                    view.setTranslationY(((float) (-reboundViewPager.getHeight())) * 2.0f);
                    view.setScaleX(0.001f);
                    view.setScaleY(0.001f);
                    view.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    view.setPivotX(((float) reboundViewPager.getWidth()) / 2.0f);
                    view.setPivotY(((float) reboundViewPager.getHeight()) / 2.0f);
                }
                AJB.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                num = Constants.A0C;
            }
            int i22 = 4;
            if (AJB.getAlpha() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                i22 = 0;
            }
            AJB.setVisibility(i22);
            r4.Bft(num);
        } else {
            if (this.A00 == Constants.ZERO) {
                view.setRotationY(A00(round));
                view.setPivotX((float) reboundViewPager.getWidth());
            }
            AJB.setAlpha(A02);
            num = Constants.ZERO;
            int i222 = 4;
            if (AJB.getAlpha() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            }
            AJB.setVisibility(i222);
            r4.Bft(num);
        }
        view.setPivotY(((float) reboundViewPager.getHeight()) / 2.0f);
        AJB.setAlpha(A02);
        num = Constants.ZERO;
        int i2222 = 4;
        if (AJB.getAlpha() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
        }
        AJB.setVisibility(i2222);
        r4.Bft(num);
    }

    public C44531wJ(float f) {
        this.A01 = f;
    }
}
