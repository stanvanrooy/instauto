package com.instagram.realtimeclient;

import com.instagram.realtimeclient.C0143QE;
import java.util.Random;
import p000X.AnonymousClass0C1;

public class RealtimeClientConfig {
    public final int mDelayDisconnectMQTTMS = 300000;
    public int mLogReceiveMessageSampleRate;
    public boolean mMQTTAnalyticsLoggingEnabled;
    public final AnonymousClass0C1 mUserSession;

    public synchronized int getLogReceiveMessageSampleRate() {
        return this.mLogReceiveMessageSampleRate;
    }

    public synchronized boolean getMQTTAnalyticsLoggingEnabled() {
        return this.mMQTTAnalyticsLoggingEnabled;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    public synchronized void loadConfig() {
        boolean z;
        int intValue = C0143QE.ig_android_realtime_mqtt_logging.log_sample_rate.peekWithoutExposure(this.mUserSession).intValue();
        int i = 0;
        if (!C0143QE.ig_android_realtime_mqtt_logging.is_enabled.peekWithoutExposure(this.mUserSession).booleanValue()) {
            if (intValue == 0 || new Random().nextInt(intValue) != 0) {
                z = false;
                this.mMQTTAnalyticsLoggingEnabled = z;
                if (z) {
                    i = C0143QE.ig_android_realtime_mqtt_logging.log_receive_message_sample_rate.peekWithoutExposure(this.mUserSession).intValue();
                }
                this.mLogReceiveMessageSampleRate = i;
            }
        }
        z = true;
        this.mMQTTAnalyticsLoggingEnabled = z;
        if (z) {
        }
        this.mLogReceiveMessageSampleRate = i;
    }

    public int getDelayDisconnectMQTTMS() {
        return this.mDelayDisconnectMQTTMS;
    }

    public RealtimeClientConfig(AnonymousClass0C1 r2) {
        this.mUserSession = r2;
    }
}
