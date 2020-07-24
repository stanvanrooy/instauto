package p000X;

import android.net.Uri;

/* 'enum' modifier removed */
/* renamed from: X.1Nr  reason: invalid class name and case insensitive filesystem */
public final class C28891Nr extends C28841Nk {
    public final boolean A01(String str, AnonymousClass0C1 r5) {
        try {
            return super.A01(str, r5) && Uri.parse(str).getQueryParameter("qp_h") != null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return false;
        }
    }

    public C28891Nr() {
        super("REQUEST_ARBITRARY_API", 51, "instagram://api/");
    }
}
