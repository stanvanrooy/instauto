package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.AU5 */
public final class AU5 implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;
    public final /* synthetic */ boolean A01;

    public AU5(DefaultBrowserLiteChrome defaultBrowserLiteChrome, boolean z) {
        this.A00 = defaultBrowserLiteChrome;
        this.A01 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1209621006);
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        boolean z = this.A01;
        AnonymousClass2OA r2 = new AnonymousClass2OA(defaultBrowserLiteChrome.getContext());
        int i = C0003R.string.not_secure_connection_title;
        if (z) {
            i = C0003R.string.secure_connection_title;
        }
        r2.A07(i);
        int i2 = C0003R.string.not_secure_connection_description;
        if (z) {
            i2 = C0003R.string.secure_connection_description;
        }
        r2.A06(i2);
        r2.A0A(C0003R.string.secure_connection_confirm, new AU7(defaultBrowserLiteChrome));
        r2.A03().show();
        AnonymousClass0Z0.A0C(1487759768, A05);
    }
}
