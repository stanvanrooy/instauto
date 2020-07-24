package com.instagram.archive.fragment;

public final class ArchiveReelTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelTabbedFragment archiveReelTabbedFragment) {
        archiveReelTabbedFragment.mTabController = null;
        archiveReelTabbedFragment.mTabBar = null;
        archiveReelTabbedFragment.mViewPager = null;
    }
}
