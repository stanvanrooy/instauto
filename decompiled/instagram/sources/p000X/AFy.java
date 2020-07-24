package p000X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.AFy */
public final class AFy implements Runnable {
    public final int A00;
    public final View A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public AFy(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.A02 = bottomSheetBehavior;
        this.A01 = view;
        this.A00 = i;
    }

    public final void run() {
        AFk aFk = this.A02.A09;
        if (aFk == null || !aFk.A0H()) {
            this.A02.A0S(this.A00);
        } else {
            this.A01.postOnAnimation(this);
        }
    }
}
