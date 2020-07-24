package com.facebook.cameracore.mediapipeline.services.audio.interfaces;

import com.facebook.jni.HybridData;
import p000X.C86263ok;

public abstract class AudioPlatformComponentHost {
    public HybridData mHybridData;

    public abstract boolean onInputDataAvailable(byte[] bArr, int i, int i2);

    public abstract void setExternalAudioProvider(C86263ok r1);

    public abstract void setMuted(boolean z);

    public abstract void setRenderCallback(AudioRenderCallback audioRenderCallback);

    public abstract void startRecording(boolean z);

    public abstract void stopRecording();
}
