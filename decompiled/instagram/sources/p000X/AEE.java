package p000X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.AEE */
public final class AEE implements Application.ActivityLifecycleCallbacks {
    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (AED.A01.containsKey(activity)) {
            throw new IllegalStateException("The MountContentPools has a reference to an activity that has just been created");
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        boolean z;
        Map map = AED.A01;
        map.remove(activity);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Context context = (Context) ((Map.Entry) it.next()).getKey();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    z = false;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
                if (context == activity) {
                    z = true;
                    break;
                }
            }
            if (z) {
                it.remove();
            }
        }
        WeakHashMap weakHashMap = AED.A02;
        Context context2 = activity;
        while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        weakHashMap.put(context2, true);
    }
}
