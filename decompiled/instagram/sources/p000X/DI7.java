package p000X;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.DI7 */
public final class DI7 extends DIC {
    public final /* synthetic */ DI8 this$0;

    public DI7(DI8 di8) {
        this.this$0 = di8;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            ((AnonymousClass1B4) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).A00 = this.this$0.A00;
        }
    }

    public void onActivityPaused(Activity activity) {
        DI8 di8 = this.this$0;
        int i = di8.A01 - 1;
        di8.A01 = i;
        if (i == 0) {
            AnonymousClass0ZA.A09(di8.A03, di8.A04, 700, 1243086173);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new C45441xt(this));
    }

    public void onActivityStopped(Activity activity) {
        DI8 di8 = this.this$0;
        int i = di8.A02 - 1;
        di8.A02 = i;
        if (i == 0 && di8.A05) {
            di8.A07.A08(C1662977d.ON_STOP);
            di8.A06 = true;
        }
    }
}
