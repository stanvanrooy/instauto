package com.facebook.common.errorreporting.memory.heapsanitizer;

public class HeapSanitizer {
    public static volatile boolean sInit;

    public static native String nativeSanitizeHprof(String str);
}
