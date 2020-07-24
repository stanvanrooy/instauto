package p000X;

import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.common.camera.IgLiveCameraCapturer$CameraCloseRequestedException;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.AQH */
public final class AQH extends AWZ {
    public final /* synthetic */ AQ5 A00;

    public final void A03(Exception exc) {
        String A05 = C06360Ot.formatString("Exception in openCamera(paused=%b)", Boolean.valueOf(this.A00.A0I));
        AnonymousClass0QD.A05("IgLiveStreamingController", A05, exc);
        if (exc instanceof IgLiveCameraCapturer$CameraCloseRequestedException) {
            this.A00.A0V.A01(new LiveStreamingError("openCamera", exc));
        } else {
            this.A00.A0D(BroadcastFailureType.CameraFailure, new C23588ASm("openCamera", A05, exc));
        }
    }

    public AQH(AQ5 aq5) {
        this.A00 = aq5;
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        Integer num;
        A52 a52 = (A52) obj;
        this.A00.A0B(a52);
        AQ5 aq5 = this.A00;
        boolean z = a52.A04;
        AnonymousClass79M r1 = aq5.A0R;
        if (z) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        r1.A07 = num;
    }
}
