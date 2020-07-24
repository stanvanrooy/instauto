package com.instagram.profile.fragment;

public final class AccountPrivacyOptionSheetFragmentLifecycleUtil {
    public static void cleanupReferences(AccountPrivacyOptionSheetFragment accountPrivacyOptionSheetFragment) {
        accountPrivacyOptionSheetFragment.mScrollView = null;
        accountPrivacyOptionSheetFragment.mPrivacyStatusTextView = null;
        accountPrivacyOptionSheetFragment.mPublicCheckButton = null;
        accountPrivacyOptionSheetFragment.mPrivateCheckButton = null;
        accountPrivacyOptionSheetFragment.mFooterButton = null;
    }
}
