package com.instagram.tagging.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import p000X.AnonymousClass0Z0;
import p000X.C26797Bsi;
import p000X.C26800Bsl;

public class PhotoScrollView extends ScrollView {
    public float A00;
    public C26800Bsl A01;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setScrollTarget(float f) {
        this.A00 = f;
        A00(this, f);
    }

    public static void A00(PhotoScrollView photoScrollView, float f) {
        int childCount = photoScrollView.getChildCount();
        if (childCount != 0) {
            photoScrollView.smoothScrollTo(0, (int) ((((float) (photoScrollView.getChildAt(childCount - 1).getBottom() + photoScrollView.getPaddingBottom())) * f) - ((float) (photoScrollView.getHeight() >> 1))));
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A01 != null) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0Z0.A06(674608206);
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new C26797Bsi(this), 500);
        AnonymousClass0Z0.A0D(1217616503, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass0Z0.A0C(1512504232, AnonymousClass0Z0.A05(-1070831124));
        return false;
    }

    public void setOnMeasureListener(C26800Bsl bsl) {
        this.A01 = bsl;
    }

    public PhotoScrollView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public PhotoScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }
}
