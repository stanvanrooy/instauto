package p000X;

import android.os.Build;
import android.webkit.WebSettings;

/* renamed from: X.0Xd  reason: invalid class name and case insensitive filesystem */
public final class C08470Xd {
    public static void A00(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setAllowContentAccess(false);
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        if (Build.VERSION.SDK_INT >= 21) {
            webSettings.setMixedContentMode(1);
        }
    }
}
