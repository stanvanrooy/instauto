package com.facebook.common.dextricks.classtracing.logger;

import android.os.Build;
import com.facebook.common.dextricks.classid.ClassId;
import java.util.Arrays;
import java.util.HashMap;
import p000X.AnonymousClass0BH;
import p000X.AnonymousClass0KG;
import p000X.AnonymousClass0Y1;
import p000X.C08800Yq;

public final class ClassTracingLogger {
    public static final Class TAG = ClassTracingLogger.class;
    public static volatile boolean sClassNameTracingEnabled;
    public static volatile boolean sEnabled;
    public static volatile boolean sEverEnabled;
    public static volatile boolean sLoggerEnabled;
    public static volatile boolean sSystraceEnabled;

    public static void logNonClassLoad(int i, int i2) {
        ClassTracingLoggerNativeHolder.classLoadStarted((String) null);
        ClassTracingLoggerNativeHolder.classLoaded((((long) i2) << 32) | (((long) i) & 4294967295L));
    }

    static {
        C08800Yq.A00(new AnonymousClass0KG());
    }

    public static void beginClassLoad(String str) {
        if (sEnabled && ClassId.sInitialized) {
            ClassTracingLoggerNativeHolder.classLoadStarted(str);
        }
    }

    public static void classLoaded(Class cls) {
        boolean z;
        long classId;
        if (sEnabled && (z = ClassId.sInitialized)) {
            if (!z) {
                classId = -1;
            } else {
                classId = ClassId.getClassId(cls);
                if ((-281474976710656L & classId) == 0) {
                    Thread currentThread = Thread.currentThread();
                    if (currentThread != null) {
                        classId |= (currentThread.getId() & 65535) << 48;
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            ClassTracingLoggerNativeHolder.classLoaded(classId);
            if (sClassNameTracingEnabled) {
                String simpleName = cls.getSimpleName();
                int length = simpleName.length();
                if (length > 4) {
                    simpleName = simpleName.substring(length - 4);
                } else if (length <= 0) {
                    return;
                }
                int i = 0;
                for (char c : simpleName.toCharArray()) {
                    i = (i << 8) + c;
                }
                logNonClassLoad(1672139416, i);
            }
        }
    }

    public static void classNotFound() {
        if (sEnabled && ClassId.sInitialized) {
            ClassTracingLoggerNativeHolder.classLoadCancelled();
        }
    }

    public static AnonymousClass0BH getClassUsageData() {
        long[] copyOf;
        if (!sEverEnabled) {
            copyOf = new long[0];
        } else {
            long[] loadedClassIds = ClassTracingLoggerNativeHolder.loadedClassIds();
            HashMap hashMap = new HashMap();
            int i = 0;
            boolean z = false;
            for (long j : loadedClassIds) {
                if (j != -1) {
                    int i2 = (int) (j & 4294967295L);
                    if (i2 != 1505373456 && i2 != 1215735889) {
                        z = true;
                    } else if (!hashMap.containsKey(Long.valueOf(j)) || z) {
                        z = false;
                    }
                    int i3 = i + 1;
                    loadedClassIds[i] = j;
                    if (i2 == 1505373456 || i2 == 1215735889) {
                        hashMap.put(Long.valueOf(j), true);
                    }
                    i = i3;
                }
            }
            copyOf = Arrays.copyOf(loadedClassIds, i);
        }
        Thread[] threadArr = new Thread[(Thread.activeCount() + 20)];
        int enumerate = Thread.enumerate(threadArr);
        HashMap hashMap2 = new HashMap();
        for (int i4 = 0; i4 < enumerate; i4++) {
            hashMap2.put(Long.valueOf(threadArr[i4].getId()), threadArr[i4].getName());
        }
        return new AnonymousClass0BH(copyOf, hashMap2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (sSystraceEnabled != false) goto L_0x000c;
     */
    public static void initialize() {
        boolean z;
        boolean z2 = sEnabled;
        if (!sLoggerEnabled) {
            z = false;
        }
        z = true;
        int i = Build.VERSION.SDK_INT;
        if (i == 26 || i == 27) {
            sClassNameTracingEnabled = true;
        }
        if (z || z2) {
            sEverEnabled = true;
            boolean z3 = !z2;
            boolean z4 = sLoggerEnabled;
            boolean z5 = sSystraceEnabled;
            if (z3) {
                try {
                    AnonymousClass0Y1.A08("classtracing");
                } catch (UnsatisfiedLinkError unused) {
                    z = false;
                }
            }
            ClassTracingLoggerNativeHolder.configureTracing(z4, z5);
            z = true;
        }
        sEnabled = z;
    }

    public static boolean isEnabled() {
        if (!sEnabled || !ClassId.sInitialized) {
            return false;
        }
        return true;
    }
}
