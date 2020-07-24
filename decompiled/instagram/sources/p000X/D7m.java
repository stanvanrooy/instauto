package p000X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.D7m */
public final class D7m {
    public static final Class A0L = D7m.class;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public MediaCodec.BufferInfo A04;
    public MediaCodec A05;
    public MediaFormat A06;
    public C29741D7n A07 = C29741D7n.UNINTIIALIZED;
    public C29755D8e A08;
    public VideoEncoderConfig A09;
    public VideoEncoderConfig A0A;
    public D8F A0B;
    public Float A0C;
    public String A0D = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final AVM A0H;
    public final AndroidPlatformVideoEncoderHybrid A0I;
    public final D75 A0J;
    public final AtomicLong A0K = new AtomicLong(0);

    public static void A00(D7m d7m) {
        MediaCodec mediaCodec = d7m.A05;
        if (mediaCodec != null) {
            int i = 0;
            while (i < 4) {
                try {
                    mediaCodec.flush();
                    break;
                } catch (IllegalStateException unused) {
                    i++;
                }
            }
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                C23983Ael.A04(D75.A03, e, "failed to stop encoder", new Object[0]);
            }
            try {
                mediaCodec.release();
            } catch (Exception e2) {
                C23983Ael.A04(D75.A03, e2, "failed to release encoder", new Object[0]);
            }
        }
        d7m.A05 = null;
        d7m.A0G = false;
    }

    public static void A01(D7m d7m, Pair pair) {
        boolean z;
        boolean z2;
        D7m d7m2 = d7m;
        if (d7m2.A09 != null) {
            VideoEncoderConfig videoEncoderConfig = d7m2.A0A;
            boolean z3 = false;
            Pair pair2 = pair;
            if (videoEncoderConfig == null) {
                z = true;
                z3 = true;
                z2 = true;
            } else {
                Object obj = pair2.first;
                int intValue = ((Integer) obj).intValue();
                int i = videoEncoderConfig.width;
                if (intValue == i && ((Integer) pair2.second).intValue() == videoEncoderConfig.height) {
                    z = false;
                } else {
                    C23983Ael.A03(A0L, "%s encoder got new resolution. From %dx%d to %dx%d.", d7m2.A0D, Integer.valueOf(i), Integer.valueOf(videoEncoderConfig.height), obj, pair2.second);
                    z = true;
                }
                int i2 = d7m2.A09.bitRate;
                if (i2 != d7m2.A0A.bitRate) {
                    C23983Ael.A03(A0L, "%s encoder got new bit rate %d", d7m2.A0D, Integer.valueOf(i2));
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i3 = d7m2.A09.frameRate;
                if (i3 != d7m2.A0A.frameRate) {
                    C23983Ael.A03(A0L, "%s encoder got new frame rate %d", d7m2.A0D, Integer.valueOf(i3));
                    z3 = true;
                }
            }
            int intValue2 = ((Integer) pair2.first).intValue();
            int intValue3 = ((Integer) pair2.second).intValue();
            VideoEncoderConfig videoEncoderConfig2 = d7m2.A09;
            int i4 = videoEncoderConfig2.bitRate;
            int i5 = videoEncoderConfig2.frameRate;
            AWA awa = videoEncoderConfig2.videoProfile;
            int i6 = i5;
            AWA awa2 = awa;
            d7m2.A0A = new VideoEncoderConfig(intValue2, intValue3, i4, i6, awa2, videoEncoderConfig2.videoBitrateMode, videoEncoderConfig2.iFrameInterval);
            if (d7m2.A05 != null) {
                if (z || z3) {
                    if (d7m2.A07 == C29741D7n.STARTED) {
                        d7m2.A0G = true;
                    } else {
                        d7m2.A0I.requestRestartEncoder();
                    }
                } else if (z2) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", d7m2.A0A.bitRate);
                    d7m2.A05.setParameters(bundle);
                }
            }
            AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = d7m2.A0I;
            VideoEncoderConfig videoEncoderConfig3 = d7m2.A0A;
            androidPlatformVideoEncoderHybrid.updateVideoEncoderConfig(videoEncoderConfig3.width, videoEncoderConfig3.height, videoEncoderConfig3.bitRate, videoEncoderConfig3.frameRate, videoEncoderConfig3.videoProfile.A00, videoEncoderConfig3.videoBitrateMode.A00, videoEncoderConfig3.iFrameInterval);
        }
    }

    public static boolean A02(D7m d7m, Exception exc) {
        boolean z;
        C23983Ael.A04(A0L, exc, "handleException/original", new Object[0]);
        if (Build.VERSION.SDK_INT < 21 || !D8J.A00(exc)) {
            int i = d7m.A01 + 1;
            d7m.A01 = i;
            C23983Ael.A04(A0L, (Throwable) null, "video_enc_exception_restart_count=%d", Integer.valueOf(i));
            if (d7m.A01 <= 5) {
                try {
                    d7m.A0I.requestRestartEncoder();
                    z = true;
                } catch (Exception e) {
                    C23983Ael.A04(A0L, e, "restartVideoEncoder", new Object[0]);
                    z = false;
                }
                if (z) {
                    C23983Ael.A04(A0L, (Throwable) null, "video_enc_exception_restart", new Object[0]);
                    return true;
                }
            }
        } else if (d7m.A02 <= 100) {
            C23983Ael.A04(A0L, (Throwable) null, "video_enc_exception_transient", new Object[0]);
            d7m.A02++;
            return true;
        }
        return false;
    }

    public final void A03() {
        C23983Ael.A02(A0L, "%s encoder stop", this.A0D);
        C29741D7n d7n = this.A07;
        C29741D7n d7n2 = C29741D7n.STOPPED;
        if (d7n == d7n2) {
            C23983Ael.A04(A0L, (Throwable) null, "%s encoder already stopped", this.A0D);
            return;
        }
        this.A03 = 0;
        C29755D8e d8e = this.A08;
        if (d8e != null) {
            d8e.A00.release();
            this.A08 = null;
        }
        A00(this);
        this.A00 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A07 = d7n2;
    }

    public final void A04(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        C23624AUk aUk;
        int i8 = i;
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i6;
        int i13 = i7;
        C23983Ael.A03(A0L, "%s encoder setVideoConfig:w=%d,h=%d,b=%d,f=%d,profile=%d,mode=%d,interval=%d", this.A0D, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i5), Integer.valueOf(i12), Integer.valueOf(i13));
        AWA A002 = AWA.A00(i5);
        if (i12 == 1) {
            aUk = C23624AUk.CBR;
        } else if (i12 != 2) {
            aUk = C23624AUk.DEFAULT;
        } else {
            aUk = C23624AUk.CQ;
        }
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig(i8, i9, i10, i11, A002, aUk, i13);
        this.A09 = videoEncoderConfig;
        int i14 = videoEncoderConfig.width;
        int i15 = videoEncoderConfig.height;
        Float f = this.A0C;
        AnonymousClass0a4.A06(f);
        Pair A003 = BV9.A00(i14, i15, f.floatValue(), this.A0B.AUM(), !this.A0E);
        if (this.A0C.floatValue() > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            this.A0C = Float.valueOf(((float) ((Integer) A003.first).intValue()) / ((float) ((Integer) A003.second).intValue()));
        }
        C23983Ael.A03(A0L, "Adjusted %s base encoder size: %dx%d", this.A0D, A003.first, A003.second);
        A01(this, A003);
    }

    public D7m(AVM avm, AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid) {
        AnonymousClass0a4.A06(avm);
        this.A0H = avm;
        AnonymousClass0a4.A06(androidPlatformVideoEncoderHybrid);
        this.A0I = androidPlatformVideoEncoderHybrid;
        this.A0J = new D75();
    }
}
