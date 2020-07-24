package com.instagram.rtc.presentation.participants;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000X.C13150hy;

public final class RtcCallParticipantsLayout extends ConstraintLayout {
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C13150hy.A02(motionEvent, "event");
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsLayout(Context context) {
        super(context);
        C13150hy.A02(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C13150hy.A02(context, "context");
        C13150hy.A02(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcCallParticipantsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13150hy.A02(context, "context");
        C13150hy.A02(attributeSet, "attrs");
    }
}
