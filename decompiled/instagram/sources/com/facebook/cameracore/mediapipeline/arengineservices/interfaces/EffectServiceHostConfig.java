package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.segmentation.interfaces.SegmentationDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import com.facebook.cameracore.mediapipeline.sessionrecording.interfaces.SessionRecordingConfig;
import com.facebook.cameracore.mediapipeline.sessionreplay.interfaces.SessionReplayConfig;
import p000X.C63932qJ;

public class EffectServiceHostConfig {
    public final FaceTrackerDataProviderConfig mFaceTrackerDataProviderConfig;
    public final FrameBrightnessDataProviderConfig mFrameBrightnessDataProviderConfig;
    public final SegmentationDataProviderConfig mSegmentationDataProviderConfig;
    public final SlamLibraryProvider mSlamLibraryProvider;
    public final WorldTrackerDataProviderConfigWithSlam mWorldTrackerDataProviderConfigWithSlam;

    public FaceTrackerDataProviderConfig getFaceTrackerDataProviderConfig() {
        return this.mFaceTrackerDataProviderConfig;
    }

    public FrameBrightnessDataProviderConfig getFrameBrightnessDataProviderConfig() {
        return this.mFrameBrightnessDataProviderConfig;
    }

    public HandTrackingDataProviderConfig getHandTrackingDataProviderConfig() {
        return null;
    }

    public SegmentationDataProviderConfig getSegmentationDataProviderConfig() {
        return this.mSegmentationDataProviderConfig;
    }

    public SessionRecordingConfig getSessionRecordingConfig() {
        return null;
    }

    public SessionReplayConfig getSessionReplayConfig() {
        return null;
    }

    public SlamLibraryProvider getSlamLibraryProvider() {
        return this.mSlamLibraryProvider;
    }

    public WorldTrackerDataProviderConfigWithSlam getWorldTrackerDataProviderConfigWithSlam() {
        return this.mWorldTrackerDataProviderConfigWithSlam;
    }

    public EffectServiceHostConfig(C63932qJ r2) {
        this.mFaceTrackerDataProviderConfig = r2.A01;
        this.mFrameBrightnessDataProviderConfig = r2.A02;
        this.mSegmentationDataProviderConfig = r2.A03;
        this.mWorldTrackerDataProviderConfigWithSlam = r2.A00;
        this.mSlamLibraryProvider = r2.A04;
    }
}
