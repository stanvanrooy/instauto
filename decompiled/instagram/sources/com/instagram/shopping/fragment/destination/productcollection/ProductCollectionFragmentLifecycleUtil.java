package com.instagram.shopping.fragment.destination.productcollection;

public final class ProductCollectionFragmentLifecycleUtil {
    public static void cleanupReferences(ProductCollectionFragment productCollectionFragment) {
        productCollectionFragment.mRefreshableContainer = null;
        productCollectionFragment.mRecyclerView = null;
    }
}
