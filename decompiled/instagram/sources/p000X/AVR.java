package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import com.facebook.mediastreaming.opt.source.audio.AndroidAudioRecorder;
import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;
import com.facebook.mediastreaming.opt.transport.TransportError;
import com.facebook.mediastreaming.opt.transport.TransportEvent;
import com.facebook.mediastreaming.opt.transport.TransportSinkFactoryHolder;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.facebook.video.common.livestreaming.NetworkSpeedTest;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;

/* renamed from: X.AVR */
public final class AVR implements TransportCallbacks {
    public static final Class A0I = AVR.class;
    public LiveStreamSessionProbe A00;
    public LiveStreamingClient A01;
    public TransportSinkFactoryHolder A02;
    public AVW A03 = AVW.UNINITIALIZED;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final TempFileCreator A07;
    public final AndroidAudioRecorder A08;
    public final AWD A09;
    public final AVK A0A;
    public final XAnalyticsHolder A0B;
    public final C23641AVq A0C;
    public final AVN A0D;
    public final C23639AVj A0E;
    public final List A0F;
    public final boolean A0G;
    public final Context A0H;

    public static LiveStreamingError A00(TransportError transportError) {
        return new LiveStreamingError(transportError.errorCode, transportError.domain, transportError.reason, transportError.descripton, transportError.fullDescription, transportError.isTransient, transportError.isConnectionLost, transportError.isStreamTerminated);
    }

    private void A01(LiveStreamingError liveStreamingError, boolean z) {
        AVN avn = this.A0D;
        if (avn != null && this.A01 != null) {
            if (z) {
                avn.A00.A0H.A01(liveStreamingError);
                AVQ avq = avn.A00;
                avq.A0I.BAM(avq, liveStreamingError.toString());
                return;
            }
            avn.A00.A0H.A00(liveStreamingError);
            AVQ avq2 = avn.A00;
            avq2.A0I.Ath(avq2, new ARA(BroadcastFailureType.InitFailure, "ConnectionFailed", liveStreamingError.fullDescription));
        }
    }

    public final void onSpeedTestResult(SpeedTestStatus speedTestStatus) {
        Integer num;
        SpeedTestStatus speedTestStatus2 = speedTestStatus;
        C23983Ael.A03(A0I, "onSpeedTestResult %s", speedTestStatus2.state.name());
        AVN avn = this.A0D;
        if (avn != null && this.A01 != null) {
            NetworkSpeedTest networkSpeedTest = new NetworkSpeedTest(speedTestStatus2.state.ordinal(), speedTestStatus2.bandwidth, speedTestStatus2.timeTaken, speedTestStatus2.speedTestPassesThreshold);
            double d = networkSpeedTest.bandwidth * 8.0d;
            AVQ avq = avn.A00;
            AnonymousClass0ZA.A08(avq.A0A, avq.A0K);
            NetworkSpeedTest.Status status = networkSpeedTest.state;
            boolean z = true;
            boolean z2 = false;
            if (status == NetworkSpeedTest.Status.Ignored) {
                z2 = true;
            }
            if ((status != NetworkSpeedTest.Status.Succeeded || !networkSpeedTest.speedTestPassesThreshold) && !z2) {
                z = false;
            }
            AnonymousClass79M r4 = avn.A00.A0G;
            String name = status.name();
            long j = networkSpeedTest.timeTaken;
            AnonymousClass0P4 A022 = AnonymousClass79M.A02(r4, Constants.A0C);
            A022.A0E("result", Integer.valueOf(Boolean.valueOf(z).booleanValue() ? 1 : 0));
            A022.A0C("kbps", Double.valueOf(d));
            A022.A0D("response_time", Float.valueOf(((float) (SystemClock.elapsedRealtime() - r4.A01)) / 1000.0f));
            A022.A0G("state", name);
            A022.A0F(AnonymousClass40t.$const$string(36), Long.valueOf(j));
            AnonymousClass0WN.A01(r4.A0N).BcG(A022);
            if (z) {
                num = Constants.A0N;
            } else {
                num = Constants.A0Y;
            }
            AnonymousClass79M.A05(r4, num);
            if (z) {
                AWN.A00(avn.A00.A01);
            } else {
                AWN.A01(avn.A00.A01, new ARA(BroadcastFailureType.SpeedTestFailure, "SpeedTestFailure", networkSpeedTest.state.name()));
            }
            avn.A00.A01 = null;
        }
    }

    public final void onTransportEvent(TransportEvent transportEvent, TransportError transportError) {
        String str;
        Class cls = A0I;
        Object[] objArr = new Object[2];
        String name = transportEvent.name();
        objArr[0] = name;
        if (transportError != null) {
            str = transportError.fullDescription;
        } else {
            str = null;
        }
        objArr[1] = str;
        C23983Ael.A03(cls, "onTransportEvent %s, %s", objArr);
        switch (transportEvent.ordinal()) {
            case 0:
                AVN avn = this.A0D;
                if (avn != null) {
                    avn.A00.A0G.A0B("didResumeStreaming");
                    AVQ avq = avn.A00;
                    avq.A0I.B6I(avq);
                    return;
                }
                return;
            case 1:
                this.A05 = false;
                return;
            case 2:
            case 6:
                return;
            case 3:
                this.A05 = true;
                return;
            case 4:
                AnonymousClass0a4.A06(transportError);
                A01(A00(transportError), true);
                return;
            case 5:
                this.A04 = true;
                AnonymousClass0a4.A06(transportError);
                A01(A00(transportError), false);
                return;
            default:
                AnonymousClass0DB.A08(cls, "Unrecognized event %s", name);
                return;
        }
    }

    public AVR(Context context, C23641AVq aVq, TempFileCreator tempFileCreator, XAnalyticsHolder xAnalyticsHolder, AVM avm, Handler handler, boolean z, C23639AVj aVj, AVN avn, List list, TransportSinkFactoryHolder transportSinkFactoryHolder) {
        this.A0H = context;
        this.A0C = aVq;
        this.A07 = tempFileCreator;
        this.A0B = xAnalyticsHolder;
        this.A06 = handler;
        this.A0G = z;
        this.A0E = aVj;
        this.A0D = avn;
        this.A0F = list;
        this.A0A = new AVK(this, avm);
        this.A08 = new AndroidAudioRecorder(avm, true, true, 2, true, true, (AW8) null);
        this.A09 = new AWD(new AW7());
        this.A02 = transportSinkFactoryHolder;
    }
}
