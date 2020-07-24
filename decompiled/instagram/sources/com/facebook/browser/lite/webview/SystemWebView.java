package com.facebook.browser.lite.webview;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import p000X.AQ8;
import p000X.C23541AQl;
import p000X.C23556ARa;
import p000X.C23565ARj;
import p000X.C23566ARk;

public final class SystemWebView extends AQ8 {
    public C23556ARa A00 = null;
    public C23541AQl A01;
    public C23566ARk A02 = null;

    public SystemWebView(Context context) {
        super(context);
        this.A01 = new C23541AQl(this, context);
    }

    public final BrowserLiteWebChromeClient A0A() {
        C23556ARa aRa = this.A00;
        if (aRa != null) {
            return aRa.A00;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ C23565ARj A0B() {
        C23566ARk aRk = this.A02;
        if (aRk != null) {
            return aRk.A00;
        }
        return null;
    }

    public final void A0a(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager instance = CookieManager.getInstance();
        if (instance != null) {
            instance.setAcceptThirdPartyCookies(this.A01, true);
        }
    }
}
