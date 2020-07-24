package p000X;

import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.AVP */
public final class AVP implements Runnable {
    public final /* synthetic */ AVQ A00;

    public AVP(AVQ avq) {
        this.A00 = avq;
    }

    public final void run() {
        AWN.A01(this.A00.A01, new ARA(BroadcastFailureType.SpeedTestFailure, "SpeedTestTimeoutRunnable", "UiTimeOut"));
        this.A00.A01 = null;
    }
}
