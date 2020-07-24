package com.instagram.archive.fragment;

public final class ManageHighlightsFragmentLifecycleUtil {
    public static void cleanupReferences(ManageHighlightsFragment manageHighlightsFragment) {
        manageHighlightsFragment.mTabbedFragmentController = null;
        manageHighlightsFragment.mLocationSuggestionsRow = null;
        manageHighlightsFragment.mAddHashtagsRowController = null;
        manageHighlightsFragment.mShoppingAutohighlightSettingRowController = null;
    }
}
