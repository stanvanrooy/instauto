package p000X;

import android.content.DialogInterface;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;

/* renamed from: X.AU7 */
public final class AU7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public AU7(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
