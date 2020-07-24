package com.instagram.p009ui.widget.touchconstrainedrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.instagram.ui.widget.touchconstrainedrecyclerview.TouchConstrainedRecyclerView */
public class TouchConstrainedRecyclerView extends RecyclerView {
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && A0M(motionEvent.getX(), motionEvent.getY()) == null) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchConstrainedRecyclerView(Context context) {
        super(context);
    }

    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchConstrainedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
