package com.facebook.wellbeing.timeinapp.jnibindings;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ScheduledExecutorService;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass13G;

public class TimeInAppControllerWrapper {
    public final HybridData mHybridData = initHybrid();

    private native void dispatchHybrid(int i);

    private native void initControllerHybrid(ScheduledExecutorService scheduledExecutorService, SQLiteDatabase sQLiteDatabase, XAnalyticsHolder xAnalyticsHolder, int i, int i2);

    public static native HybridData initHybrid();

    private native void queryIntervalsHybrid(long j, long j2, TimeInAppIntervalList timeInAppIntervalList);

    public native int[] getDailyTimeInApp(long j);

    public native long getTimeInApp(long j, long j2);

    public void initController(ScheduledExecutorService scheduledExecutorService, String str, XAnalyticsHolder xAnalyticsHolder, int i, int i2) {
        try {
            initControllerHybrid(scheduledExecutorService, SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null), xAnalyticsHolder, i, i2);
        } catch (SQLiteException unused) {
        }
    }

    public native void setOSUsageEventsCallback(OSUsageEventsCallback oSUsageEventsCallback);

    public native void setReminder(TimeInAppReminder timeInAppReminder, int i);

    static {
        AnonymousClass0Y1.A08("timeinapp-jni");
    }

    public void dispatch(AnonymousClass13G r2) {
        dispatchHybrid(r2.ordinal());
    }
}
