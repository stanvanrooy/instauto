package com.facebook.cameracore.mediapipeline.services.audio.interfaces;

public abstract class AudioRenderCallback {
    public abstract void onSamplesReady(byte[] bArr, int i);
}
