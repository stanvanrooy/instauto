package p000X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import java.util.Map;

/* renamed from: X.ARP */
public abstract class ARP extends RelativeLayout {
    public void A01(AQ8 aq8, BrowserLiteWebChromeClient browserLiteWebChromeClient) {
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) this;
        defaultBrowserLiteChrome.A0G = aq8;
        defaultBrowserLiteChrome.setTitle(aq8.A0E());
        if (browserLiteWebChromeClient != null) {
            BrowserLiteWebChromeClient.A00(browserLiteWebChromeClient, browserLiteWebChromeClient.A00);
        }
        defaultBrowserLiteChrome.A03(defaultBrowserLiteChrome.A0G.A14());
    }

    public boolean A02() {
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = (DefaultBrowserLiteChrome) this;
        AUW auw = defaultBrowserLiteChrome.A0C;
        if (auw == null || !auw.isShowing()) {
            return false;
        }
        defaultBrowserLiteChrome.A0C.dismiss();
        defaultBrowserLiteChrome.A0C = null;
        return true;
    }

    public abstract void A03(String str);

    public abstract Map getMenuItemActionLog();

    public abstract void setCloseButtonVisibility(boolean z);

    public abstract void setControllers(ATp aTp, ASB asb);

    public abstract void setMenuButtonVisibility(boolean z);

    public abstract void setTitle(String str);

    public ARP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
