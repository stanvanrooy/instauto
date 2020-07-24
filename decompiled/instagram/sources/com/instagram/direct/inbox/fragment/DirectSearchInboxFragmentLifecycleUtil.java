package com.instagram.direct.inbox.fragment;

public final class DirectSearchInboxFragmentLifecycleUtil {
    public static void cleanupReferences(DirectSearchInboxFragment directSearchInboxFragment) {
        directSearchInboxFragment.mTouchInterceptorFrameLayout = null;
    }
}
