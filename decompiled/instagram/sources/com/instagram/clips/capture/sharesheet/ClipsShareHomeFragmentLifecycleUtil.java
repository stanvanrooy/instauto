package com.instagram.clips.capture.sharesheet;

public final class ClipsShareHomeFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsShareHomeFragment clipsShareHomeFragment) {
        clipsShareHomeFragment.mTabbedFragmentController = null;
    }
}
