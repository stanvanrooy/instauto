package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.AQO */
public final class AQO extends AQN {
    public static AQO A00;

    public static AQO A00() {
        if (A00 == null) {
            A00 = new AQO();
        }
        return A00;
    }

    public final void A02() {
        Intent intent;
        Intent intent2;
        Uri data;
        Intent intent3;
        String str;
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            intent = (Intent) weakReference.get();
        } else {
            intent = null;
        }
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENABLED", false)) {
            z = true;
        }
        if (z) {
            WeakReference weakReference2 = this.A04;
            if (weakReference2 != null) {
                intent3 = (Intent) weakReference2.get();
            } else {
                intent3 = null;
            }
            String str2 = null;
            HashMap hashMap = new HashMap();
            if (intent3 != null) {
                str2 = intent3.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_BLACKLIST");
                Bundle bundleExtra = intent3.getBundleExtra("BrowserLiteIntent.InstagramExtras.EXTRA_AUTOFILL_OPTOUT_INFO");
                if (bundleExtra != null && bundleExtra.containsKey("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY")) {
                    hashMap.put(bundleExtra.getString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY"), Boolean.valueOf(bundleExtra.getBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY")));
                }
            }
            if (intent3 != null) {
                str = intent3.getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID");
            } else {
                str = "";
            }
            C24079Aha aha = new C24079Aha(str, str2, hashMap);
            if (intent3 != null) {
                aha.A00 = intent3.getIntExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPT_IN_CONTENT_VARIANT", 0);
                aha.A01 = intent3.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_IS_LOG_NEW_DOMAIN_OPT_OUT_ENABLED", false);
            }
            this.A06.add(aha);
        }
        this.A06.add(new AUD());
        WeakReference weakReference3 = this.A04;
        if (weakReference3 != null) {
            intent2 = (Intent) weakReference3.get();
        } else {
            intent2 = null;
        }
        if (!(intent2 == null || !intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_INTEGRITY_LOGGING", false) || (data = intent2.getData()) == null)) {
            List list = this.A06;
            String uri = data.toString();
            boolean z2 = false;
            if (Build.VERSION.SDK_INT == 19) {
                z2 = true;
            }
            boolean booleanExtra = intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_PAGE_SIZE_LOGGING", false);
            boolean booleanExtra2 = intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_SIM_HASH_LOGGING", false);
            intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_IAB_SAFE_BROWSING_LOGGING", false);
            list.add(new ASC(uri, z2, booleanExtra, booleanExtra2, intent2.getBooleanExtra("BrowserLiteIntent.EXTRA_IMAGES_SIZES_LOGGING", false)));
        }
        super.A02();
    }

    public final void A03() {
        super.A03();
        A00 = null;
    }
}
