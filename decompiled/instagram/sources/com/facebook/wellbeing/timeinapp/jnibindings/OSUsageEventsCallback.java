package com.facebook.wellbeing.timeinapp.jnibindings;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import p000X.AnonymousClass144;

public class OSUsageEventsCallback {
    public static Method mGetAppStandbyBucketMethod;
    public final Method mQueryEventsForSelfMethod;
    public boolean mShouldFetchUsageEvents;
    public final UsageStatsManager mUsageStatsManager;

    public static boolean areUsageEventsAvailable() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public String getOSUsageEvents(long j, long j2) {
        UsageStatsManager usageStatsManager;
        Method method;
        if (!this.mShouldFetchUsageEvents || (usageStatsManager = this.mUsageStatsManager) == null || (method = this.mQueryEventsForSelfMethod) == null) {
            return null;
        }
        return AnonymousClass144.A00(method, usageStatsManager, j, j2);
    }

    public OSUsageEventsCallback(Context context) {
        Method method;
        UsageStatsManager usageStatsManager = null;
        if (Build.VERSION.SDK_INT >= 28) {
            method = AnonymousClass144.A01();
            if (method != null) {
                usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                this.mShouldFetchUsageEvents = true;
            }
        } else {
            method = null;
        }
        this.mQueryEventsForSelfMethod = method;
        this.mUsageStatsManager = usageStatsManager;
    }
}
