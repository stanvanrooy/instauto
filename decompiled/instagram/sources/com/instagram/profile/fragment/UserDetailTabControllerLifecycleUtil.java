package com.instagram.profile.fragment;

public final class UserDetailTabControllerLifecycleUtil {
    public static void cleanupReferences(UserDetailTabController userDetailTabController) {
        userDetailTabController.mRootLayout = null;
        userDetailTabController.mAdapterLinearLayout = null;
        userDetailTabController.mViewPager = null;
        userDetailTabController.mPullToRefreshSpinnerContainer = null;
        userDetailTabController.mPullToRefreshSpinnerContainerBg = null;
        userDetailTabController.mPullToRefresh = null;
        userDetailTabController.mTabLayout = null;
        userDetailTabController.mAppBarLayout = null;
        userDetailTabController.mRefreshableLayoutBehavior = null;
        userDetailTabController.mPagerTabsContainer = null;
        userDetailTabController.mHeaderContainer = null;
        userDetailTabController.mRefreshDrawable = null;
        userDetailTabController.mPrivateProfileEmptyStateViewStubHolder = null;
        userDetailTabController.mOverFlowFollowButton = null;
    }
}
