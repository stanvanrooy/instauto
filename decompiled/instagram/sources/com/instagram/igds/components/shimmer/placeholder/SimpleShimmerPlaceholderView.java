package com.instagram.igds.components.shimmer.placeholder;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1EM;

public class SimpleShimmerPlaceholderView extends View {
    public int A00;
    public int A01;
    public Paint A02;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3N);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A01 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setColor(this.A01);
    }

    public final void onDraw(Canvas canvas) {
        RectF rectF = new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight());
        float f = (float) this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    public SimpleShimmerPlaceholderView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public SimpleShimmerPlaceholderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
