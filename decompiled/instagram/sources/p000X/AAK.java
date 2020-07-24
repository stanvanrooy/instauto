package p000X;

import android.webkit.JavascriptInterface;

/* renamed from: X.AAK */
public final class AAK {
    public AAA A00;
    public final /* synthetic */ AAA A01;

    public AAK(AAA aaa, AAA aaa2) {
        this.A01 = aaa;
        this.A00 = aaa2;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.A00.post(new AAF(this, str));
    }
}
