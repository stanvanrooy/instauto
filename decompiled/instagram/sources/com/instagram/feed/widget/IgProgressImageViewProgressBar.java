package com.instagram.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class IgProgressImageViewProgressBar extends ProgressBar {
    public final synchronized void onDraw(Canvas canvas) {
        canvas.save();
        canvas.rotate(270.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        super.onDraw(canvas);
        canvas.restore();
    }

    public final synchronized void onMeasure(int i, int i2) {
        Drawable progressDrawable = getProgressDrawable();
        setMeasuredDimension(progressDrawable.getIntrinsicWidth(), progressDrawable.getIntrinsicHeight());
    }

    public IgProgressImageViewProgressBar(Context context) {
        super(context);
    }

    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IgProgressImageViewProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
