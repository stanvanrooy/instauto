package com.facebook.cameracore.mediapipeline.services.camerashare.interfaces;

import com.facebook.jni.HybridData;
import java.util.Map;

public abstract class CameraShareService {
    public HybridData mHybridData;

    public abstract void setDeeplinkTextureMap(Map map);

    public abstract void setEffectArgumentsJSON(String str);

    public CameraShareService(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
