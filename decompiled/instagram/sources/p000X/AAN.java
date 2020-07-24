package p000X;

import android.app.Activity;
import android.webkit.JavascriptInterface;

/* renamed from: X.AAN */
public final class AAN {
    public Activity A00;
    public Runnable A01;

    @JavascriptInterface
    public void interfacedUIMethod() {
        this.A00.runOnUiThread(this.A01);
    }

    public AAN(Runnable runnable, Activity activity) {
        this.A01 = runnable;
        this.A00 = activity;
    }
}
