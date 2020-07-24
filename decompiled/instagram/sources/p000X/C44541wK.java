package p000X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1wK  reason: invalid class name and case insensitive filesystem */
public final class C44541wK extends C32511bO {
    public final float A00 = 1.0f;
    public final float A01;
    public final int A02;
    public final int A03;

    public C44541wK(int i, int i2, float f) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = f;
    }

    private float A00(float f) {
        float abs = Math.abs(f);
        if (abs <= 1.0f) {
            return (float) C27181Gu.A01((double) abs, 0.0d, 1.0d, (double) this.A00, (double) this.A01);
        }
        return this.A01;
    }

    public final void BXS(ReboundViewPager reboundViewPager, View view, float f, int i) {
        float A002 = A00(f);
        if (view.getHeight() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass5MF(this, view, A002));
        } else {
            view.setScaleX(A002);
            view.setScaleY(A002);
            view.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setPivotY(((float) view.getHeight()) / 2.0f);
        }
        float f2 = f - ((float) ((int) f));
        if (((double) Math.abs(f2)) >= 0.5d) {
            if (f2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f2 += 1.0f;
            } else {
                f2 -= 1.0f;
            }
        }
        int round = Math.round(f - f2);
        float A003 = A00(f2) * ((float) this.A03);
        int i2 = this.A02;
        float f3 = (float) i2;
        float width = (((float) reboundViewPager.getWidth()) / 2.0f) + ((f2 - 0.5f) * A003) + (f3 * f2);
        float A004 = A00(f2 + 1.0f);
        float f4 = (float) this.A03;
        float f5 = A004 * f4;
        float f6 = A003 + width + f3;
        float A005 = (width - f3) - (A00(f2 - 1.0f) * f4);
        if (round != 0) {
            if (round == 1) {
                width = f6;
            } else if (round == -1) {
                width = A005;
            } else if (round > 0) {
                width = (f4 * this.A01 * ((float) (round - 2))) + f6 + f5 + ((float) (i2 * (round - 1)));
            } else {
                int i3 = round + 1;
                width = (f4 * this.A01 * ((float) i3)) + A005 + ((float) (i2 * i3));
            }
        }
        view.setTranslationX(width);
    }
}
