package com.instagram.arlink.fragment;

public final class NametagBackgroundControllerLifecycleUtil {
    public static void cleanupReferences(NametagBackgroundController nametagBackgroundController) {
        nametagBackgroundController.mRootView = null;
        nametagBackgroundController.mCloseButton = null;
        nametagBackgroundController.mPageIndicator = null;
        nametagBackgroundController.mBackgroundModeButton = null;
        nametagBackgroundController.mBackgroundModeLabel = null;
        nametagBackgroundController.mSelfieButton = null;
        nametagBackgroundController.mShareButton = null;
        nametagBackgroundController.mGradientView = null;
        nametagBackgroundController.mGridPatternView = null;
        nametagBackgroundController.mCardView = null;
        nametagBackgroundController.mBottomButton = null;
    }
}
