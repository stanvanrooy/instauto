package com.instagram.common.p004ui.widget.framelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.AnonymousClass1EM;
import p000X.C31841a5;
import p000X.C39121mO;
import p000X.C39131mP;

/* renamed from: com.instagram.common.ui.widget.framelayout.MediaFrameLayout */
public class MediaFrameLayout extends FrameLayout implements C31841a5 {
    public float A00;
    public final boolean A01;

    public void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f != -1.0f) {
            C39131mP A012 = C39121mO.A01(i, i2, f, this.A01);
            i = A012.A01;
            i2 = A012.A00;
        }
        super.onMeasure(i, i2);
    }

    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public MediaFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public MediaFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2m);
        this.A01 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
