package com.facebook.cameracore.mediapipeline.dataproviders.movingtargettracking.interfaces;

import com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces.ImageTrackerCreator;

public class MovingTargetTrackingDataProviderConfiguration {
    public ImageTrackerCreator mImageTrackerCreator;

    public MovingTargetTrackingDataProviderConfiguration(ImageTrackerCreator imageTrackerCreator) {
        this.mImageTrackerCreator = imageTrackerCreator;
    }

    public ImageTrackerCreator getImageTrackerCreator() {
        return this.mImageTrackerCreator;
    }
}
