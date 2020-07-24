package com.google.android.exoplayer2.ext.vp9;

import p000X.AnonymousClass0Y1;
import p000X.D7c;
import p000X.D8M;

public final class VpxLibrary {
    public static final D8M A00 = new D8M("vpxJNI");

    public static native String vpxGetBuildConfig();

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();

    static {
        D7c.A00("goog.exo.vpx");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|(1:10)|19|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001d */
    public static boolean A00() {
        boolean z;
        D8M d8m = A00;
        synchronized (d8m) {
            if (d8m.A01) {
                z = d8m.A00;
            } else {
                d8m.A01 = true;
                for (String A08 : d8m.A02) {
                    AnonymousClass0Y1.A08(A08);
                }
                d8m.A00 = true;
                z = d8m.A00;
            }
        }
        return z;
    }
}
