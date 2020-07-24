package com.instagram.debug.network;

import com.instagram.debug.network.C0140L;
import java.util.Calendar;
import p000X.C06590Pq;

public class DebugNetworkShapingServerOverrideHelper {
    public static long getSleepPerChunkOverride(C06590Pq r1) {
        if (!isDayEnabled(r1)) {
            return 0;
        }
        return (long) C0140L.ig_android_slow_network_debug_tool_config.sleep_time_per_chunk.getAndExpose(r1).intValue();
    }

    public static boolean isDayEnabled(C06590Pq r2) {
        int intValue = C0140L.ig_android_slow_network_debug_tool_config.days_of_week.getAndExpose(r2).intValue();
        int i = 1 << Calendar.getInstance().get(7);
        if ((intValue & i) != i) {
            return false;
        }
        return true;
    }
}
