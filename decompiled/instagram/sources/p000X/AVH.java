package p000X;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.AVH */
public final class AVH implements Runnable {
    public final /* synthetic */ WebResourceRequest A00;
    public final /* synthetic */ WebView A01;
    public final /* synthetic */ C25117B1n A02;

    public AVH(C25117B1n b1n, WebView webView, WebResourceRequest webResourceRequest) {
        this.A02 = b1n;
        this.A01 = webView;
        this.A00 = webResourceRequest;
    }

    public final void run() {
        synchronized (this.A02.A06) {
            for (B1A A002 : this.A02.A06) {
                A002.A00(this.A00.getUrl());
            }
        }
    }
}
