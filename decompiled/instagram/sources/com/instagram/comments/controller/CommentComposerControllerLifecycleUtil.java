package com.instagram.comments.controller;

public final class CommentComposerControllerLifecycleUtil {
    public static void cleanupReferences(CommentComposerController commentComposerController) {
        commentComposerController.mViewHolder = null;
    }
}
