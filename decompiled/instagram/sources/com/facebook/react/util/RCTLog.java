package com.facebook.react.util;

import com.facebook.react.bridge.JavaScriptModule;

public interface RCTLog extends JavaScriptModule {
    void logIfNoNativeHook(String str, String str2);
}
