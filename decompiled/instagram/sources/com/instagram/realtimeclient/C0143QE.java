package com.instagram.realtimeclient;

import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.C05000Hl;
import p000X.C06590Pq;

/* renamed from: com.instagram.realtimeclient.QE */
public class C0143QE {

    /* renamed from: com.instagram.realtimeclient.QE$ig_android_mqtt_cookie_auth_memcache_universe */
    public class ig_android_mqtt_cookie_auth_memcache_universe {

        /* renamed from: com.instagram.realtimeclient.QE$ig_android_mqtt_cookie_auth_memcache_universe$is_enabled */
        public class is_enabled {
            public static C05000Hl getParameter() {
                return new C05000Hl("is_enabled", AnonymousClass0L7.MQTT_COOKIE_AUTH_MEMCACHE, false, (String[]) null, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.MQTT_COOKIE_AUTH_MEMCACHE, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A00(r4, AnonymousClass0L7.MQTT_COOKIE_AUTH_MEMCACHE, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A03(r4, AnonymousClass0L7.MQTT_COOKIE_AUTH_MEMCACHE, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A01(r4, AnonymousClass0L7.MQTT_COOKIE_AUTH_MEMCACHE, "is_enabled", false, (AnonymousClass04H) null);
            }
        }
    }

    /* renamed from: com.instagram.realtimeclient.QE$ig_android_realtime_mqtt_logging */
    public class ig_android_realtime_mqtt_logging {

        /* renamed from: com.instagram.realtimeclient.QE$ig_android_realtime_mqtt_logging$is_enabled */
        public class is_enabled {
            public static C05000Hl getParameter() {
                return new C05000Hl("is_enabled", AnonymousClass0L7.REALTIME_MQTT_LOGGING, false, (String[]) null, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A00(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A03(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A01(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "is_enabled", false, (AnonymousClass04H) null);
            }
        }

        /* renamed from: com.instagram.realtimeclient.QE$ig_android_realtime_mqtt_logging$log_sample_rate */
        public class log_sample_rate {
            public static C05000Hl getParameter() {
                return new C05000Hl("log_sample_rate", AnonymousClass0L7.REALTIME_MQTT_LOGGING, 0, new String[]{"0"}, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A02(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_sample_rate", 0, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A00(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_sample_rate", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A03(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_sample_rate", 0, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A01(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_sample_rate", 0, (AnonymousClass04H) null);
            }
        }

        /* renamed from: com.instagram.realtimeclient.QE$ig_android_realtime_mqtt_logging$log_receive_message_sample_rate */
        public class log_receive_message_sample_rate {
            public static C05000Hl getParameter() {
                return new C05000Hl("log_receive_message_sample_rate", AnonymousClass0L7.REALTIME_MQTT_LOGGING, 1, new String[]{RealtimeSubscription.GRAPHQL_MQTT_VERSION}, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A02(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_receive_message_sample_rate", 1, (AnonymousClass04H) null);
            }

            public static Integer getAndExpose(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A00(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_receive_message_sample_rate", 1, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Integer) AnonymousClass0L6.A03(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_receive_message_sample_rate", 1, (AnonymousClass04H) null);
            }

            public static Integer peekWithoutExposure(C06590Pq r4) {
                return (Integer) AnonymousClass0L6.A01(r4, AnonymousClass0L7.REALTIME_MQTT_LOGGING, "log_receive_message_sample_rate", 1, (AnonymousClass04H) null);
            }
        }
    }

    /* renamed from: com.instagram.realtimeclient.QE$ig_rti_inapp_notifications_universe */
    public class ig_rti_inapp_notifications_universe {

        /* renamed from: com.instagram.realtimeclient.QE$ig_rti_inapp_notifications_universe$is_enabled */
        public class is_enabled {
            public static C05000Hl getParameter() {
                return new C05000Hl("is_enabled", AnonymousClass0L7.RTI_INAPP_NOTIFICATIONS, false, (String[]) null, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.RTI_INAPP_NOTIFICATIONS, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean getAndExpose(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A00(r4, AnonymousClass0L7.RTI_INAPP_NOTIFICATIONS, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(AnonymousClass0C1 r4) {
                return (Boolean) AnonymousClass0L6.A03(r4, AnonymousClass0L7.RTI_INAPP_NOTIFICATIONS, "is_enabled", false, (AnonymousClass04H) null);
            }

            public static Boolean peekWithoutExposure(C06590Pq r4) {
                return (Boolean) AnonymousClass0L6.A01(r4, AnonymousClass0L7.RTI_INAPP_NOTIFICATIONS, "is_enabled", false, (AnonymousClass04H) null);
            }
        }
    }
}
