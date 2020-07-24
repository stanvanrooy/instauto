package com.instagram.igtv.profile;

public final class IGTVProfileTabFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVProfileTabFragment iGTVProfileTabFragment) {
        iGTVProfileTabFragment.mUserChannel = null;
        iGTVProfileTabFragment.mRecyclerView = null;
        iGTVProfileTabFragment.mOnScrollListener = null;
        iGTVProfileTabFragment.mIGTVUserProfileLogger = null;
        iGTVProfileTabFragment.mNavPerfLogger = null;
        iGTVProfileTabFragment.mScrollPerfLogger = null;
        iGTVProfileTabFragment.mUserAdapter = null;
        iGTVProfileTabFragment.mPullToRefreshStopperDelegate = null;
        iGTVProfileTabFragment.mIgEventBus = null;
        iGTVProfileTabFragment.mMediaUpdateListener = null;
        iGTVProfileTabFragment.mSeriesUpdatedEventListener = null;
    }
}
