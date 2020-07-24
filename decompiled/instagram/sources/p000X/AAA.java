package p000X;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.views.webview.ReactWebViewManager;

/* renamed from: X.AAA */
public final class AAA extends WebView implements A47 {
    public A76 A00;
    public String A01;
    public boolean A02 = false;

    public final void onHostDestroy() {
        setWebViewClient((WebViewClient) null);
        destroy();
    }

    public final void onHostPause() {
    }

    public final void onHostResume() {
    }

    public void setMessagingEnabled(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (z) {
                addJavascriptInterface(new AAK(this, this), ReactWebViewManager.BRIDGE_NAME);
                if (this.A02) {
                    evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", (ValueCallback) null);
                    return;
                }
                return;
            }
            removeJavascriptInterface(ReactWebViewManager.BRIDGE_NAME);
        }
    }

    public AAA(C23053A3d a3d) {
        super(a3d);
    }

    public A76 getReactWebViewClient() {
        return this.A00;
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.A00 = (A76) webViewClient;
    }

    public void setInjectedJavaScript(String str) {
        this.A01 = str;
    }
}
