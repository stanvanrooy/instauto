package com.facebook.rsys.videosubscriptions.gen;

import com.facebook.simplejni.NativeHolder;

public abstract class VideoSubscriptionsApi {

    public final class CProxy extends VideoSubscriptionsApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void updateSubscriptions(VideoSubscriptions videoSubscriptions);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoSubscriptionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void updateSubscriptions(VideoSubscriptions videoSubscriptions);
}
