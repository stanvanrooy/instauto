package com.facebook.mediastreaming.opt.source.audio;

import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public abstract class AndroidAudioInputHost extends StreamingHybridClassBase {
    public static native HybridData initHybrid();

    public abstract ByteBuffer acquireAudioSampleBuffer();

    public abstract void audioSampleBufferFilled(int i, boolean z);

    public abstract void onAudioRecordingFailed(Exception exc);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public AndroidAudioInputHost() {
        super(initHybrid());
    }

    public AndroidAudioInputHost(HybridData hybridData) {
        super(hybridData);
    }
}
