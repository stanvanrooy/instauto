package com.instagram.igtv.search;

public final class IGTVSearchControllerLifecycleUtil {
    public static void cleanupReferences(IGTVSearchController iGTVSearchController) {
        iGTVSearchController.mCustomLoadingSpinnerView = null;
    }
}
