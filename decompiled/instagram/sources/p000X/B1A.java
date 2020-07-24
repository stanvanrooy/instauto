package p000X;

import android.net.Uri;

/* renamed from: X.B1A */
public final class B1A {
    public final /* synthetic */ B1C A00;

    public B1A(B1C b1c) {
        this.A00 = b1c;
    }

    public final void A00(Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            if (!AnonymousClass1BX.A00(uri2) && uri2.startsWith("https://www.facebook.com/tr/?")) {
                B1C b1c = this.A00;
                C25116B1m.A01(b1c.A00.A02).A05(b1c.A00.A01, Constants.A0k, new B1B(b1c, uri.getQueryParameter("ev"), uri.getQueryParameter("id")));
            }
        }
    }
}
