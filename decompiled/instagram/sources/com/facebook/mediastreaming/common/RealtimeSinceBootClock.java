package com.facebook.mediastreaming.common;

import android.os.SystemClock;
import p000X.AVM;

public class RealtimeSinceBootClock implements AVM {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
