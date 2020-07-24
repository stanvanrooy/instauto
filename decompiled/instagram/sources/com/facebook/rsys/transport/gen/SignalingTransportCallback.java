package com.facebook.rsys.transport.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportCallback {

    public final class CProxy extends SignalingTransportCallback {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void sendFailureCallback(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendFailureCallback(int i);
}
