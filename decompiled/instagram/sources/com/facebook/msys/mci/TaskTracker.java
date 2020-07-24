package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C208928zC;

public class TaskTracker {
    public static final TaskTracker TRACKER_CRYPTO = new TaskTracker(5, "Crypto");
    public static final TaskTracker TRACKER_DECODING = new TaskTracker(4, "Decoding");
    public static final TaskTracker TRACKER_DISK_IO = new TaskTracker(2, "Disk IO");
    public static final TaskTracker TRACKER_MAIN = new TaskTracker(1, "Main");
    public static final TaskTracker TRACKER_NETWORK = new TaskTracker(3, "Network");
    public static volatile boolean sInitialized;
    public final int mExecutionContext;
    public NativeHolder mNativeHolder;
    public final String mQueueName;

    public static native NativeHolder initNativeHolder(int i, String str);

    private native long nativeGetLong(int i);

    private native String nativeGetString(int i);

    private native int nativeGetTaskCount();

    static {
        C208928zC.A00();
    }

    public TaskTracker(int i, String str) {
        this.mExecutionContext = i;
        this.mQueueName = str;
    }
}
