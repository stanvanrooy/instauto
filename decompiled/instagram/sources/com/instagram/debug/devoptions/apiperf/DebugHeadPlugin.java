package com.instagram.debug.devoptions.apiperf;

import android.app.Activity;
import android.content.Context;
import p000X.C157696oP;
import p000X.C30731Uz;

public abstract class DebugHeadPlugin {
    public static DebugHeadPlugin sInstance;

    public abstract C30731Uz getDebugHeadDropFrameListener(Activity activity);

    public abstract LoomTraceProvider getDebugHeadLoomTraceHelper(Context context);

    public abstract C157696oP getDebugHeadMemoryLeakListener();

    public abstract void initializeDebugHead(Activity activity, Context context);

    public abstract void showDebugHead();

    public static DebugHeadPlugin getInstance() {
        return sInstance;
    }

    public static void setInstance(DebugHeadPlugin debugHeadPlugin) {
        sInstance = debugHeadPlugin;
    }
}
