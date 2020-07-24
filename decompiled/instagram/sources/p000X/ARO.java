package p000X;

import com.facebook.browser.lite.BrowserLiteActivity;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ARO */
public final class ARO implements ATG {
    public final Map A00;
    public final /* synthetic */ BrowserLiteActivity A01;

    public ARO(BrowserLiteActivity browserLiteActivity) {
        this.A01 = browserLiteActivity;
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        hashMap.put("action", "ACTION_SOFT_BOARD_UP");
    }

    public final void Auz(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        BrowserLiteActivity browserLiteActivity = this.A01;
        BrowserLiteFragment browserLiteFragment = browserLiteActivity.A01;
        if (browserLiteFragment != null) {
            boolean z5 = z2;
            if (z2) {
                browserLiteActivity.A04.A05(this.A00, browserLiteFragment.AYv());
            }
            BrowserLiteFragment browserLiteFragment2 = this.A01.A01;
            List<AQP> list = browserLiteFragment2.A0Q;
            if (list != null) {
                for (AQP BO1 : list) {
                    BO1.BO1(z, z5, z3, z4, i);
                }
            }
            C23560ARe aRe = browserLiteFragment2.A0I;
            if (aRe != null && z2) {
                aRe.A05 = true;
            }
        }
    }
}
