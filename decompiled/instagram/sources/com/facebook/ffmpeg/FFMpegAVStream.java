package com.facebook.ffmpeg;

import java.nio.ByteBuffer;
import p000X.C79543dc;

public class FFMpegAVStream {
    public long mNativeContext;

    private native void nativeFinalize();

    private native void nativeSetOrientationHint(int i);

    private native void nativeWriteFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3 == 270) goto L_0x000f;
     */
    public void setOrientationHint(int i) {
        boolean z;
        if (!(i == 0 || i == 90 || i == 180)) {
            z = false;
        }
        z = true;
        C79543dc.A03(z);
        nativeSetOrientationHint(i);
    }

    public FFMpegAVStream(long j) {
        this.mNativeContext = j;
    }

    public void finalize() {
        super.finalize();
        nativeFinalize();
    }

    public void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        C79543dc.A01(fFMpegBufferInfo);
        C79543dc.A01(byteBuffer);
        nativeWriteFrame(fFMpegBufferInfo, byteBuffer);
    }
}
