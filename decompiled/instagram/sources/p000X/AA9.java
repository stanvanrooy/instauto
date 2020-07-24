package p000X;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;

/* renamed from: X.AA9 */
public final class AA9 {
    public static void A00(AV6 av6, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(av6, true);
        }
        WebSettings settings = av6.getSettings();
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880);
        settings.setDatabaseEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setUserAgentString(AnonymousClass000.A0J(settings.getUserAgentString(), " ", str));
    }
}
