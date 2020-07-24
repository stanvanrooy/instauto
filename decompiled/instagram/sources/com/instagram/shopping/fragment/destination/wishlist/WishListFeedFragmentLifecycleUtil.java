package com.instagram.shopping.fragment.destination.wishlist;

public final class WishListFeedFragmentLifecycleUtil {
    public static void cleanupReferences(WishListFeedFragment wishListFeedFragment) {
        wishListFeedFragment.mRefreshableContainer = null;
        wishListFeedFragment.mRecyclerView = null;
    }
}
