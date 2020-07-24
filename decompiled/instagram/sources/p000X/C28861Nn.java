package p000X;

import android.net.Uri;

/* 'enum' modifier removed */
/* renamed from: X.1Nn  reason: invalid class name and case insensitive filesystem */
public final class C28861Nn extends C28841Nk {
    public final boolean A01(String str, AnonymousClass0C1 r5) {
        try {
            return (!super.A01(str, r5) || Uri.parse(str).getQueryParameter("id") == null || Uri.parse(str).getQueryParameter("referrer") == null) ? false : true;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return false;
        }
    }

    public C28861Nn() {
        super("APP_INSTALL", 2, "market://details");
    }
}
