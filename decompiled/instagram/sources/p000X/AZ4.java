package p000X;

import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: X.AZ4 */
public final /* synthetic */ class AZ4 implements Runnable {
    public final /* synthetic */ AZA A00;

    public /* synthetic */ AZ4(AZA aza) {
        this.A00 = aza;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 == false) goto L_0x000d;
     */
    public final void run() {
        boolean z;
        AZA aza = this.A00;
        try {
            AZK azk = aza.A00;
            if (azk.A0H) {
                boolean z2 = azk.A0I;
                z = false;
            }
            z = true;
            AnonymousClass0a4.A0C(z, "Unexpected state. Both local/remote sdp are set, not expecting new one.");
            AZK azk2 = aza.A00;
            if (!azk2.A0H) {
                azk2.A07.getLocalDescription();
                AZK azk3 = aza.A00;
                azk3.A0H = true;
                PeerConnection peerConnection = azk3.A07;
                SdpObserver sdpObserver = azk3.A0Q;
                SessionDescription sessionDescription = azk3.A0C;
                AnonymousClass0a4.A06(sessionDescription);
                peerConnection.setRemoteDescription(sdpObserver, sessionDescription);
                return;
            }
            azk2.A07.getRemoteDescription();
            aza.A00.A0I = true;
        } catch (RuntimeException e) {
            C23691AYc.A00(aza.A00.A00, e.getMessage());
            C23700AYl aYl = aza.A00.A00;
            if (aYl != null) {
                C12670hC.A04(new AYJ(aYl, e));
            }
        }
    }
}
