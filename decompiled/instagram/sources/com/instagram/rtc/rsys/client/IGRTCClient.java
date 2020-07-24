package com.instagram.rtc.rsys.client;

import com.facebook.rsys.mediasync.gen.MediaSyncUpdateAction;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class IGRTCClient {

    public final class CProxy extends IGRTCClient {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native void acceptCall(boolean z);

        public native void endCall(int i);

        public native void finishCall();

        public native void handleCallEndedFromPushNotification(String str, String str2);

        public native void handleIncomingCallFromPushNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7);

        public native void handleInteropMessageFromPushNotification(String str);

        public native void handleMediaSyncUpdate(MediaSyncUpdateAction mediaSyncUpdateAction);

        public native void handleMqttPayload(String str);

        public native void handleMultiwayHttpResponse(String str, String str2, int i);

        public native void handleMultiwaySignalingMessage(String str);

        public native void handleP2PSignalingMessage(String str);

        public native int hashCode();

        public native void invalidate();

        public native void joinCall(String str, String str2, String str3, String str4);

        public native void refresh();

        public native void setAudioEnabled(boolean z);

        public native void setCameraEnabled(boolean z);

        public native void setVideoPaused(boolean z);

        public native void startCall(int i, String str, ArrayList arrayList, String str2);

        public native void switchCamera();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof IGRTCClient)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void acceptCall(boolean z);

    public abstract void endCall(int i);

    public abstract void finishCall();

    public abstract void handleCallEndedFromPushNotification(String str, String str2);

    public abstract void handleIncomingCallFromPushNotification(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public abstract void handleInteropMessageFromPushNotification(String str);

    public abstract void handleMediaSyncUpdate(MediaSyncUpdateAction mediaSyncUpdateAction);

    public abstract void handleMqttPayload(String str);

    public abstract void handleMultiwayHttpResponse(String str, String str2, int i);

    public abstract void handleMultiwaySignalingMessage(String str);

    public abstract void handleP2PSignalingMessage(String str);

    public abstract void invalidate();

    public abstract void joinCall(String str, String str2, String str3, String str4);

    public abstract void refresh();

    public abstract void setAudioEnabled(boolean z);

    public abstract void setCameraEnabled(boolean z);

    public abstract void setVideoPaused(boolean z);

    public abstract void startCall(int i, String str, ArrayList arrayList, String str2);

    public abstract void switchCamera();
}
