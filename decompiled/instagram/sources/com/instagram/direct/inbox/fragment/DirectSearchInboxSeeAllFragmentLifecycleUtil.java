package com.instagram.direct.inbox.fragment;

public final class DirectSearchInboxSeeAllFragmentLifecycleUtil {
    public static void cleanupReferences(DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment) {
        directSearchInboxSeeAllFragment.mRecyclerView = null;
    }
}
