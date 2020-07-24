package com.instagram.rtc.rsys.proxies;

import com.instagram.rtc.rsys.models.AnalyticsEvent;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.HttpRequest;
import java.util.Map;

public abstract class EngineProxy {
    public abstract void createAnalyticsEvent(AnalyticsEvent analyticsEvent);

    public abstract void sendHttpSignalingMessageHandler(HttpRequest httpRequest);

    public abstract void sendSignalingMessageHandler(byte[] bArr);

    public abstract void stateChangedHandler(EngineModel engineModel, Map map);
}
