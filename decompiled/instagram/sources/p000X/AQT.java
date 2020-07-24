package p000X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.AQT */
public final class AQT implements Runnable {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ AQ8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public AQT(BrowserLiteFragment browserLiteFragment, String str, AQ8 aq8, String str2) {
        this.A00 = browserLiteFragment;
        this.A03 = str;
        this.A01 = aq8;
        this.A02 = str2;
    }

    public final void run() {
        if (this.A03.equals(this.A01.A14())) {
            this.A01.A16(this.A02);
        }
    }
}
