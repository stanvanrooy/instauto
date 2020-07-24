package com.instagram.settings.common;

public final class PaymentOptionsFragmentLifecycleUtil {
    public static void cleanupReferences(PaymentOptionsFragment paymentOptionsFragment) {
        paymentOptionsFragment.mEmptyStateView = null;
    }
}
