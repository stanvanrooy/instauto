package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Iterator;

/* renamed from: X.AQ8 */
public abstract class AQ8 extends AQ7 {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public C23540AQk A09;
    public C23537AQh A0A;
    public BrowserLiteWebChromeClient A0B;
    public C23565ARj A0C;
    public ARZ A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;

    public final void A16(String str) {
        A17(str, true, (C23544AQo) null);
    }

    public final BrowserLiteWebChromeClient A11() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A0B;
        }
        BrowserLiteWebChromeClient A0A2 = A0A();
        if (!(A0A2 instanceof BrowserLiteWebChromeClient)) {
            return null;
        }
        return A0A2;
    }

    public final C23565ARj A12() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A0C;
        }
        C23565ARj A0B2 = A0B();
        if (!(A0B2 instanceof C23565ARj)) {
            return null;
        }
        return A0B2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != null) goto L_0x0020;
     */
    public final String A14() {
        String str;
        ARS ars;
        ARS ars2;
        C23540AQk aQk = this.A09;
        if (aQk != null) {
            Iterator it = aQk.A00.A0S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = null;
                    break;
                }
                str = ((AQM) it.next()).AZc();
                if (str != null) {
                    break;
                }
            }
        }
        String str2 = null;
        try {
            ARR A0C2 = A0C();
            if (A0C2 != null) {
                if (A0C2.A01.size() == 0) {
                    ars = null;
                } else {
                    ars = A0C2.A00(A0C2.A00);
                }
                if (ars != null) {
                    if (A0C2.A01.size() == 0) {
                        ars2 = null;
                    } else {
                        ars2 = A0C2.A00(A0C2.A00);
                    }
                    str2 = ars2.A03;
                }
            }
        } catch (Throwable unused) {
        }
        if (str == null || str.isEmpty()) {
            return A0F();
        }
        return str;
    }

    public final void A15(long j) {
        C23537AQh aQh;
        long j2;
        if (!this.A0H && (aQh = this.A0A) != null) {
            C23590ASp.A00().A01("BLWV.onPageInteractive");
            aQh.A01.A0t.add(A14());
            if (!aQh.A00) {
                aQh.A00 = true;
                aQh.A01.A0U = true;
            }
            if (aQh.A01.A0Z) {
                A0U(-1);
            }
            BrowserLiteFragment browserLiteFragment = aQh.A01;
            C23560ARe aRe = browserLiteFragment.A0I;
            if (aRe != null) {
                aRe.A05 = false;
            }
            Iterator it = browserLiteFragment.A0S.iterator();
            while (true) {
                j2 = j;
                if (!it.hasNext()) {
                    break;
                }
                ((AQM) it.next()).BDb(this, j);
            }
            Bundle bundleExtra = aQh.A01.A08.getBundleExtra("BrowserLiteIntent.EXTRA_TRACKING");
            String stringExtra = aQh.A01.A08.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY");
            boolean booleanExtra = aQh.A01.A08.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", true);
            if (!TextUtils.isEmpty(stringExtra)) {
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_DOMAIN_KEY", stringExtra);
                bundleExtra.putBoolean("BrowserLiteIntent.EXTRA_AUTOFILL_OPTOUT_INFO_BUNDLE_IS_OPTOUT_KEY", booleanExtra);
            }
            ATL atl = aQh.A01.A0E;
            ATL.A02(atl, new AQW(atl, A14(), bundleExtra, aQh.A01.A0D(), j2));
            this.A0H = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r6 == false) goto L_0x002c;
     */
    public final void A17(String str, boolean z, C23544AQo aQo) {
        String A0E2 = AnonymousClass000.A0E("javascript: ", str);
        Intent intent = ((Activity) A05()).getIntent();
        boolean z2 = true;
        if (intent != null) {
            z2 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_EXECUTE_JS_ENABLED", true);
        }
        if (z2) {
            try {
                A0n(str, new C23536AQg(this, aQo));
            } catch (IllegalStateException unused) {
            }
        } else {
            if (z) {
                A0m(A0E2);
            }
            if (aQo != null) {
                aQo.onFailure();
            }
        }
    }

    public AQ8(Context context) {
        Intent intent = ((Activity) context).getIntent();
        ARZ arz = new ARZ(this);
        this.A0D = arz;
        arz.A01 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_NAVIGATION_TIMING_LOGGER_ENABLED", true);
        this.A0D.A02 = intent.getBooleanExtra("BrowserLiteIntent.USE_FALLBACK_DOM_LOADED_LISTENER", false);
    }

    public final String A13() {
        ARR A0C2 = A0C();
        if (A0C2.A01.size() > 0) {
            return A0C2.A00(0).A03;
        }
        return A14();
    }

    public final boolean A18() {
        if (A10()) {
            ARR A0C2 = A0C();
            if (A0C2.A01.size() >= 2 && A0C2.A00 == 1) {
                String str = A0C2.A00(0).A03;
                String str2 = A0C2.A00(1).A03;
                if (ReactWebViewManager.BLANK_URL.equals(str) || TextUtils.equals(str, str2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean A19() {
        if (A18() || A0z()) {
            return true;
        }
        return false;
    }
}
