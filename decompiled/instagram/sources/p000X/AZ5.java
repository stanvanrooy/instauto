package p000X;

import org.webrtc.MediaConstraints;

/* renamed from: X.AZ5 */
public final /* synthetic */ class AZ5 implements Runnable {
    public final /* synthetic */ AZK A00;

    public /* synthetic */ AZ5(AZK azk) {
        this.A00 = azk;
    }

    public final void run() {
        AZK azk = this.A00;
        try {
            azk.A0B = null;
            azk.A0C = null;
            MediaConstraints mediaConstraints = new MediaConstraints();
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveAudio", "true"));
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("OfferToReceiveVideo", "true"));
            if (azk.A0J) {
                mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                azk.A0J = false;
            }
            C23700AYl aYl = azk.A00;
            if (aYl != null) {
                C12670hC.A04(new C23694AYf(aYl));
            }
            azk.A07.createOffer(azk.A0Q, mediaConstraints);
        } catch (Exception e) {
            C23691AYc.A00(azk.A00, e.getMessage());
        }
    }
}
