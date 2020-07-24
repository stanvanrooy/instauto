package com.instagram.archive.fragment;

public final class ArchiveReelCalendarFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelCalendarFragment archiveReelCalendarFragment) {
        archiveReelCalendarFragment.mCalendar = null;
        archiveReelCalendarFragment.mLoadingSpinner = null;
    }
}
