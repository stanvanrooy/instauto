package com.instagram.creation.fragment;

public final class ManageDraftsFragmentLifecycleUtil {
    public static void cleanupReferences(ManageDraftsFragment manageDraftsFragment) {
        manageDraftsFragment.mActionBarActionButton = null;
        manageDraftsFragment.mActionBarTitleTextView = null;
    }
}
