package com.facebook.rti.common.time;

import android.os.SystemClock;

public class RealtimeSinceBootClock {
    public static final RealtimeSinceBootClock INSTANCE = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return INSTANCE;
    }

    public long now() {
        return SystemClock.elapsedRealtime();
    }
}
