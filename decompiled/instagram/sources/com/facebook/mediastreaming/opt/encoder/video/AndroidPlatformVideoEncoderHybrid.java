package com.facebook.mediastreaming.opt.encoder.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Pair;
import android.view.Surface;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.common.RealtimeSinceBootClock;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import com.facebook.react.uimanager.BaseViewManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import p000X.AWA;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass0a4;
import p000X.BV9;
import p000X.C194408Ty;
import p000X.C23624AUk;
import p000X.C23983Ael;
import p000X.C29741D7n;
import p000X.C29753D8a;
import p000X.C29755D8e;
import p000X.D75;
import p000X.D7m;
import p000X.D8F;
import p000X.DBw;

public class AndroidPlatformVideoEncoderHybrid extends StreamingHybridClassBase {
    public static final Class TAG = AndroidPlatformVideoEncoderHybrid.class;
    public final D7m mImpl = new D7m(RealtimeSinceBootClock.A00, this);

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat);

    public native void requestRestartEncoder();

    public native void updateVideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7);

    static {
        AnonymousClass0Y1.A08("mediastreaming");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        throw r3;
     */
    public void drain() {
        RuntimeException runtimeException;
        D7m d7m = this.mImpl;
        C29741D7n d7n = d7m.A07;
        if (d7n != C29741D7n.STARTED) {
            C23983Ael.A04(D7m.A0L, (Throwable) null, "%s encoder cannot be drained when it's %s", d7m.A0D, d7n);
            return;
        }
        try {
            MediaCodec mediaCodec = d7m.A05;
            AnonymousClass0a4.A06(mediaCodec);
            ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
            VideoEncoderConfig videoEncoderConfig = d7m.A0A;
            AnonymousClass0a4.A06(videoEncoderConfig);
            int i = videoEncoderConfig.iFrameInterval;
            boolean z = false;
            while (true) {
                int dequeueOutputBuffer = d7m.A05.dequeueOutputBuffer(d7m.A04, 1000);
                if (dequeueOutputBuffer == -1) {
                    break;
                } else if (dequeueOutputBuffer == -3) {
                    outputBuffers = d7m.A05.getOutputBuffers();
                } else if (dequeueOutputBuffer == -2) {
                    d7m.A06 = d7m.A05.getOutputFormat();
                } else {
                    if (dequeueOutputBuffer >= 0) {
                        MediaCodec.BufferInfo bufferInfo = d7m.A04;
                        if (bufferInfo.size >= 0 && bufferInfo.offset >= 0) {
                            long j = bufferInfo.presentationTimeUs / 1000;
                            if ((bufferInfo.flags & 2) == 0 && d7m.A0A.iFrameInterval != -1 && d7m.A0F) {
                                long now = d7m.A0H.now();
                                if ((d7m.A04.flags & 1) != 0) {
                                    d7m.A03 = now;
                                } else if (now - d7m.A03 > ((long) (i * 1000))) {
                                    d7m.A03 = now;
                                    z = true;
                                }
                            }
                            if (dequeueOutputBuffer >= outputBuffers.length) {
                                runtimeException = new RuntimeException(AnonymousClass000.A0G(d7m.A0D, " encoder index out of bounds: ", dequeueOutputBuffer));
                                break;
                            }
                            ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                            if (byteBuffer == null) {
                                runtimeException = new RuntimeException(AnonymousClass000.A0H(d7m.A0D, " encoderOutputBuffer %s was null", dequeueOutputBuffer, " was null"));
                                break;
                            }
                            Buffer position = byteBuffer.position(d7m.A04.offset);
                            MediaCodec.BufferInfo bufferInfo2 = d7m.A04;
                            position.limit(bufferInfo2.offset + bufferInfo2.size);
                            MediaCodec.BufferInfo bufferInfo3 = d7m.A04;
                            if ((bufferInfo3.flags & 2) != 0) {
                                bufferInfo3.flags = 2;
                                byteBuffer = d7m.A0B.AbH(byteBuffer);
                            }
                            AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = d7m.A0I;
                            AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid2 = androidPlatformVideoEncoderHybrid;
                            androidPlatformVideoEncoderHybrid2.onEncoded(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j, j, d7m.A04.flags, d7m.A06);
                            d7m.A05.releaseOutputBuffer(dequeueOutputBuffer, false);
                            if ((d7m.A04.flags & 4) != 0) {
                                break;
                            }
                        }
                    }
                    if (dequeueOutputBuffer >= 0) {
                        d7m.A05.releaseOutputBuffer(dequeueOutputBuffer, false);
                    }
                    int i2 = d7m.A00 + 1;
                    d7m.A00 = i2;
                    if (i2 > 100) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(d7m.A0D);
                        sb.append(" video encoder bad parameters ret=");
                        sb.append(dequeueOutputBuffer);
                        sb.append(" offs=");
                        MediaCodec.BufferInfo bufferInfo4 = d7m.A04;
                        sb.append(bufferInfo4.offset);
                        sb.append(" sz=");
                        sb.append(bufferInfo4.size);
                        sb.append(" pts=");
                        sb.append(bufferInfo4.presentationTimeUs);
                        sb.append(" cnt=");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (d7m.A0F) {
                if (z) {
                    if (d7m.A0G) {
                        d7m.A0G = false;
                        d7m.A0I.requestRestartEncoder();
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putInt("request-sync", 0);
                        d7m.A05.setParameters(bundle);
                    }
                }
            } else if (d7m.A0G) {
                d7m.A0G = false;
                d7m.A0I.requestRestartEncoder();
            }
            d7m.A02 = 0;
        } catch (Exception e) {
            if (!D7m.A02(d7m, e)) {
                C23983Ael.A04(D7m.A0L, e, "Failed to drain %s video encoder", d7m.A0D);
                d7m.A0I.fireError(C194408Ty.VideoEncoderError, "Failed to drain video encoder", e);
            }
        }
    }

    public void prepare(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        D8F d8a;
        float f;
        D7m d7m = this.mImpl;
        d7m.A0D = str;
        Class cls = D7m.A0L;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        C23983Ael.A02(cls, "prepare %s encoder:w=%d,h=%d,b=%d,f=%d,profile=%d,mode=%d,interval=%d", str, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        C29741D7n d7n = d7m.A07;
        if (d7n != C29741D7n.UNINTIIALIZED) {
            C23983Ael.A04(cls, (Throwable) null, "Calling prepare when %s encoder is already initialized %s", d7m.A0D, d7n);
            return;
        }
        d7m.A0E = z;
        d7m.A0F = z2;
        if (!z) {
            d8a = new DBw();
        } else {
            d8a = new C29753D8a();
        }
        d7m.A0B = d8a;
        d7m.A0K.set(0);
        d7m.A06 = null;
        d7m.A00 = 0;
        d7m.A02 = 0;
        d7m.A01 = 0;
        if (d7m.A0C == null) {
            float f2 = (float) i9;
            if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                f = 1.0f;
            } else {
                f = ((float) i8) / f2;
            }
            d7m.A0C = Float.valueOf(f);
        }
        d7m.A04(i8, i9, i10, i11, i12, i13, i14);
        d7m.A07 = C29741D7n.A01;
    }

    public SurfaceHolder prepareEncoder() {
        C23624AUk aUk;
        int i;
        D7m d7m = this.mImpl;
        try {
            Class cls = D7m.A0L;
            C23983Ael.A02(cls, "prepare %s encoder", d7m.A0D);
            C29741D7n d7n = d7m.A07;
            if (d7n == C29741D7n.UNINTIIALIZED) {
                C23983Ael.A04(cls, (Throwable) null, "Cannot prepare %s encoder when uninitialized!", d7m.A0D);
                return null;
            }
            if (d7n == C29741D7n.STARTED) {
                D7m.A00(d7m);
            }
            AnonymousClass0a4.A06(d7m.A0A);
            d7m.A04 = new MediaCodec.BufferInfo();
            VideoEncoderConfig Aba = d7m.A0B.Aba(d7m.A0A);
            D75 d75 = d7m.A0J;
            boolean z = d7m.A0F;
            AWA awa = Aba.videoProfile;
            if (d75.A00) {
                awa = AWA.BASELINE;
            } else if (d75.A02 && awa == AWA.HIGH31) {
                awa = AWA.HIGH;
            }
            if (d75.A01) {
                aUk = C23624AUk.DEFAULT;
            } else {
                aUk = Aba.videoBitrateMode;
            }
            if (z) {
                i = 60;
            } else {
                int i2 = Aba.iFrameInterval;
                i = 1;
                if (i2 > 0) {
                    i = i2;
                }
            }
            MediaCodec A00 = D75.A00(d75, awa, aUk, Aba.width, Aba.height, Aba.bitRate, Aba.frameRate, i);
            AnonymousClass0a4.A06(A00);
            d7m.A05 = A00;
            Surface createInputSurface = A00.createInputSurface();
            VideoEncoderConfig videoEncoderConfig = d7m.A0A;
            d7m.A08 = new C29755D8e(createInputSurface, videoEncoderConfig.width, videoEncoderConfig.height);
            if (d7m.A07 == C29741D7n.STARTED) {
                MediaCodec mediaCodec = d7m.A05;
                AnonymousClass0a4.A06(mediaCodec);
                mediaCodec.start();
            }
            C29755D8e d8e = d7m.A08;
            AnonymousClass0a4.A06(d8e);
            return d8e;
        } catch (Exception e) {
            if (D7m.A02(d7m, e)) {
                return null;
            }
            C23983Ael.A04(D7m.A0L, e, "Failed to prepare %s encoder", d7m.A0D);
            d7m.A0I.fireError(C194408Ty.VideoEncoderError, "Failed to prepare encoder", e);
            return null;
        }
    }

    public void release() {
        D7m d7m = this.mImpl;
        C23983Ael.A02(D7m.A0L, "%s encoder release", d7m.A0D);
        d7m.A03();
    }

    public void setABRVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C23624AUk aUk;
        D7m d7m = this.mImpl;
        Class cls = D7m.A0L;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        int i8 = i3;
        int i9 = i4;
        int i10 = i6;
        int i11 = i7;
        C23983Ael.A03(cls, "%s encoder setABRVideoConfig:w=%d,h=%d,b=%d,f=%d,profile=%d,mode=%d,interval=%d", d7m.A0D, valueOf, valueOf2, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i11));
        int AUM = d7m.A0B.AUM();
        if (i % AUM == 0 && i2 % AUM == 0) {
            Float f = d7m.A0C;
            AnonymousClass0a4.A06(f);
            if (f.floatValue() >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                VideoEncoderConfig videoEncoderConfig = d7m.A09;
                int i12 = videoEncoderConfig.width;
                int i13 = videoEncoderConfig.height;
                AWA A00 = AWA.A00(i5);
                if (i10 == 1) {
                    aUk = C23624AUk.CBR;
                } else if (i10 != 2) {
                    aUk = C23624AUk.DEFAULT;
                } else {
                    aUk = C23624AUk.CQ;
                }
                d7m.A09 = new VideoEncoderConfig(i12, i13, i8, i9, A00, aUk, i11);
                D7m.A01(d7m, Pair.create(valueOf, valueOf2));
                return;
            }
        }
        C23983Ael.A04(cls, (Throwable) null, "Invalid size from ABR: w=%d,h=%d,ar=%f", valueOf, valueOf2, d7m.A0C);
    }

    public void setAspectRatio(float f) {
        D7m d7m = this.mImpl;
        Class cls = D7m.A0L;
        Float valueOf = Float.valueOf(f);
        C23983Ael.A02(cls, "%s encoder setAspectRatio: %f", d7m.A0D, valueOf);
        C29741D7n d7n = d7m.A07;
        if (d7n == C29741D7n.STARTED || d7n == C29741D7n.STOPPED) {
            C23983Ael.A04(cls, (Throwable) null, "%s encoder setAspectRatio is not supported %s once a stream has started ", d7m.A0D, d7n);
            return;
        }
        Float f2 = d7m.A0C;
        if (f2 == null || f != f2.floatValue()) {
            d7m.A0C = valueOf;
            if (d7n != C29741D7n.UNINTIIALIZED) {
                VideoEncoderConfig videoEncoderConfig = d7m.A09;
                AnonymousClass0a4.A06(videoEncoderConfig);
                AnonymousClass0a4.A06(d7m.A0A);
                Pair A00 = BV9.A00(videoEncoderConfig.width, videoEncoderConfig.height, f, d7m.A0B.AUM(), !d7m.A0E);
                if (d7m.A0C.floatValue() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    d7m.A0C = Float.valueOf(((float) ((Integer) A00.first).intValue()) / ((float) ((Integer) A00.second).intValue()));
                }
                D7m.A01(d7m, A00);
            }
        }
    }

    public void setBaseVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i;
        this.mImpl.A04(i8, i2, i3, i4, i5, i6, i7);
    }

    public void start() {
        D7m d7m = this.mImpl;
        Class cls = D7m.A0L;
        C23983Ael.A02(cls, "%s encoder start", d7m.A0D);
        C29741D7n d7n = d7m.A07;
        if (d7n == C29741D7n.A01 || d7n == C29741D7n.STOPPED) {
            MediaCodec mediaCodec = d7m.A05;
            AnonymousClass0a4.A06(mediaCodec);
            mediaCodec.start();
            d7m.A07 = C29741D7n.STARTED;
            return;
        }
        AnonymousClass0DB.A08(cls, "%s encoder cannot be started when it's %s", d7m.A0D, d7n);
    }

    public void stop() {
        this.mImpl.A03();
    }

    public AndroidPlatformVideoEncoderHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
