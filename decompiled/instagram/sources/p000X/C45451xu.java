package p000X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.1xu  reason: invalid class name and case insensitive filesystem */
public final class C45451xu implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        AnonymousClass1B4.A01(activity, C1662977d.ON_STOP);
    }
}
