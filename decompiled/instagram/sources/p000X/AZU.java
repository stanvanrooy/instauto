package p000X;

import org.webrtc.CapturerObserver;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: X.AZU */
public final class AZU {
    public boolean A00;
    public final CapturerObserver A01;
    public final SurfaceTextureHelper A02;

    public AZU(SurfaceTextureHelper surfaceTextureHelper, CapturerObserver capturerObserver) {
        AnonymousClass0a4.A06(capturerObserver);
        this.A01 = capturerObserver;
        AnonymousClass0a4.A06(surfaceTextureHelper);
        this.A02 = surfaceTextureHelper;
    }
}
