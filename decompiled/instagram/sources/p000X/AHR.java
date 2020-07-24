package p000X;

/* renamed from: X.AHR */
public final class AHR implements Runnable {
    public final /* synthetic */ AH5 A00;

    public AHR(AH5 ah5) {
        this.A00 = ah5;
    }

    public final void run() {
        C205608r8 r0 = this.A00.A0B;
        if (r0 != null && r0.isAttachedToWindow() && this.A00.A0B.getCount() > this.A00.A0B.getChildCount()) {
            int childCount = this.A00.A0B.getChildCount();
            AH5 ah5 = this.A00;
            if (childCount <= ah5.A00) {
                ah5.A0A.setInputMethodMode(2);
                this.A00.show();
            }
        }
    }
}
