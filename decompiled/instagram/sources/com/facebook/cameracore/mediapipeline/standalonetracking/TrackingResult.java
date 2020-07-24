package com.facebook.cameracore.mediapipeline.standalonetracking;

public class TrackingResult {
    public final FaceVO[] mFaceData;
    public boolean mHasHandTrackerResult;
    public final boolean mHasLocationResult;
    public boolean mHasSegmentationResult;
    public boolean mHasWorldTrackerResult;
    public final int mWorldTrackingConfidence;

    public TrackingResult(boolean z, boolean z2, FaceVO[] faceVOArr, boolean z3, int i, boolean z4) {
        this.mHasWorldTrackerResult = z;
        this.mHasSegmentationResult = z2;
        this.mFaceData = faceVOArr;
        this.mHasHandTrackerResult = z3;
        this.mWorldTrackingConfidence = i;
        this.mHasLocationResult = z4;
    }
}
