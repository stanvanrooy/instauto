package com.instagram.realtimeclient;

import com.facebook.flipper.plugins.mqtt.MqttEvent;
import com.facebook.flipper.plugins.mqtt.MqttFlipperPlugin;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.nio.charset.Charset;
import p000X.C55622b2;
import p000X.C56392cQ;

public class SonarLoggingObserver implements RealtimeClientManager.Observer {
    public static final Charset CHARSET_UTF8 = Charset.forName("UTF-8");
    public MqttFlipperPlugin mPlugin;

    public void onConnectionChanged(C56392cQ r1) {
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        this.mPlugin.reportEvent(MqttEvent.subscribe(str, str2));
    }

    public SonarLoggingObserver(MqttFlipperPlugin mqttFlipperPlugin) {
        this.mPlugin = mqttFlipperPlugin;
    }

    public void onMessage(C55622b2 r6) {
        String str;
        RealtimePayload parse = RealtimePayloadParser.parse(r6);
        MqttFlipperPlugin mqttFlipperPlugin = this.mPlugin;
        String str2 = r6.A00;
        if (parse != null) {
            str = parse.stringPayload;
        } else {
            str = new String(r6.A01, CHARSET_UTF8);
        }
        mqttFlipperPlugin.reportEvent(MqttEvent.message(str2, str));
    }
}
