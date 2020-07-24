package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class RawTouchGesture extends Gesture {
    public final Gesture.GestureType getGestureType() {
        return Gesture.GestureType.RAW_TOUCH;
    }

    public RawTouchGesture(long j, float f, float f2, Gesture.GestureState gestureState, boolean z, float f3, float f4) {
        super(j, f, f2, gestureState, z, f3, f4);
    }
}
