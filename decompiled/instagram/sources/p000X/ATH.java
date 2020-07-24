package p000X;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import java.util.Vector;
import java.util.regex.Pattern;

/* renamed from: X.ATH */
public final class ATH {
    public static final Vector A00 = new Vector();
    public static final Pattern A01 = Pattern.compile("(?:\\sChrome/)(\\d{2,3})(?:\\.)");

    public static void A02(C23629AUr aUr) {
        try {
            aUr.Bah((C23601ATh) null);
        } catch (Exception unused) {
        }
    }

    public static void A01(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.createInstance(context);
            C23629AUr.A00().Bag();
            return;
        }
        A02(C23629AUr.A00());
    }

    public static boolean A03() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|(1:3)(1:4)|5|6|7|8|(1:10)|(3:12|13|14)(3:15|16|18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0017 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[Catch:{  }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[SYNTHETIC, Splitter:B:12:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032 A[SYNTHETIC, Splitter:B:15:0x0032] */
    public static void A00(Context context) {
        CookieSyncManager.createInstance(context);
        C23629AUr A002 = C23629AUr.A00();
        if (Build.VERSION.SDK_INT < 21) {
            A002.Bag();
        } else {
            A02(A002);
        }
        A002.flush();
        boolean z = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        if (!z) {
            try {
                WebView webView = new WebView(context);
                webView.clearCache(true);
                webView.destroy();
            } catch (Exception unused) {
            }
        } else {
            AS5.A00(new ATI(context));
        }
    }
}
