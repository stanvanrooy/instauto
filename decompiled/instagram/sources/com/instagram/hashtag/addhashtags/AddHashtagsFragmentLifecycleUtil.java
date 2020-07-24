package com.instagram.hashtag.addhashtags;

public final class AddHashtagsFragmentLifecycleUtil {
    public static void cleanupReferences(AddHashtagsFragment addHashtagsFragment) {
        addHashtagsFragment.mViewController = null;
    }
}
