package com.facebook.cameracore.mediapipeline.services.gallerypicker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.interfaces.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.interfaces.GalleryPickerServiceDataSource;
import com.facebook.jni.HybridData;

public class GalleryPickerServiceConfigurationHybrid extends ServiceConfiguration {
    public final GalleryPickerServiceConfiguration mConfiguration;

    public static native HybridData initHybrid(GalleryPickerServiceDataSource galleryPickerServiceDataSource);

    public GalleryPickerServiceConfigurationHybrid(GalleryPickerServiceConfiguration galleryPickerServiceConfiguration) {
        this.mConfiguration = galleryPickerServiceConfiguration;
        this.mHybridData = initHybrid(galleryPickerServiceConfiguration.A00);
    }
}
