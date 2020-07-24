package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.CAR */
public final class CAR implements Runnable {
    public final /* synthetic */ CAL A00;

    public CAR(CAL cal) {
        this.A00 = cal;
    }

    public final void run() {
        CWQ cwq = this.A00.A00;
        CWQ.A02(cwq, cwq.A00.getTranslationY(), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
