package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.browser.lite.BrowserLiteInMainProcessIntentService;
import com.facebook.browser.lite.BrowserLiteIntentService;

/* renamed from: X.ATJ */
public final class ATJ {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    public static void A00(Context context) {
        PackageInfo currentWebViewPackage;
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 26 && (currentWebViewPackage = WebView.getCurrentWebViewPackage()) != null) {
                context.getPackageManager().getPackageInfo(currentWebViewPackage.packageName, 0);
                z = true;
            }
        } catch (Exception e) {
            AnonymousClass0DB.A0H("BrowserLiteIntentServiceHelper", "Checking for WebView package failed", e);
        }
        if (z) {
            WebSettings.getDefaultUserAgent(context);
            C23629AUr.A00();
        }
    }

    public static void A01(Context context, String str, Bundle bundle, boolean z) {
        Class cls;
        if (z) {
            cls = BrowserLiteInMainProcessIntentService.class;
        } else {
            cls = BrowserLiteIntentService.class;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("EXTRA_ACTION", str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (z) {
            try {
                AnonymousClass00Y.enqueueWork(context, BrowserLiteInMainProcessIntentService.class, "BrowserLiteInMainProcessIntentService".hashCode(), intent);
            } catch (RuntimeException e) {
                e = e;
                try {
                    if (!(e.getCause() instanceof DeadObjectException)) {
                        if ((e instanceof IllegalArgumentException) && String.valueOf(e.getMessage()).contains("No such service")) {
                            AnonymousClass0DB.A0G("BrowserLiteInMainProcessIntentService", "Could not enqueue work", e);
                            return;
                        }
                        throw e;
                    }
                } catch (SecurityException unused) {
                }
            }
        } else {
            try {
                AnonymousClass00Y.enqueueWork(context, BrowserLiteIntentService.class, "BrowserLiteIntentService".hashCode(), intent);
            } catch (RuntimeException e2) {
                e = e2;
                if (!(e.getCause() instanceof DeadObjectException)) {
                    if ((e instanceof IllegalArgumentException) && String.valueOf(e.getMessage()).contains("No such service")) {
                        AnonymousClass0DB.A0G("BrowserLiteIntentService", "Could not enqueue work", e);
                        return;
                    }
                    throw e;
                }
            }
        }
    }
}
