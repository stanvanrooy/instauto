package com.instagram.p009ui.simplevideolayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.C31841a5;

/* renamed from: com.instagram.ui.simplevideolayout.SimpleVideoLayout */
public class SimpleVideoLayout extends FrameLayout implements C31841a5 {
    public final void detachViewFromParent(View view) {
        super.detachViewFromParent(view);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public SimpleVideoLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SimpleVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
