package com.facebook.profilo.provider.systemcounters;

import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0GY;
import p000X.AnonymousClass0HW;
import p000X.AnonymousClass0HX;
import p000X.AnonymousClass0Z0;

public final class SystemCounterThread extends AnonymousClass0GW {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public AnonymousClass0HW mSystemCounterLogger = new AnonymousClass0HW();

    public static native HybridData initHybrid();

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    public synchronized void disable() {
        int A03 = AnonymousClass0Z0.A03(493192633);
        if (this.mEnabled) {
            this.mSystemCounterLogger.A02();
            if (this.mAllThreadsMode) {
                logCounters();
            }
            if (this.mHighFrequencyMode) {
                logHighFrequencyThreadCounters();
                logTraceAnnotations();
            }
        }
        this.mEnabled = false;
        this.mAllThreadsMode = false;
        this.mHighFrequencyMode = false;
        nativeSetHighFrequencyMode(false);
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mHandlerThread = null;
        }
        this.mHandler = null;
        Debug.stopAllocCounting();
        AnonymousClass0Z0.A0A(1054018765, A03);
    }

    public synchronized void enable() {
        int A03 = AnonymousClass0Z0.A03(-158531286);
        this.mHybridData = initHybrid();
        this.mEnabled = true;
        synchronized (this) {
            if (this.mHandler == null) {
                HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
                this.mHandlerThread = handlerThread;
                handlerThread.start();
                this.mHandler = new AnonymousClass0HX(this, this.mHandlerThread.getLooper());
            }
        }
        TraceContext traceContext = this.A00;
        if (TraceEvents.isEnabled(PROVIDER_SYSTEM_COUNTERS)) {
            this.mHighFrequencyMode = false;
            nativeSetHighFrequencyMode(false);
            this.mAllThreadsMode = true;
            Debug.startAllocCounting();
            AnonymousClass0HW r2 = this.mSystemCounterLogger;
            r2.A00 = 0;
            r2.A01 = 0;
            r2.A04 = 0;
            r2.A05 = 0;
            r2.A02 = 0;
            r2.A03 = 0;
            r2.A06 = 0;
            r2.A07 = 0;
            r2.A08 = 0;
            r2.A09 = 0;
            int i = 50;
            if (traceContext != null) {
                i = traceContext.A07.A00("provider.system_counters.sampling_rate_ms", 50);
            }
            this.mHandler.obtainMessage(1, i, 0).sendToTarget();
        }
        if (TraceEvents.isEnabled(PROVIDER_HIGH_FREQ_THREAD_COUNTERS)) {
            nativeAddToWhitelist(Process.myPid());
            this.mHighFrequencyMode = true;
            nativeSetHighFrequencyMode(true);
            int i2 = 7;
            if (traceContext != null) {
                i2 = traceContext.A07.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
            }
            this.mHandler.obtainMessage(2, i2, 0).sendToTarget();
        }
        AnonymousClass0Z0.A0A(-1242989419, A03);
    }

    public native void logCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);

    public SystemCounterThread() {
        super("profilo_systemcounters");
    }

    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    public int getTracingProviders() {
        int i = 0;
        if (!this.mEnabled) {
            return 0;
        }
        if (this.mAllThreadsMode) {
            i = 0 | PROVIDER_SYSTEM_COUNTERS;
        }
        if (this.mHighFrequencyMode) {
            return i | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
        }
        return i;
    }

    static {
        AnonymousClass0GY r1 = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = r1.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = r1.A02("high_freq_main_thread_counters");
    }
}
