package com.facebook.cameracore.audiograph;

public interface AudioCallback {
    public static final int kFloatSample = 0;
    public static final int kInt16Sample = 1;

    void onAudioInput(byte[] bArr, long j);
}
