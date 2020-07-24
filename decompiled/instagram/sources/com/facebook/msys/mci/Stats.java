package com.facebook.msys.mci;

import java.util.HashMap;
import p000X.C208928zC;

public class Stats {
    public static native void decrement(int i);

    public static native HashMap getPerformanceData();

    public static native void increment(int i);

    static {
        C208928zC.A00();
    }
}
