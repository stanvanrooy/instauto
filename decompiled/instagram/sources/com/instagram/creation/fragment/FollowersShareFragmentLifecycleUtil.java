package com.instagram.creation.fragment;

public final class FollowersShareFragmentLifecycleUtil {
    public static void cleanupReferences(FollowersShareFragment followersShareFragment) {
        followersShareFragment.mAppShareTable = null;
        followersShareFragment.mIgShareTable = null;
        followersShareFragment.mPeopleTagRow = null;
        followersShareFragment.mTagPeopleInfoIconViewStubHolder = null;
        followersShareFragment.mAdvancedSettingRow = null;
        followersShareFragment.mPeopleTextView = null;
        followersShareFragment.mLocationSuggestionsRow = null;
        followersShareFragment.mCaptionBox = null;
        followersShareFragment.mAppShareTitleContainer = null;
        followersShareFragment.mIgShareTitleContainer = null;
        followersShareFragment.mUploadButtonTextView = null;
        followersShareFragment.mPostOverlayView = null;
    }
}
