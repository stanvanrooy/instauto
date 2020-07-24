package com.facebook.acra.anr.sigquit;

import android.os.Build;
import android.os.Handler;
import p000X.AnonymousClass02K;
import p000X.AnonymousClass02N;
import p000X.AnonymousClass02O;
import p000X.AnonymousClass02P;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0ZA;
import p000X.C021801j;

public class SigquitDetectorLacrima implements AnonymousClass02K {
    public static AnonymousClass02K sInstance;
    public static boolean sIsArt;
    public AnonymousClass02P mListener;
    public Handler mMainThreadHandler;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, boolean z7);

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0019;
     */
    static {
        boolean z;
        String property = System.getProperty("java.vm.version");
        if (property != null && !property.startsWith("1.")) {
            z = true;
        }
        z = false;
        sIsArt = z;
    }

    private void sigquitDetected(String str, String str2, boolean z, boolean z2) {
        AnonymousClass0DB.A0K("SigquitDetectorLacrima", "sigquitDetected inFgV1: %b inFgV2: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        this.mListener.Bom(str, str2, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (r2.A09.endsWith(":browser") != false) goto L_0x0030;
     */
    public void init(C021801j r18, boolean z) {
        boolean z2;
        AnonymousClass0DB.A0E("SigquitDetectorLacrima", "nativeInit");
        C021801j r2 = r18;
        this.mMainThreadHandler = r2.A05;
        boolean z3 = sIsArt;
        int i = Build.VERSION.SDK_INT;
        String str = r2.A07;
        String str2 = r2.A08;
        String str3 = r2.A0B;
        String str4 = r2.A0A;
        if (r2.A09.contains(":")) {
            z2 = false;
        }
        z2 = true;
        nativeInit(this, z3, i, str, str2, str3, str4, z2, z, r2.A0H, r2.A0F, r2.A0E, r2.A00(), r2.A0G);
    }

    public void installSignalHandler(Handler handler, boolean z) {
        AnonymousClass0ZA.A0E(this.mMainThreadHandler, new AnonymousClass02O(this, handler, new AnonymousClass02N(this, z)), 137675189);
    }

    public SigquitDetectorLacrima(AnonymousClass02P r1) {
        this.mListener = r1;
    }

    public void cleanupAppStateFile() {
        nativeCleanupAppStateFile();
    }

    public void stopDetector() {
        nativeStopDetector();
    }
}
