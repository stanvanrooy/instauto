package com.facebook.react.bridge;

public interface ReactCallback {
    void decrementPendingJSCalls();

    void incrementPendingJSCalls();

    void onBatchComplete();
}
