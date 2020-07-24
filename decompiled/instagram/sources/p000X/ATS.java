package p000X;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.PermissionRequest;
import com.facebook.browser.lite.BrowserLiteWebChromeClient;

/* renamed from: X.ATS */
public final class ATS implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ PermissionRequest A01;
    public final /* synthetic */ BrowserLiteWebChromeClient A02;

    public ATS(BrowserLiteWebChromeClient browserLiteWebChromeClient, Activity activity, PermissionRequest permissionRequest) {
        this.A02 = browserLiteWebChromeClient;
        this.A00 = activity;
        this.A01 = permissionRequest;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00.runOnUiThread(new ATU(this));
    }
}
