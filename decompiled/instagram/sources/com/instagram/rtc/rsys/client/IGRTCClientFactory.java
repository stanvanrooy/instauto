package com.instagram.rtc.rsys.client;

import com.facebook.msys.mci.NotificationCenter;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.externalcall.gen.ExternalCallProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.log.gen.LogSubmissionProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.instagram.rtc.rsys.proxies.EngineProxy;
import java.util.Map;

public abstract class IGRTCClientFactory {

    public final class CProxy extends IGRTCClientFactory {
        public static native IGRTCClient createClient(String str, String str2, String str3, String str4, int i, NotificationCenter notificationCenter, EngineProxy engineProxy, LogPersistenceProxy logPersistenceProxy, AudioProxy audioProxy, CameraProxy cameraProxy, ExternalCallProxy externalCallProxy, LogSubmissionProxy logSubmissionProxy, VideoRenderProxy videoRenderProxy, Map map);
    }
}
