package com.facebook.common.time;

import android.os.SystemClock;
import p000X.C04140Cp;
import p000X.C04150Cq;

public class AwakeTimeSinceBootClock implements C04140Cp, C04150Cq {
    public static final AwakeTimeSinceBootClock INSTANCE = new AwakeTimeSinceBootClock();

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.uptimeMillis();
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
