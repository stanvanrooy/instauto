package p000X;

import com.facebook.smartcapture.components.ContourView;

/* renamed from: X.C5G */
public final class C5G implements Runnable {
    public final /* synthetic */ C4n A00;
    public final /* synthetic */ Integer A01;

    public C5G(C4n c4n, Integer num) {
        this.A00 = c4n;
        this.A01 = num;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2 == p000X.Constants.A14) goto L_0x000f;
     */
    public final void run() {
        boolean z;
        ContourView contourView = this.A00.A08;
        Integer num = this.A01;
        if (num != Constants.A0u) {
            z = true;
        }
        z = false;
        contourView.setTextTipVisible(z);
    }
}
