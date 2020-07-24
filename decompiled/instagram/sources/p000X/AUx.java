package p000X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.AUx */
public final class AUx implements Application.ActivityLifecycleCallbacks {
    public Object A00;
    public Activity A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.A01 == activity) {
            this.A01 = null;
            this.A02 = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        boolean z;
        if (this.A02 && !this.A04 && !this.A03) {
            Object obj = this.A00;
            try {
                Object obj2 = AnonymousClass2WT.A02.get(activity);
                if (obj2 != obj) {
                    z = false;
                } else {
                    AnonymousClass0ZA.A0F(AnonymousClass2WT.A00, new C23634AUw(AnonymousClass2WT.A01.get(activity), obj2), -1754545249);
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
                z = false;
            }
            if (z) {
                this.A04 = true;
                this.A00 = null;
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.A01 == activity) {
            this.A03 = true;
        }
    }

    public AUx(Activity activity) {
        this.A01 = activity;
    }
}
