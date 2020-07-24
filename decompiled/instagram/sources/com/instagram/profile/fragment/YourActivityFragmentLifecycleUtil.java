package com.instagram.profile.fragment;

public final class YourActivityFragmentLifecycleUtil {
    public static void cleanupReferences(YourActivityFragment yourActivityFragment) {
        yourActivityFragment.mTabLayout = null;
        yourActivityFragment.mViewPager = null;
    }
}
