package com.instagram.debug.network;

import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.C05000Hl;
import p000X.C06590Pq;

/* renamed from: com.instagram.debug.network.L */
public class C0140L {

    /* renamed from: com.instagram.debug.network.L$ig_android_slow_network_debug_tool_config */
    public class ig_android_slow_network_debug_tool_config {

        /* renamed from: com.instagram.debug.network.L$ig_android_slow_network_debug_tool_config$days_of_week */
        public class days_of_week {
            public static C05000Hl getParameter() {
                return new C05000Hl("days_of_week", AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, 0, new String[]{"0", "8"}, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A02(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "days_of_week", 0, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A00(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "days_of_week", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A03(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "days_of_week", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A01(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "days_of_week", 0, (AnonymousClass04H) null);
            }
        }

        /* renamed from: com.instagram.debug.network.L$ig_android_slow_network_debug_tool_config$sleep_time_per_chunk */
        public class sleep_time_per_chunk {
            public static C05000Hl getParameter() {
                return new C05000Hl("sleep_time_per_chunk", AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, 0, new String[]{"0", "500"}, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A02(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "sleep_time_per_chunk", 0, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A00(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "sleep_time_per_chunk", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A03(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "sleep_time_per_chunk", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A01(r4, AnonymousClass0L7.SLOW_NETWORK_DEBUG_TOOL_CONFIG, "sleep_time_per_chunk", 0, (AnonymousClass04H) null);
            }
        }
    }
}
