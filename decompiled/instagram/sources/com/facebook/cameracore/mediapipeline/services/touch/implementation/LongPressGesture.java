package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.implementation.Gesture;

public class LongPressGesture extends Gesture {
    public final Gesture.GestureType getGestureType() {
        return Gesture.GestureType.LONG_PRESS;
    }

    public LongPressGesture(long j, float f, float f2, Gesture.GestureState gestureState, boolean z, float f3, float f4) {
        super(j, f, f2, gestureState, z, f3, f4);
    }
}
