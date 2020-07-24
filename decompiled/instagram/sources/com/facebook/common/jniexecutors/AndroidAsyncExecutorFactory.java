package com.facebook.common.jniexecutors;

import com.facebook.jni.HybridData;
import java.util.concurrent.ScheduledExecutorService;
import p000X.AnonymousClass0YD;

public class AndroidAsyncExecutorFactory {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService);

    static {
        AnonymousClass0YD.A01("jniexecutors");
    }

    public AndroidAsyncExecutorFactory(ScheduledExecutorService scheduledExecutorService) {
        this.mHybridData = initHybrid(scheduledExecutorService);
    }
}
