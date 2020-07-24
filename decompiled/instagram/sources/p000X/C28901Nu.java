package p000X;

import android.net.Uri;

/* 'enum' modifier removed */
/* renamed from: X.1Nu  reason: invalid class name and case insensitive filesystem */
public final class C28901Nu extends C28841Nk {
    public final boolean A01(String str, AnonymousClass0C1 r5) {
        try {
            return super.A01(str, r5) && Uri.parse(str).getQueryParameter("bloks_app_id") != null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return false;
        }
    }

    public C28901Nu() {
        super("RUN_BLOKS_ACTION", 73, "instagram://run_bloks_action");
    }
}
