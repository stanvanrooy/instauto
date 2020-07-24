package com.instagram.p009ui.animation.pushlayout;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: com.instagram.ui.animation.pushlayout.PushRefreshableNestedScrollingParent */
public class PushRefreshableNestedScrollingParent extends RefreshableNestedScrollingParent {
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

    public PushRefreshableNestedScrollingParent(Context context) {
        super(context);
    }

    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public PushRefreshableNestedScrollingParent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
