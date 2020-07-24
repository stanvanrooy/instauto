package com.instagram.publisher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0XY;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZP;
import p000X.AnonymousClass1BH;
import p000X.C06180Ob;
import p000X.C06190Oc;
import p000X.C06590Pq;
import p000X.C241613n;

public class CopypastaConnectivityChangeReceiver extends BroadcastReceiver {
    public static final C241613n A01 = new C241613n(4);
    public final C06180Ob A00 = C06190Oc.A00;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean z;
        int A012 = AnonymousClass0Z0.A01(-1908699172);
        if (!AnonymousClass0XY.A01().A00(context, this, intent)) {
            i = 2036303088;
        } else {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (A01.A00() > 0) {
                    C241613n r2 = A01;
                    if (elapsedRealtime >= ((Long) r2.A02(r2.A00() - 1)).longValue() + ArLinkScanControllerImpl.ERROR_DELAY_MS) {
                        if (A01.A00() == 4) {
                            if (elapsedRealtime >= ((Long) A01.A02(0)).longValue() + 600000) {
                                A01.A01();
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                        boolean z2 = true;
                        if (1 != activeNetworkInfo.getType()) {
                            z2 = false;
                        }
                        PowerManager.WakeLock wakeLock = CopypastaUploadRetryService.A01;
                        if (wakeLock != null) {
                            AnonymousClass0ZP.A01(wakeLock);
                        }
                        C06590Pq A013 = AnonymousClass0J1.A01(this);
                        if (A013.AgN()) {
                            AnonymousClass1BH.A04(new Intent(context, CopypastaUploadRetryService.class).setAction("Connected").putExtra("ConnectedToWifi", z2).putExtra("IgSessionManager.SESSION_TOKEN_KEY", A013.getToken()), context);
                        }
                    }
                }
                A01.A05(Long.valueOf(elapsedRealtime));
                z = false;
                if (!z) {
                }
            }
            i = -933721723;
        }
        AnonymousClass0Z0.A0E(intent, i, A012);
    }
}
