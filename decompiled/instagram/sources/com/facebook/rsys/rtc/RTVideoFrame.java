package com.facebook.rsys.rtc;

import com.facebook.simplejni.NativeHolder;
import org.webrtc.VideoFrame;

public class RTVideoFrame {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(VideoFrame videoFrame);

    public native VideoFrame getVideoFrame();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RTVideoFrame)) {
            return false;
        }
        return getVideoFrame().buffer.equals(((RTVideoFrame) obj).getVideoFrame().buffer);
    }

    public RTVideoFrame(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public RTVideoFrame(VideoFrame videoFrame) {
        this.mNativeHolder = initNativeHolder(videoFrame);
    }
}
