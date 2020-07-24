package com.facebook.rsys.audio.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class AudioApi {

    public final class CProxy extends AudioApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native void enableMicrophone(boolean z);

        public native int hashCode();

        public native void setAudioActivationState(int i);

        public native void setAudioOutputRoute(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enableMicrophone(boolean z);

    public abstract void setAudioActivationState(int i);

    public abstract void setAudioOutputRoute(int i);
}
