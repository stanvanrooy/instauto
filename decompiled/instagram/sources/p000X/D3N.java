package p000X;

import android.net.Uri;

/* renamed from: X.D3N */
public final class D3N extends Exception {
    /* JADX WARNING: Illegal instructions before constructor call */
    public D3N(Uri uri, Exception exc) {
        super(r1, r4);
        String A0E;
        C2101594l r4;
        if (uri == null) {
            A0E = "URL: Unknown";
        } else {
            A0E = AnonymousClass000.A0E("URL: ", uri.toString());
        }
        if (exc instanceof C2101594l) {
            r4 = (C2101594l) exc;
        } else {
            r4 = new C2101594l((Throwable) exc);
        }
    }
}
