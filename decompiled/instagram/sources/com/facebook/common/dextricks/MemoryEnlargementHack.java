package com.facebook.common.dextricks;

import android.content.Context;

public final class MemoryEnlargementHack {
    public static final String TAG = "MemoryEnlargementHack";

    public static void growMyHeap(Context context) {
        if ((context.getApplicationInfo().flags & 1048576) == 0) {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            cls.getMethod("clearGrowthLimit", new Class[0]).invoke(cls.getMethod("getRuntime", new Class[0]).invoke((Object) null, new Object[0]), new Object[0]);
        }
    }
}
