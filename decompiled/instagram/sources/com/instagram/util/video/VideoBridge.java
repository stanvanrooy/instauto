package com.instagram.util.video;

import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class VideoBridge {
    public static native int configureAACTrack(int i, int i2);

    public static native int configureVideoCodec(String str, int i, int i2);

    public static native int encodeFrame(long j, long j2);

    public static native int finishEncoding();

    public static native int writeAudioPacket(ByteBuffer byteBuffer, int i, long j);

    static {
        AnonymousClass0Y1.A08("vp8");
    }
}
