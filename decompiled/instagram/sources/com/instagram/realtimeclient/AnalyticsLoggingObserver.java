package com.instagram.realtimeclient;

import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Random;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0WN;
import p000X.C150036bP;
import p000X.C55622b2;
import p000X.C56392cQ;

public class AnalyticsLoggingObserver implements RealtimeClientManager.Observer {
    public int mConnectingCount;
    public long mLastConnectionStatusChangeTimestamp;
    public final Random mRandomGenerator = new Random();
    public final int mReceiveMessageSampleRate;
    public final AnonymousClass0C1 mUserSession;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0048, code lost:
        if (r10 == p000X.Constants.ZERO) goto L_0x004a;
     */
    public void onConnectionChanged(C56392cQ r12) {
        boolean z;
        String str;
        AnonymousClass0P4 A00 = AnonymousClass0P4.A00(RealtimeConstants.CONNECTION_STATUS_EVENT_NAME, (AnonymousClass0RN) null);
        long currentTimeMillis = System.currentTimeMillis();
        Integer num = r12.A00;
        Integer num2 = Constants.ONE;
        boolean z2 = false;
        if (num == num2) {
            z2 = true;
        }
        if (z2) {
            str = RealtimeConstants.MQTT_CONNECTED;
        } else {
            if (num != num2) {
                z = false;
            }
            z = true;
            if (!z) {
                str = RealtimeConstants.MQTT_DISCONNECTED;
            } else {
                int i = this.mConnectingCount + 1;
                this.mConnectingCount = i;
                this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
                if (i == 1) {
                    A00.A0G("event_type", RealtimeConstants.MQTT_CONNECTING);
                    A00.A0E("connecting_count", Integer.valueOf(this.mConnectingCount));
                    AnonymousClass0WN.A01(this.mUserSession).BcG(A00);
                    return;
                }
                return;
            }
        }
        A00.A0G("event_type", str);
        A00.A0E("connecting_count", Integer.valueOf(this.mConnectingCount));
        A00.A0F("time_spend", Long.valueOf(currentTimeMillis - this.mLastConnectionStatusChangeTimestamp));
        AnonymousClass0WN.A01(this.mUserSession).BcG(A00);
        this.mConnectingCount = 0;
        this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
    }

    public void onMessage(C55622b2 r6) {
        String str;
        String str2 = r6.A00;
        RealtimePayload parse = RealtimePayloadParser.parse(r6);
        if (this.mRandomGenerator.nextInt(this.mReceiveMessageSampleRate) == 0) {
            C150036bP r2 = new C150036bP(AnonymousClass0QT.A00(this.mUserSession, (AnonymousClass0RN) null).A02(RealtimeConstants.RECEIVE_MESSAGE));
            if (parse != null) {
                str = parse.subTopic;
            } else {
                str = "unknown";
            }
            r2.A08("sub_topic", str);
            r2.A08("mqtt_topic", str2);
            r2.A01();
        }
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        String str4;
        if (z) {
            str4 = RealtimeConstants.SUBSCRIPTION_STATUS_EVENT_NAME;
        } else {
            str4 = RealtimeConstants.SEND_MESSAGE_EVENT_NAME;
        }
        AnonymousClass0P4 A00 = AnonymousClass0P4.A00(str4, (AnonymousClass0RN) null);
        A00.A0G("send_message", str2);
        A00.A0G("event_type", str3);
        A00.A0G("mqtt_topic", str);
        if (l != null) {
            A00.A0F("send_time", l);
        }
        AnonymousClass0WN.A01(this.mUserSession).BcG(A00);
    }

    public AnalyticsLoggingObserver(AnonymousClass0C1 r2, int i) {
        this.mUserSession = r2;
        this.mReceiveMessageSampleRate = i;
    }
}
