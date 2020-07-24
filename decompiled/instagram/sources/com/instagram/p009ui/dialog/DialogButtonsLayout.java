package com.instagram.p009ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000X.C25913Bc3;

/* renamed from: com.instagram.ui.dialog.DialogButtonsLayout */
public class DialogButtonsLayout extends LinearLayout {
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getChildAt(i4).getMeasuredHeight() > i3) {
                i3 = getChildAt(i4).getMeasuredHeight();
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, C25913Bc3.MAX_SIGNED_POWER_OF_TWO));
    }

    public DialogButtonsLayout(Context context) {
        super(context);
    }

    public DialogButtonsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
