package p000X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ClientCertRequest;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.A76 */
public final class A76 extends WebViewClient {
    public A1e A00;
    public List A01;
    public boolean A02 = false;

    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (ReactWebViewManager.customClientCertRequestHandler == null) {
            super.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0086 A[SYNTHETIC, Splitter:B:31:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        boolean z;
        Intent intent;
        Intent intent2;
        if (str.equals(ReactWebViewManager.BLANK_URL)) {
            return false;
        }
        A1e a1e = this.A00;
        if (a1e != null && a1e.size() > 0) {
            Iterator it = this.A00.toArrayList().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        break;
                    }
                } else {
                    break;
                }
            }
            Context context = webView.getContext();
            if (str.startsWith(ReactWebViewManager.INTENT_URL_PREFIX)) {
                try {
                    intent = Intent.parseUri(str, 1);
                } catch (URISyntaxException e) {
                    AnonymousClass0CH.A09("ReactNative", "Can't parse intent:// URI", e);
                }
                String $const$string = AnonymousClass0C5.$const$string(183);
                if (intent != null) {
                    intent.addCategory($const$string);
                    intent.setComponent((ComponentName) null);
                    intent.setSelector((Intent) null);
                    if (context.getPackageManager().resolveActivity(intent, DexStore.LOAD_RESULT_PGO_ATTEMPTED) != null) {
                        AnonymousClass0XM.A00().A05().A04(intent, context);
                    } else {
                        String stringExtra = intent.getStringExtra("browser_fallback_url");
                        if (stringExtra != null) {
                            intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                        }
                    }
                    return true;
                }
                intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.setFlags(268435456);
                intent2.addCategory($const$string);
                AnonymousClass0XM.A00().A05().A04(intent2, context);
                return true;
            }
            intent = null;
            String $const$string2 = AnonymousClass0C5.$const$string(183);
            if (intent != null) {
            }
            intent2.setFlags(268435456);
            intent2.addCategory($const$string2);
            AnonymousClass0XM.A00().A05().A04(intent2, context);
            return true;
        }
        List list = this.A01;
        if (list != null) {
            Uri parse = Uri.parse(str);
            String str3 = "";
            if (parse.getScheme() != null) {
                str2 = parse.getScheme();
            } else {
                str2 = str3;
            }
            if (parse.getAuthority() != null) {
                str3 = parse.getAuthority();
            }
            String A0J = AnonymousClass000.A0J(str2, "://", str3);
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((Pattern) it2.next()).matcher(A0J).matches()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return false;
            }
        }
        Context context2 = webView.getContext();
        if (str.startsWith(ReactWebViewManager.INTENT_URL_PREFIX)) {
        }
        intent = null;
        String $const$string22 = AnonymousClass0C5.$const$string(183);
        if (intent != null) {
        }
        try {
            intent2.setFlags(268435456);
            intent2.addCategory($const$string22);
            AnonymousClass0XM.A00().A05().A04(intent2, context2);
            return true;
        } catch (ActivityNotFoundException e2) {
            AnonymousClass0CH.A0A("ReactNative", AnonymousClass000.A0E("activity not found to handle uri scheme for: ", str), e2);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r5.getProgress() == 100) goto L_0x0020;
     */
    public final C228259s1 A00(WebView webView, String str) {
        boolean z;
        C228259s1 A03 = C23041A0r.A03();
        A03.putDouble("target", (double) webView.getId());
        A03.putString(IgReactNavigatorModule.URL, str);
        if (!this.A02) {
            z = true;
        }
        z = false;
        A03.putBoolean("loading", z);
        A03.putString(DialogModule.KEY_TITLE, webView.getTitle());
        A03.putBoolean("canGoBack", webView.canGoBack());
        A03.putBoolean("canGoForward", webView.canGoForward());
        return A03;
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (!this.A02) {
            AAA aaa = (AAA) webView;
            if (aaa.A02) {
                aaa.evaluateJavascript("(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})", (ValueCallback) null);
            }
            if (aaa.getSettings().getJavaScriptEnabled() && (str2 = aaa.A01) != null && !TextUtils.isEmpty(str2)) {
                aaa.evaluateJavascript(AnonymousClass000.A0J("(function() {\n", aaa.A01, ";\n})();"), (ValueCallback) null);
            }
            ReactWebViewManager.dispatchEvent(webView, new A6N(webView.getId(), A00(webView, str)));
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.A02 = false;
        ReactWebViewManager.dispatchEvent(webView, new A6O(webView.getId(), A00(webView, str)));
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        this.A02 = true;
        ReactWebViewManager.dispatchEvent(webView, new A6N(webView.getId(), A00(webView, str2)));
        C228259s1 A002 = A00(webView, str2);
        A002.putDouble("code", (double) i);
        A002.putString("description", str);
        ReactWebViewManager.dispatchEvent(webView, new A6M(webView.getId(), A002));
    }
}
