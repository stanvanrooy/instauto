package com.instagram.archive.fragment;

public final class HighlightsMetadataFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsMetadataFragment highlightsMetadataFragment) {
        highlightsMetadataFragment.mCoverImageView = null;
        highlightsMetadataFragment.mEditCoverImageButton = null;
    }
}
