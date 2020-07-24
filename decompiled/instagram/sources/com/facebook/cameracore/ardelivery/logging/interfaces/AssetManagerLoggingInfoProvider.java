package com.facebook.cameracore.ardelivery.logging.interfaces;

public interface AssetManagerLoggingInfoProvider {
    String getEffectSessionId();

    String getOperationId();

    String getProductName();

    String getProductSessionId();

    String getRequestSource();

    boolean isPrefetch();

    boolean shouldLogEffectDetails();
}
