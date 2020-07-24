package com.facebook.rsys.datachannel.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class DataTransport {

    public final class CProxy extends DataTransport {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native boolean isReady();

        public native void remove();

        public native void sendData(byte[] bArr);

        public native void setListener(DataTransportListener dataTransportListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataTransport)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean isReady();

    public abstract void remove();

    public abstract void sendData(byte[] bArr);

    public abstract void setListener(DataTransportListener dataTransportListener);
}
