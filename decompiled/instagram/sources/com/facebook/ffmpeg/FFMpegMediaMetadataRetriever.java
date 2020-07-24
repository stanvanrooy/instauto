package com.facebook.ffmpeg;

import p000X.AnonymousClass88W;

public class FFMpegMediaMetadataRetriever {
    public final AnonymousClass88W mFFMpegLib;
    public long mNativeContext;
    public final String mPath;

    private native void nativeFinalize();

    private native int nativeGetAudioBitRate();

    private native String nativeGetAudioCodecType();

    private native int nativeGetBitRate();

    private native String nativeGetCodecType();

    private native long nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetRotation();

    private native String nativeGetSphericalMetadataXml();

    private native int nativeGetWidth();

    private native void nativeInit(String str);

    private native void nativeRelease();

    public FFMpegMediaMetadataRetriever initialize() {
        this.mFFMpegLib.A00();
        nativeInit(this.mPath);
        return this;
    }

    public FFMpegMediaMetadataRetriever(AnonymousClass88W r1, String str) {
        this.mFFMpegLib = r1;
        this.mPath = str;
    }

    public void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public int getRotation() {
        return nativeGetRotation();
    }

    public void release() {
        nativeRelease();
    }
}
