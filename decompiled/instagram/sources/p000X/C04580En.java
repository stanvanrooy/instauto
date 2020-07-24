package p000X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: X.0En  reason: invalid class name and case insensitive filesystem */
public final class C04580En implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ AnonymousClass0aU A00;

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public C04580En(AnonymousClass0aU r1) {
        this.A00 = r1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_CREATED);
            AnonymousClass0aU.A01(this.A00);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_DESTROYED);
            AnonymousClass0aU.A01(this.A00);
        }
    }

    public final void onActivityPaused(Activity activity) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_PAUSED);
            AnonymousClass0aU.A01(this.A00);
        }
    }

    public final void onActivityResumed(Activity activity) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_RESUMED);
            AnonymousClass0aU.A01(this.A00);
        }
    }

    public final void onActivityStarted(Activity activity) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_STARTED);
            AnonymousClass0aU.A01(this.A00);
        }
    }

    public final void onActivityStopped(Activity activity) {
        synchronized (this.A00.A06) {
            AnonymousClass0aU.A00(this.A00);
            this.A00.A04.A00(activity, AnonymousClass04W.ACTIVITY_STOPPED);
            AnonymousClass0aU.A01(this.A00);
        }
    }
}
