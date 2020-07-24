package p000X;

import android.app.Activity;
import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: X.A5S */
public final class A5S implements Runnable {
    public final /* synthetic */ LogBoxModule A00;

    public A5S(LogBoxModule logBoxModule) {
        this.A00 = logBoxModule;
    }

    public final void run() {
        LogBoxModule logBoxModule = this.A00;
        if (logBoxModule.mLogBoxDialog == null && logBoxModule.mReactRootView != null) {
            Activity currentActivity = logBoxModule.getCurrentActivity();
            if (currentActivity == null || currentActivity.isFinishing()) {
                AnonymousClass0CH.A06("ReactNative", "Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
                return;
            }
            LogBoxModule logBoxModule2 = this.A00;
            logBoxModule2.mLogBoxDialog = new A5V(currentActivity, logBoxModule2.mReactRootView);
            this.A00.mLogBoxDialog.setCancelable(false);
            this.A00.mLogBoxDialog.show();
        }
    }
}
