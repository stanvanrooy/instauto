package com.instagram.shopping.fragment.sizechart;

public final class SizeChartFragmentLifecycleUtil {
    public static void cleanupReferences(SizeChartFragment sizeChartFragment) {
        sizeChartFragment.mTopLeftFixedSpace = null;
        sizeChartFragment.mRowHeadersColumn = null;
        sizeChartFragment.mViewPager = null;
    }
}
