package com.instagram.genericsurvey.fragment;

public final class GenericSurveyFragmentLifecycleUtil {
    public static void cleanupReferences(GenericSurveyFragment genericSurveyFragment) {
        genericSurveyFragment.mEndScreenViewStub = null;
        genericSurveyFragment.mEndScreen = null;
        genericSurveyFragment.mContentContainer = null;
        genericSurveyFragment.mRetryViewStub = null;
        genericSurveyFragment.mRetryView = null;
        genericSurveyFragment.mLoadingSpinner = null;
        genericSurveyFragment.mNavbarController = null;
    }
}
