package p000X;

import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;

/* renamed from: X.AAT */
public final class AAT extends WebChromeClient {
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, true, false);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return true;
    }
}
