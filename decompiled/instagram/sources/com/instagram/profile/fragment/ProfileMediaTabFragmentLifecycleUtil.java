package com.instagram.profile.fragment;

public final class ProfileMediaTabFragmentLifecycleUtil {
    public static void cleanupReferences(ProfileMediaTabFragment profileMediaTabFragment) {
        profileMediaTabFragment.mRecyclerView = null;
        profileMediaTabFragment.mScrollingViewProxy = null;
        profileMediaTabFragment.mDropFrameWatcher = null;
    }
}
