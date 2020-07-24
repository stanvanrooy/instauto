package com.facebook.rsys.video;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class VideoSource {
    public final NativeHolder mNativeHolder;

    public static native VideoSource createFromMcfType(McfReference mcfReference);

    public static native long getMcfTypeId();

    public static native NativeHolder initNativeHolder();

    private native boolean nativeEquals(Object obj);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VideoSource)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public VideoSource() {
        this.mNativeHolder = initNativeHolder();
    }

    public VideoSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
