package p000X;

import android.webkit.ValueCallback;

/* renamed from: X.AV7 */
public final class AV7 implements Runnable {
    public final /* synthetic */ AV6 A00;
    public final /* synthetic */ String A01;

    public AV7(AV6 av6, String str) {
        this.A00 = av6;
        this.A01 = str;
    }

    public final void run() {
        AV6 av6 = this.A00;
        String str = this.A01;
        String A0E = AnonymousClass000.A0E("javascript: ", str);
        try {
            av6.evaluateJavascript(str, (ValueCallback) null);
        } catch (IllegalStateException unused) {
            av6.loadUrl(A0E);
        }
    }
}
