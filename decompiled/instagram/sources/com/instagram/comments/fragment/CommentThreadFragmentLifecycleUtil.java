package com.instagram.comments.fragment;

public final class CommentThreadFragmentLifecycleUtil {
    public static void cleanupReferences(CommentThreadFragment commentThreadFragment) {
        commentThreadFragment.mCommentsContainer = null;
        commentThreadFragment.mRootView = null;
        commentThreadFragment.mScrollingViewProxy = null;
    }
}
