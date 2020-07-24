package com.facebook.rsys.camera.gen;

import com.facebook.rsys.rtc.RTVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class CameraApi {

    public final class CProxy extends CameraApi {
        public final NativeHolder mNativeHolder;

        private native boolean nativeEquals(Object obj);

        public native void enableCamera(boolean z);

        public native void handleCameraEviction(String str);

        public native void handleCapturedFrame(RTVideoFrame rTVideoFrame);

        public native int hashCode();

        public native void setCameraAccess(boolean z);

        public native void setCameraState(int i);

        public native void switchCamera();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enableCamera(boolean z);

    public abstract void handleCameraEviction(String str);

    public abstract void handleCapturedFrame(RTVideoFrame rTVideoFrame);

    public abstract void setCameraAccess(boolean z);

    public abstract void setCameraState(int i);

    public abstract void switchCamera();
}
