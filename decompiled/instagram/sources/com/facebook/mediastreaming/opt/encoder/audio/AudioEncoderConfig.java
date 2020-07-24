package com.facebook.mediastreaming.opt.encoder.audio;

import p000X.C23622AUg;

public final class AudioEncoderConfig {
    public final int bitRate;
    public final int channels;
    public final C23622AUg profile;
    public final int sampleRate;

    public AudioEncoderConfig(int i, int i2, int i3, int i4) {
        C23622AUg aUg;
        this.sampleRate = i;
        this.bitRate = i2;
        this.channels = i3;
        if (i4 != 5) {
            aUg = C23622AUg.LC;
        } else {
            aUg = C23622AUg.HE;
        }
        this.profile = aUg;
    }

    public AudioEncoderConfig(int i, int i2, int i3, C23622AUg aUg) {
        this.sampleRate = i;
        this.bitRate = i2;
        this.channels = i3;
        this.profile = aUg;
    }
}
