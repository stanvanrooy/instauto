package com.instagram.profile.edit.controller;

public final class EditProfileFieldsControllerLifecycleUtil {
    public static void cleanupReferences(EditProfileFieldsController editProfileFieldsController) {
        editProfileFieldsController.mActivity = null;
        editProfileFieldsController.mView = null;
        editProfileFieldsController.mNameField = null;
        editProfileFieldsController.mUsernameField = null;
        editProfileFieldsController.mWebsiteField = null;
        editProfileFieldsController.mBioField = null;
    }
}
