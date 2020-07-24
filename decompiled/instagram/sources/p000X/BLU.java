package p000X;

import com.facebook.video.heroplayer.ipc.VideoPlayRequest;

/* renamed from: X.BLU */
public final class BLU implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C39731nP A01;
    public final /* synthetic */ VideoPlayRequest A02;
    public final /* synthetic */ boolean A03 = true;

    public BLU(C39731nP r2, VideoPlayRequest videoPlayRequest, float f) {
        this.A01 = r2;
        this.A02 = videoPlayRequest;
        this.A00 = f;
    }

    public final void run() {
        C39731nP.A02(this.A01, this.A02, this.A03, this.A00);
    }
}
