package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.C50 */
public final class C50 implements Runnable {
    public final /* synthetic */ C27245C4v A00;

    public C50(C27245C4v c4v) {
        this.A00 = c4v;
    }

    public final void run() {
        this.A00.A00.A09.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).withEndAction(new C5B(this)).start();
    }
}
