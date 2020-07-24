package p000X;

import android.webkit.JavascriptInterface;

/* renamed from: X.B2B */
public final class B2B {
    public final C25125B2b A00;

    @JavascriptInterface
    public void log(String str) {
        try {
            this.A00.B9u(str);
        } catch (Exception e) {
            AnonymousClass0DB.A05(B2B.class, "Log message failed", e);
        }
    }

    public B2B(C25125B2b b2b) {
        this.A00 = b2b;
    }
}
