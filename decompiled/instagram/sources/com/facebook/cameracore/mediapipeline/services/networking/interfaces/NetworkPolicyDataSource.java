package com.facebook.cameracore.mediapipeline.services.networking.interfaces;

import com.facebook.cameracore.ardelivery.networkconsentmanager.impl.NetworkConsentManagerJNI;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;

public interface NetworkPolicyDataSource {
    int getAdditionalRequests();

    int getAdditionalRequestsForSeconds();

    AnalyticsLogger getAnalyticsLogger();

    String getEffectCacheKey();

    int getInitialRequests();

    int getMaxRequestsCapAtAGivenTime();

    NetworkConsentManagerJNI getNetworkConsentManager();

    boolean isNetworkConsentRequired();
}
