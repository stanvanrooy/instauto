package com.instagram.gallery.p034ui;

/* renamed from: com.instagram.gallery.ui.StoriesArchiveFragmentLifecycleUtil */
public final class StoriesArchiveFragmentLifecycleUtil {
    public static void cleanupReferences(StoriesArchiveFragment storiesArchiveFragment) {
        storiesArchiveFragment.mRecyclerView = null;
        storiesArchiveFragment.mFastScrollController = null;
        storiesArchiveFragment.mLoadingSpinner = null;
        storiesArchiveFragment.mLoadingDrawable = null;
        storiesArchiveFragment.mLayoutManager = null;
        storiesArchiveFragment.mEmptyMessage = null;
        storiesArchiveFragment.mGridInsetAdjustmentHelper = null;
    }
}
