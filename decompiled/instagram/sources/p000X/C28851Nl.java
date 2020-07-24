package p000X;

import android.net.Uri;

/* 'enum' modifier removed */
/* renamed from: X.1Nl  reason: invalid class name and case insensitive filesystem */
public final class C28851Nl extends C28841Nk {
    public final boolean A01(String str, AnonymousClass0C1 r5) {
        try {
            return (!super.A01(str, r5) || Uri.parse(str).getQueryParameter("package_name") == null || Uri.parse(str).getQueryParameter("referrer") == null) ? false : true;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return false;
        }
    }

    public C28851Nl() {
        super("OPEN_PLAY_STORE_LINK", 1, "instagram://play_store");
    }
}
