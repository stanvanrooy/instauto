package com.instagram.realtimeclient;

public class RealtimeConstants {
    public static final String CONNECTION_STATUS_EVENT_NAME = "ig_mqtt__client_connection_status";
    public static final String DIRECT_TYPING_INDICATOR_BLACKLIST_TYPE = "typing_type";
    public static final String GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING = "direct";
    public static final String MQTT_CONNECTED = "connected";
    public static final String MQTT_CONNECTING = "connecting";
    public static final String MQTT_DISCONNECTED = "disconnected";
    public static final String MQTT_TOPIC_GRAPHQL_SUBSCRIPTION_PREFIX = "/graphql";
    public static final String MQTT_TOPIC_MESSAGE_SYNC = "/ig_message_sync";
    public static final String MQTT_TOPIC_PREEMPTIVE_PING = "/pp";
    public static final String MQTT_TOPIC_REALTIME = "/ig_realtime";
    public static final String MQTT_TOPIC_REALTIME_META_SUBSCRIBE = "/ig_realtime_sub";
    public static final String MQTT_TOPIC_REGION_HINT = "/t_region_hint";
    public static final String MQTT_TOPIC_SEND_MESSAGE = "/ig_send_message";
    public static final String MQTT_TOPIC_SEND_MESSAGE_RESPONSE = "/ig_send_message_response";
    public static final String MQTT_TOPIC_SKYWALKER = "/pubsub";
    public static final String MQTT_TOPIC_SUB_IRIS = "/ig_sub_iris";
    public static final String MQTT_TOPIC_SUB_IRIS_RESPONSE = "/ig_sub_iris_response";
    public static final String RECEIVE_MESSAGE = "ig_realtime_skywalker_client_receive_event";
    public static final String SEND_ATTEMPT = "attempt";
    public static final String SEND_FAIL = "fail";
    public static final String SEND_MESSAGE_EVENT_NAME = "ig_mqtt_client_send_message";
    public static final String SEND_SUCCESS = "success";
    public static final int SKYWALKER_MESSAGE_TYPE_DIRECT = 1;
    public static final int SKYWALKER_MESSAGE_TYPE_LIVE = 2;
    public static final int SKYWALKER_MESSAGE_TYPE_LIVEWITH = 3;
    public static final int SKYWALKER_MESSAGE_TYPE_VIDEOCALL = 4;
    public static final String SUBSCRIPTION_STATUS_EVENT_NAME = "ig_realtime_skywalker_client_subscription_status";
}
