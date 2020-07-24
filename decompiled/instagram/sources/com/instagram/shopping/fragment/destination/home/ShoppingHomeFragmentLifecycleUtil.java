package com.instagram.shopping.fragment.destination.home;

public final class ShoppingHomeFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingHomeFragment shoppingHomeFragment) {
        shoppingHomeFragment.mRefreshableContainer = null;
        shoppingHomeFragment.mRecyclerView = null;
        shoppingHomeFragment.mCategoryRibbonView = null;
    }
}
