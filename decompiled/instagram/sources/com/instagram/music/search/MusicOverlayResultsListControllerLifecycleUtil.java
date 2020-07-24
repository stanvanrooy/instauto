package com.instagram.music.search;

public final class MusicOverlayResultsListControllerLifecycleUtil {
    public static void cleanupReferences(MusicOverlayResultsListController musicOverlayResultsListController) {
        musicOverlayResultsListController.mParentView = null;
        musicOverlayResultsListController.mRecyclerView = null;
        musicOverlayResultsListController.mLayoutManager = null;
        musicOverlayResultsListController.mDropFrameWatcher = null;
    }
}
