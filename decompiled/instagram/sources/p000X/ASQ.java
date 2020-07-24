package p000X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.ASQ */
public final class ASQ implements Runnable {
    public final /* synthetic */ ASP A00;
    public final /* synthetic */ AQ8 A01;

    public ASQ(ASP asp, AQ8 aq8) {
        this.A00 = asp;
        this.A01 = aq8;
    }

    public final void run() {
        this.A01.A0N();
        ASP asp = this.A00;
        int i = asp.A01;
        if (i == 0) {
            asp.A00 += CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        } else {
            asp.A00 += CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
        }
        asp.A01 = i + 1;
    }
}
