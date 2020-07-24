package com.instagram.shopping.fragment.moreproducts;

public final class ShoppingMoreProductsFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingMoreProductsFragment shoppingMoreProductsFragment) {
        shoppingMoreProductsFragment.mContainerView = null;
        shoppingMoreProductsFragment.mRecyclerView = null;
        shoppingMoreProductsFragment.mShopsEntryPointViewStubHolder = null;
    }
}
