package com.google.p013ar.core;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.Locale;

/* renamed from: com.google.ar.core.Pose */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}, Quaternion.f168a);
    public final Quaternion quaternion;
    public final float[] translation;

    public String toString() {
        Locale locale = Locale.ENGLISH;
        float[] fArr = this.translation;
        Quaternion quaternion2 = this.quaternion;
        return String.format(locale, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", new Object[]{Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(quaternion2.f170x), Float.valueOf(quaternion2.f171y), Float.valueOf(quaternion2.f172z), Float.valueOf(quaternion2.f169w)});
    }

    public Pose(float[] fArr, Quaternion quaternion2) {
        this.translation = fArr;
        this.quaternion = quaternion2;
    }
}
