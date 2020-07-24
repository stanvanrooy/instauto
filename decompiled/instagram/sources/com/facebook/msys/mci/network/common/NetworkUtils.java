package com.facebook.msys.mci.network.common;

import p000X.C208928zC;

public class NetworkUtils {
    public static native String getSandboxDomain();

    public static native synchronized void setSandboxDomain(String str);

    static {
        C208928zC.A00();
    }
}
