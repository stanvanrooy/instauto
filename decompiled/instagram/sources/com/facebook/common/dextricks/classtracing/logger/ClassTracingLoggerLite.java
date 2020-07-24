package com.facebook.common.dextricks.classtracing.logger;

import com.facebook.common.dextricks.classid.ClassId;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000X.AnonymousClass0KH;
import p000X.C08800Yq;

public class ClassTracingLoggerLite {
    public static final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A01;
    public static volatile boolean A02;

    static {
        C08800Yq.A00(new AnonymousClass0KH());
    }

    public static void classLoaded(Class cls) {
        if (A01 && ClassId.sInitialized) {
            A00.add(Long.valueOf(ClassId.getClassId(cls)));
        }
    }

    public static void classNotFound() {
        if (A01 && ClassId.sInitialized) {
            A00.add(-1L);
        }
    }

    public static void beginClassLoad(String str) {
    }
}
