package com.facebook.rsys.transport.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportProxy {

    public final class CProxy extends SignalingTransportProxy {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void sendSignalingMessage(int i, byte[] bArr, SignalingTransportCallback signalingTransportCallback, String str);

        public native void setSink(SignalingTransportSink signalingTransportSink);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendSignalingMessage(int i, byte[] bArr, SignalingTransportCallback signalingTransportCallback, String str);

    public abstract void setSink(SignalingTransportSink signalingTransportSink);
}
