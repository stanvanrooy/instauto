package com.instagram.p009ui.animation.pushlayout;

import android.content.Context;
import android.util.AttributeSet;
import p000X.C28780Cma;

/* renamed from: com.instagram.ui.animation.pushlayout.PushFastScrollListContainerFrameLayout */
public class PushFastScrollListContainerFrameLayout extends C28780Cma {
    public float getXFraction() {
        int width = getWidth();
        float x = getX();
        if (width != 0) {
            return x / ((float) width);
        }
        return x;
    }

    public void setXFraction(float f) {
        float f2;
        int width = getWidth();
        if (width > 0) {
            f2 = f * ((float) width);
        } else {
            f2 = -9999.0f;
        }
        setX(f2);
    }

    public PushFastScrollListContainerFrameLayout(Context context) {
        super(context);
    }

    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public PushFastScrollListContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
