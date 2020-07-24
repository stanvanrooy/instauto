package com.facebook.mediastreaming.opt.source.audio;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;
import p000X.C194408Ty;

public class AndroidExternalAudioSource extends AndroidAudioInputHost {
    public static final Class TAG = AndroidExternalAudioSource.class;
    public AndroidAudioInput mAudioInput;

    public native ByteBuffer acquireAudioSampleBuffer();

    public native void audioSampleBufferFilled(int i, boolean z);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public void onAudioRecordingFailed(Exception exc) {
        fireError(C194408Ty.AudioSourceError, "Audio recording failed", exc);
    }

    public void prepare() {
        this.mAudioInput.setHost(this);
    }

    public void start() {
        this.mAudioInput.startAudioStreaming();
    }

    public void stop() {
        this.mAudioInput.stopAudioStreaming();
    }

    public AndroidExternalAudioSource(HybridData hybridData) {
        super(hybridData);
    }

    public void release() {
        stop();
        this.mAudioInput.setHost((AndroidAudioInputHost) null);
    }

    public void setAudioInput(AndroidAudioInput androidAudioInput) {
        this.mAudioInput = androidAudioInput;
    }
}
