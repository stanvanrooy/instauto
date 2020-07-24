package com.instagram.shopping.fragment.productsource;

public final class ProductSourceSelectionTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(ProductSourceSelectionTabbedFragment productSourceSelectionTabbedFragment) {
        productSourceSelectionTabbedFragment.mTabbedFragmentController = null;
    }
}
