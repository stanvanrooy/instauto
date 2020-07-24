package com.facebook.rsys.externalcall.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class ExternalCallDelegate {

    public final class CProxy extends ExternalCallDelegate {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void onExternalCallStarted();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ExternalCallDelegate)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onExternalCallStarted();
}
