package com.instagram.creation.base.p029ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass1XB;

/* renamed from: com.instagram.creation.base.ui.ConstrainedTextureView */
public class ConstrainedTextureView extends TextureView {
    public float A00 = 1.0f;

    public void setAspectRatio(float f) {
        if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            throw new IllegalArgumentException();
        } else if (this.A00 != f) {
            this.A00 = f;
            requestLayout();
        }
    }

    public float getAspectRatio() {
        return this.A00;
    }

    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int i3;
        super.onMeasure(i, i2);
        if (this.A00 < 1.0f) {
            i3 = getMeasuredHeight();
            measuredWidth = (int) ((((float) i3) * this.A00) + 0.5f);
        } else {
            measuredWidth = getMeasuredWidth();
            i3 = (int) ((((float) measuredWidth) / this.A00) + 0.5f);
        }
        setMeasuredDimension(measuredWidth, i3);
    }

    public ConstrainedTextureView(Context context) {
        super(context);
    }

    public ConstrainedTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstrainedTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (AnonymousClass1XB.A00) {
            AnonymousClass1XB.A00(this);
        }
    }
}
