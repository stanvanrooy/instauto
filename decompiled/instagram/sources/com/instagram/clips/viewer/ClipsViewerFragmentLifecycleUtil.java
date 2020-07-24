package com.instagram.clips.viewer;

public final class ClipsViewerFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsViewerFragment clipsViewerFragment) {
        clipsViewerFragment.mDrawerController = null;
        clipsViewerFragment.mClipsViewerViewPager = null;
    }
}
