package com.facebook.cameracore.mediapipeline.services.camerashare.implementation;

import com.facebook.cameracore.mediapipeline.services.camerashare.interfaces.CameraShareService;
import com.facebook.jni.HybridData;
import java.util.Map;

public class CameraShareServiceImpl extends CameraShareService {
    public static native HybridData initHybrid();

    private native void nativeSetDeeplinkTextureMap(Map map);

    private native void nativeSetEffectArgumentsJSON(String str);

    public CameraShareServiceImpl() {
        super(initHybrid());
    }

    public final void setDeeplinkTextureMap(Map map) {
        nativeSetDeeplinkTextureMap(map);
    }

    public final void setEffectArgumentsJSON(String str) {
        nativeSetEffectArgumentsJSON(str);
    }
}
