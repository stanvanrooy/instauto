package p000X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.AA7 */
public final class AA7 implements Runnable {
    public int A00 = 0;
    public boolean A01 = true;
    public boolean A02 = false;
    public final /* synthetic */ AA1 A03;

    public AA7(AA1 aa1) {
        this.A03 = aa1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r1 != false) goto L_0x0063;
     */
    public final void run() {
        boolean z;
        String str;
        AA1 aa1 = this.A03;
        if (aa1.A0A) {
            aa1.A0A = false;
            this.A00 = 0;
            this.A01 = true;
        } else {
            AA1.A06(aa1, aa1.getScrollX(), aa1.getScrollY());
            int i = this.A00 + 1;
            this.A00 = i;
            boolean z2 = false;
            if (i < 3) {
                z2 = true;
            }
            this.A01 = z2;
            AA1 aa12 = this.A03;
            if (!aa12.A0C || this.A02) {
                if (aa12.A0E) {
                    A5x.A01(aa12, Constants.A0Y, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                AA1 aa13 = this.A03;
                C23155AAf aAf = aa13.A05;
                if (!(aAf == null || (str = aa13.A08) == null)) {
                    boolean isEmpty = str.isEmpty();
                    z = true;
                }
                z = false;
                if (z) {
                    AnonymousClass0FY.A00(aAf);
                    AnonymousClass0FY.A00(aa13.A08);
                }
            } else {
                this.A02 = true;
                AA1.A04(aa12, 0);
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
