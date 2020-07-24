package com.facebook.ffmpeg;

import android.media.MediaCodec;

public class FFMpegBufferInfo {
    public int flags;
    public int offset;
    public long presentationTimeUs;
    public int size;

    public void set(int i, int i2, long j, int i3) {
        this.offset = i;
        this.size = i2;
        this.presentationTimeUs = j;
        this.flags = i3;
    }

    public void setFrom(MediaCodec.BufferInfo bufferInfo) {
        this.offset = bufferInfo.offset;
        this.size = bufferInfo.size;
        this.presentationTimeUs = bufferInfo.presentationTimeUs;
        this.flags = bufferInfo.flags;
    }
}
