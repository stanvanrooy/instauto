package com.facebook.cameracore.mediapipeline.services.gallerypicker.interfaces;

public class GalleryPickerServiceConfiguration {
    public final GalleryPickerServiceDataSource A00;

    public GalleryPickerServiceDataSource getDataSource() {
        return this.A00;
    }

    public GalleryPickerServiceConfiguration(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }
}
