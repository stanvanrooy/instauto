package com.instagram.p009ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.ui.text.BadgeTextView */
public class BadgeTextView extends TextView {
    public final void onMeasure(int i, int i2) {
        int A06 = AnonymousClass0Z0.A06(-1559050703);
        super.onMeasure(i, i2);
        if (getMeasuredWidth() < getMeasuredHeight()) {
            int measuredHeight = (getMeasuredHeight() - getMeasuredWidth()) >> 1;
            setPadding(getPaddingLeft() + measuredHeight, getPaddingTop(), getPaddingRight() + measuredHeight, getPaddingBottom());
            setMeasuredDimension(getMeasuredHeight(), getMeasuredHeight());
        }
        AnonymousClass0Z0.A0D(-994216764, A06);
    }

    public BadgeTextView(Context context) {
        super(context);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
