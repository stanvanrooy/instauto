package com.instagram.archive.fragment;

public final class ArchiveReelFragmentLifecycleUtil {
    public static void cleanupReferences(ArchiveReelFragment archiveReelFragment) {
        archiveReelFragment.mEmptyStateView = null;
        archiveReelFragment.mHideAnimationCoordinator = null;
        archiveReelFragment.mReelLoader = null;
    }
}
