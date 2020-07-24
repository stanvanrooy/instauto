package com.facebook.rsys.videorender.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class VideoRenderApi {

    public final class CProxy extends VideoRenderApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void removeRenderTarget(String str, Object obj);

        public native void setRenderTarget(String str, Object obj);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void removeRenderTarget(String str, Object obj);

    public abstract void setRenderTarget(String str, Object obj);
}
