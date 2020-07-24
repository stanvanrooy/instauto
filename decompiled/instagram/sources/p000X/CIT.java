package p000X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CIT */
public final class CIT extends LinearLayout implements C44611wS {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = -1;
    public Paint A03;
    public float A04;
    public float A05;
    public ValueAnimator A06;

    public CIT(Context context) {
        super(context, (AttributeSet) null, 0);
        setOrientation(0);
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.A03.setStrokeWidth((float) getResources().getDimensionPixelSize(C0003R.dimen.segmented_tab_indicator_thicc));
        this.A03.setColor(C019000b.A00(context, C0003R.color.igds_primary_text));
        setWillNotDraw(false);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (getChildCount() > 0) {
            canvas2.drawLine(this.A04, ((float) getHeight()) - (this.A03.getStrokeWidth() / 2.0f), this.A05, ((float) getHeight()) - (this.A03.getStrokeWidth() / 2.0f), this.A03);
        }
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
        A01(i, (int) Math.ceil((double) (((float) i) + f)), f);
    }

    public final void onPageSelected(int i) {
    }

    public static final void A00(C220439eh r3, CIV civ) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (civ == CIV.FIXED) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        r3.setLayoutParams(layoutParams);
    }

    public final void A01(int i, int i2, float f) {
        View childAt = getChildAt(i);
        View childAt2 = getChildAt(i2);
        if (childAt != null && childAt2 != null) {
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int left2 = childAt2.getLeft();
            int right2 = childAt2.getRight();
            float f2 = 1.0f - f;
            this.A04 = (((float) left2) * f) + (((float) left) * f2);
            float f3 = (float) right;
            float f4 = (float) right2;
            float f5 = (f4 * f) + (f2 * f3);
            this.A05 = f5;
            if (Math.abs(f5 - f3) > Math.abs(f5 - f4)) {
                i = i2;
            }
            if (this.A00 != i) {
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    if (i3 == i) {
                        C220439eh r3 = (C220439eh) getChildAt(i3);
                        r3.A00.setTextColor(C019000b.A00(r3.getContext(), C0003R.color.igds_primary_text));
                        r3.setSelected(true);
                        this.A02 = i3;
                    } else {
                        C220439eh r32 = (C220439eh) getChildAt(i3);
                        r32.A00.setTextColor(C019000b.A00(r32.getContext(), C0003R.color.igds_secondary_text));
                        r32.setSelected(false);
                    }
                }
                this.A00 = i;
            }
            invalidate();
        }
    }

    public int getSelectedIndex() {
        return this.A01;
    }

    public void setSelectedIndex(int i) {
        if (i < getChildCount() && this.A02 != i) {
            this.A02 = i;
            ValueAnimator valueAnimator = this.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.A06 = valueAnimator2;
            valueAnimator2.setDuration(250);
            this.A06.setInterpolator(new AccelerateDecelerateInterpolator());
            this.A06.addUpdateListener(new CIX(this, i));
            this.A06.addListener(new CIY(this));
            this.A06.setIntValues(new int[]{this.A01, i});
            this.A06.start();
        }
    }
}
