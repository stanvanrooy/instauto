package com.instagram.shopping.fragment.pdp.lightbox;

public final class LightboxFragmentLifecycleUtil {
    public static void cleanupReferences(LightboxFragment lightboxFragment) {
        lightboxFragment.mPrimaryColorCloseButton = null;
        lightboxFragment.mWhiteColorCloseButton = null;
    }
}
