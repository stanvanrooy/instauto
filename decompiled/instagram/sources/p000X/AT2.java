package p000X;

import android.os.Handler;
import android.os.Message;
import com.facebook.browser.lite.BrowserLiteActivity;

/* renamed from: X.AT2 */
public final class AT2 extends Handler {
    public final BrowserLiteActivity A00;
    public final boolean A01;
    public final boolean A02;

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.A00.A02(4, (String) message.obj);
        }
    }

    public AT2(BrowserLiteActivity browserLiteActivity) {
        this.A00 = browserLiteActivity;
        this.A01 = browserLiteActivity.getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_HOT_INSTANCE_ENABLED", false);
        this.A02 = browserLiteActivity.getIntent().getBooleanExtra("BrowserLiteIntent.InstagramExtras.EXTRA_HOT_INSTANCE_SKIP_HIDE_VIEW_WHEN_CLOSE_ENABLED", false);
    }
}
