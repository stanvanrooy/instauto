package com.facebook.ffmpeg;

import p000X.AnonymousClass11J;
import p000X.C203468n8;
import p000X.C203478n9;
import p000X.C203488nA;
import p000X.C203498nB;

public class FFMpegMediaMuxer$NativeWrapper {
    public volatile long mNativeAudioCodec;
    public volatile long mNativeContext;
    public volatile long mNativeVideoCodec;

    private native void nativeFinalize();

    public native FFMpegAVStream nativeAddStream(FFMpegMediaFormat fFMpegMediaFormat, int i, int i2);

    public native void nativeInit(String str);

    public native void nativeStart(boolean z, String str);

    public native void nativeStop();

    public FFMpegMediaMuxer$NativeWrapper(Object obj) {
        C203478n9 r2 = C203488nA.A00;
        C203498nB r1 = new C203498nB(obj, this, r2.A02);
        synchronized (r2) {
            AnonymousClass11J.A03(r2.A03.add(r1));
            if (!r2.A00) {
                r2.A00 = true;
                new C203468n8(r2).start();
            }
        }
    }

    public void targetDestructed() {
        nativeFinalize();
    }
}
