package com.instagram.rtc.rsys.proxies;

import com.instagram.rtc.rsys.models.AnalyticsEvent;

public abstract class LoggingProxy {
    public abstract void createAnalyticsEvent(AnalyticsEvent analyticsEvent);
}
