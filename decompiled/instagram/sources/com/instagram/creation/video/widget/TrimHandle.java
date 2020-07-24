package com.instagram.creation.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class TrimHandle extends View {
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getBackground().getIntrinsicWidth(), View.MeasureSpec.getSize(i2));
    }

    public TrimHandle(Context context) {
        super(context);
    }

    public TrimHandle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TrimHandle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
