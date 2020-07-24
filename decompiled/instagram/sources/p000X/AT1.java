package p000X;

import android.view.Window;
import com.facebook.browser.lite.BrowserLiteActivity;

/* renamed from: X.AT1 */
public final class AT1 implements ATG {
    public double A00;
    public final /* synthetic */ BrowserLiteActivity A01;

    public AT1(BrowserLiteActivity browserLiteActivity) {
        this.A01 = browserLiteActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r13 < 100) goto L_0x0007;
     */
    public final void Auz(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5;
        int i2;
        if (z2) {
            z5 = false;
        }
        z5 = true;
        if (z5) {
            BrowserLiteActivity browserLiteActivity = this.A01;
            this.A00 = browserLiteActivity.A00;
            this.A01.getWindow().setLayout(-1, (int) (((double) browserLiteActivity.getResources().getDisplayMetrics().heightPixels) * this.A00));
            this.A01.getWindow().setGravity(87);
            return;
        }
        Window window = this.A01.getWindow();
        int i3 = (int) ((double) this.A01.getResources().getDisplayMetrics().heightPixels);
        BrowserLiteActivity browserLiteActivity2 = this.A01;
        int identifier = browserLiteActivity2.getResources().getIdentifier(AnonymousClass0C5.$const$string(38), "dimen", "android");
        if (identifier > 0) {
            i2 = browserLiteActivity2.getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        window.setLayout(-1, i3 - i2);
        this.A00 = 1.0d;
    }
}
