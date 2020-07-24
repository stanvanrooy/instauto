package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AA8 */
public final class AA8 implements Runnable {
    public int A00 = 0;
    public boolean A01 = true;
    public boolean A02 = false;
    public final /* synthetic */ AA2 A03;

    public AA8(AA2 aa2) {
        this.A03 = aa2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r1 != false) goto L_0x0063;
     */
    public final void run() {
        boolean z;
        String str;
        AA2 aa2 = this.A03;
        if (aa2.A0A) {
            aa2.A0A = false;
            this.A00 = 0;
            this.A01 = true;
        } else {
            AA2.A05(aa2, aa2.getScrollX(), aa2.getScrollY());
            int i = this.A00 + 1;
            this.A00 = i;
            boolean z2 = false;
            if (i < 3) {
                z2 = true;
            }
            this.A01 = z2;
            AA2 aa22 = this.A03;
            if (!aa22.A0C || this.A02) {
                if (aa22.A0E) {
                    A5x.A01(aa22, Constants.A0Y, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                AA2 aa23 = this.A03;
                C23155AAf aAf = aa23.A05;
                if (!(aAf == null || (str = aa23.A08) == null)) {
                    boolean isEmpty = str.isEmpty();
                    z = true;
                }
                z = false;
                if (z) {
                    AnonymousClass0FY.A00(aAf);
                    AnonymousClass0FY.A00(aa23.A08);
                }
            } else {
                this.A02 = true;
                AA2.A03(aa22, 0);
                this.A03.postOnAnimationDelayed(this, 20);
            }
        }
        if (this.A01) {
            this.A03.postOnAnimationDelayed(this, 20);
        } else {
            this.A03.A07 = null;
        }
    }
}
