package com.facebook.common.dextricks;

import android.util.Log;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.HashMap;
import p000X.AnonymousClass0Bq;

public final class ClassFailureStapler extends DalvikInternals.ClassInitFailureHook {
    public static final String TAG = "ClassFailureStapler";
    public final HashMap mSeenFailures = new HashMap();

    public synchronized void onClassInitFailure(Class cls, Throwable th) {
        if (th instanceof NoClassDefFoundError) {
            Throwable th2 = (Throwable) this.mSeenFailures.get(cls);
            if (th2 != null) {
                th.initCause(th2);
            }
        } else {
            this.mSeenFailures.put(cls, th);
        }
    }

    public static void install() {
        DalvikInternals.setClassInitFailureHook(new ClassFailureStapler());
    }

    public static void tryInstall() {
        if (!AnonymousClass0Bq.A00) {
            try {
                install();
            } catch (Throwable th) {
                Log.w(TAG, "failed to install class failure stapler; proceeding", th);
            }
        }
    }
}
