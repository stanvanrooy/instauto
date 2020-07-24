package p000X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.devsupport.LogBoxModule;

/* renamed from: X.A5T */
public final class A5T implements Runnable {
    public final /* synthetic */ LogBoxModule A00;

    public A5T(LogBoxModule logBoxModule) {
        this.A00 = logBoxModule;
    }

    public final void run() {
        LogBoxModule logBoxModule = this.A00;
        if (logBoxModule.mLogBoxDialog != null) {
            View view = logBoxModule.mReactRootView;
            if (!(view == null || view.getParent() == null)) {
                ((ViewGroup) this.A00.mReactRootView.getParent()).removeView(this.A00.mReactRootView);
            }
            this.A00.mLogBoxDialog.dismiss();
            this.A00.mLogBoxDialog = null;
        }
    }
}
