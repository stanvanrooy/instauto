package com.instagram.video.videocall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class VideoCallParticipantsLayout extends ConstraintLayout {
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int childCount = getChildCount() - 1;
            while (true) {
                if (childCount < 0) {
                    z = false;
                    break;
                }
                View childAt = getChildAt(childCount);
                float translationX = childAt.getTranslationX();
                float translationY = childAt.getTranslationY();
                if (x >= ((float) childAt.getLeft()) + translationX && x <= ((float) childAt.getRight()) + translationX && y >= ((float) childAt.getTop()) + translationY && y <= ((float) childAt.getBottom()) + translationY) {
                    z = true;
                    break;
                }
                childCount--;
            }
            if (!z) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public VideoCallParticipantsLayout(Context context) {
        super(context);
    }

    public VideoCallParticipantsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoCallParticipantsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
