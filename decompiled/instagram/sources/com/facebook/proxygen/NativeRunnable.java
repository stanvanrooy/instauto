package com.facebook.proxygen;

public class NativeRunnable extends NativeHandleImpl implements Runnable {
    public native void close();

    public native void run();

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
