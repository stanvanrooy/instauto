package p000X;

import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.instagram.perf.classpreload.CameraClassPreloadController;

/* renamed from: X.04m  reason: invalid class name and case insensitive filesystem */
public final class C028904m extends AnonymousClass0L1 {
    public final /* synthetic */ CameraClassPreloadController A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C028904m(CameraClassPreloadController cameraClassPreloadController) {
        super("preloadCameraClasses", 170);
        this.A00 = cameraClassPreloadController;
    }

    public final void A00() {
        ClassMarkerLoader.loadIsClassPreloadRunMarker();
    }
}
