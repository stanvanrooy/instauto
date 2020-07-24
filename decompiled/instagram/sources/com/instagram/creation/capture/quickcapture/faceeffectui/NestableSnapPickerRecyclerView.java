package com.instagram.creation.capture.quickcapture.faceeffectui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class NestableSnapPickerRecyclerView extends RecyclerView {
    public final boolean A14(int i, int i2) {
        return super.A14((int) (((double) i) * 0.7d), i2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestableSnapPickerRecyclerView(Context context) {
        super(context);
    }

    public NestableSnapPickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestableSnapPickerRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
