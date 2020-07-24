package com.instagram.reels.dashboard.p036ui.quickreaction;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.reels.dashboard.ui.quickreaction.ReactionCountBarView */
public class ReactionCountBarView extends View {
    public float A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public int A05;
    public Paint A06;
    public Path A07;
    public RectF A08;

    public final void A00(Context context, AttributeSet attributeSet) {
        Paint paint = new Paint();
        this.A06 = paint;
        paint.setAntiAlias(true);
        this.A07 = new Path();
        this.A08 = new RectF();
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = context.getTheme();
        theme.resolveAttribute(C0003R.attr.backgroundColorPrimary, typedValue, true);
        int i = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(C0003R.attr.backgroundColorPrimary, typedValue2, true);
        int i2 = typedValue2.data;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A30);
            this.A01 = obtainStyledAttributes.getColor(0, i);
            this.A03 = obtainStyledAttributes.getColor(2, i2);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A00 = obtainStyledAttributes.getFloat(3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            obtainStyledAttributes.recycle();
        } else {
            this.A01 = i;
            this.A03 = i2;
            this.A02 = 0;
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        this.A06.setColor(this.A03);
    }

    public final void onDraw(Canvas canvas) {
        Path path = this.A07;
        RectF rectF = this.A08;
        float f = (float) this.A02;
        path.addRoundRect(rectF, f, f, Path.Direction.CCW);
        canvas.clipPath(this.A07);
        canvas.drawColor(this.A01);
        canvas.save();
        float f2 = ((float) this.A04) * (1.0f - this.A00);
        canvas.translate(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f2);
        canvas.drawRect(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) this.A05, ((float) this.A04) - f2, this.A06);
        canvas.restore();
    }

    public void setFillPercentage(float f) {
        this.A00 = f;
        postInvalidate();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A05 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A04 = size;
        RectF rectF = this.A08;
        rectF.left = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        rectF.right = (float) this.A05;
        rectF.bottom = (float) size;
    }

    public ReactionCountBarView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public ReactionCountBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
