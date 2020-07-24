package com.instagram.realtimeclient;

import java.util.Collections;
import java.util.List;
import p000X.C55622b2;

public abstract class GraphQLSubscriptionHandler extends RealtimeEventHandler {
    public final List getMqttTopicsToHandle() {
        return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
    }

    public final boolean handleRealtimeEvent(C55622b2 r4, RealtimePayload realtimePayload) {
        if (!canHandleRealtimeEvent(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic)) {
            return false;
        }
        onRealtimeEventPayload(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic, realtimePayload.stringPayload);
        return true;
    }
}
