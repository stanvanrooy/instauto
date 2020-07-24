package com.instagram.gallery.p034ui;

/* renamed from: com.instagram.gallery.ui.GalleryHomeTabbedFragmentLifecycleUtil */
public final class GalleryHomeTabbedFragmentLifecycleUtil {
    public static void cleanupReferences(GalleryHomeTabbedFragment galleryHomeTabbedFragment) {
        galleryHomeTabbedFragment.mTabController = null;
        galleryHomeTabbedFragment.mTabBar = null;
        galleryHomeTabbedFragment.mTabBarShadow = null;
        galleryHomeTabbedFragment.mViewPager = null;
        galleryHomeTabbedFragment.mInnerContainer = null;
        galleryHomeTabbedFragment.mPeekController = null;
        galleryHomeTabbedFragment.mActionBarController = null;
        galleryHomeTabbedFragment.mThumbnailTrayController = null;
        galleryHomeTabbedFragment.mCardFragmentNavigator = null;
        galleryHomeTabbedFragment.mTabBarAndThumbnailTrayContainer = null;
    }
}
