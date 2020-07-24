package com.instagram.shopping.fragment.destination.profileshop;

public final class ProfileShopFragmentLifecycleUtil {
    public static void cleanupReferences(ProfileShopFragment profileShopFragment) {
        profileShopFragment.mProfileShopContainer = null;
        profileShopFragment.mRefreshableContainer = null;
        profileShopFragment.mRecyclerView = null;
        profileShopFragment.mLinearLayoutManager = null;
        profileShopFragment.mAutoLoadMoreHelper = null;
    }
}
