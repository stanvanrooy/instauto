package com.instagram.shopping.fragment.pdp;

public final class ProductDetailsPageFragmentLifecycleUtil {
    public static void cleanupReferences(ProductDetailsPageFragment productDetailsPageFragment) {
        productDetailsPageFragment.mRecyclerView = null;
    }
}
