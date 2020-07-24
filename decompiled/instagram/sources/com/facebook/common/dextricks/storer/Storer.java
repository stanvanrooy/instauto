package com.facebook.common.dextricks.storer;

import p000X.AnonymousClass0Y1;

public class Storer {
    public static native void cleanup(long j);

    public static native void finish(long j);

    public static native long open(String str, int i);

    public static native void start(long j, String str, int i);

    public static native void write(long j, byte[] bArr, int i);

    static {
        AnonymousClass0Y1.A08("storer-jni");
    }
}
