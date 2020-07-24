package com.instagram.igtv.browse;

public final class IGTVBrowseFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVBrowseFragment iGTVBrowseFragment) {
        iGTVBrowseFragment.mRootContainer = null;
        iGTVBrowseFragment.mGridRecyclerView = null;
        iGTVBrowseFragment.mGridLayoutManager = null;
        iGTVBrowseFragment.mActionBarTitleTextView = null;
        iGTVBrowseFragment.mActionBarView = null;
        iGTVBrowseFragment.mActionBarShadow = null;
        iGTVBrowseFragment.mLoadingSpinner = null;
        iGTVBrowseFragment.mBrowseAutoplayingUnit = null;
        iGTVBrowseFragment.mGridViewpointManager = null;
        iGTVBrowseFragment.mAutoplayingUnitViewpointManager = null;
        iGTVBrowseFragment.mPendingMediaObserver = null;
        iGTVBrowseFragment.mLoadingShimmerHolder = null;
        iGTVBrowseFragment.mLoadingShimmer = null;
        iGTVBrowseFragment.mSpanSizeLookup = null;
        iGTVBrowseFragment.mGridRecyclerViewScrollListener = null;
    }
}
