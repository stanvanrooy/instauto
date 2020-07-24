package com.instagram.common.p004ui.widget.zoomcontainer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.C31831a3;

/* renamed from: com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer */
public class SimpleZoomableViewContainer extends FrameLayout implements C31831a3 {
    public final void ABv(View view) {
        super.detachViewFromParent(view);
    }

    public final void A67(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.attachViewToParent(view, i, layoutParams);
    }

    public SimpleZoomableViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleZoomableViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
