package com.facebook.react.bridge;

public interface JavaJSExecutor {
    String executeJSCall(String str, String str2);

    void loadBundle(String str);

    void setGlobalVariable(String str, String str2);
}
