package com.instagram.shopping.fragment.destination.home;

public final class ShoppingBrandDestinationFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingBrandDestinationFragment shoppingBrandDestinationFragment) {
        shoppingBrandDestinationFragment.mRefreshableContainer = null;
        shoppingBrandDestinationFragment.mRecyclerView = null;
    }
}
