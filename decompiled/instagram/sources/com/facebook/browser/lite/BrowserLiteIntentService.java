package com.facebook.browser.lite;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p000X.ADB;
import p000X.ASB;
import p000X.ATH;
import p000X.ATJ;
import p000X.ATK;
import p000X.AnonymousClass074;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0XV;
import p000X.AnonymousClass0Z0;
import p000X.C193418Ps;
import p000X.C23538AQi;
import p000X.C23594ASt;
import p000X.C23600ATg;
import p000X.C248116c;

public class BrowserLiteIntentService extends AnonymousClass0EY {
    public String A00 = "BrowserLiteIntentService";

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r2.endsWith(p000X.AnonymousClass0C5.$const$string(138)) == false) goto L_0x0028;
     */
    public final void onHandleWork(Intent intent) {
        C23594ASt aSt;
        ASB asb;
        boolean z;
        if (intent != null) {
            if (ATH.A03()) {
                String str = null;
                try {
                    str = getPackageManager().getServiceInfo(intent.getComponent(), 0).processName;
                } catch (Exception unused) {
                }
                if (str != null) {
                    z = true;
                }
                z = false;
                if (z) {
                    C248116c.A00 = true;
                }
            }
            ADB.A01 = true;
            String stringExtra = intent.getStringExtra("EXTRA_ACTION");
            if (!TextUtils.isEmpty(stringExtra)) {
                ATK.A00 = intent.getBooleanExtra("BrowserLiteIntent.EXTRA_LOGCAT", false);
                ATK.A03("Service got action request: %s", stringExtra);
                char c = 65535;
                switch (stringExtra.hashCode()) {
                    case -1896793051:
                        if (stringExtra.equals("ACTION_CLEAR_DATA")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 270752123:
                        if (stringExtra.equals("ACTION_EXTRACT_HTML_RESOURCE")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1206811370:
                        if (stringExtra.equals(C193418Ps.$const$string(20))) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1258331532:
                        if (stringExtra.equals("ACTION_WARM_UP")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    ATH.A00(this);
                } else if (c == 1) {
                    HashMap hashMap = (HashMap) intent.getSerializableExtra(AnonymousClass0C5.$const$string(43));
                    if (hashMap != null) {
                        boolean booleanExtra = intent.getBooleanExtra("EXTRA_FLUSH_COOKIES", true);
                        ATK.A03("Inject cookies for %d urls, flush %s", Integer.valueOf(hashMap.size()), Boolean.valueOf(booleanExtra));
                        C23600ATg.A01(this, hashMap, booleanExtra);
                    }
                } else if (c != 2) {
                    if (c != 3) {
                        C23538AQi A002 = C23538AQi.A00();
                        synchronized (A002) {
                            if (A002.A00.size() > 0) {
                                asb = (ASB) ((WeakReference) A002.A00.get(0)).get();
                            } else {
                                asb = null;
                            }
                            if (asb != null) {
                                asb.B6F(intent);
                            }
                        }
                        return;
                    }
                    PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) intent.getParcelableExtra("BrowserLiteIntent.EXTRA_PREFETCH_INFO");
                    if (prefetchCacheEntry != null) {
                        synchronized (C23594ASt.class) {
                            if (C23594ASt.A09 == null) {
                                C23594ASt.A09 = new C23594ASt(this);
                            }
                            aSt = C23594ASt.A09;
                        }
                        aSt.A00(prefetchCacheEntry);
                    }
                } else if (intent.getBooleanExtra(AnonymousClass0C5.$const$string(140), false)) {
                    ATJ.A00(getApplicationContext());
                }
            }
        }
    }

    public final void onCreate() {
        int A04 = AnonymousClass0Z0.A04(1294123826);
        AnonymousClass074.A00.block();
        AnonymousClass0XV.A00.block();
        super.onCreate();
        AnonymousClass0Z0.A0B(695558224, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0Z0.A04(271823284);
        super.onStartCommand(intent, i, i2);
        AnonymousClass0Z0.A0B(1991039513, A04);
        return 3;
    }
}
