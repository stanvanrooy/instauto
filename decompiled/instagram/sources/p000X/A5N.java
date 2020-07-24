package p000X;

import android.app.Activity;
import com.facebook.react.modules.statusbar.StatusBarModule;

/* renamed from: X.A5N */
public final class A5N implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ StatusBarModule A01;
    public final /* synthetic */ boolean A02;

    public A5N(StatusBarModule statusBarModule, boolean z, Activity activity) {
        this.A01 = statusBarModule;
        this.A02 = z;
        this.A00 = activity;
    }

    public final void run() {
        if (this.A02) {
            this.A00.getWindow().addFlags(1024);
            this.A00.getWindow().clearFlags(2048);
            return;
        }
        this.A00.getWindow().addFlags(2048);
        this.A00.getWindow().clearFlags(1024);
    }
}
