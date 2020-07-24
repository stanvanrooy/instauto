package com.instagram.viewads.fragment;

public final class ViewAdsHomeFragmentLifecycleUtil {
    public static void cleanupReferences(ViewAdsHomeFragment viewAdsHomeFragment) {
        viewAdsHomeFragment.mTabBar = null;
        viewAdsHomeFragment.mTabController = null;
        viewAdsHomeFragment.mViewPager = null;
    }
}
