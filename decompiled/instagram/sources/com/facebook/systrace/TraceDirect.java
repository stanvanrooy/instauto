package com.facebook.systrace;

import android.util.Log;
import com.facebook.common.util.TriState;
import p000X.AnonymousClass070;
import p000X.AnonymousClass0YD;
import p000X.AnonymousClass0Yu;
import p000X.C08820Yv;

public class TraceDirect {
    public static final boolean sForceJavaImpl = "true".equals(AnonymousClass070.A02("debug.fbsystrace.force_java"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sTraceLoad = "true".equals(AnonymousClass070.A02("debug.fbsystrace.trace_load"));

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        int i;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                sNativeAvailable = TriState.NO;
            } else {
                if (AnonymousClass0YD.A02()) {
                    synchronized (AnonymousClass0YD.class) {
                        if (AnonymousClass0YD.A00 == null) {
                            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = AnonymousClass0YD.A00.AWG();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    String.format("Attempting to load fbsystrace.so [%d|%d].", new Object[]{Integer.valueOf(sPrevSoLoaderSourcesVersion), Integer.valueOf(i)});
                    if (sTraceLoad) {
                        new Exception();
                    }
                    try {
                        AnonymousClass0YD.A01("fbsystrace");
                        sNativeAvailable = TriState.YES;
                        nativeSetEnabledTags(AnonymousClass070.A00("debug.fbsystrace.tags"));
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            return false;
        }
        return true;
    }

    public static void asyncTraceBegin(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceBegin(str, i, j);
            return;
        }
        AnonymousClass0Yu r3 = new AnonymousClass0Yu('S');
        r3.A00();
        r3.A03(str);
        r3.A02("<0>");
        if (j != 0) {
            r3.A02("<T");
            r3.A02(Long.toString(j));
            r3.A02(">");
        }
        r3.A01(i);
        C08820Yv.A00(r3.toString());
    }

    public static void asyncTraceEnd(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceEnd(str, i, j);
            return;
        }
        AnonymousClass0Yu r3 = new AnonymousClass0Yu('F');
        r3.A00();
        r3.A03(str);
        if (j != 0) {
            r3.A02("<T");
            r3.A02(Long.toString(j));
            r3.A02(">");
        }
        r3.A01(i);
        C08820Yv.A00(r3.toString());
    }
}
