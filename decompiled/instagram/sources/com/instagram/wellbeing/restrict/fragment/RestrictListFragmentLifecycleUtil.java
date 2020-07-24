package com.instagram.wellbeing.restrict.fragment;

public final class RestrictListFragmentLifecycleUtil {
    public static void cleanupReferences(RestrictListFragment restrictListFragment) {
        restrictListFragment.mEmptyStateView = null;
    }
}
