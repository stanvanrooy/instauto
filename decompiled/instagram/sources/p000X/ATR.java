package p000X;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

/* renamed from: X.ATR */
public final class ATR implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ PermissionRequest A01;
    public final /* synthetic */ BrowserLiteWebChromeClient A02;

    public ATR(BrowserLiteWebChromeClient browserLiteWebChromeClient, Activity activity, PermissionRequest permissionRequest) {
        this.A02 = browserLiteWebChromeClient;
        this.A00 = activity;
        this.A01 = permissionRequest;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.runOnUiThread(new ATQ(this));
    }
}
