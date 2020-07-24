package p000X;

import android.os.Build;
import android.webkit.WebSettings;

/* renamed from: X.AAI */
public final class AAI {
    public WebSettings A00;

    public final void A00() {
        this.A00.setAllowFileAccess(false);
        this.A00.setAllowContentAccess(false);
        WebSettings webSettings = this.A00;
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        if (Build.VERSION.SDK_INT >= 21) {
            AAU.A00(this.A00);
        }
    }

    public AAI(WebSettings webSettings) {
        this.A00 = webSettings;
    }
}
