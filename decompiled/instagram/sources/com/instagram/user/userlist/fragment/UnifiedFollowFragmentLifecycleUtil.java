package com.instagram.user.userlist.fragment;

public final class UnifiedFollowFragmentLifecycleUtil {
    public static void cleanupReferences(UnifiedFollowFragment unifiedFollowFragment) {
        unifiedFollowFragment.mTabLayout = null;
        unifiedFollowFragment.mViewPager = null;
    }
}
