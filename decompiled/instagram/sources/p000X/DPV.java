package p000X;

import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import java.io.File;

/* renamed from: X.DPV */
public final class DPV implements DKT {
    public final /* synthetic */ RecorderCoordinatorImpl A00;
    public final /* synthetic */ C30085DPp A01;
    public final /* synthetic */ File A02;

    public DPV(RecorderCoordinatorImpl recorderCoordinatorImpl, File file, C30085DPp dPp) {
        this.A00 = recorderCoordinatorImpl;
        this.A02 = file;
        this.A01 = dPp;
    }

    public final void B2m(Throwable th) {
        this.A01.Auo(new C30073DPd(AnonymousClass000.A0E("Failed to prepare during start: ", th.getMessage())));
    }

    public final void onSuccess() {
        RecorderCoordinatorImpl.A06(this.A00, this.A02, this.A01);
    }
}
