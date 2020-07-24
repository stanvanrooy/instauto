package com.facebook.cameracore.mediapipeline.engine;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import p000X.AnonymousClass0ZA;

public class ScriptThreadExecutor implements Executor {
    public Handler mHandler = new Handler(this.mThread.getLooper());
    public HandlerThread mThread;

    public ScriptThreadExecutor(String str) {
        HandlerThread handlerThread = new HandlerThread("AREngineScript");
        this.mThread = handlerThread;
        handlerThread.start();
    }

    public void execute(Runnable runnable) {
        AnonymousClass0ZA.A0E(this.mHandler, runnable, -2019826458);
    }

    public void quit() {
        this.mThread.quit();
    }
}
