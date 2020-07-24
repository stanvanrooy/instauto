package com.instagram.rtc.rsys.proxies;

import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.simplejni.NativeHolder;

public abstract class SignalingProxy {

    public final class CProxy extends SignalingProxy {
        public final NativeHolder mNativeHolder;

        public static native SignalingProxy createSignalingProxy(SignalingSenderProxy signalingSenderProxy);

        private native boolean nativeEquals(Object obj);

        public native SignalingTransportProxy getSignalingTransportProxy();

        public native void handleIncomingCallFromPushNotification(String str, String str2, String str3, String str4);

        public native void handleMqttPayload(String str);

        public native void handleMultiwayHttpResponse(String str, String str2, int i);

        public native void handleMultiwaySignalingMessage(String str);

        public native void handleP2PSignalingMessage(String str);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract SignalingTransportProxy getSignalingTransportProxy();

    public abstract void handleIncomingCallFromPushNotification(String str, String str2, String str3, String str4);

    public abstract void handleMqttPayload(String str);

    public abstract void handleMultiwayHttpResponse(String str, String str2, int i);

    public abstract void handleMultiwaySignalingMessage(String str);

    public abstract void handleP2PSignalingMessage(String str);
}
