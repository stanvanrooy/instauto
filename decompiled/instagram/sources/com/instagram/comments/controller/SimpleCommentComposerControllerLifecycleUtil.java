package com.instagram.comments.controller;

public final class SimpleCommentComposerControllerLifecycleUtil {
    public static void cleanupReferences(SimpleCommentComposerController simpleCommentComposerController) {
        simpleCommentComposerController.mViewHolder = null;
    }
}
