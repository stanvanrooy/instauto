package p000X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AA5 */
public final class AA5 {
    public static void A00(AAY aay, AnonymousClass0C1 r7, List list) {
        List<HttpCookie> list2;
        aay.getSecureSettings().A00.setSaveFormData(false);
        aay.getSecureSettings().A00.setSavePassword(false);
        aay.getSecureSettings().A00.setSupportZoom(false);
        aay.getSecureSettings().A00.setBuiltInZoomControls(false);
        aay.getSecureSettings().A00.setSupportMultipleWindows(true);
        aay.getSecureSettings().A00.setDisplayZoomControls(false);
        aay.getSecureSettings().A00.setUseWideViewPort(false);
        aay.getSecureSettings().A00.setJavaScriptEnabled(true);
        aay.getSecureSettings().A00.setAppCacheEnabled(true);
        aay.getSecureSettings().A00.setDatabaseEnabled(true);
        aay.getSecureSettings().A00.setDomStorageEnabled(true);
        Context context = aay.getContext();
        aay.getSecureSettings().A00.setAppCachePath(context.getDir("appcache", 0).getPath());
        aay.getContext();
        aay.getSecureSettings().A00.setDatabasePath(context.getDir("databases", 0).getPath());
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            aay.A00();
        }
        aay.setVerticalScrollBarEnabled(false);
        aay.setHorizontalScrollBarEnabled(false);
        aay.getSecureSettings().A00.setUserAgentString(C14300kE.A01(aay.getSettings().getUserAgentString()));
        if (i >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(aay, true);
        }
        if (AnonymousClass0k5.A00(r7) == null) {
            return;
        }
        if (((Boolean) AnonymousClass0LZ.A3B.A01(r7)).booleanValue()) {
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str) && str.startsWith("fr=")) {
                        list2 = HttpCookie.parse(str);
                        break;
                    }
                }
            }
            list2 = null;
            AnonymousClass0k5.A02(r7, list2);
            return;
        }
        AnonymousClass0k5.A02(r7, (List) null);
    }
}
