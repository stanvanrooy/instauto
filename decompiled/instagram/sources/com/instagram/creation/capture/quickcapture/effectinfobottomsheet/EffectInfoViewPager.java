package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import p000X.C25913Bc3;

public class EffectInfoViewPager extends ViewPager {
    public final void onMeasure(int i, int i2) {
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            i2 = View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    public EffectInfoViewPager(Context context) {
        super(context);
    }

    public EffectInfoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
