package p000X;

import android.os.Bundle;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.ABq */
public final class ABq implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ C23189ABt A02;
    public final /* synthetic */ DialogModule A03;

    public ABq(DialogModule dialogModule, C23189ABt aBt, Bundle bundle, Callback callback) {
        this.A03 = dialogModule;
        this.A02 = aBt;
        this.A00 = bundle;
        this.A01 = callback;
    }

    public final void run() {
        C23188ABs aBs;
        C23189ABt aBt = this.A02;
        Bundle bundle = this.A00;
        Callback callback = this.A01;
        C228039ra.A00();
        C23189ABt.A00(aBt);
        if (callback != null) {
            aBs = new C23188ABs(aBt.A02, callback);
        } else {
            aBs = null;
        }
        C23187ABr aBr = new C23187ABr(aBs, bundle);
        if (!aBt.A02.mIsInForeground || aBt.A01.A0z()) {
            aBt.A00 = aBr;
            return;
        }
        if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
            aBr.A07(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
        }
        aBr.A06(aBt.A01, DialogModule.FRAGMENT_TAG);
    }
}
