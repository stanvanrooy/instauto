package com.instagram.shopping.fragment.bag;

public final class ShoppingBagFragmentLifecycleUtil {
    public static void cleanupReferences(ShoppingBagFragment shoppingBagFragment) {
        shoppingBagFragment.mRecyclerView = null;
        shoppingBagFragment.mProductCollectionStub = null;
    }
}
