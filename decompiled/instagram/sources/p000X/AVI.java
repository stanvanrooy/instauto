package p000X;

import android.net.Uri;
import android.webkit.WebView;

/* renamed from: X.AVI */
public final class AVI implements Runnable {
    public final /* synthetic */ WebView A00;
    public final /* synthetic */ C25117B1n A01;
    public final /* synthetic */ String A02;

    public AVI(C25117B1n b1n, WebView webView, String str) {
        this.A01 = b1n;
        this.A00 = webView;
        this.A02 = str;
    }

    public final void run() {
        synchronized (this.A01.A06) {
            for (B1A A002 : this.A01.A06) {
                A002.A00(Uri.parse(this.A02));
            }
        }
    }
}
