package com.facebook.djinni.msys.infra;

import com.facebook.simplejni.NativeHolder;

public class McfReference {
    public final NativeHolder mNativeHolder;

    public static native McfReference createEqualsForTest();

    public static native McfReference createNotEqualsForTest();

    private native boolean nativeEquals(Object obj);

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof McfReference)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public McfReference(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
