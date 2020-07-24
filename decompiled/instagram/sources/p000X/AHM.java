package p000X;

import android.view.ViewTreeObserver;

/* renamed from: X.AHM */
public final class AHM implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AH6 A00;

    public AHM(AH6 ah6) {
        this.A00 = ah6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.getGlobalVisibleRect(r2.A03) == false) goto L_0x0013;
     */
    public final void onGlobalLayout() {
        boolean z;
        AH6 ah6 = this.A00;
        AnonymousClass2AW r1 = ah6.A04;
        if (r1.isAttachedToWindow()) {
            z = true;
        }
        z = false;
        if (!z) {
            this.A00.dismiss();
            return;
        }
        this.A00.A03();
        AHM.super.show();
    }
}
