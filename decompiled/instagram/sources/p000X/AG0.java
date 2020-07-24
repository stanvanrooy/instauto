package p000X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.AG0 */
public final class AG0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public AG0(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.A02 = bottomSheetBehavior;
        this.A01 = view;
        this.A00 = i;
    }

    public final void run() {
        this.A02.A0T(this.A01, this.A00);
    }
}
