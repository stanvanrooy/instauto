package com.facebook.common.time;

import android.os.SystemClock;
import p000X.C04140Cp;

public class RealtimeSinceBootClock implements C04140Cp {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
