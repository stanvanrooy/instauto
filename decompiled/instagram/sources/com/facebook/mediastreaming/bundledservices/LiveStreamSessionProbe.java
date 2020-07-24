package com.facebook.mediastreaming.bundledservices;

import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.io.File;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0a4;

public class LiveStreamSessionProbe {
    public final HybridData mHybridData;

    public native AudioEncoderConfig getAudioEncoderConfig();

    public native long getAudioPts();

    public native long getAudioPtsStreamTime();

    public native File getDvrOutputFile();

    public native int getMuxState();

    public native VideoEncoderConfig getVideoEncoderConfig();

    public native long getVideoPts();

    static {
        AnonymousClass0Y1.A08("mediastreaming-bundledservices");
    }

    public LiveStreamSessionProbe(HybridData hybridData) {
        AnonymousClass0a4.A06(hybridData);
        this.mHybridData = hybridData;
    }
}
