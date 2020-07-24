package com.instagram.arlink.fragment;

public final class NametagControllerLifecycleUtil {
    public static void cleanupReferences(NametagController nametagController) {
        nametagController.mRootView = null;
        nametagController.mTopBar = null;
        nametagController.mGradientOverlay = null;
        nametagController.mCardView = null;
        nametagController.mBottomBar = null;
        nametagController.mBottomButton = null;
    }
}
