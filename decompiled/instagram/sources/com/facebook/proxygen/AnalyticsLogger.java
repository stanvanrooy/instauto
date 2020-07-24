package com.facebook.proxygen;

import java.util.Map;

public interface AnalyticsLogger {
    void reportEvent(Map map, String str, String str2);
}
