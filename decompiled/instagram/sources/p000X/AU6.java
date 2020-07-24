package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.AU6 */
public final class AU6 implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public AU6(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0Z0.A05(-1010635941);
        if (this.A00.A03 == null) {
            i = 1921912918;
        } else {
            if (view.getId() == C0003R.C0005id.ig_browser_close_button) {
                DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
                defaultBrowserLiteChrome.A03.A8u(1, defaultBrowserLiteChrome.A06);
            }
            i = -1178825071;
        }
        AnonymousClass0Z0.A0C(i, A05);
    }
}
