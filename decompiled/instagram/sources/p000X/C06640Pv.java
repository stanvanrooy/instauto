package p000X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;

/* renamed from: X.0Pv  reason: invalid class name and case insensitive filesystem */
public final class C06640Pv implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C05850Mk A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C06640Pv(C05850Mk r1) {
        this.A00 = r1;
    }

    public final void onActivityStarted(Activity activity) {
        C05850Mk r3 = this.A00;
        int i = r3.A00 + 1;
        r3.A00 = i;
        if (i == 1 && !r3.A02) {
            r3.A03 = true;
            r3.A04 = true;
            AnonymousClass0ZA.A0E(r3.A01, r3.A07, -982938821);
            C05850Mk.A00(this.A00, "foreground");
        }
    }

    public final void onActivityStopped(Activity activity) {
        this.A00.A02 = activity.isChangingConfigurations();
        C05850Mk r1 = this.A00;
        int i = r1.A00 - 1;
        r1.A00 = i;
        if (i == 0 && !r1.A02) {
            r1.A03 = false;
            AnonymousClass0ZA.A0E(r1.A01, r1.A06, -24473131);
            C05850Mk.A00(this.A00, AppStateModule.APP_STATE_BACKGROUND);
        }
    }
}
