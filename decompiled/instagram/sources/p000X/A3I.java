package p000X;

import android.graphics.Picture;
import android.webkit.WebView;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.A3I */
public final class A3I implements WebView.PictureListener {
    public final /* synthetic */ ReactWebViewManager A00;

    public A3I(ReactWebViewManager reactWebViewManager) {
        this.A00 = reactWebViewManager;
    }

    public final void onNewPicture(WebView webView, Picture picture) {
        ReactWebViewManager.dispatchEvent(webView, new A0O(webView.getId(), webView.getWidth(), webView.getContentHeight()));
    }
}
