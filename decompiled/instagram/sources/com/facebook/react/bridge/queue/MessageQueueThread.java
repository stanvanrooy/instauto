package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p000X.C23078A4z;

public interface MessageQueueThread {
    void assertIsOnThread();

    void assertIsOnThread(String str);

    Future callOnQueue(Callable callable);

    C23078A4z getPerfStats();

    boolean isOnThread();

    void quitSynchronous();

    void resetPerfStats();

    void runOnQueue(Runnable runnable);
}
