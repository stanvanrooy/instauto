package com.instagram.shopping.fragment.pdp.herocarousel;

public final class HeroCarouselProductImageViewerFragmentLifecycleUtil {
    public static void cleanupReferences(HeroCarouselProductImageViewerFragment heroCarouselProductImageViewerFragment) {
        heroCarouselProductImageViewerFragment.mContainerView = null;
        heroCarouselProductImageViewerFragment.mImageView = null;
    }
}
