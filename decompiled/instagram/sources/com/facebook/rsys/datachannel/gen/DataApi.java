package com.facebook.rsys.datachannel.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class DataApi {

    public final class CProxy extends DataApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);
}
