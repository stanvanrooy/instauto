package com.facebook.mediastreaming.opt.encoder.audio;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;
import p000X.C23622AUg;
import p000X.D74;
import p000X.D7k;

public class AndroidPlatformAudioEncoderHybrid extends StreamingHybridClassBase {
    public final D7k mImpl = new D7k(this);

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    public void drain(ByteBuffer byteBuffer, int i, boolean z) {
        this.mImpl.A00(byteBuffer, i, z);
    }

    public void prepare(int i, int i2, int i3, int i4) {
        C23622AUg aUg;
        D7k d7k = this.mImpl;
        if (i4 != 5) {
            aUg = C23622AUg.LC;
        } else {
            aUg = C23622AUg.HE;
        }
        d7k.A06 = new AudioEncoderConfig(i, i2, i3, aUg);
        d7k.A05 = null;
        d7k.A00 = 0;
        d7k.A02 = 0;
        d7k.A01 = 0;
    }

    public void release() {
        D7k d7k = this.mImpl;
        MediaCodec mediaCodec = d7k.A04;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (Exception unused) {
            }
        }
        d7k.A04 = null;
        d7k.A00 = 0;
        d7k.A02 = 0;
        d7k.A01 = 0;
    }

    public void start() {
        D7k d7k = this.mImpl;
        d7k.A03 = new MediaCodec.BufferInfo();
        MediaCodec A00 = D74.A00(d7k.A06);
        d7k.A04 = A00;
        A00.start();
    }

    public void stop() {
        D7k d7k = this.mImpl;
        MediaCodec mediaCodec = d7k.A04;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (Exception unused) {
            }
        }
        d7k.A04 = null;
        d7k.A00 = 0;
        d7k.A02 = 0;
        d7k.A01 = 0;
    }

    public AndroidPlatformAudioEncoderHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
