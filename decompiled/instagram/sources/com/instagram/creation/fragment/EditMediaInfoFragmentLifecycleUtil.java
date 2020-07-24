package com.instagram.creation.fragment;

public final class EditMediaInfoFragmentLifecycleUtil {
    public static void cleanupReferences(EditMediaInfoFragment editMediaInfoFragment) {
        editMediaInfoFragment.mScrollView = null;
        editMediaInfoFragment.mUserImageView = null;
        editMediaInfoFragment.mUsername = null;
        editMediaInfoFragment.mBelowUsernameLabel = null;
        editMediaInfoFragment.mExtraLocationLabel = null;
        editMediaInfoFragment.mTimestamp = null;
        editMediaInfoFragment.mCaption = null;
        editMediaInfoFragment.mFailedView = null;
        editMediaInfoFragment.mTextContainer = null;
        editMediaInfoFragment.mPostOverlayView = null;
    }
}
