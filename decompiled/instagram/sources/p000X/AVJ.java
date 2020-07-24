package p000X;

import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.io.File;

/* renamed from: X.AVJ */
public final class AVJ implements LiveStreamingClient.LiveStreamingSessionCallbacks {
    public final /* synthetic */ AVR A00;

    public AVJ(AVR avr) {
        this.A00 = avr;
    }

    public final void onError(int i, String str, String str2, String str3, String str4) {
        AVR avr = this.A00;
        if (!avr.A04) {
            LiveStreamingError liveStreamingError = new LiveStreamingError(i, "StreamingSdkLiveStreamer", str2, str, str4, false, false, false);
            if (avr.A01 != null) {
                AVN avn = avr.A0D;
                AnonymousClass0DB.A05(AVQ.A0Q, "onStreamFailed", liveStreamingError.A00);
                avn.A00.A0H.A00(liveStreamingError);
                AVQ avq = avn.A00;
                avq.A0I.Ath(avq, new ARA(BroadcastFailureType.InitFailure, "BroadcastFailed", liveStreamingError.fullDescription));
            }
        }
    }

    public final void onInitialized() {
        AVN avn = this.A00.A0D;
        avn.A00.A0G.A0B("didInitializeLiveStream");
        avn.A00.A06 = Constants.ONE;
    }

    public final void onPaused() {
        this.A00.A0A.A00();
        AVN avn = this.A00.A0D;
        avn.A00.A0G.A0B("didStopLiveStream");
        avn.A00.A0J.A00();
        avn.A00.A06 = Constants.A0N;
        C12670hC.A04(new AVZ(avn));
    }

    public final void onReleased() {
        Integer num;
        File file;
        String str;
        LiveStreamSessionProbe liveStreamSessionProbe;
        int muxState;
        AVN avn = this.A00.A0D;
        AVQ avq = avn.A00;
        if (avq.A0M) {
            LiveStreamSessionProbe liveStreamSessionProbe2 = avq.A0B.A00;
            if (liveStreamSessionProbe2 == null) {
                muxState = 0;
            } else {
                muxState = liveStreamSessionProbe2.getMuxState();
            }
            num = C163246xr.A00(muxState);
        } else {
            num = Constants.ZERO;
        }
        avq.A05 = num;
        AVQ avq2 = avn.A00;
        Integer num2 = avq2.A05;
        if ((num2 == Constants.A0C || num2 == Constants.A0Y) && (liveStreamSessionProbe = avq2.A0B.A00) != null) {
            file = liveStreamSessionProbe.getDvrOutputFile();
        } else {
            file = null;
        }
        avq2.A04 = file;
        AVQ avq3 = avn.A00;
        AnonymousClass79M r2 = avq3.A0G;
        if (avq3.A04 == null) {
            str = "dvr:missing";
        } else if (avq3.A05 == Constants.A0Y) {
            str = "dvr:ok";
        } else {
            str = "dvr:full";
        }
        r2.A0C("didStopBroadcast", str);
        AVQ avq4 = avn.A00;
        AWZ awz = avq4.A02;
        File file2 = avq4.A04;
        Integer num3 = avq4.A05;
        boolean z = false;
        if (num3 == Constants.A0Y) {
            z = true;
        }
        AWZ.A01(awz, new ARL(file2, z));
        AVQ avq5 = avn.A00;
        avq5.A02 = null;
        avq5.A06 = Constants.A0j;
    }

    public final void onResumed() {
        AVK avk = this.A00.A0A;
        if (!avk.A02) {
            avk.A02 = true;
            avk.A01 = avk.A03.now();
        }
        AVN avn = this.A00.A0D;
        avn.A00.A0G.A0B("didStartLiveStream");
        C23587ASk aSk = avn.A00.A0J;
        if (!aSk.A02) {
            aSk.A02 = true;
            AnonymousClass0ZA.A0E(aSk.A05.A0A, aSk.A04, -1292015910);
        }
        avn.A00.A06 = Constants.A0C;
    }

    public final void onStarted() {
        boolean z;
        ASU asu;
        C23581ASc aSc;
        AVK avk = this.A00.A0A;
        if (!avk.A02) {
            avk.A02 = true;
            avk.A01 = avk.A03.now();
        }
        AVN avn = this.A00.A0D;
        avn.A00.A0G.A0B("didStartLiveStream");
        AVQ avq = avn.A00;
        AO0 ao0 = avq.A0F;
        if (ao0 == null || (asu = avq.A0C) == null || (aSc = asu.A01) == null) {
            z = false;
        } else {
            z = aSc.A02;
        }
        if (z) {
            ao0.A02(Constants.ZERO);
        }
        C23587ASk aSk = avn.A00.A0J;
        if (!aSk.A02) {
            aSk.A02 = true;
            AnonymousClass0ZA.A0E(aSk.A05.A0A, aSk.A04, -1292015910);
        }
        avn.A00.A06 = Constants.A0C;
    }

    public final void onStopped() {
        boolean z;
        String str;
        ASU asu;
        C23581ASc aSc;
        this.A00.A0A.A00();
        AVN avn = this.A00.A0D;
        AVQ avq = avn.A00;
        AO0 ao0 = avq.A0F;
        if (ao0 == null || (asu = avq.A0C) == null || (aSc = asu.A01) == null) {
            z = false;
        } else {
            z = aSc.A02;
        }
        if (z) {
            Integer num = Constants.ZERO;
            Integer num2 = ao0.A01;
            if (num2 == Constants.A0N || num2 == Constants.A0u) {
                C06270Ok A002 = C06270Ok.A00();
                switch (num.intValue()) {
                    case 0:
                        str = "rtmp";
                        break;
                    case 2:
                        str = "rtc";
                        break;
                    default:
                        str = "";
                        break;
                }
                A002.A09("t", str);
                ao0.A01 = Constants.A0j;
                AO0.A00(ao0, "SESSION_END", "INFO", A002);
            }
        }
        avn.A00.A0J.A00();
        avn.A00.A06 = Constants.A0Y;
    }
}
