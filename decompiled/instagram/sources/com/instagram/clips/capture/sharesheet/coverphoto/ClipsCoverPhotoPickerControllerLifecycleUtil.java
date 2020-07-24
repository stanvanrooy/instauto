package com.instagram.clips.capture.sharesheet.coverphoto;

public final class ClipsCoverPhotoPickerControllerLifecycleUtil {
    public static void cleanupReferences(ClipsCoverPhotoPickerController clipsCoverPhotoPickerController) {
        clipsCoverPhotoPickerController.mCoverPhotoContainer = null;
        clipsCoverPhotoPickerController.mCoverPhotoContainerVideoPreview = null;
        clipsCoverPhotoPickerController.mCurrentCoverPhotoImage = null;
        clipsCoverPhotoPickerController.mFilmStripFramesContainer = null;
        clipsCoverPhotoPickerController.mSeekBar = null;
        clipsCoverPhotoPickerController.mAddFromGalleryButton = null;
    }
}
