package p000X;

import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import java.util.Map;

/* renamed from: X.DPI */
public final class DPI implements C88443sQ {
    public final /* synthetic */ RecorderCoordinatorImpl A00;

    public DPI(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        this.A00 = recorderCoordinatorImpl;
    }

    public final void B2h(Exception exc, Map map) {
        RecorderCoordinatorImpl.A04(this.A00, new C30073DPd("Failed to stop audio recorder", (Throwable) exc));
    }

    public final void onSuccess() {
        RecorderCoordinatorImpl recorderCoordinatorImpl = this.A00;
        C30053DOi dOi = recorderCoordinatorImpl.A09;
        if (dOi != null) {
            dOi.A01(new C30060DOq(this), recorderCoordinatorImpl.A0G);
        }
    }
}
