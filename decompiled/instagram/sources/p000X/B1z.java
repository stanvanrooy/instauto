package p000X;

import android.webkit.WebView;

/* renamed from: X.B1z */
public final class B1z implements Runnable {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ C25117B1n A01;
    public final /* synthetic */ String A02;

    public B1z(C25117B1n b1n, WebView webView, String str) {
        this.A01 = b1n;
        this.A00 = webView;
        this.A02 = str;
    }

    public final void run() {
        synchronized (this.A01.A03) {
            for (B2W BDa : this.A01.A03) {
                BDa.BDa((AV6) this.A00, this.A02);
            }
        }
    }
}
