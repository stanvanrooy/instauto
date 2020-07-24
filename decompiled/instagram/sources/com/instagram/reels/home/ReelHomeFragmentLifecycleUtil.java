package com.instagram.reels.home;

public final class ReelHomeFragmentLifecycleUtil {
    public static void cleanupReferences(ReelHomeFragment reelHomeFragment) {
        reelHomeFragment.mClosePill = null;
    }
}
