package com.facebook.rsys.videorender.gen;

import com.facebook.simplejni.NativeHolder;
import org.webrtc.VideoFrame;

public abstract class VideoRenderProxy {

    public final class CProxy extends VideoRenderProxy {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native int hashCode();

        public native void renderFrame(VideoFrame videoFrame, Object obj, int i);

        public native void setApi(VideoRenderApi videoRenderApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void renderFrame(VideoFrame videoFrame, Object obj, int i);

    public abstract void setApi(VideoRenderApi videoRenderApi);
}
