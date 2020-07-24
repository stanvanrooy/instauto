package com.instagram.igtv.feed;

public final class IGTVFeedControllerLifecycleUtil {
    public static void cleanupReferences(IGTVFeedController iGTVFeedController) {
        iGTVFeedController.mEntryPointButton = null;
        iGTVFeedController.mPendingMediaObserver = null;
    }
}
