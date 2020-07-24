package com.instagram.closefriends.fragment;

public final class CloseFriendsHomeFragmentLifecycleUtil {
    public static void cleanupReferences(CloseFriendsHomeFragment closeFriendsHomeFragment) {
        closeFriendsHomeFragment.mMainContainer = null;
        closeFriendsHomeFragment.mProgressDialog = null;
        closeFriendsHomeFragment.mMembersTabViewLabel = null;
        closeFriendsHomeFragment.mMembersTabView = null;
        closeFriendsHomeFragment.mSearchRow = null;
        closeFriendsHomeFragment.mHeader = null;
        closeFriendsHomeFragment.mHeaderDescription = null;
        closeFriendsHomeFragment.mSearchAdapter = null;
        closeFriendsHomeFragment.mTabbedFragmentController = null;
    }
}
