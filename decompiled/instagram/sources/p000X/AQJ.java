package p000X;

import android.webkit.DownloadListener;
import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.AQJ */
public final class AQJ implements DownloadListener {
    public final /* synthetic */ BrowserLiteFragment A00;
    public final /* synthetic */ AQ8 A01;

    public AQJ(BrowserLiteFragment browserLiteFragment, AQ8 aq8) {
        this.A00 = browserLiteFragment;
        this.A01 = aq8;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.A00.A0J(str);
        if (!str.equals(this.A01.A14())) {
            return;
        }
        if (this.A01.A18()) {
            this.A01.A0J();
        } else if (this.A00.A0u.size() > 1) {
            BrowserLiteFragment.A08(this.A00);
        } else {
            this.A00.A8u(4, str);
        }
    }
}
