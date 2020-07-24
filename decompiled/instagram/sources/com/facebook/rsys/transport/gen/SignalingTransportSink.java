package com.facebook.rsys.transport.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportSink {

    public final class CProxy extends SignalingTransportSink {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void signalingMessageReceived(SignalingMessage signalingMessage);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void signalingMessageReceived(SignalingMessage signalingMessage);
}
