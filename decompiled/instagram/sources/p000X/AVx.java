package p000X;

import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;
import com.facebook.mediastreaming.opt.transport.TransportCallbacks;

/* renamed from: X.AVx */
public final class AVx implements Runnable {
    public final /* synthetic */ AVv A00;
    public final /* synthetic */ SpeedTestStatus A01;

    public AVx(AVv aVv, SpeedTestStatus speedTestStatus) {
        this.A00 = aVv;
        this.A01 = speedTestStatus;
    }

    public final void run() {
        TransportCallbacks transportCallbacks = this.A00.A00;
        if (transportCallbacks != null) {
            transportCallbacks.onSpeedTestResult(this.A01);
        }
    }
}
