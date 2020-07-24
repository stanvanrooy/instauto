package p000X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import com.facebook.forker.Process;
import com.facebook.react.modules.statusbar.StatusBarModule;

/* renamed from: X.A5J */
public final class A5J extends C228069rd {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ StatusBarModule A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A5J(StatusBarModule statusBarModule, A3N a3n, Activity activity, boolean z, int i) {
        super(a3n);
        this.A02 = statusBarModule;
        this.A01 = activity;
        this.A03 = z;
        this.A00 = i;
    }

    public final void A00() {
        this.A01.getWindow().addFlags(Process.WAIT_RESULT_TIMEOUT);
        if (this.A03) {
            int statusBarColor = this.A01.getWindow().getStatusBarColor();
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(statusBarColor), Integer.valueOf(this.A00)});
            ofObject.addUpdateListener(new A5K(this));
            ofObject.setDuration(300).setStartDelay(0);
            ofObject.start();
            return;
        }
        this.A01.getWindow().setStatusBarColor(this.A00);
    }
}
