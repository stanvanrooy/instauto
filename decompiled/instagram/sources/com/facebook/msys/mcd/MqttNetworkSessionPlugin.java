package com.facebook.msys.mcd;

import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import p000X.C30188DUm;
import p000X.DV0;

public class MqttNetworkSessionPlugin {
    public static final MqttNetworkSessionPlugin sInstance = new MqttNetworkSessionPlugin();
    public volatile DV0 mMqttClientCallbacks;

    public static native void onMqttConnected();

    public static native void onMqttDisconnected();

    public static native void onMqttPubAck(int i);

    public static native void onMqttPubAckTimeout(int i);

    public static native void onMqttPubError(int i);

    public static native void onMqttPublishReceived(String str, byte[] bArr);

    public static native void register(NetworkSession networkSession, AuthData authData, NotificationCenter notificationCenter, String str);

    public static native void shutdown();

    public static int onGetConnectionState() {
        return sInstance.mMqttClientCallbacks.onGetConnectionState();
    }

    public static int onPublish(String str, int i, byte[] bArr) {
        return sInstance.mMqttClientCallbacks.onPublish(str, i, bArr);
    }

    static {
        C30188DUm.A00();
    }

    public static void onCancelPublish(int i) {
    }
}
