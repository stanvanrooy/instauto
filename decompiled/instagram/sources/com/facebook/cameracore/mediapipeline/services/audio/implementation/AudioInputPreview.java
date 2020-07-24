package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import com.facebook.audiofiltercore.interfaces.AudioInput;

public class AudioInputPreview implements AudioInput {
    public AudioServiceController A00;
    public final int A01;

    public synchronized void close() {
        this.A00 = null;
    }

    public synchronized int read(short[] sArr, int i) {
        int i2;
        AudioServiceController audioServiceController = this.A00;
        if (audioServiceController != null) {
            i2 = audioServiceController.readPreviewSamples(sArr, i, this.A01);
        } else {
            i2 = 0;
        }
        return i2;
    }

    public AudioInputPreview(AudioServiceController audioServiceController, int i) {
        this.A00 = audioServiceController;
        this.A01 = i;
    }
}
