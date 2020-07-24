package com.facebook.profilo.provider.stacktrace;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Y1;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    public static native boolean nativeCheck(int i);

    static {
        AnonymousClass0Y1.A08("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:112|113) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0191, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0198, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011a, code lost:
        if (r0 == false) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011c, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011d, code lost:
        switch(r1) {
            case 0: goto L_0x015f;
            case 1: goto L_0x015f;
            case 2: goto L_0x015f;
            case 3: goto L_0x0158;
            case 4: goto L_0x0151;
            case 5: goto L_0x014a;
            case 6: goto L_0x0143;
            case 7: goto L_0x013c;
            case 8: goto L_0x013c;
            case 9: goto L_0x0135;
            case 10: goto L_0x0135;
            case X.5Dh.VIEW_TYPE_BANNER :int: goto L_0x0130;
            case X.5Dh.VIEW_TYPE_SPINNER :int: goto L_0x0130;
            case X.5Dh.VIEW_TYPE_BADGE :int: goto L_0x0129;
            case X.5Dh.VIEW_TYPE_LINK :int: goto L_0x0129;
            case 15: goto L_0x0129;
            case 16: goto L_0x0122;
            case X.5Dh.VIEW_TYPE_CUSTOM_ITEM :int: goto L_0x0122;
            case 18: goto L_0x0122;
            default: goto L_0x0120;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0120, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0122, code lost:
        r3 = nativeCheck(1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0129, code lost:
        r3 = nativeCheck(2048);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0130, code lost:
        r3 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0135, code lost:
        r3 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013c, code lost:
        r3 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0143, code lost:
        r3 = nativeCheck(128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x014a, code lost:
        r3 = nativeCheck(256);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0151, code lost:
        r3 = nativeCheck(4096);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0158, code lost:
        r3 = nativeCheck(8192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015f, code lost:
        r3 = nativeCheck(com.facebook.common.dextricks.DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0166, code lost:
        r1 = new java.io.FileOutputStream(r2);
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016d, code lost:
        if (r3 == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016f, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x019c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:112:0x019c=Splitter:B:112:0x019c, B:14:0x003d=Splitter:B:14:0x003d} */
    public static boolean isCompatible(Context context) {
        boolean z;
        char c;
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        Boolean bool = (Boolean) sIsCompatible.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            File filesDir = context.getFilesDir();
            String str = Build.VERSION.RELEASE;
            File file = new File(filesDir, AnonymousClass000.A0E("ProfiloArtUnwindcCompat_", str));
            if (!file.exists()) {
                switch (str.hashCode()) {
                    case 57:
                        boolean equals = str.equals("9");
                        c = 0;
                        break;
                    case 52407:
                        boolean equals2 = str.equals("5.0");
                        c = 16;
                        if (!equals2) {
                        }
                        break;
                    case 52408:
                        boolean equals3 = str.equals("5.1");
                        c = 13;
                        if (!equals3) {
                        }
                        break;
                    case 53368:
                        boolean equals4 = str.equals("6.0");
                        c = 11;
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
                        c = 17;
                        if (!equals8) {
                        }
                        break;
                    case 50364603:
                        boolean equals9 = str.equals("5.0.2");
                        c = 18;
                        if (!equals9) {
                        }
                        break;
                    case 50365562:
                        boolean equals10 = str.equals("5.1.0");
                        c = 14;
                        if (!equals10) {
                        }
                        break;
                    case 50365563:
                        boolean equals11 = str.equals("5.1.1");
                        c = 15;
                        if (!equals11) {
                        }
                        break;
                    case 51288123:
                        boolean equals12 = str.equals("6.0.1");
                        c = 12;
                        if (!equals12) {
                        }
                        break;
                    case 52211643:
                        boolean equals13 = str.equals("7.0.0");
                        c = 10;
                        if (!equals13) {
                        }
                        break;
                    case 52212604:
                        boolean equals14 = str.equals("7.1.0");
                        c = 8;
                        if (!equals14) {
                        }
                        break;
                    case 52212605:
                        boolean equals15 = str.equals("7.1.1");
                        c = 6;
                        if (!equals15) {
                        }
                        break;
                    case 52212606:
                        boolean equals16 = str.equals("7.1.2");
                        c = 5;
                        if (!equals16) {
                        }
                        break;
                    case 53135164:
                        boolean equals17 = str.equals("8.0.0");
                        c = 4;
                        if (!equals17) {
                        }
                        break;
                    case 53136125:
                        boolean equals18 = str.equals("8.1.0");
                        c = 3;
                        if (!equals18) {
                        }
                        break;
                    case 54058685:
                        boolean equals19 = str.equals("9.0.0");
                        c = 2;
                        if (!equals19) {
                        }
                        break;
                }
            } else {
                FileInputStream fileInputStream = new FileInputStream(file);
                z = false;
                if (fileInputStream.read() == 49) {
                    z = true;
                }
                fileInputStream.close();
            }
            AtomicReference atomicReference = sIsCompatible;
            if (!atomicReference.compareAndSet((Object) null, Boolean.valueOf(z))) {
                return ((Boolean) atomicReference.get()).booleanValue();
            }
            return z;
        } catch (IOException unused) {
            return false;
        }
    }
}
