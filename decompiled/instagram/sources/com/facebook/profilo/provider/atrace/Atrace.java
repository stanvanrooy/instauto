package com.facebook.profilo.provider.atrace;

import p000X.C09660bm;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative();

    public static native boolean installSystraceHook(int i);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative();

    public static synchronized boolean hasHacks() {
        boolean z;
        synchronized (Atrace.class) {
            if (!sHasHook && !sHookFailed) {
                boolean installSystraceHook = installSystraceHook(C09660bm.A00);
                sHasHook = installSystraceHook;
                boolean z2 = false;
                if (!installSystraceHook) {
                    z2 = true;
                }
                sHookFailed = z2;
            }
            z = sHasHook;
        }
        return z;
    }
}
