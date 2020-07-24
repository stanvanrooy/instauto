package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.http.SslCertificate;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.webview.SystemWebView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.AQ7 */
public abstract class AQ7 {
    public int A00() {
        return ((SystemWebView) this).A01.computeHorizontalScrollRange();
    }

    public int A01() {
        return ((SystemWebView) this).A01.computeVerticalScrollRange();
    }

    public int A02() {
        return ((SystemWebView) this).A01.getHeight();
    }

    public int A03() {
        return ((SystemWebView) this).A01.getScrollY();
    }

    public int A04() {
        return ((SystemWebView) this).A01.getVisibility();
    }

    public Context A05() {
        return ((SystemWebView) this).A01.getContext();
    }

    public Bitmap A06() {
        return ((SystemWebView) this).A01.getDrawingCache();
    }

    public SslCertificate A07() {
        return ((SystemWebView) this).A01.getCertificate();
    }

    public View A08() {
        return ((SystemWebView) this).A01;
    }

    public WebSettings A09() {
        return ((SystemWebView) this).A01.getSettings();
    }

    public abstract BrowserLiteWebChromeClient A0A();

    public abstract C23565ARj A0B();

    public ARR A0C() {
        WebBackForwardList copyBackForwardList = ((SystemWebView) this).A01.copyBackForwardList();
        int size = copyBackForwardList.getSize();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
            arrayList.add(new ARS(itemAtIndex.getUrl(), itemAtIndex.getOriginalUrl(), itemAtIndex.getTitle(), itemAtIndex.getFavicon()));
        }
        return new ARR(arrayList, copyBackForwardList.getCurrentIndex());
    }

    public String A0D() {
        return "com.facebook.browser.lite.webview.SystemWebView";
    }

    public String A0E() {
        return ((SystemWebView) this).A01.getTitle();
    }

    public String A0F() {
        return ((SystemWebView) this).A01.getUrl();
    }

    public void A0G() {
        ((SystemWebView) this).A01.clearHistory();
    }

    public void A0H() {
        ((SystemWebView) this).A01.clearSslPreferences();
    }

    public void A0I() {
        ((SystemWebView) this).A01.destroy();
    }

    public void A0J() {
        ((SystemWebView) this).A01.goBack();
    }

    public void A0K() {
        ((SystemWebView) this).A01.goForward();
    }

    public void A0L() {
        ((SystemWebView) this).A01.onResume();
    }

    public void A0M() {
        ((SystemWebView) this).A01.pauseTimers();
    }

    public void A0N() {
        ((SystemWebView) this).A01.reload();
    }

    public void A0O() {
        ((SystemWebView) this).A01.removeAllViews();
    }

    public void A0P() {
        ((SystemWebView) this).A01.resumeTimers();
    }

    public void A0Q() {
        ((SystemWebView) this).A01.stopLoading();
    }

    public void A0R() {
        ((SystemWebView) this).A01.onPause();
    }

    public void A0S(float f) {
        ((SystemWebView) this).A01.setTranslationY(f);
    }

    public void A0T(int i) {
        ((SystemWebView) this).A01.goBackOrForward(i);
    }

    public void A0U(int i) {
        ((SystemWebView) this).A01.setBackgroundColor(i);
    }

    public void A0V(int i) {
        ((SystemWebView) this).A01.setInitialScale(i);
    }

    public void A0W(int i) {
        ((SystemWebView) this).A01.setScrollBarStyle(i);
    }

    public void A0X(int i) {
        ((SystemWebView) this).A01.setScrollY(i);
    }

    public void A0Y(int i) {
        ((SystemWebView) this).A01.setVisibility(i);
    }

    public void A0Z(int i, Paint paint) {
        ((SystemWebView) this).A01.setLayerType(i, paint);
    }

    public abstract void A0a(Context context);

    public void A0b(Bundle bundle) {
        ((SystemWebView) this).A01.restoreState(bundle);
    }

    public void A0c(Bundle bundle) {
        ((SystemWebView) this).A01.saveState(bundle);
    }

    public void A0d(Message message) {
        ((WebView.WebViewTransport) message.obj).setWebView(((SystemWebView) this).A01);
    }

    public void A0e(View.OnTouchListener onTouchListener) {
        ((SystemWebView) this).A01.setOnTouchListener(onTouchListener);
    }

    public void A0f(DownloadListener downloadListener) {
        ((SystemWebView) this).A01.setDownloadListener(downloadListener);
    }

    public void A0g(FrameLayout.LayoutParams layoutParams) {
        ((SystemWebView) this).A01.setLayoutParams(layoutParams);
    }

    public void A0h(BrowserLiteWebChromeClient browserLiteWebChromeClient) {
        SystemWebView systemWebView = (SystemWebView) this;
        C23556ARa aRa = new C23556ARa(browserLiteWebChromeClient);
        systemWebView.A00 = aRa;
        systemWebView.A01.setWebChromeClient(aRa);
    }

    public void A0i(C23565ARj aRj) {
        SystemWebView systemWebView = (SystemWebView) this;
        C23566ARk aRk = new C23566ARk(aRj);
        systemWebView.A02 = aRk;
        systemWebView.A01.setWebViewClient(aRk);
    }

    public void A0j(Object obj) {
        ((SystemWebView) this).A01.setTag(obj);
    }

    public void A0k(Object obj, String str) {
        ((SystemWebView) this).A01.addJavascriptInterface(obj, str);
    }

    public void A0l(Runnable runnable) {
        ((SystemWebView) this).A01.post(runnable);
    }

    public void A0m(String str) {
        ((SystemWebView) this).A01.loadUrl(str);
    }

    public void A0n(String str, ValueCallback valueCallback) {
        ((SystemWebView) this).A01.evaluateJavascript(str, valueCallback);
    }

    public void A0o(String str, String str2, String str3, String str4, String str5) {
        ((SystemWebView) this).A01.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void A0p(String str, Map map) {
        ((SystemWebView) this).A01.loadUrl(str, map);
    }

    public void A0q(String str, byte[] bArr) {
        ((SystemWebView) this).A01.postUrl(str, bArr);
    }

    public void A0r(boolean z) {
        ((SystemWebView) this).A01.buildDrawingCache(z);
    }

    public void A0s(boolean z) {
        ((SystemWebView) this).A01.setDrawingCacheEnabled(z);
    }

    public void A0t(boolean z) {
        ((SystemWebView) this).A01.setFocusable(z);
    }

    public void A0u(boolean z) {
        ((SystemWebView) this).A01.setFocusableInTouchMode(z);
    }

    public void A0v(boolean z) {
        ((SystemWebView) this).A01.setHapticFeedbackEnabled(z);
    }

    public void A0w(boolean z) {
        ((SystemWebView) this).A01.setScrollbarFadingEnabled(z);
    }

    public void A0x(boolean z) {
        ((AQ8) this).A0L = z;
    }

    public void A0y(boolean z) {
        C23541AQl.setWebContentsDebuggingEnabled(z);
    }

    public boolean A0z() {
        return ((SystemWebView) this).A01.canGoForward();
    }

    public boolean A10() {
        return ((SystemWebView) this).A01.canGoBack();
    }
}
