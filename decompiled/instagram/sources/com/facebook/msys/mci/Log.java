package com.facebook.msys.mci;

import p000X.AnonymousClass0DB;
import p000X.C208928zC;
import p000X.D4W;
import p000X.D9M;

public class Log {
    public static boolean sRegistered;

    public static native void registerLoggerNative(long j, int i);

    public static native void setLogLevel(int i);

    public static void log(int i, String str) {
        if (AnonymousClass0DB.A01.isLoggable(i)) {
            AnonymousClass0DB.A01.log(i, "msys", str);
        }
        if (i >= 5) {
            synchronized (D4W.A01) {
                System.currentTimeMillis();
                D9M d9m = new D9M();
                D9M[] d9mArr = D4W.A02;
                int i2 = D4W.A00;
                d9mArr[i2] = d9m;
                D4W.A00 = (i2 + 1) % 100;
            }
        }
    }

    static {
        C208928zC.A00();
    }
}
