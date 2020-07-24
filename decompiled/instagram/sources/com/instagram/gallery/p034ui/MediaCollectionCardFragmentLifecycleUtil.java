package com.instagram.gallery.p034ui;

/* renamed from: com.instagram.gallery.ui.MediaCollectionCardFragmentLifecycleUtil */
public final class MediaCollectionCardFragmentLifecycleUtil {
    public static void cleanupReferences(MediaCollectionCardFragment mediaCollectionCardFragment) {
        mediaCollectionCardFragment.mRecyclerView = null;
        mediaCollectionCardFragment.mActionBarService = null;
        mediaCollectionCardFragment.mFastScrollController = null;
        mediaCollectionCardFragment.mTitleTextView = null;
        mediaCollectionCardFragment.mActionBarView = null;
        mediaCollectionCardFragment.mActionBarShadow = null;
        mediaCollectionCardFragment.mMultiSelectButton = null;
        mediaCollectionCardFragment.mLoadingSpinner = null;
        mediaCollectionCardFragment.mLoadingDrawable = null;
        mediaCollectionCardFragment.mPermissionsEmptyStateContainer = null;
        mediaCollectionCardFragment.mEmptyMessage = null;
        mediaCollectionCardFragment.mPermissionController = null;
        mediaCollectionCardFragment.mGridInsetAdjustmentHelper = null;
    }
}
