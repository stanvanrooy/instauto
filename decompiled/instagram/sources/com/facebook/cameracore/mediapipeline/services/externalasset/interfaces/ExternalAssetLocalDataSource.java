package com.facebook.cameracore.mediapipeline.services.externalasset.interfaces;

import com.facebook.native_bridge.NativeDataPromise;

public interface ExternalAssetLocalDataSource {
    boolean getAsset(NativeDataPromise nativeDataPromise, String str, String str2);

    String getStreamingURI(String str, String str2);
}
