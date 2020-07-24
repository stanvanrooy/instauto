package com.instagram.archive.fragment;

public final class HighlightsMetadataRedesignFragmentLifecycleUtil {
    public static void cleanupReferences(HighlightsMetadataRedesignFragment highlightsMetadataRedesignFragment) {
        highlightsMetadataRedesignFragment.mCoverImageView = null;
        highlightsMetadataRedesignFragment.mEditCoverImageButton = null;
        highlightsMetadataRedesignFragment.mLocationSuggestionsRow = null;
        highlightsMetadataRedesignFragment.mAddHashtagsRowController = null;
    }
}
