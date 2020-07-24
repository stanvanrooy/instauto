package com.facebook.common.threadutils;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;
import p000X.C12310gX;
import p000X.C30772Djl;

public class ThreadUtils {
    public static final ThreadUtils THE_ONE = new ThreadUtils();
    public int mMaxAffinityMask;

    public static native void nativeSetThreadAffinityMask(int i, int i2);

    static {
        AnonymousClass0Y1.A08("threadutils-jni");
    }

    public ThreadUtils() {
        int i;
        C30772Djl djl = C30772Djl.A02;
        synchronized (djl) {
            i = djl.A00;
            if (i == 0) {
                try {
                    djl.A00 = C12310gX.A01();
                } catch (Exception e) {
                    AnonymousClass0DB.A0H("ProcessorInfoUtil", "Unable to get reliable CPU Core count", e);
                }
                i = djl.A00;
            }
        }
        if (i == -1) {
            if (djl.A01 == 0) {
                djl.A01 = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i = djl.A01;
        }
        this.mMaxAffinityMask = (1 << i) - 1;
    }
}
