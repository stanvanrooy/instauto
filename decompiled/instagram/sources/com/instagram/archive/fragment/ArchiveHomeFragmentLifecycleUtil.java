package com.instagram.archive.fragment;

public final class ArchiveHomeFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveHomeFragment archiveHomeFragment) {
        archiveHomeFragment.mCalendarActionBarButton = null;
    }
}
