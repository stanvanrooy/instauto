package com.instagram.creation.capture.quickcapture;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.p004ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;

public class CaptureFormatPickerTouchableContainer extends TouchInterceptorLinearLayout {
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    public CaptureFormatPickerTouchableContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CaptureFormatPickerTouchableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
