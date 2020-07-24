package com.instagram.realtimeclient;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;

public class RealtimeSubscription {
    public static final String GRAPHQL_MQTT_VERSION = "1";
    public static final String GRAPHQL_SUBSCRIPTIONS_SUBTOPIC = "graphqlsubscriptions";
    public static final String GRAPHQL_SUBSCRIPTION_TOPIC_PREFIX = "1/graphqlsubscriptions";
    public static final String REALTIME_USER_TOPIC_PREFIX = "ig/u/v1/";
    public static final String SKYWALKER_USER_LIVE_TOPIC_PREFIX = "ig/live_notification_subscribe/";
    public static final Class TAG = RealtimeSubscription.class;
    public final JSONObject mInputParams;
    public final String mSubscriptionQueryId;

    public static RealtimeSubscription getDirectTypingSubscription(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.DIRECT_TYPING_INDICATOR_QUERY_ID, jSONObject);
    }

    public String getSubscriptionString(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("input_data", this.mInputParams);
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("client_logged", true);
                jSONObject.put("%options", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return AnonymousClass000.A0N("1/graphqlsubscriptions/", this.mSubscriptionQueryId, "/", jSONObject.toString());
    }

    public RealtimeSubscription(String str, JSONObject jSONObject) {
        this.mSubscriptionQueryId = str;
        this.mInputParams = jSONObject;
    }

    public static RealtimeSubscription getAppPresenceSubscription(String str, PresenceSubscriptionIDStore presenceSubscriptionIDStore) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
        } catch (JSONException e) {
            AnonymousClass0DB.A08(TAG, "Can't create subscription intput for getAppPresenceSubscription: userId %s", str, e);
        }
        return new RealtimeSubscription(presenceSubscriptionIDStore.getAppPresenceQueryIdForSubscription(), jSONObject);
    }

    public static RealtimeSubscription getAsyncAdSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(MemoryDumpUploadJob.EXTRA_USER_ID, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.ASYNC_AD_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getClientConfigUpdateSubscription() {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.CLIENT_CONFIG_UPDATE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getDirectStatusSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
        } catch (JSONException e) {
            AnonymousClass0DB.A08(TAG, "Can't create subscription intput for getDirectStatusSubscription: userId %s", str, e);
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.DIRECT_STATUS_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getIgLiveWaveSubscription(String str, String str2) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
            jSONObject.put("receiver_id", str2);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IGLIVE_WAVE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivityActivateQuestionSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_ACTIVATE_QUESTION_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivityRealtimeQuestionSubmissionsStatusSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_REALTIME_SUBMISSIONS_STATUS_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivitySubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getLivePinnedProductSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.LIVE_PINNED_PRODUCT_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getLiveRealtimeCommentsSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put(TraceFieldType.BroadcastId, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.LIVE_REALTIME_COMMENT_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getMediaFeedbackSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("feedback_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getReactNativeOTAUpdateSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("build_number", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.REACT_NATIVE_OTA_UPDATE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getVideoCallCoWatchControlSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("video_call_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.COWATCH_CONTROL_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getVideoCallInCallAlertSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("video_call_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getVideoCallPrototypePublishSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("video_call_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.VIDEO_CALL_PROTOTYPE_PUBLISH_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getZeroProvisionSubscription(String str) {
        String uuid = UUID.randomUUID().toString();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", uuid);
            jSONObject.put("device_id", str);
        } catch (JSONException e) {
            AnonymousClass0DB.A08(TAG, "Can't create subscription intput for getZeroProvisionSubscription: deviceId %s", str, e);
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.ZERO_PROVISION_QUERY_ID, jSONObject);
    }
}
