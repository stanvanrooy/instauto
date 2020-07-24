package com.facebook.profilo.logger;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.mmapbuf.MmapBufferManager;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import p000X.AnonymousClass0H7;
import p000X.AnonymousClass0H9;
import p000X.AnonymousClass0HA;

public final class Logger {
    public static String sFilePrefix;
    public static volatile boolean sInitialized;
    public static AnonymousClass0H9 sLoggerCallbacks;
    public static MmapBufferManager sMmapBufferManager;
    public static NativeTraceWriterCallbacks sNativeTraceWriterCallbacks;
    public static int sRingBufferSize;
    public static File sTraceDirectory;
    public static volatile NativeTraceWriter sTraceWriter;
    public static AtomicReference sWorker;

    public static native int loggerWriteAndWakeupTraceWriter(NativeTraceWriter nativeTraceWriter, long j, int i, int i2, int i3, long j2);

    public static native int loggerWriteBytesEntry(int i, int i2, int i3, String str);

    public static native int loggerWriteStandardEntry(int i, int i2, long j, int i3, int i4, int i5, long j2);

    public static native void nativeInitRingBuffer(int i);

    public static void postFinishTrace(int i, long j) {
        writeStandardEntry(0, 7, i, 0, 0, 0, 0, j);
    }

    public static native void stopTraceWriter(NativeTraceWriter nativeTraceWriter);

    public static void startWorkerThreadIfNecessary() {
        if (sWorker.get() == null) {
            try {
                NativeTraceWriter nativeTraceWriter = new NativeTraceWriter(sTraceDirectory.getCanonicalPath(), sFilePrefix, sNativeTraceWriterCallbacks);
                AnonymousClass0HA r2 = new AnonymousClass0HA(nativeTraceWriter);
                if (sWorker.compareAndSet((Object) null, r2)) {
                    sTraceWriter = nativeTraceWriter;
                    r2.setUncaughtExceptionHandler(new AnonymousClass0H7());
                    r2.start();
                }
            } catch (IOException unused) {
                throw new IllegalArgumentException("Could not get canonical path of trace directory");
            }
        }
    }

    public static int writeBytesEntry(int i, int i2, int i3, int i4, String str) {
        if (str == null) {
            str = "null";
        }
        if (!sInitialized) {
            return -1;
        }
        if ((i2 & 1) != 0 || TraceEvents.isEnabled(i)) {
            return loggerWriteBytesEntry(i2, i3, i4, str);
        }
        return -1;
    }

    public static int writeStandardEntry(int i, int i2, int i3, long j, int i4, int i5, int i6, long j2) {
        if (!sInitialized) {
            return -1;
        }
        int i7 = i2;
        if ((i2 & 1) == 0 && !TraceEvents.isEnabled(i)) {
            return -1;
        }
        return loggerWriteStandardEntry(i7, i3, j, i4, i5, i6, j2);
    }
}
