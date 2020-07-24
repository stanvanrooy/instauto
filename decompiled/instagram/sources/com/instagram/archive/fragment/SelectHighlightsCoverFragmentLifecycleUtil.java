package com.instagram.archive.fragment;

public final class SelectHighlightsCoverFragmentLifecycleUtil {
    public static void cleanupReferences(SelectHighlightsCoverFragment selectHighlightsCoverFragment) {
        selectHighlightsCoverFragment.mRootView = null;
        selectHighlightsCoverFragment.mTouchImageView = null;
        selectHighlightsCoverFragment.mPunchedOverlayView = null;
        selectHighlightsCoverFragment.mViewPager = null;
    }
}
