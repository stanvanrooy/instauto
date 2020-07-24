package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeImagePickerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void canRecordVideos(Callback callback);

    @ReactMethod
    public abstract void canUseCamera(Callback callback);

    @ReactMethod
    public abstract void clearAllPendingVideos();

    @ReactMethod
    public abstract void openCameraDialog(C23043A0y a0y, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void openSelectDialog(C23043A0y a0y, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void removePendingVideo(String str);

    public NativeImagePickerIOSSpec(A44 a44) {
        super(a44);
    }
}
