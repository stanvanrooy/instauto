package p000X;

import org.webrtc.EglBase;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;

/* renamed from: X.AZ2 */
public final /* synthetic */ class AZ2 implements Runnable {
    public final /* synthetic */ AZK A00;

    public /* synthetic */ AZ2(AZK azk) {
        this.A00 = azk;
    }

    public final void run() {
        AZK azk = this.A00;
        azk.A0M.clear();
        AZK.A03(azk);
        AZK.A04(azk);
        PeerConnection peerConnection = azk.A07;
        if (peerConnection != null) {
            peerConnection.stopRtcEventLog();
            azk.A07.dispose();
            C49922Ee.A00(azk.A07);
        }
        PeerConnectionFactory peerConnectionFactory = azk.A08;
        if (peerConnectionFactory != null) {
            peerConnectionFactory.dispose();
            C49922Ee.A00(azk.A07);
        }
        EglBase eglBase = azk.A06;
        if (eglBase != null) {
            eglBase.release();
        }
        azk.A0O.shutdownNow();
    }
}
