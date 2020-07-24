package com.facebook.react.views.webview;

import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.A0P;
import p000X.A0h;
import p000X.A1e;
import p000X.A3I;
import p000X.A3N;
import p000X.A73;
import p000X.A76;
import p000X.A77;
import p000X.AAA;
import p000X.AAM;
import p000X.AAT;
import p000X.AAV;
import p000X.AnonymousClass0CH;
import p000X.C23043A0y;
import p000X.C23053A3d;
import p000X.C23091A6e;

@ReactModule(name = "RCTWebView")
public class ReactWebViewManager extends SimpleViewManager {
    public static final String BLANK_URL = "about:blank";
    public static final String BRIDGE_NAME = "__REACT_WEB_VIEW_BRIDGE";
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    public static final String FACEBOOK_DOMAIN = "facebook.com";
    public static final String HTML_ENCODING = "UTF-8";
    public static final String HTML_MIME_TYPE = "text/html";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String INTENT_URL_PREFIX = "intent://";
    public static final String REACT_CLASS = "RCTWebView";
    public static A77 customClientCertRequestHandler;
    public boolean mAlwaysReloadOnSourceChange;
    public final A0h mDelegate;
    public List mFBSessionCookies;
    public WebView.PictureListener mPictureListener;
    public AAV mWebViewConfig;

    private void handlePostMessageCommand(AAA aaa, A1e a1e) {
        String string = a1e.getString(0);
        String string2 = a1e.getString(1);
        if (TextUtils.isEmpty(string2) || "*".equals(string2)) {
            AnonymousClass0CH.A07("ReactNative", "Always provide specific targetOrigin when using WebView.postMessage command");
        } else {
            String parseOrigin = parseOrigin(aaa.getUrl());
            if (!string2.equals(parseOrigin)) {
                AnonymousClass0CH.A0B("ReactNative", "Cross-origin request blocked: postMessage was sent to %s, but current origin is %s", string2, parseOrigin);
                return;
            }
        }
        postWebMessage(aaa, string);
    }

    public Map getCommandsMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("goBack", 1);
        hashMap.put("goForward", 2);
        hashMap.put("reload", 3);
        hashMap.put("stopLoading", 4);
        hashMap.put("postMessage", 5);
        hashMap.put("injectJavaScript", 6);
        return hashMap;
    }

    public String getName() {
        return REACT_CLASS;
    }

    public static String parseOrigin(String str) {
        try {
            URL url = new URL(str);
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            StringBuilder sb = new StringBuilder();
            sb.append(protocol);
            sb.append("://");
            sb.append(host);
            if (!(port == -1 || port == url.getDefaultPort())) {
                sb.append(":");
                sb.append(port);
            }
            return sb.toString();
        } catch (MalformedURLException unused) {
            ReactSoftException.logSoftException("ReactNative", new A0P("Error parsing origin: ReactWebView returned malformed URL for current page"));
            return null;
        }
    }

    private void postWebMessage(AAA aaa, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            aaa.evaluateJavascript("(function () {var event;var data = " + jSONObject.toString() + ";" + "try {" + "event = new MessageEvent('message', data);" + "} catch (e) {" + "event = document.createEvent('MessageEvent');" + "event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);" + "}" + "document.dispatchEvent(event);" + "})();", (ValueCallback) null);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private void setSessionCookiesForFacebookURL(String str) {
        String host;
        List<String> list;
        if (str != null && (host = Uri.parse(str).getHost()) != null) {
            if ((host.equals(FACEBOOK_DOMAIN) || host.endsWith(".facebook.com")) && (list = this.mFBSessionCookies) != null) {
                for (String cookie : list) {
                    CookieManager.getInstance().setCookie(str, cookie);
                }
            }
        }
    }

    public AAA createReactWebViewInstance(C23053A3d a3d) {
        return new AAA(a3d);
    }

    public WebView.PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new A3I(this);
        }
        return this.mPictureListener;
    }

    public static void dispatchEvent(WebView webView, C23091A6e a6e) {
        UIManagerModule uIManagerModule = (UIManagerModule) ((A3N) webView.getContext()).A02(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.mEventDispatcher.ACG(a6e);
        }
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public static void setCustomClientCertRequestHandler(A77 a77) {
        customClientCertRequestHandler = a77;
    }

    public ReactWebViewManager() {
        this((AAV) null, (List) null);
    }

    public ReactWebViewManager(AAV aav) {
        this(aav, (List) null);
    }

    public ReactWebViewManager(AAV aav, List list) {
        this.mAlwaysReloadOnSourceChange = false;
        if (aav == null) {
            this.mWebViewConfig = new AAM(this);
        } else {
            this.mWebViewConfig = aav;
        }
        this.mFBSessionCookies = list;
        this.mDelegate = new A73(this);
    }

    public ReactWebViewManager(List list) {
        this((AAV) null, list);
    }

    public void addEventEmitters(C23053A3d a3d, WebView webView) {
        webView.setWebViewClient(new A76());
    }

    public WebView createViewInstance(C23053A3d a3d) {
        AAA aaa = new AAA(a3d);
        aaa.setWebChromeClient(new AAT());
        a3d.A06(aaa);
        this.mWebViewConfig.A9G(aaa);
        WebSettings settings = aaa.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs((WebView) aaa, false);
        setMixedContentMode((WebView) aaa, "never");
        aaa.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setGeolocationEnabled((WebView) aaa, false);
        return aaa;
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        AAA aaa = (AAA) webView;
        ((C23053A3d) webView.getContext()).A07(aaa);
        aaa.setWebViewClient((WebViewClient) null);
        aaa.destroy();
    }

    public void receiveCommand(WebView webView, int i, A1e a1e) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                if (a1e != null) {
                    handlePostMessageCommand((AAA) webView, a1e);
                    return;
                }
                return;
            case 6:
                ((AAA) webView).evaluateJavascript(a1e.getString(0), (ValueCallback) null);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r10.equals("goBack") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r10.equals("stopLoading") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r10.equals("reload") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r10.equals("goForward") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r10.equals("postMessage") == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r10.equals("injectJavaScript") == false) goto L_0x000d;
     */
    public void receiveCommand(WebView webView, String str, A1e a1e) {
        char c;
        switch (str.hashCode()) {
            case -1241591313:
                c = 0;
                break;
            case -948122918:
                c = 3;
                break;
            case -934641255:
                c = 2;
                break;
            case -318289731:
                c = 1;
                break;
            case 1490029383:
                c = 4;
                break;
            case 2104576510:
                c = 5;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            webView.goBack();
        } else if (c == 1) {
            webView.goForward();
        } else if (c == 2) {
            webView.reload();
        } else if (c == 3) {
            webView.stopLoading();
        } else if (c != 4) {
            if (c == 5) {
                ((AAA) webView).evaluateJavascript(a1e.getString(0), (ValueCallback) null);
            }
        } else if (a1e != null) {
            handlePostMessageCommand((AAA) webView, a1e);
        }
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, boolean z) {
        webView.getSettings().setAllowFileAccess(z);
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public /* bridge */ /* synthetic */ void setAlwaysReloadOnSourceChange(View view, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "alwaysReloadOnSourceChange")
    public void setAlwaysReloadOnSourceChange(WebView webView, boolean z) {
        this.mAlwaysReloadOnSourceChange = z;
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, boolean z) {
        webView.getSettings().setGeolocationEnabled(z);
    }

    @ReactProp(defaultBoolean = true, name = "hardwareAccelerationEnabledExperimental")
    public void setHardwareAccelerationEnabledExperimental(WebView webView, boolean z) {
        if (!z) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((AAA) webView).A01 = str;
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((AAA) webView).setMessagingEnabled(z);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (str == null || "never".equals(str)) {
            webView.getSettings().setMixedContentMode(1);
        } else if ("always".equals(str)) {
            webView.getSettings().setMixedContentMode(0);
        } else if ("compatibility".equals(str)) {
            webView.getSettings().setMixedContentMode(2);
        }
    }

    @ReactProp(name = "originWhitelist")
    public void setOriginWhitelist(WebView webView, A1e a1e) {
        A76 a76 = ((AAA) webView).A00;
        if (a76 != null && a1e != null) {
            LinkedList linkedList = new LinkedList();
            for (int i = 0; i < a1e.size(); i++) {
                linkedList.add(Pattern.compile(a1e.getString(i)));
            }
            a76.A01 = linkedList;
        }
    }

    @ReactProp(name = "reportContentSizeChanges")
    public void setReportContentSizeChanges(WebView webView, boolean z) {
        if (z) {
            webView.setPictureListener(getPictureListener());
        } else {
            webView.setPictureListener((WebView.PictureListener) null);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @ReactProp(name = "source")
    public void setSource(WebView webView, C23043A0y a0y) {
        WebView webView2 = webView;
        if (a0y != null) {
            if (a0y.hasKey("html")) {
                String string = a0y.getString("html");
                if (a0y.hasKey("baseUrl")) {
                    webView2.loadDataWithBaseURL(a0y.getString("baseUrl"), string, HTML_MIME_TYPE, "UTF-8", (String) null);
                    return;
                } else {
                    webView.loadData(string, HTML_MIME_TYPE, "UTF-8");
                    return;
                }
            } else if (a0y.hasKey("uri")) {
                String string2 = a0y.getString("uri");
                setSessionCookiesForFacebookURL(string2);
                String url = webView.getUrl();
                if (!this.mAlwaysReloadOnSourceChange && url != null && url.equals(string2)) {
                    return;
                }
                if (!a0y.hasKey("method") || !a0y.getString("method").equalsIgnoreCase("POST")) {
                    HashMap hashMap = new HashMap();
                    if (a0y.hasKey("headers")) {
                        C23043A0y map = a0y.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.Aby()) {
                            String Aq1 = keySetIterator.Aq1();
                            if (!"user-agent".equals(Aq1.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(Aq1, map.getString(Aq1));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map.getString(Aq1));
                            }
                        }
                    }
                    webView.loadUrl(string2, hashMap);
                    return;
                }
                byte[] bArr = null;
                if (a0y.hasKey("body")) {
                    String string3 = a0y.getString("body");
                    try {
                        bArr = string3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        bArr = string3.getBytes();
                    }
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                webView.postUrl(string2, bArr);
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, A1e a1e) {
        A76 a76 = ((AAA) webView).A00;
        if (a76 != null && a1e != null) {
            a76.A00 = a1e;
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }
}
