package p000X;

import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* renamed from: X.AZL */
public final /* synthetic */ class AZL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AWZ A02;
    public final /* synthetic */ AZK A03;

    public /* synthetic */ AZL(AZK azk, AWZ awz, int i, int i2) {
        this.A03 = azk;
        this.A02 = awz;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        AZK azk = this.A03;
        AWZ awz = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        try {
            if (azk.A0D == null) {
                boolean z = false;
                VideoSource createVideoSource = azk.A08.createVideoSource(false, true);
                AnonymousClass0a4.A06(createVideoSource);
                azk.A0D = createVideoSource;
                if (azk.A03 == null) {
                    z = true;
                }
                AnonymousClass0a4.A0C(z, "VideoCapturer should be null.");
                EglBase eglBase = azk.A06;
                AnonymousClass0a4.A06(eglBase);
                EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
                azk.A03 = new AZU(SurfaceTextureHelper.create("WebRtcVideoCapturer", eglBaseContext), azk.A0D.capturerObserver);
            } else {
                boolean z2 = false;
                if (azk.A03 != null) {
                    z2 = true;
                }
                AnonymousClass0a4.A0C(z2, "VideoCapturer should not be null.");
            }
            if (azk.A0E == null) {
                VideoTrack createVideoTrack = azk.A08.createVideoTrack(azk.A0A.mo50739id(), azk.A0D);
                azk.A0E = createVideoTrack;
                createVideoTrack.setEnabled(true);
            }
            azk.A0A.setTrack(azk.A0E, false);
            AZU azu = azk.A03;
            azu.A02.setTextureSize(i, i2);
            if (!azu.A00) {
                azu.A02.startListening(new AZY(azu.A01));
                azu.A00 = true;
            }
            AWZ.A01(awz, azk.A03.A02.surfaceTexture);
        } catch (Exception e) {
            AWZ.A00(awz, e);
        }
    }
}
