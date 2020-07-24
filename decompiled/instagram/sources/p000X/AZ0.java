package p000X;

import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.VideoTrack;

/* renamed from: X.AZ0 */
public final /* synthetic */ class AZ0 implements Runnable {
    public final /* synthetic */ AZK A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AZ0(AZK azk, String str, Object obj) {
        this.A00 = azk;
        this.A02 = str;
        this.A01 = obj;
    }

    public final void run() {
        IllegalArgumentException illegalArgumentException;
        AZK azk = this.A00;
        String str = this.A02;
        Object obj = this.A01;
        try {
            MediaStream mediaStream = (MediaStream) azk.A0M.get(str);
            if (mediaStream == null) {
                illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0E("Media stream could not be found: ", str));
            } else if (!mediaStream.videoTracks.isEmpty()) {
                C208658xY r4 = ((C208648xX) obj).A00;
                VideoTrack videoTrack = (VideoTrack) mediaStream.videoTracks.get(0);
                if (r4.A00 == null) {
                    r4.A00 = new C208688xb(r4);
                }
                videoTrack.addSink(r4.A00);
                videoTrack.setEnabled(true);
                EglBase eglBase = azk.A06;
                AnonymousClass0a4.A06(eglBase);
                C12670hC.A04(new AZ1(r4, eglBase.getEglBaseContext(), azk.A00));
                return;
            } else {
                illegalArgumentException = new IllegalArgumentException(AnonymousClass000.A0E("Media stream nave no video tracks to attach: ", str));
            }
            throw illegalArgumentException;
        } catch (IllegalArgumentException e) {
            C23691AYc.A00(azk.A00, e.toString());
        }
    }
}
