package com.instagram.music.common.fragment;

public final class ClipsConsumptionSheetFragmentLifecycleUtil {
    public static void cleanupReferences(ClipsConsumptionSheetFragment clipsConsumptionSheetFragment) {
        clipsConsumptionSheetFragment.mTrackCoverReelHolder = null;
        clipsConsumptionSheetFragment.mTrackTitle = null;
        clipsConsumptionSheetFragment.mArtistProfilePic = null;
        clipsConsumptionSheetFragment.mArtistUsername = null;
        clipsConsumptionSheetFragment.mArtistInfoContainer = null;
        clipsConsumptionSheetFragment.mMusicPlayer = null;
        clipsConsumptionSheetFragment.mCreateClipsActionButton = null;
        clipsConsumptionSheetFragment.mViewTopClipsReelHolder = null;
    }
}
