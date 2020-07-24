package p000X;

import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import java.io.File;

/* renamed from: X.DP7 */
public final class DP7 implements Runnable {
    public final /* synthetic */ RecorderCoordinatorImpl A00;
    public final /* synthetic */ C30085DPp A01;
    public final /* synthetic */ File A02;

    public DP7(RecorderCoordinatorImpl recorderCoordinatorImpl, File file, C30085DPp dPp) {
        this.A00 = recorderCoordinatorImpl;
        this.A02 = file;
        this.A01 = dPp;
    }

    public final void run() {
        RecorderCoordinatorImpl recorderCoordinatorImpl = this.A00;
        File file = this.A02;
        C30085DPp dPp = this.A01;
        DPU dpu = recorderCoordinatorImpl.A07;
        if (dpu == DPU.RECORDING) {
            RecorderCoordinatorImpl.A00(recorderCoordinatorImpl);
            throw new IllegalStateException("Recording video has already started");
        } else if (dpu != DPU.PREPARED) {
            DPL dpl = recorderCoordinatorImpl.A0C;
            if (dpl != null) {
                RecorderCoordinatorImpl.A05(recorderCoordinatorImpl, dpl, (C30048DOc) null, new DPV(recorderCoordinatorImpl, file, dPp), false);
                return;
            }
            RecorderCoordinatorImpl.A00(recorderCoordinatorImpl);
            throw new IllegalStateException("Prepare has never been called before calling start. Current state: " + recorderCoordinatorImpl.A07);
        } else {
            RecorderCoordinatorImpl.A06(recorderCoordinatorImpl, file, dPp);
        }
    }
}
