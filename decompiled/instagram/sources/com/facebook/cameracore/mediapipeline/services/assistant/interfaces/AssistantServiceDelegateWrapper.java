package com.facebook.cameracore.mediapipeline.services.assistant.interfaces;

import java.util.HashMap;

public class AssistantServiceDelegateWrapper {
    public void onCommandsChanged(String[] strArr, String[] strArr2) {
        int length = strArr.length;
        if (length == strArr2.length) {
            HashMap hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                hashMap.put(strArr[i], strArr2[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Keys and values should have the same number of elements");
    }

    public void registerApp(String str) {
        throw null;
    }

    public void setCallback(AssistantServiceCallbackHybrid assistantServiceCallbackHybrid) {
        throw null;
    }

    public void startSession() {
        throw null;
    }

    public void stopSession() {
        throw null;
    }

    public void unregisterApp() {
        throw null;
    }

    public void onIntentsChanged(String[] strArr, String[] strArr2) {
        throw null;
    }
}
