package p000X;

import android.hardware.display.DisplayManager;

/* renamed from: X.D83 */
public final class D83 implements DisplayManager.DisplayListener {
    public final DisplayManager A00;
    public final /* synthetic */ D72 A01;

    public final void onDisplayAdded(int i) {
    }

    public final void onDisplayRemoved(int i) {
    }

    public D83(D72 d72, DisplayManager displayManager) {
        this.A01 = d72;
        this.A00 = displayManager;
    }

    public final void onDisplayChanged(int i) {
        if (i == 0) {
            D72.A00(this.A01);
        }
    }
}
