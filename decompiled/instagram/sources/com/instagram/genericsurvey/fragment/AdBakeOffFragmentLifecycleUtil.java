package com.instagram.genericsurvey.fragment;

public final class AdBakeOffFragmentLifecycleUtil {
    public static void cleanupReferences(AdBakeOffFragment adBakeOffFragment) {
        adBakeOffFragment.mAnswerButtonController = null;
        adBakeOffFragment.mBakeoffFeedPairSectionController = null;
        adBakeOffFragment.mBakeoffStoryPairSectionController = null;
        adBakeOffFragment.mNavbarController = null;
        adBakeOffFragment.mContentContainer = null;
        adBakeOffFragment.mRetryViewStub = null;
        adBakeOffFragment.mRetryView = null;
        adBakeOffFragment.mLoadingSpinner = null;
    }
}
