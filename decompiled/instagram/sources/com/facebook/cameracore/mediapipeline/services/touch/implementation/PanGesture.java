package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class PanGesture extends Gesture {
    public final float translateX;
    public final float translateY;

    /* JADX WARNING: Illegal instructions before constructor call */
    public PanGesture(long j, float f, float f2, float f3, float f4, Gesture.GestureState gestureState, boolean z, float f5, float f6) {
        super(r1, f3, r4, r5, z, f5, f6);
        long j2 = j;
        float f7 = f4;
        Gesture.GestureState gestureState2 = gestureState;
        this.translateX = f;
        this.translateY = f2;
    }

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.PAN;
    }
}
