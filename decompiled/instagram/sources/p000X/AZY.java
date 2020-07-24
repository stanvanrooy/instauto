package p000X;

import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: X.AZY */
public final /* synthetic */ class AZY implements VideoSink {
    public final /* synthetic */ CapturerObserver A00;

    public /* synthetic */ AZY(CapturerObserver capturerObserver) {
        this.A00 = capturerObserver;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.A00.onFrameCaptured(videoFrame);
    }
}
