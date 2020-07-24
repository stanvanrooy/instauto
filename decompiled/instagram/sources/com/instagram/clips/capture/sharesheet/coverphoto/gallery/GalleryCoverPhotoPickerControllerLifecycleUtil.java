package com.instagram.clips.capture.sharesheet.coverphoto.gallery;

public final class GalleryCoverPhotoPickerControllerLifecycleUtil {
    public static void cleanupReferences(GalleryCoverPhotoPickerController galleryCoverPhotoPickerController) {
        galleryCoverPhotoPickerController.mCoverPhotoEmptyStateController = null;
        galleryCoverPhotoPickerController.mContainerView = null;
        galleryCoverPhotoPickerController.mTitleFolderPicker = null;
        galleryCoverPhotoPickerController.mGalleryRecycler = null;
    }
}
