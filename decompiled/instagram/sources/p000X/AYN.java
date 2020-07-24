package p000X;

import org.webrtc.PeerConnection;

/* renamed from: X.AYN */
public final /* synthetic */ class AYN implements Runnable {
    public final /* synthetic */ C23706AYs A00;
    public final /* synthetic */ PeerConnection.IceConnectionState A01;

    public /* synthetic */ AYN(C23706AYs aYs, PeerConnection.IceConnectionState iceConnectionState) {
        this.A00 = aYs;
        this.A01 = iceConnectionState;
    }

    public final void run() {
        C23706AYs aYs = this.A00;
        PeerConnection.IceConnectionState iceConnectionState = this.A01;
        if (iceConnectionState == PeerConnection.IceConnectionState.CONNECTED) {
            AZK azk = aYs.A00;
            azk.A0G = true;
            C23700AYl aYl = azk.A00;
            if (aYl != null) {
                C12670hC.A04(new AYK(aYl));
            }
        } else if (iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
            C23700AYl aYl2 = aYs.A00.A00;
            if (aYl2 != null) {
                C12670hC.A04(new AYO(aYl2));
            }
        } else if (iceConnectionState == PeerConnection.IceConnectionState.FAILED) {
            AZK azk2 = aYs.A00;
            azk2.A0J = true;
            C23700AYl aYl3 = azk2.A00;
            if (aYl3 != null) {
                C12670hC.A04(new AYM(aYl3));
            }
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            AZK.A02(aYs.A00);
        }
    }
}
