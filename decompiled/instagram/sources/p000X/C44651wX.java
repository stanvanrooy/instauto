package p000X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1wX  reason: invalid class name and case insensitive filesystem */
public class C44651wX extends C44661wY {
    public float A00;
    public int A01 = 0;
    public int A02 = 0;
    public PointF A03;
    public boolean A04 = false;
    public final DisplayMetrics A05;
    public final LinearInterpolator A06 = new LinearInterpolator();
    public final DecelerateInterpolator A07 = new DecelerateInterpolator();

    public void A02() {
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = null;
    }

    public int A0B(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public void A04(int i, int i2, AnonymousClass1Xv r10, C44671wZ r11) {
        if (this.A03.A0L.A0R() == 0) {
            A01();
            return;
        }
        int i3 = this.A01;
        int i4 = i3 - i;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.A01 = i4;
        int i5 = this.A02;
        int i6 = i5 - i2;
        if (i5 * i6 <= 0) {
            i6 = 0;
        }
        this.A02 = i6;
        if (i4 == 0 && i6 == 0) {
            PointF A002 = A00(this.A00);
            if (A002 != null) {
                float f = A002.x;
                if (!(f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A002.y == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)) {
                    float f2 = A002.y;
                    float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
                    float f3 = f / sqrt;
                    A002.x = f3;
                    float f4 = f2 / sqrt;
                    A002.y = f4;
                    this.A03 = A002;
                    this.A01 = (int) (f3 * 10000.0f);
                    this.A02 = (int) (f4 * 10000.0f);
                    r11.A00((int) (((float) this.A01) * 1.2f), (int) (((float) this.A02) * 1.2f), (int) (((float) A09(10000)) * 1.2f), this.A06);
                    return;
                }
            }
            r11.A04 = this.A00;
            A01();
        }
    }

    public float A06(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int A07() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 0;
        }
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 1;
        }
        return -1;
    }

    public int A08() {
        PointF pointF = this.A03;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 0;
        }
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return 1;
        }
        return -1;
    }

    public int A0C(View view, int i) {
        C31391Ya r2 = this.A02;
        if (r2 == null || !r2.A1b()) {
            return 0;
        }
        AnonymousClass1ZN r1 = (AnonymousClass1ZN) view.getLayoutParams();
        return A0B(r2.A0W(view) - r1.leftMargin, r2.A0X(view) + r1.rightMargin, r2.A0P(), r2.A06 - r2.A0Q(), i);
    }

    public C44651wX(Context context) {
        this.A05 = context.getResources().getDisplayMetrics();
    }

    public void A05(View view, AnonymousClass1Xv r11, C44671wZ r12) {
        int i;
        int A0C = A0C(view, A07());
        int A08 = A08();
        C31391Ya r3 = this.A02;
        if (r3 == null || !r3.A1c()) {
            i = 0;
        } else {
            AnonymousClass1ZN r1 = (AnonymousClass1ZN) view.getLayoutParams();
            i = A0B(r3.A0Y(view) - r1.topMargin, r3.A0V(view) + r1.bottomMargin, r3.A0U(), r3.A03 - r3.A0T(), A08);
        }
        int A0A = A0A((int) Math.sqrt((double) ((A0C * A0C) + (i * i))));
        if (A0A > 0) {
            r12.A00(-A0C, -i, A0A, this.A07);
        }
    }

    public int A09(int i) {
        float abs = (float) Math.abs(i);
        if (!this.A04) {
            this.A00 = A06(this.A05);
            this.A04 = true;
        }
        return (int) Math.ceil((double) (abs * this.A00));
    }

    public final int A0A(int i) {
        return (int) Math.ceil(((double) A09(i)) / 0.3356d);
    }
}
