package com.facebook.profilo.provider.stacktrace;

import android.content.Context;
import android.os.Build;
import p000X.AnonymousClass0Y1;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(int i);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, boolean z, int i3, boolean z2);

    public static native void nativeStopProfiling();

    static {
        AnonymousClass0Y1.A08("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e6, code lost:
        if (r0 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e8, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        switch(r2) {
            case 0: goto L_0x0106;
            case 1: goto L_0x0106;
            case 2: goto L_0x0106;
            case 3: goto L_0x0103;
            case 4: goto L_0x0100;
            case 5: goto L_0x00fd;
            case 6: goto L_0x00fa;
            case 7: goto L_0x00f7;
            case 8: goto L_0x00f7;
            case 9: goto L_0x00f4;
            case 10: goto L_0x0108;
            case X.5Dh.VIEW_TYPE_BANNER :int: goto L_0x0108;
            case X.5Dh.VIEW_TYPE_SPINNER :int: goto L_0x00f1;
            case X.5Dh.VIEW_TYPE_BADGE :int: goto L_0x00f1;
            case X.5Dh.VIEW_TYPE_LINK :int: goto L_0x00f1;
            case 15: goto L_0x00ee;
            case 16: goto L_0x00ee;
            case X.5Dh.VIEW_TYPE_CUSTOM_ITEM :int: goto L_0x00ee;
            default: goto L_0x00ec;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ee, code lost:
        r1 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f1, code lost:
        r1 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f4, code lost:
        r1 = 32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f7, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00fa, code lost:
        r1 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00fd, code lost:
        r1 = 256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0100, code lost:
        r1 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0103, code lost:
        r1 = 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0106, code lost:
        r1 = com.facebook.common.dextricks.DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
     */
    public static synchronized boolean init(Context context) {
        boolean z;
        char c;
        synchronized (CPUProfiler.class) {
            if (sInitialized) {
                z = true;
            } else {
                int i = 16;
                if (Build.VERSION.SDK_INT < 21) {
                    i = 1;
                } else {
                    if (ArtCompatibility.isCompatible(context)) {
                        String str = Build.VERSION.RELEASE;
                        switch (str.hashCode()) {
                            case 57:
                                boolean equals = str.equals("9");
                                c = 0;
                                break;
                            case 52407:
                                boolean equals2 = str.equals("5.0");
                                c = 15;
                                if (!equals2) {
                                }
                                break;
                            case 52408:
                                boolean equals3 = str.equals("5.1");
                                c = 12;
                                if (!equals3) {
                                }
                                break;
                            case 53368:
                                boolean equals4 = str.equals("6.0");
                                c = 10;
                                if (!equals4) {
                                }
                                break;
                            case 54329:
                                boolean equals5 = str.equals("7.0");
                                c = 9;
                                if (!equals5) {
                                }
                                break;
                            case 54330:
                                boolean equals6 = str.equals("7.1");
                                c = 7;
                                if (!equals6) {
                                }
                                break;
                            case 56251:
                                boolean equals7 = str.equals("9.0");
                                c = 1;
                                if (!equals7) {
                                }
                                break;
                            case 50364602:
                                boolean equals8 = str.equals("5.0.1");
                                c = 16;
                                if (!equals8) {
                                }
                                break;
                            case 50364603:
                                boolean equals9 = str.equals("5.0.2");
                                c = 17;
                                if (!equals9) {
                                }
                                break;
                            case 50365562:
                                boolean equals10 = str.equals("5.1.0");
                                c = 13;
                                if (!equals10) {
                                }
                                break;
                            case 50365563:
                                boolean equals11 = str.equals("5.1.1");
                                c = 14;
                                if (!equals11) {
                                }
                                break;
                            case 51288123:
                                boolean equals12 = str.equals("6.0.1");
                                c = 11;
                                if (!equals12) {
                                }
                                break;
                            case 52212604:
                                boolean equals13 = str.equals("7.1.0");
                                c = 8;
                                if (!equals13) {
                                }
                                break;
                            case 52212605:
                                boolean equals14 = str.equals("7.1.1");
                                c = 6;
                                if (!equals14) {
                                }
                                break;
                            case 52212606:
                                boolean equals15 = str.equals("7.1.2");
                                c = 5;
                                if (!equals15) {
                                }
                                break;
                            case 53135164:
                                boolean equals16 = str.equals("8.0.0");
                                c = 4;
                                if (!equals16) {
                                }
                                break;
                            case 53136125:
                                boolean equals17 = str.equals("8.1.0");
                                c = 3;
                                if (!equals17) {
                                }
                                break;
                            case 54058685:
                                boolean equals18 = str.equals("9.0.0");
                                c = 2;
                                if (!equals18) {
                                }
                                break;
                        }
                    }
                    i = 0;
                }
                int i2 = i | 512;
                String property = System.getProperty("os.arch");
                if (property == null || property.startsWith("arm")) {
                    i2 |= 4;
                }
                sAvailableTracers = i2;
                sInitialized = nativeInitialize(sAvailableTracers);
                z = sInitialized;
            }
        }
        return z;
    }
}
