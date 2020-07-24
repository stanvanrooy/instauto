package p000X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0dK  reason: invalid class name and case insensitive filesystem */
public abstract class C10450dK implements C07640Tw {
    public BroadcastReceiver A00;
    public final C07630Tv A01;
    public final Integer A02;
    public final Context A03;
    public final C10960eC A04;
    public volatile String A05;
    public volatile String A06;

    public abstract String A00();

    public abstract String A01();

    public abstract void A05(String str, String str2);

    public final boolean A06(String str) {
        if (str == null) {
            return true;
        }
        if (!str.startsWith("https://")) {
            str = AnonymousClass000.A0E("https://", str);
        }
        try {
            Uri A002 = C08480Xf.A00(str);
            for (String str2 : A02()) {
                String host = A002.getHost();
                boolean z = false;
                if (host != null && (host.equalsIgnoreCase(str2) || host.endsWith(AnonymousClass000.A0E(".", str2)))) {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public Set A02() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{ReactWebViewManager.FACEBOOK_DOMAIN, "workplace.com", "pushnotifs.com"})));
    }

    public void A03() {
        if (this.A00 == null) {
            AnonymousClass0VG r3 = new AnonymousClass0VG(this);
            this.A00 = r3;
            this.A03.registerReceiver(r3, new IntentFilter(A00()));
        }
    }

    public final void A04() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A03.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                AnonymousClass0DB.A0N(A01(), e, "Failed to unregister broadcast receiver");
            }
            this.A00 = null;
        }
    }

    public final String AFr() {
        return this.A05;
    }

    public final String AQS() {
        return this.A06;
    }

    public C10450dK(Context context, C07630Tv r2, Integer num, C10960eC r4) {
        this.A03 = context;
        this.A01 = r2;
        this.A02 = num;
        this.A04 = r4;
    }
}
