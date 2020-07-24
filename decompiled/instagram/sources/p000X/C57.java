package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.smartcapture.components.ContourView;

/* renamed from: X.C57 */
public final class C57 implements Runnable {
    public final /* synthetic */ ContourView A00;

    public C57(ContourView contourView) {
        this.A00 = contourView;
    }

    public final void run() {
        this.A00.A07.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).start();
    }
}
