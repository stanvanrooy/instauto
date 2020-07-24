package com.instagram.clips.capture.sharesheet;

public final class ClipsShareSheetControllerLifecycleUtil {
    public static void cleanupReferences(ClipsShareSheetController clipsShareSheetController) {
        clipsShareSheetController.mShareButton = null;
        clipsShareSheetController.mSaveDraftButton = null;
        clipsShareSheetController.mCaptionInputTextView = null;
        clipsShareSheetController.mCoverPhotoContainer = null;
        clipsShareSheetController.mPublicSharingView = null;
        clipsShareSheetController.mPrivateSharingView = null;
        clipsShareSheetController.mThumbnailImage = null;
    }
}
