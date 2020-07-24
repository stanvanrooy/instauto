package com.instagram.realtimeclient;

import p000X.C55622b2;

public class RealtimePayloadParser {
    public static RealtimePayload parse(C55622b2 r2) {
        String str = r2.A00;
        if (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str)) {
            return parseSkywalkerMessage(r2);
        }
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            return parseGraphQLSubscriptionMessage(r2);
        }
        return null;
    }

    public static RealtimePayload parseGraphQLSubscriptionMessage(C55622b2 r2) {
        GraphQLSubscriptionMessage graphQLSubscriptionMessage = new GraphQLSubscriptionMessage(r2.A01);
        return new RealtimePayload(TCompactProtocol.getStringFromByteBuffer(graphQLSubscriptionMessage.mMessageTopic), TCompactProtocol.getStringFromByteBuffer(graphQLSubscriptionMessage.mMessagePayload));
    }

    public static RealtimePayload parseSkywalkerMessage(C55622b2 r2) {
        SkywalkerMessage skywalkerMessage = new SkywalkerMessage(r2.A01);
        return new RealtimePayload(Integer.toString(skywalkerMessage.mMessageType.intValue()), TCompactProtocol.getStringFromByteBuffer(skywalkerMessage.mMessagePayload));
    }
}
