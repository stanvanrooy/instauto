package com.facebook.ffmpeg;

import java.nio.ByteBuffer;
import p000X.AnonymousClass88W;
import p000X.C79543dc;

public class FFMpegMediaDemuxer {
    public final AnonymousClass88W mFFMpegLib;
    public boolean mIsInitialized;
    public long mNativeContext;
    public final Options mOptions;
    public final String mPath;

    public class Options {
        public boolean autoConvertPacketData = false;
        public boolean ensureSafeFileNames = false;
    }

    private native boolean nativeAdvance();

    private native void nativeFinalize();

    private native long nativeGetSampleDuration();

    private native int nativeGetSampleFlags();

    private native long nativeGetSampleTime();

    private native int nativeGetSampleTrackIndex();

    private native int nativeGetTrackCount();

    private native FFMpegMediaFormat nativeGetTrackFormat(int i);

    private native void nativeInit(String str, Options options);

    private native int nativeReadSampleData(ByteBuffer byteBuffer, int i);

    private native void nativeRelease();

    private native void nativeSeekTo(int i, long j, int i2);

    private native void nativeSelectTrack(int i);

    private native void nativeUnselectTrack(int i);

    public void seekTo(int i, long j, int i2) {
        boolean z = true;
        if (!(i2 == 2 || i2 == 1 || i2 == 0)) {
            z = false;
        }
        C79543dc.A03(z);
        nativeSeekTo(i, j, i2);
    }

    public FFMpegMediaDemuxer initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath, this.mOptions);
        this.mIsInitialized = true;
        return this;
    }

    public void release() {
        if (this.mIsInitialized) {
            nativeRelease();
            this.mIsInitialized = false;
        }
    }

    public FFMpegMediaDemuxer(AnonymousClass88W r1, String str, Options options) {
        this.mFFMpegLib = r1;
        this.mPath = str;
        this.mOptions = options;
    }

    public boolean advance() {
        return nativeAdvance();
    }

    public void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public long getSampleDuration() {
        return nativeGetSampleDuration();
    }

    public int getSampleFlags() {
        return nativeGetSampleFlags();
    }

    public long getSampleTime() {
        return nativeGetSampleTime();
    }

    public int getSampleTrackIndex() {
        return nativeGetSampleTrackIndex();
    }

    public int getTrackCount() {
        return nativeGetTrackCount();
    }

    public FFMpegMediaFormat getTrackFormat(int i) {
        return nativeGetTrackFormat(i);
    }

    public int readSampleData(ByteBuffer byteBuffer, int i) {
        C79543dc.A01(byteBuffer);
        return nativeReadSampleData(byteBuffer, i);
    }

    public void selectTrack(int i) {
        nativeSelectTrack(i);
    }
}
