package com.instagram.realtimeclient;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.realtimeclient.C0143QE;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P4;
import p000X.StoredPreferences;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.C05940Nb;
import p000X.C06630Pu;
import p000X.C07180Sb;
import p000X.C07190Sc;
import p000X.C14300kE;
import p000X.C16180oA;
import p000X.C60792kX;

public class RealtimeMqttClientConfig extends C60792kX {
    public static final Class TAG = RealtimeMqttClientConfig.class;
    public final C07190Sc mAnalyticsLogger = new C07190Sc() {
        public synchronized void reportEvent(final C07180Sb r5) {
            if (RealtimeMqttClientConfig.this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
                AnonymousClass0P4 A00 = AnonymousClass0P4.A00(r5.A01, new AnonymousClass0RN() {
                    public String getModuleName() {
                        return r5.A00;
                    }
                });
                for (Map.Entry entry : r5.A02.entrySet()) {
                    A00.A0G((String) entry.getKey(), (String) entry.getValue());
                }
                A00.A0F("client_nano_time", Long.valueOf(System.nanoTime()));
                AnonymousClass0WN.A01(RealtimeMqttClientConfig.this.mUserSession).BcG(A00);
            }
        }
    };
    public String mCurrentlyConnectedHost;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final AnonymousClass0C1 mUserSession;

    public int getHealthStatsSamplingRate() {
        return 30;
    }

    public synchronized void setHost(String str, boolean z) {
        if (str != null) {
            if (!str.equals(this.mCurrentlyConnectedHost)) {
                this.mCurrentlyConnectedHost = str;
                if (z) {
                    setPreferredTier("sandbox");
                    setPreferredSandbox(this.mCurrentlyConnectedHost);
                } else {
                    setPreferredTier(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                    setMqttConnectionConfig(AnonymousClass000.A0J("{\"host_name_v6\":\"", this.mCurrentlyConnectedHost, "\"}"));
                }
            }
        }
    }

    private String getEverclearSubscriptions() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C0143QE.ig_rti_inapp_notifications_universe.is_enabled.getAndExpose(this.mUserSession).booleanValue()) {
                jSONObject.put("inapp_notification_subscribe_default", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            }
            jSONObject.put("inapp_notification_subscribe_comment", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_comment_mention_and_reply", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put(GraphQLSubscriptionID.IMPORT_PAGE_MEDIA_QUERY_NAME, GraphQLSubscriptionID.IMPORT_PAGE_MEDIA_QUERY_ID);
            jSONObject.put(GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_NAME, GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_ID);
        } catch (JSONException unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }

    private String getPubSubMsgTypeBlacklist() {
        return AnonymousClass000.A0E(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, ", typing_type");
    }

    public C07190Sc getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public Map getAppSpecificInfo() {
        String str;
        Context context = StoredPreferences.A00;
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put(OptSvcAnalyticsStore.LOGGING_KEY_APP_VERSION, C06630Pu.A01(context));
        hashMap.put("X-IG-Capabilities", "3brTvw8=");
        hashMap.put("Accept-Language", C05940Nb.A00());
        hashMap.put("User-Agent", C14300kE.A00());
        hashMap.put("ig_mqtt_route", "django");
        if (this.mRealtimeClientConfig.getMQTTAnalyticsLoggingEnabled()) {
            hashMap.put("client_session_id", String.valueOf(System.currentTimeMillis()));
        }
        String pubSubMsgTypeBlacklist = getPubSubMsgTypeBlacklist();
        if (!TextUtils.isEmpty(pubSubMsgTypeBlacklist)) {
            hashMap.put("pubsub_msg_type_blacklist", pubSubMsgTypeBlacklist);
        }
        String everclearSubscriptions = getEverclearSubscriptions();
        if (!TextUtils.isEmpty(everclearSubscriptions)) {
            hashMap.put("everclear_subscriptions", everclearSubscriptions);
        }
        if (C0143QE.ig_android_mqtt_cookie_auth_memcache_universe.is_enabled.getAndExpose(this.mUserSession).booleanValue()) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        hashMap.put("auth_cache_enabled", str);
        return hashMap;
    }

    public String getRequestRoutingRegion() {
        return C16180oA.A00(this.mUserSession).A00.getString("realtime_mqtt_request_routing_region", (String) null);
    }

    public RealtimeMqttClientConfig(AnonymousClass0C1 r2, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = r2;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }
}
