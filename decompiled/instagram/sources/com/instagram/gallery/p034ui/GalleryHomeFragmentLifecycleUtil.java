package com.instagram.gallery.p034ui;

/* renamed from: com.instagram.gallery.ui.GalleryHomeFragmentLifecycleUtil */
public final class GalleryHomeFragmentLifecycleUtil {
    public static void cleanupReferences(GalleryHomeFragment galleryHomeFragment) {
        galleryHomeFragment.mRecyclerView = null;
        galleryHomeFragment.mFastScrollController = null;
        galleryHomeFragment.mLoadingSpinner = null;
        galleryHomeFragment.mLoadingDrawable = null;
        galleryHomeFragment.mLayoutManager = null;
        galleryHomeFragment.mEmptyMessage = null;
        galleryHomeFragment.mPermissionsEmptyStateContainer = null;
        galleryHomeFragment.mPermissionController = null;
        galleryHomeFragment.mGridInsetAdjustmentHelper = null;
    }
}
