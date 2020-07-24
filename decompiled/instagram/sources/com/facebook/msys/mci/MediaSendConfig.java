package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import java.util.Map;
import p000X.AnonymousClass0Y1;

public class MediaSendConfig {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2);

    private native boolean nativeEquals(Object obj);

    public native Map getExtraLoggingData();

    public native boolean getIsSecure();

    public native String getJobId();

    public native Map getOptionalConfig();

    public native boolean getSendByServer();

    public native boolean getShouldTranscode();

    public native boolean getUseDoublePhase();

    public native int hashCode();

    public native String toString();

    static {
        AnonymousClass0Y1.A08("msysjniinfranosqlite");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSendConfig)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSendConfig(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
