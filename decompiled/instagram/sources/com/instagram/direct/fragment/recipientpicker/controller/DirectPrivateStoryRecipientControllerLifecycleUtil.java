package com.instagram.direct.fragment.recipientpicker.controller;

public final class DirectPrivateStoryRecipientControllerLifecycleUtil {
    public static void cleanupReferences(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        directPrivateStoryRecipientController.mListContainer = null;
        directPrivateStoryRecipientController.mSearchController = null;
        directPrivateStoryRecipientController.mFastScrollController = null;
    }
}
