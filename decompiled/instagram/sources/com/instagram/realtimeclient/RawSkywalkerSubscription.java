package com.instagram.realtimeclient;

import p000X.AnonymousClass000;

public class RawSkywalkerSubscription {
    public static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";
    public static final String SKYWALKER_USER_LIVE_TOPIC_PREFIX = "ig/live_notification_subscribe/";

    public static String getLiveNotificationTopicSubscription(String str) {
        return AnonymousClass000.A0E("ig/live_notification_subscribe/", str);
    }

    public static String getUserTopicSubscription(String str) {
        return AnonymousClass000.A0E("ig/u/v1/", str);
    }
}
