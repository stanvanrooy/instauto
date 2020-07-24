package com.instagram.direct.p018ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;

/* renamed from: com.instagram.direct.ui.NonFocusingHorizontalScrollView */
public class NonFocusingHorizontalScrollView extends HorizontalScrollView {
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return true;
    }

    public final ArrayList getFocusables(int i) {
        return new ArrayList();
    }

    public NonFocusingHorizontalScrollView(Context context) {
        super(context);
    }

    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonFocusingHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
