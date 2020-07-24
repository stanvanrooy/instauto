package com.facebook.rsys.callmanager.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;
import java.util.Map;

public abstract class CallClient {
    public abstract McfReference getAppCallClient();

    public abstract AudioProxy getAudio();

    public abstract CameraProxy getCamera();

    public abstract VideoRenderProxy getVideoRenderer();

    public abstract VideoSubscriptionsProxy getVideoSubscriptions();

    public abstract void onCallEnded(Map map, CallEndedApi callEndedApi);

    public abstract void setApi(CallApi callApi);
}
