package p000X;

import android.app.Activity;
import android.view.View;
import com.facebook.react.modules.statusbar.StatusBarModule;

/* renamed from: X.A5M */
public final class A5M implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ StatusBarModule A01;
    public final /* synthetic */ String A02;

    public A5M(StatusBarModule statusBarModule, Activity activity, String str) {
        this.A01 = statusBarModule;
        this.A00 = activity;
        this.A02 = str;
    }

    public final void run() {
        int i;
        View decorView = this.A00.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if ("dark-content".equals(this.A02)) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & -8193;
        }
        decorView.setSystemUiVisibility(i);
    }
}
