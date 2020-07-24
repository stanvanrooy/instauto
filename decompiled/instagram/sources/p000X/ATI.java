package p000X;

import android.content.Context;
import android.webkit.WebView;

/* renamed from: X.ATI */
public final class ATI implements Runnable {
    public final /* synthetic */ Context A00;

    public ATI(Context context) {
        this.A00 = context;
    }

    public final void run() {
        try {
            WebView webView = new WebView(this.A00);
            webView.clearCache(true);
            webView.destroy();
        } catch (Exception unused) {
        }
    }
}
