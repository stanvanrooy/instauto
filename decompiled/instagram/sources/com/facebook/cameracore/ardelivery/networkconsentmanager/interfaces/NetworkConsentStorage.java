package com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces;

import com.facebook.common.util.TriState;

public interface NetworkConsentStorage {
    void clearAllUserConsent();

    TriState getUserConsent(String str);

    void saveUserConsent(String str, boolean z);
}
