package com.instagram.wellbeing.restrict.fragment;

public final class RestrictHomeFragmentLifecycleUtil {
    public static void cleanupReferences(RestrictHomeFragment restrictHomeFragment) {
        restrictHomeFragment.mSearchBar = null;
        restrictHomeFragment.mTabbedFragmentController = null;
    }
}
