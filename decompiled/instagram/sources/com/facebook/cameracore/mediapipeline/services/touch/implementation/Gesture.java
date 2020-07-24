package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.react.uimanager.BaseViewManager;

public abstract class Gesture {
    public final GestureState gestureState;

    /* renamed from: id */
    public final long f164id;

    /* renamed from: x */
    public final float f165x;

    /* renamed from: y */
    public final float f166y;

    public enum GestureState {
        BEGAN,
        CHANGED,
        ENDED,
        CANCELLED,
        FAILED
    }

    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public abstract GestureType getGestureType();

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public Gesture(long j, float f, float f2, GestureState gestureState2, boolean z, float f3, float f4) {
        this.f164id = j;
        this.gestureState = gestureState2;
        if (z || f3 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f4 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.f165x = f;
            this.f166y = f2;
            return;
        }
        this.f165x = (f * f3) / f4;
        this.f166y = (f2 * f4) / f3;
    }

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
