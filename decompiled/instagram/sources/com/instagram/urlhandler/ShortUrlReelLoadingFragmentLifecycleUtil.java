package com.instagram.urlhandler;

public final class ShortUrlReelLoadingFragmentLifecycleUtil {
    public static void cleanupReferences(ShortUrlReelLoadingFragment shortUrlReelLoadingFragment) {
        shortUrlReelLoadingFragment.mLoadingSpinner = null;
    }
}
