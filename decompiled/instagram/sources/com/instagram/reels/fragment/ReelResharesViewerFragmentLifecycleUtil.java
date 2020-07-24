package com.instagram.reels.fragment;

public final class ReelResharesViewerFragmentLifecycleUtil {
    public static void cleanupReferences(ReelResharesViewerFragment reelResharesViewerFragment) {
        reelResharesViewerFragment.mEmptyStateView = null;
        reelResharesViewerFragment.mHideAnimationCoordinator = null;
    }
}
