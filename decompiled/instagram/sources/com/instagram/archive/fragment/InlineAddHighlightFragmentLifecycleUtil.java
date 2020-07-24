package com.instagram.archive.fragment;

public final class InlineAddHighlightFragmentLifecycleUtil {
    public static void cleanupReferences(InlineAddHighlightFragment inlineAddHighlightFragment) {
        inlineAddHighlightFragment.mView = null;
        inlineAddHighlightFragment.mActionButton = null;
        inlineAddHighlightFragment.mTrayRecyclerView = null;
        inlineAddHighlightFragment.mCreateHighlightViewStub = null;
        inlineAddHighlightFragment.mCreateHighlightView = null;
        inlineAddHighlightFragment.mCreateHighlightCoverImage = null;
        inlineAddHighlightFragment.mCreateHighlightEditText = null;
        inlineAddHighlightFragment.mHeaderBackButtonStubHolder = null;
        inlineAddHighlightFragment.mHeaderText = null;
        inlineAddHighlightFragment.mLoadingSpinner = null;
        inlineAddHighlightFragment.mDelegate = null;
    }
}
