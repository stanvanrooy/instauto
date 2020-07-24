package p000X;

import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: X.A5W */
public final class A5W implements Runnable {
    public final /* synthetic */ LogBoxModule A00;

    public A5W(LogBoxModule logBoxModule) {
        this.A00 = logBoxModule;
    }

    public final void run() {
        LogBoxModule logBoxModule = this.A00;
        if (logBoxModule.mReactRootView != null) {
            logBoxModule.mReactRootView = null;
        }
    }
}
