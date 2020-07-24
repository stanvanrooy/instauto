package com.instagram.direct.visual;

public final class DirectVisualMessageViewerControllerLifecycleUtil {
    public static void cleanupReferences(DirectVisualMessageViewerController directVisualMessageViewerController) {
        directVisualMessageViewerController.mRootView = null;
        directVisualMessageViewerController.mContentView = null;
        directVisualMessageViewerController.mItemView = null;
        directVisualMessageViewerController.mViewerInfoContainer = null;
        directVisualMessageViewerController.mProgressBar = null;
        directVisualMessageViewerController.mContentHolder = null;
        directVisualMessageViewerController.mPhotoTimerController = null;
        directVisualMessageViewerController.mVideoPlayer = null;
        directVisualMessageViewerController.mVolumeIndicator = null;
        directVisualMessageViewerController.mReplyComposerContainer = null;
        directVisualMessageViewerController.mComposerEditText = null;
        directVisualMessageViewerController.mTextSendButton = null;
        directVisualMessageViewerController.mViewerContainer = null;
        directVisualMessageViewerController.mComposerTextWatcher = null;
        directVisualMessageViewerController.mKeyboardHeightChangeDetector = null;
        directVisualMessageViewerController.mBlurImageViewContainerStubHolder = null;
        directVisualMessageViewerController.mSparklerAnimationStubHolder = null;
        directVisualMessageViewerController.mBackgroundDimmer = null;
        directVisualMessageViewerController.mReelViewerShadowAnimator = null;
        directVisualMessageViewerController.mThreadsVvmUpsellFooterStubHolder = null;
    }
}
