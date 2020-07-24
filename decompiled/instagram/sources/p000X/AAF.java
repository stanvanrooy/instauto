package p000X;

import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.AAF */
public final class AAF implements Runnable {
    public final /* synthetic */ AAK A00;
    public final /* synthetic */ String A01;

    public AAF(AAK aak, String str) {
        this.A00 = aak;
        this.A01 = str;
    }

    public final void run() {
        String parseOrigin = ReactWebViewManager.parseOrigin(this.A00.A01.getUrl());
        AAA aaa = this.A00.A00;
        ReactWebViewManager.dispatchEvent(aaa, new A61(aaa.getId(), this.A01, parseOrigin));
    }
}
