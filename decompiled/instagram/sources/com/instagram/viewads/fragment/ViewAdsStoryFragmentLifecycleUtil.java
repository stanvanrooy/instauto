package com.instagram.viewads.fragment;

public final class ViewAdsStoryFragmentLifecycleUtil {
    public static void cleanupReferences(ViewAdsStoryFragment viewAdsStoryFragment) {
        viewAdsStoryFragment.mHideAnimationCoordinator = null;
    }
}
