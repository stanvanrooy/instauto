package com.facebook.mediastreaming.opt.encoder.video.encoding;

import p000X.AWA;
import p000X.C23624AUk;

public final class VideoEncoderConfig {
    public final int bitRate;
    public final int frameRate;
    public final int height;
    public final int iFrameInterval;
    public final C23624AUk videoBitrateMode;
    public final AWA videoProfile;
    public final int width;

    public VideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C23624AUk aUk;
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
        this.frameRate = i4;
        this.videoProfile = AWA.A00(i5);
        if (i6 == 1) {
            aUk = C23624AUk.CBR;
        } else if (i6 != 2) {
            aUk = C23624AUk.DEFAULT;
        } else {
            aUk = C23624AUk.CQ;
        }
        this.videoBitrateMode = aUk;
        this.iFrameInterval = i7;
    }

    public VideoEncoderConfig(int i, int i2, int i3, int i4, AWA awa, C23624AUk aUk, int i5) {
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
        this.frameRate = i4;
        this.videoProfile = awa;
        this.videoBitrateMode = aUk;
        this.iFrameInterval = i5;
    }
}
