package com.facebook.cameracore.mediapipeline.services.identity.interfaces;

import com.facebook.native_bridge.NativeDataPromise;

public interface IdentityServiceDataSource {
    void getAccessToken(NativeDataPromise nativeDataPromise);

    void getAppScopedID(NativeDataPromise nativeDataPromise);

    void getEmailAddress(NativeDataPromise nativeDataPromise);

    void getFullName(NativeDataPromise nativeDataPromise);

    void getPageScopedID(NativeDataPromise nativeDataPromise);
}
