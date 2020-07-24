package com.instagram.genericsurvey.fragment;

public final class BakeoffFeedPairSectionControllerLifecycleUtil {
    public static void cleanupReferences(BakeoffFeedPairSectionController bakeoffFeedPairSectionController) {
        bakeoffFeedPairSectionController.mFixedTabBar = null;
        bakeoffFeedPairSectionController.mFragmentPager = null;
        bakeoffFeedPairSectionController.mPagerAdapter = null;
    }
}
