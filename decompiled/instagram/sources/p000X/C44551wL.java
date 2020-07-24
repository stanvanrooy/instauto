package p000X;

import android.graphics.Paint;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
public final class C44551wL extends C32511bO {
    public float A00;
    public int A01;
    public float A02;
    public int A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final float A09;
    public final Paint A0A = new Paint();

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    public final void BXS(ReboundViewPager reboundViewPager, View view, float f, int i) {
        float f2;
        float A012 = (float) C27181Gu.A01((double) f, -1.0d, 1.0d, -90.0d, 90.0d);
        if (this.A04) {
            float cameraDistance = view.getCameraDistance();
            float f3 = this.A09;
            if (cameraDistance != f3) {
                view.setCameraDistance(f3);
            }
        } else {
            view.setCameraDistance(this.A09);
        }
        if (this.A01 == 0 || this.A03 == 0) {
            int width = reboundViewPager.getWidth();
            this.A01 = width;
            this.A00 = ((float) width) / 2.0f;
            int height = reboundViewPager.getHeight();
            this.A03 = height;
            this.A02 = ((float) height) / 2.0f;
        }
        int i2 = 0;
        boolean z = false;
        if (Math.abs(f) < 1.0f) {
            z = true;
        }
        if (z || !this.A08) {
            view.setTranslationX(((float) this.A01) * f);
        }
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            if (f < 1.0f || !this.A07) {
                view.setRotationY(A012);
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            if (!z) {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
        if (f >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            view.setRotationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setPivotX(this.A00);
            A00(view);
            A01(view, 0);
        } else if (f > -1.0f || !this.A07) {
            view.setRotationY(A012);
            f2 = (float) this.A01;
        }
        if (!z) {
        }
        view.setVisibility(i2);
        view.setPivotX(f2);
        A00(view);
        A01(view, 2);
        if (!z) {
        }
        view.setVisibility(i2);
    }

    public final boolean Bra(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    private void A00(View view) {
        if (!this.A06 || view.getPivotY() != this.A02) {
            view.setPivotY(this.A02);
        }
    }

    private void A01(View view, int i) {
        if (!this.A05) {
            view.setLayerType(i, this.A0A);
        } else if (view.getLayerType() != i) {
            view.setLayerType(i, (Paint) null);
        }
    }

    public C44551wL(float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A09 = f;
        this.A04 = z;
        this.A07 = z2;
        this.A06 = z3;
        this.A05 = z4;
        this.A08 = z5;
    }
}
