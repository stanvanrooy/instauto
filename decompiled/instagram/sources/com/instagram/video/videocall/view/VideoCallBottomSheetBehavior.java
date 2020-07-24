package com.instagram.video.videocall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class VideoCallBottomSheetBehavior extends BottomSheetBehavior {
    public final boolean A0H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        try {
            return super.A0H(coordinatorLayout, view, motionEvent);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public VideoCallBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
