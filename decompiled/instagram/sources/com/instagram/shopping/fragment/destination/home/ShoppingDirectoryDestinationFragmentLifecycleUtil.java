package com.instagram.shopping.fragment.destination.home;

public final class ShoppingDirectoryDestinationFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingDirectoryDestinationFragment shoppingDirectoryDestinationFragment) {
        shoppingDirectoryDestinationFragment.mRefreshableContainer = null;
        shoppingDirectoryDestinationFragment.mRecyclerView = null;
    }
}
