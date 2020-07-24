package p000X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.facebook.mediastreaming.bundledservices.BundledLiveStreamServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClientImpl;
import com.facebook.mediastreaming.client.livestreaming.config.LiveStreamingConfig;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.livetrace.LiveTraceServiceProviderHolder;
import com.facebook.mediastreaming.client.livestreaming.tslog.LiveStreamingTsLogServiceProviderHolder;
import com.facebook.mediastreaming.opt.dvr.DvrConfig;
import com.facebook.mediastreaming.opt.sessionlog.SessionLogger;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import com.facebook.mediastreaming.opt.transport.SSLFactoryHolder;
import com.facebook.mediastreaming.opt.transport.TraceEventObserverHolder;
import com.facebook.mediastreaming.opt.transport.rtmpandvp.RtmpAndVpTransportSinkFactoryHolder;
import com.facebook.mediastreaming.opt.xanalytics.XAnalyticsEventLogWriterProviderHolder;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.File;
import java.util.ArrayList;

/* renamed from: X.AVQ */
public final class AVQ implements ARK {
    public static final Class A0Q = AVQ.class;
    public C23621AUf A00;
    public AWN A01;
    public AWZ A02;
    public C23640AVp A03;
    public File A04;
    public Integer A05;
    public Integer A06;
    public final int A07;
    public final int A08;
    public final Context A09;
    public final Handler A0A = new Handler();
    public final AVR A0B;
    public final ASU A0C;
    public final C11060eM A0D;
    public final C23724Aa8 A0E;
    public final AO0 A0F;
    public final AnonymousClass79M A0G;
    public final AR0 A0H;
    public final AVL A0I;
    public final C23587ASk A0J;
    public final Runnable A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final long A0N;
    public final AVN A0O;
    public final boolean A0P;

    public final boolean AfI() {
        return true;
    }

    public final void BtB() {
    }

    public final long AYh() {
        AVK avk = this.A0B.A0A;
        if (avk.A02) {
            return avk.A00 + (avk.A03.now() - avk.A01);
        }
        return avk.A00;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    public final void AdJ(AWN awn) {
        LiveStreamingConfig build;
        C23624AUk aUk;
        DvrConfig build2;
        boolean z;
        Class cls;
        String str;
        boolean z2;
        Class cls2 = A0Q;
        if (this.A06 != Constants.ZERO) {
            AnonymousClass0DB.A03(cls2, "init() on a broadcast that was already initialized");
            return;
        }
        AWN awn2 = awn;
        this.A01 = new AVT(this, awn2);
        AVR avr = this.A0B;
        ASU asu = this.A0C;
        if (avr.A01 != null) {
            cls = AVR.A0I;
            str = "Live streaming client already created!";
        } else {
            if (avr.A03 == AVW.FINISHED) {
                z = false;
            } else {
                C23641AVq aVq = avr.A0C;
                LiveStreamingConfig.Builder A002 = new C23585ASh(aVq.A00, aVq.A03, aVq.A01, aVq.A02).A00(asu);
                if (A002 == null) {
                    build = null;
                } else {
                    build = A002.build();
                }
                if (build == null) {
                    cls = AVR.A0I;
                    str = "Cannot go online: LiveStreamingConfig is null";
                } else {
                    C23639AVj aVj = avr.A0E;
                    if (!aVj.A02.A0M) {
                        build2 = null;
                    } else {
                        AWA A012 = AWA.A01((String) AnonymousClass0L6.A02(aVj.A00, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "video_profile", "baseline", (AnonymousClass04H) null));
                        if (((Boolean) AnonymousClass0L6.A02(aVj.A00, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "enable_cq_mode", false, (AnonymousClass04H) null)).booleanValue()) {
                            aUk = C23624AUk.CQ;
                        } else {
                            aUk = C23624AUk.DEFAULT;
                        }
                        int intValue = ((Integer) AnonymousClass0L6.A02(aVj.A00, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "key_frame_interval", 1, (AnonymousClass04H) null)).intValue();
                        build2 = new DvrConfig.Builder().setVideoWidth(aVj.A01.A02).setVideoHeight(aVj.A01.A01).setVideoBitrate(aVj.A01.A00).setVideoFps(((Integer) AnonymousClass0L6.A02(aVj.A00, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "frame_rate", 30, (AnonymousClass04H) null)).intValue()).setVideoEncoderProfile(A012.A00).setVideoEncoderBitrateMode(aUk.A00).setVideoKeyframeInterval(intValue).setVideoEnforceKeyframeInterval(((Boolean) AnonymousClass0L6.A02(aVj.A00, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "enforce_key_frame_interval", false, (AnonymousClass04H) null)).booleanValue()).setAudioSampleRate(44100).setAudioChannels(1).setAudioBitRate(64000).setAudioEncoderProfile(C23622AUg.LC.A00).setAvailableSpaceThresholdInMB(1000).setCheckAvailableSpaceIntervalInSeconds(1).setBinFailureHandleMode(C23642AVr.DISABLE.A00).setUsePersistentStorage(true).setAllowSeparateThreads(aVj.A02.A0L).build();
                    }
                    BundledLiveStreamServiceProviderHolder bundledLiveStreamServiceProviderHolder = new BundledLiveStreamServiceProviderHolder(build, build2, avr.A07);
                    avr.A00 = bundledLiveStreamServiceProviderHolder.getSessionProbe();
                    AVU avu = new AVU(build, new AVJ(avr), avr.A06);
                    avu.A07.add(avr.A09);
                    avu.A05.add(avr.A08);
                    avu.A00 = avr;
                    avu.A01 = avr.A02;
                    avu.A06.add(bundledLiveStreamServiceProviderHolder);
                    avu.A06.add(new SessionLogger((String) null));
                    avu.A06.add(new LiveTraceServiceProviderHolder());
                    avu.A06.add(new XAnalyticsEventLogWriterProviderHolder(avr.A0B));
                    for (ServiceProviderHolder add : avr.A0F) {
                        avu.A06.add(add);
                    }
                    boolean z3 = true;
                    AnonymousClass0a4.A0C(!avu.A05.isEmpty(), "Must specify at least one audio track");
                    if (avu.A07.size() != 1) {
                        z3 = false;
                    }
                    AnonymousClass0a4.A0C(z3, "Only single video track supported!");
                    synchronized (AW3.class) {
                    }
                    avr.A01 = new LiveStreamingClientImpl(avu.A04, (AndroidVideoInput) avu.A07.get(0), avu.A05, avu.A03, avu.A02, avu.A00, avu.A01, (SSLFactoryHolder) null, avu.A06, (BV4) null, (TraceEventObserverHolder) null);
                    z = true;
                }
            }
            if (!z) {
                avr.A03 = AVW.INITIALIZED_BROADCAST;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                AWN.A01(awn2, new ARA(BroadcastFailureType.InitFailure, "VideoInitDataDownload", "Failed to initialize broadcast"));
                return;
            } else {
                AnonymousClass0ZA.A09(this.A0A, this.A0K, this.A0N * 1000, 1035228526);
                return;
            }
        }
        AnonymousClass0DB.A03(cls, str);
        z = false;
        if (!z) {
        }
        if (z2) {
        }
    }

    public final void App() {
        this.A0B.A09.A03.A01(Looper.myLooper());
    }

    public final void BaJ(boolean z, AWZ awz) {
        String str;
        AnonymousClass79M r1 = this.A0G;
        if (z) {
            str = "stopBroadcastAndSeal";
        } else {
            str = "stopBroadcastNoSeal";
        }
        r1.A0B(str);
        AnonymousClass0ZA.A08(this.A0A, this.A0K);
        this.A0J.A00();
        AVR avr = this.A0B;
        AWD awd = avr.A09;
        awd.stopRenderingToOutput();
        SurfaceTexture surfaceTexture = awd.A02.A05;
        AnonymousClass0a4.A06(surfaceTexture);
        surfaceTexture.release();
        awd.A01.A03();
        LiveStreamingClient liveStreamingClient = avr.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.stop(z);
            avr.A01 = null;
        }
        avr.A03 = AVW.FINISHED;
        if (this.A06 == Constants.A0j) {
            File file = this.A04;
            boolean z2 = false;
            if (this.A05 == Constants.A0Y) {
                z2 = true;
            }
            AWZ.A01(awz, new ARL(file, z2));
            this.A02 = null;
            return;
        }
        this.A02 = awz;
    }

    public final void Bg3(boolean z) {
        AndroidAudioRecorder androidAudioRecorder = this.A0B.A08;
        if (androidAudioRecorder != null) {
            androidAudioRecorder.mMuteOn.set(z);
        }
    }

    public final void Bpb(AWZ awz) {
        AVR avr = this.A0B;
        C23983Ael.A02(AVR.A0I, "startLiveStream", new Object[0]);
        AndroidAudioRecorder androidAudioRecorder = avr.A08;
        AnonymousClass0Z9.A03(androidAudioRecorder.mExecutor, new B9F(androidAudioRecorder), -770541226);
        LiveStreamingClient liveStreamingClient = avr.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.start();
        }
        avr.A03 = AVW.STARTED_STREAMING;
        AVR avr2 = this.A0B;
        ArrayList<AWE> arrayList = new ArrayList<>();
        arrayList.add(avr2.A09.A03);
        ArrayList arrayList2 = new ArrayList();
        for (AWE awf : arrayList) {
            arrayList2.add(new AWF(awf));
        }
        AWZ.A01(awz, arrayList2);
    }

    public final void BqO(boolean z, AWN awn) {
        this.A0J.A00();
        AVy aVy = new AVy(this);
        AVR avr = this.A0B;
        C23983Ael.A02(AVR.A0I, "stopLiveStream", new Object[0]);
        LiveStreamingClient liveStreamingClient = avr.A01;
        if (liveStreamingClient != null) {
            liveStreamingClient.pause(z);
        }
        AndroidAudioRecorder androidAudioRecorder = avr.A08;
        AnonymousClass0Z9.A03(androidAudioRecorder.mExecutor, new C23637AVb(androidAudioRecorder, aVy), 1662814190);
        avr.A03 = AVW.STOPPED_STREAMING;
        if (z) {
            AWN.A00(awn);
            this.A03 = null;
            return;
        }
        C23640AVp aVp = this.A03;
        if (aVp == null) {
            this.A03 = new C23640AVp(awn);
        } else {
            aVp.A00 = awn;
        }
    }

    public final BroadcastType AH8() {
        return BroadcastType.LIVESWAP_RTMP;
    }

    public AVQ(Context context, AnonymousClass0C1 r21, ASW asw, int i, int i2, AnonymousClass79M r25, AR0 ar0, AO0 ao0, C23724Aa8 aa8, AVL avl, boolean z, boolean z2) {
        Integer num = Constants.ZERO;
        this.A06 = num;
        this.A00 = C23621AUf.NORMAL;
        this.A05 = num;
        this.A0O = new AVN(this);
        this.A0K = new AVP(this);
        this.A0J = new C23587ASk(this);
        Context context2 = context;
        this.A09 = context2;
        this.A0D = new C11060eM();
        ASW asw2 = asw;
        ASU asu = asw2.A04;
        AnonymousClass0a4.A06(asu);
        this.A0C = asu;
        this.A0N = asw2.A03;
        this.A08 = i;
        this.A07 = i2;
        this.A0M = asw2.A05;
        AnonymousClass79M r0 = r25;
        AnonymousClass0a4.A06(r0);
        this.A0G = r0;
        AR0 ar02 = ar0;
        AnonymousClass0a4.A06(ar02);
        this.A0H = ar02;
        AO0 ao02 = ao0;
        AnonymousClass0a4.A06(ao02);
        this.A0F = ao02;
        C23724Aa8 aa82 = aa8;
        AnonymousClass0a4.A06(aa82);
        this.A0E = aa82;
        AVL avl2 = avl;
        AnonymousClass0a4.A06(avl2);
        this.A0I = avl2;
        AnonymousClass0C1 r4 = r21;
        this.A0L = ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.LIVE_STREAMING, "allow_separate_threads", false, (AnonymousClass04H) null)).booleanValue();
        this.A0P = ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.LIVE_USE_VIDEO_PROTOCOL, "enabled", false, (AnonymousClass04H) null)).booleanValue();
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new LiveStreamingTsLogServiceProviderHolder());
        }
        C23641AVq aVq = new C23641AVq(r4, !this.A0P, this.A0L, z2);
        C206248sH r10 = new C206248sH(this);
        XAnalyticsAdapterHolder xAnalyticsAdapterHolder = new XAnalyticsAdapterHolder(new C209348zw(r4));
        C23638AVi aVi = new C23638AVi(this);
        Handler handler = this.A0A;
        boolean z3 = this.A0M;
        C23639AVj aVj = new C23639AVj(this, r4, asw2);
        AVN avn = this.A0O;
        this.A0B = new AVR(context2, aVq, r10, xAnalyticsAdapterHolder, aVi, handler, z3, aVj, avn, arrayList, new RtmpAndVpTransportSinkFactoryHolder(context2, this.A0P));
        Bg3(C05770Lw.A00().A0H());
        if (this.A0B.A0G) {
            C23724Aa8 aa83 = this.A0E;
            aa83.A05 = new Pair(Integer.valueOf(asw2.A02), Integer.valueOf(asw2.A01));
            C23724Aa8.A01(aa83);
            C23724Aa8 aa84 = this.A0E;
            aa84.A09 = (Integer) AnonymousClass0L6.A02(r4, AnonymousClass0L7.DVR_VIDEO_ENCODER_PARAMS, "frame_rate", 30, (AnonymousClass04H) null);
            C23724Aa8.A01(aa84);
        }
    }
}
