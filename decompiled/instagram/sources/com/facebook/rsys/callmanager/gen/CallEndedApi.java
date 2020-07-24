package com.facebook.rsys.callmanager.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class CallEndedApi {

    public final class CProxy extends CallEndedApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void removeCall();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallEndedApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void removeCall();
}
