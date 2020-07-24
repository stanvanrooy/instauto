package p000X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.AQL */
public final class AQL implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;

    public AQL(BrowserLiteFragment browserLiteFragment) {
        this.A00 = browserLiteFragment;
    }

    public final void run() {
        if (!this.A00.A0u.isEmpty()) {
            ((AQ8) this.A00.A0u.peek()).A0N();
        }
    }
}
