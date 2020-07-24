package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class PinchGesture extends Gesture {
    public final float scale;

    /* JADX WARNING: Illegal instructions before constructor call */
    public PinchGesture(long j, float f, float f2, float f3, Gesture.GestureState gestureState, boolean z, float f4, float f5) {
        super(r1, f2, r4, r5, z, f4, f5);
        long j2 = j;
        float f6 = f3;
        Gesture.GestureState gestureState2 = gestureState;
        this.scale = f;
    }

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.PINCH;
    }
}
