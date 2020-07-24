package com.facebook.proxygen;

public class EventBase extends NativeHandleImpl {
    public long mJniEnv;

    private native void close();

    private native void init();

    public native void loopForever();

    public native void runInThread(Runnable runnable);

    public native void terminate();

    public EventBase() {
        init();
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
