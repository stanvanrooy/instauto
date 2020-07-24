package p000X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebChromeClient;

/* renamed from: X.ATW */
public final class ATW {
    public static Uri[] A00(int i, Intent intent) {
        return WebChromeClient.FileChooserParams.parseResult(i, intent);
    }
}
