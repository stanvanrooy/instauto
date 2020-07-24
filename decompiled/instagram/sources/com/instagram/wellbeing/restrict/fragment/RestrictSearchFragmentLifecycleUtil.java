package com.instagram.wellbeing.restrict.fragment;

public final class RestrictSearchFragmentLifecycleUtil {
    public static void cleanupReferences(RestrictSearchFragment restrictSearchFragment) {
        restrictSearchFragment.mSearchAdapter = null;
        restrictSearchFragment.mSearchController = null;
    }
}
