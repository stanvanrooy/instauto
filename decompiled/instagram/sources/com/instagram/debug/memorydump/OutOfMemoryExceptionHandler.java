package com.instagram.debug.memorydump;

import com.facebook.common.stringformat.StringFormatUtil;
import java.lang.Thread;
import p000X.AnonymousClass0DB;

public class OutOfMemoryExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final Class TAG = OutOfMemoryExceptionHandler.class;
    public static OutOfMemoryExceptionHandler sHandler;
    public MemoryDumpCreator mMemoryDumpCreator;
    public Thread.UncaughtExceptionHandler mPreviousHandler = Thread.getDefaultUncaughtExceptionHandler();

    public static void init(MemoryDumpCreator memoryDumpCreator) {
        if (sHandler == null) {
            OutOfMemoryExceptionHandler outOfMemoryExceptionHandler = new OutOfMemoryExceptionHandler(memoryDumpCreator);
            sHandler = outOfMemoryExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(outOfMemoryExceptionHandler);
            return;
        }
        AnonymousClass0DB.A04(TAG, "Trying to initialize MemoryDumpHandler twice");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            try {
                this.mMemoryDumpCreator.createCrashMemoryDump(th);
            } catch (Throwable th2) {
                Class cls = TAG;
                Object[] objArr = new Object[0];
                if (AnonymousClass0DB.A01.isLoggable(6)) {
                    AnonymousClass0DB.A0I(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Error while handling OOM dump", objArr), th2);
                }
            }
        }
        this.mPreviousHandler.uncaughtException(thread, th);
    }

    public OutOfMemoryExceptionHandler(MemoryDumpCreator memoryDumpCreator) {
        this.mMemoryDumpCreator = memoryDumpCreator;
    }
}
