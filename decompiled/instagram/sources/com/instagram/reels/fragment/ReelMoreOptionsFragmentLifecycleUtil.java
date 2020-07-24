package com.instagram.reels.fragment;

public final class ReelMoreOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        reelMoreOptionsFragment.mBrandedContentMetadataItem = null;
        reelMoreOptionsFragment.mSaveButton = null;
        reelMoreOptionsFragment.mAddIconDrawable = null;
    }
}
