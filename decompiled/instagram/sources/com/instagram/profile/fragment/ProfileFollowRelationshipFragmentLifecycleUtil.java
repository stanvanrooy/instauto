package com.instagram.profile.fragment;

public final class ProfileFollowRelationshipFragmentLifecycleUtil {
    public static void cleanupReferences(ProfileFollowRelationshipFragment profileFollowRelationshipFragment) {
        profileFollowRelationshipFragment.mRecyclerView = null;
    }
}
