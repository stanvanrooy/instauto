package com.instagram.creation.fragment;

public final class AlbumEditFragmentLifecycleUtil {
    public static void cleanupReferences(AlbumEditFragment albumEditFragment) {
        albumEditFragment.mFilterPicker = null;
        albumEditFragment.mRenderViewController = null;
        albumEditFragment.mAspectButton = null;
    }
}
