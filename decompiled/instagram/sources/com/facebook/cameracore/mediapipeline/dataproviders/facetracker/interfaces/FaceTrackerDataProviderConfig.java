package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

public class FaceTrackerDataProviderConfig {
    public final int executionMode;
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive = 15000;
    public final int frameProcessorWaitTimeout = 70000;
    public final boolean useAmlFaceTracker = true;
    public final boolean useLazyFaceTracker;
    public final boolean useOcean;
    public final boolean useSynchronousFaceTracker;

    public int getExecutionMode() {
        return this.executionMode;
    }

    public boolean getUseAmlFaceTracker() {
        return this.useAmlFaceTracker;
    }

    public boolean getUseLazyFaceTracker() {
        return this.useLazyFaceTracker;
    }

    public boolean getUseOcean() {
        return this.useOcean;
    }

    public boolean getUseSynchronousFaceTracker() {
        return this.useSynchronousFaceTracker;
    }

    public FaceTrackerDataProviderConfig(int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, boolean z4) {
        this.frameProcessorDelayTolerance = i;
        this.useSynchronousFaceTracker = z2;
        this.useLazyFaceTracker = false;
        this.executionMode = i4;
        this.useOcean = z4;
    }
}
