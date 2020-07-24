package p000X;

import android.view.View;
import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: X.A5Q */
public final class A5Q implements Runnable {
    public final /* synthetic */ LogBoxModule A00;

    public A5Q(LogBoxModule logBoxModule) {
        this.A00 = logBoxModule;
    }

    public final void run() {
        C228089rf r1;
        LogBoxModule logBoxModule = this.A00;
        if (logBoxModule.mReactRootView == null && (r1 = logBoxModule.mDevSupportManager) != null) {
            View AAx = r1.AAx(LogBoxModule.NAME);
            logBoxModule.mReactRootView = AAx;
            if (AAx == null) {
                AnonymousClass0CH.A06("ReactNative", "Unable to launch logbox because react was unable to create the root view");
            }
        }
    }
}
