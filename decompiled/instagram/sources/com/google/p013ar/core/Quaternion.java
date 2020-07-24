package com.google.p013ar.core;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: com.google.ar.core.Quaternion */
public class Quaternion {

    /* renamed from: a */
    public static final Quaternion f168a = new Quaternion();

    /* renamed from: w */
    public float f169w;

    /* renamed from: x */
    public float f170x;

    /* renamed from: y */
    public float f171y;

    /* renamed from: z */
    public float f172z;

    public String toString() {
        return String.format("[%.3f, %.3f, %.3f, %.3f]", new Object[]{Float.valueOf(this.f170x), Float.valueOf(this.f171y), Float.valueOf(this.f172z), Float.valueOf(this.f169w)});
    }

    public Quaternion() {
        this.f170x = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f171y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f172z = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f169w = 1.0f;
        this.f170x = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f171y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f172z = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f169w = 1.0f;
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.f170x = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f171y = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f172z = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.f169w = 1.0f;
        this.f170x = f;
        this.f171y = f2;
        this.f172z = f3;
        this.f169w = f4;
    }
}
