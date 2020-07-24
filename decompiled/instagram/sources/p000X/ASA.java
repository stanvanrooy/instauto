package p000X;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.RelativeLayout;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.widgets.progressbar.BrowserLiteProgressBar;
import com.facebook.browser.lite.extensions.watchandbrowse.BrowserLiteHeaderLoadingScreen;

/* renamed from: X.ASA */
public final class ASA extends ASL implements AQM, AQP, C23569ARo, AQU {
    public BrowserLiteProgressBar A00;
    public BrowserLiteHeaderLoadingScreen A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = true;
    public boolean A05 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1.getBoolean("watch_and_browse_is_in_watch_and_browse", false) == false) goto L_0x0013;
     */
    public final boolean A00() {
        boolean z;
        ASB asb;
        ARQ AHB;
        Bundle extras = this.A01.getExtras();
        if (extras != null) {
            z = true;
        }
        z = false;
        if (!z || (asb = this.A03) == null || (AHB = asb.AHB()) == null) {
            return false;
        }
        if (!(asb == null || AHB == null || AHB == null)) {
            Intent intent = this.A01;
            if (intent == null || !intent.getBooleanExtra("IN_WATCH_AND_MORE_OVERLAY", false)) {
                AHB.A00(C0003R.layout.watch_and_browse_lite_chrome, "watch_and_browse");
                AHB.A01.setLayoutResource(C0003R.layout.default_le_browser_chrome);
                ARt aRt = (ARt) AHB.A01.inflate();
                AHB.A03 = aRt;
                aRt.setControllers(AHB.A04, AHB.A05);
                aRt.AdS();
                ((RelativeLayout) AHB.A03).bringToFront();
                ((RelativeLayout) AHB.A03).setVisibility(8);
                return true;
            }
            AHB.A00(C0003R.layout.watch_and_browse_in_overlay_lite_chrome, (String) null);
        }
        return true;
    }

    public final void BDY(AQ8 aq8, String str) {
        Intent intent = this.A01;
        if (intent != null && this.A03 != null && intent.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse") && this.A01 != null && !this.A04) {
            this.A03.BlN(0);
        }
    }

    public final void BDb(AQ8 aq8, long j) {
        Intent intent = this.A01;
        if (intent != null && intent.getExtras() != null && this.A01.getExtras().getBoolean("watch_and_browse_is_in_watch_and_browse") && this.A04) {
            if (this.A01 != null) {
                BrowserLiteProgressBar browserLiteProgressBar = (BrowserLiteProgressBar) this.A02.findViewById(0);
                BrowserLiteHeaderLoadingScreen browserLiteHeaderLoadingScreen = this.A01;
                ObjectAnimator objectAnimator = browserLiteHeaderLoadingScreen.A00;
                if (objectAnimator != null && objectAnimator.isRunning()) {
                    browserLiteHeaderLoadingScreen.A00.cancel();
                }
                browserLiteProgressBar.setProgress(browserLiteProgressBar.getMax());
                AnonymousClass0ZA.A09(new Handler(Looper.getMainLooper()), new C23291AGq(this), 100, 1227537689);
            }
            this.A04 = false;
        }
    }

    public final void destroy() {
        ASB asb = this.A03;
        if (asb != null) {
            asb.AYf();
        }
        this.A01 = null;
        this.A04 = true;
        this.A00 = null;
        this.A05 = true;
        this.A03 = false;
        this.A02 = false;
        super.destroy();
    }

    public final void B0Q(AQ8 aq8) {
    }
}
