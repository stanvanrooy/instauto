package p000X;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: X.AZA */
public final class AZA implements SdpObserver {
    public final /* synthetic */ AZK A00;

    public final void onCreateFailure(String str) {
        AnonymousClass0DB.A0J("WebRtcConnectionImpl", "onCreateFailure: %s", str);
        AZK.A05(this.A00, new AZB(this, str), (AWN) null);
    }

    public final void onSetFailure(String str) {
        AnonymousClass0DB.A0J("WebRtcConnectionImpl", "onSetFailure: %s", str);
        AZK.A05(this.A00, new AZ9(this, str), (AWN) null);
    }

    public AZA(AZK azk) {
        this.A00 = azk;
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        AZK.A05(this.A00, new AZf(this, sessionDescription), (AWN) null);
    }

    public final void onSetSuccess() {
        AZK.A05(this.A00, new AZ4(this), (AWN) null);
    }
}
