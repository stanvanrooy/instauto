package com.instagram.realtimeclient;

import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.List;
import p000X.C55622b2;
import p000X.C56392cQ;

public abstract class RealtimeEventHandler {
    public abstract boolean canHandleRealtimeEvent(String str, String str2);

    public abstract List getMqttTopicsToHandle();

    public abstract boolean handleRealtimeEvent(C55622b2 r1, RealtimePayload realtimePayload);

    public void onMqttChannelStateChanged(C56392cQ r1) {
    }

    public abstract void onRealtimeEventPayload(String str, String str2, String str3);

    public void onSendRealtimeCommand(String str, RealtimeClientManager.MessageDeliveryCallback messageDeliveryCallback) {
    }

    public boolean shouldNotifyMqttChannelStateChanged() {
        return false;
    }
}
