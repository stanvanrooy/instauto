package com.instagram.react.delegate;

public final class IgReactDelegateLifecycleUtil {
    public static void cleanupReferences(IgReactDelegate igReactDelegate) {
        igReactDelegate.mFrameLayout = null;
        igReactDelegate.mLoadingIndicator = null;
        igReactDelegate.mInlineNavTitle = null;
        igReactDelegate.mInlineNavCloseButton = null;
        igReactDelegate.mInlineNavBar = null;
    }
}
