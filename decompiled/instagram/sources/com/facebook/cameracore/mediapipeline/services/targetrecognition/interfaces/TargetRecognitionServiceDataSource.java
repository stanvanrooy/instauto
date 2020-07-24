package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

import com.facebook.native_bridge.NativeDataPromise;

public interface TargetRecognitionServiceDataSource {
    void getTargetWithFeatures(String str, byte[] bArr, NativeDataPromise nativeDataPromise);
}
