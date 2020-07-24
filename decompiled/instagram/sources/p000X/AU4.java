package p000X;

import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.AU4 */
public final class AU4 implements AUS {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public AU4(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void Avc(C23611ATs aTs) {
        ASB asb;
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        ATp aTp = defaultBrowserLiteChrome.A04;
        if (aTp != null && (asb = defaultBrowserLiteChrome.A03) != null) {
            aTs.A02(aTp, asb, defaultBrowserLiteChrome.A0C, defaultBrowserLiteChrome.getContext());
            DefaultBrowserLiteChrome defaultBrowserLiteChrome2 = this.A00;
            AUW auw = defaultBrowserLiteChrome2.A02;
            if (auw != null && auw.isShowing()) {
                defaultBrowserLiteChrome2.A02.dismiss();
                defaultBrowserLiteChrome2.A02 = null;
            }
        }
    }
}
