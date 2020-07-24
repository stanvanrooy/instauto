package com.instagram.shopping.fragment.bag;

public final class MerchantShoppingBagFragmentLifecycleUtil {
    public static void cleanupReferences(MerchantShoppingBagFragment merchantShoppingBagFragment) {
        merchantShoppingBagFragment.mRecyclerView = null;
    }
}
