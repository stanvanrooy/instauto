package com.instagram.igtv.viewer.edit;

public final class IGTVEditMetadataFragmentLifecycleUtil {
    public static void cleanupReferences(IGTVEditMetadataFragment iGTVEditMetadataFragment) {
        iGTVEditMetadataFragment.mSaveButton = null;
        iGTVEditMetadataFragment.mView = null;
        iGTVEditMetadataFragment.mMonetizationRowViewStub = null;
    }
}
