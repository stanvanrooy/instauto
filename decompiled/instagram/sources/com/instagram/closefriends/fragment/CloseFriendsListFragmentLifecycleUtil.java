package com.instagram.closefriends.fragment;

public final class CloseFriendsListFragmentLifecycleUtil {
    public static void cleanupReferences(CloseFriendsListFragment closeFriendsListFragment) {
        closeFriendsListFragment.mList = null;
        closeFriendsListFragment.mEmptyStateView = null;
        closeFriendsListFragment.mListRemovalAnimationShimHolder = null;
        closeFriendsListFragment.mRowRemovalAnimator = null;
    }
}
