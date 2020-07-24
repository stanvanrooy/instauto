package com.facebook.cameracore.mediapipeline.standalonetracking;

import android.graphics.Rect;

public class FaceVO {
    public final Rect mBoundingBox;
    public final float[] mRawHeadMatrix;

    public FaceVO(Rect rect, float[] fArr) {
        this.mBoundingBox = rect;
        this.mRawHeadMatrix = fArr;
    }
}
