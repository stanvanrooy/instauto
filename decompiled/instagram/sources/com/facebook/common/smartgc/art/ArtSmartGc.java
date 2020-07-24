package com.facebook.common.smartgc.art;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0KU;
import p000X.AnonymousClass0Y1;
import p000X.C04070Ch;
import p000X.C04080Ci;
import p000X.C04090Cj;
import p000X.C179837m6;

public class ArtSmartGc implements C04070Ch {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final Object LOCK = new Object();
    public static Method sConcurrentGc;
    public static String sDataDir;
    public static Boolean sHadErrorInitalizing;
    public static boolean sReflectionInited;
    public static Method sRequestConcurrentGc;
    public static boolean sSetUpHookInited;
    public static C04080Ci sSetupSmartGcConfig;
    public static Object sVmRuntimeInstance;

    public static native void nativeBadTimeToDoGc(boolean z, boolean z2, boolean z3);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize(String str, int i, int i2, int i3, boolean z, boolean z2);

    public static native void nativeNotAsBadTimeToDoGc();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (android.os.Build.VERSION.SDK_INT > 26) goto L_0x000d;
     */
    static {
        boolean z;
        if (AnonymousClass0Bq.A00) {
            z = true;
        }
        z = false;
        CAN_RUN_ON_THIS_PLATFORM = z;
        if (z) {
            try {
                Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                Method declaredMethod = cls.getDeclaredMethod("getRuntime", new Class[0]);
                declaredMethod.setAccessible(true);
                sVmRuntimeInstance = declaredMethod.invoke((Object) null, new Object[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("concurrentGC", new Class[0]);
                sConcurrentGc = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("requestConcurrentGC", new Class[0]);
                sRequestConcurrentGc = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sReflectionInited = true;
            } catch (Exception unused) {
                sReflectionInited = false;
            }
        }
    }

    public static void init() {
        if (sHadErrorInitalizing == null) {
            synchronized (LOCK) {
                if (sHadErrorInitalizing == null) {
                    boolean z = false;
                    if (!CAN_RUN_ON_THIS_PLATFORM) {
                        sHadErrorInitalizing = false;
                    } else if (sDataDir != null) {
                        try {
                            AnonymousClass0Y1.A08("artsmartgc");
                            int[] A00 = C179837m6.A00("(HeapTaskDaemon)", "(GCDaemon)", "(HeapTrimmerDaem)");
                            if (!nativeInitialize(sDataDir, A00[0], A00[1], A00[2], false, false)) {
                                z = true;
                            }
                            sHadErrorInitalizing = Boolean.valueOf(z);
                        } catch (UnsatisfiedLinkError e) {
                            Log.e("ArtSmartGc", "Cannot Init ART Smart GC", e);
                            sHadErrorInitalizing = true;
                        }
                    } else {
                        throw new IllegalStateException("setupHook must be called first");
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void badTimeToDoGc(C04090Cj r4) {
        AnonymousClass0KU r42 = (AnonymousClass0KU) r4;
        if (CAN_RUN_ON_THIS_PLATFORM) {
            init();
            if (!sHadErrorInitalizing.booleanValue()) {
                nativeBadTimeToDoGc(r42.A00, r42.A02, r42.A01);
                return;
            }
            return;
        }
        throw new IllegalStateException("This platform is not supported");
    }

    public void notAsBadTimeToDoGc() {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            init();
            if (!sHadErrorInitalizing.booleanValue()) {
                nativeNotAsBadTimeToDoGc();
                return;
            }
            return;
        }
        throw new IllegalStateException("This platform is not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r1 != false) goto L_0x000f;
     */
    public void setUpHook(Context context, C04080Ci r4) {
        boolean z;
        if (!sSetUpHookInited) {
            sDataDir = context.getDir("artsmartgc", 0).getAbsolutePath();
            if (r4 == null) {
                r4 = new C04080Ci();
            }
            sSetupSmartGcConfig = r4;
            sSetUpHookInited = true;
        } else if (r4 != null) {
            C04080Ci r0 = sSetupSmartGcConfig;
            if (r0 != null) {
                boolean z2 = r0.A00;
                z = false;
            }
            z = true;
            if (z) {
                sSetupSmartGcConfig = r4;
            }
        }
    }
}
