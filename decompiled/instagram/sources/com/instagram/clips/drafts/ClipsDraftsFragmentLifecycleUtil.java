package com.instagram.clips.drafts;

public final class ClipsDraftsFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsDraftsFragment clipsDraftsFragment) {
        clipsDraftsFragment.mDiscardDrafts = null;
        clipsDraftsFragment.mRecyclerView = null;
        clipsDraftsFragment.mDiscardDraftsDivider = null;
    }
}
