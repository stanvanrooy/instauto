package com.facebook.profilo.provider.stacktrace;

import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.Logger;
import p000X.AnonymousClass0GW;
import p000X.AnonymousClass0GY;
import p000X.AnonymousClass0Z0;
import p000X.C09640bk;

public final class StackFrameThread extends AnonymousClass0GW {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public TraceContext mSavedTraceContext;
    public int mSystemClockTimeIntervalMs = -1;

    public static native int nativeSystemClockTickIntervalMs();

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null || !(context instanceof Application)) {
            this.mContext = applicationContext;
        } else {
            this.mContext = context;
        }
    }

    public static void logAnnotation(String str, String str2) {
        int writeStandardEntry = Logger.writeStandardEntry(PROVIDER_STACK_FRAME, 7, 52, 0, 0, 0, 0, 0);
        int i = PROVIDER_STACK_FRAME;
        Logger.writeBytesEntry(i, 1, 57, Logger.writeBytesEntry(i, 1, 56, writeStandardEntry, str), str2);
    }

    public static int providersToTracers(int i) {
        int i2 = 0;
        if (((PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE) & i) != 0) {
            i2 = 32753;
        }
        if ((i & PROVIDER_NATIVE_STACK_TRACE) != 0) {
            return i2 | 4;
        }
        return i2;
    }

    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if ((r2 & r1) != 0) goto L_0x0017;
     */
    public int getTracingProviders() {
        TraceContext traceContext = this.mSavedTraceContext;
        int i = 0;
        if (!this.mEnabled || traceContext == null) {
            return 0;
        }
        int i2 = traceContext.A02;
        int i3 = PROVIDER_WALL_TIME_STACK_TRACE;
        if ((i2 & i3) == 0) {
            i3 = PROVIDER_STACK_FRAME;
        }
        i = 0 | i3;
        return (i2 & PROVIDER_NATIVE_STACK_TRACE) | i;
    }

    public void onTraceEnded(TraceContext traceContext, C09640bk r5) {
        int i;
        if ((traceContext.A02 & PROVIDER_STACK_FRAME) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int providersToTracers = providersToTracers(traceContext.A02);
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(providersToTracers & i));
        }
    }

    public void onTraceStarted(TraceContext traceContext, C09640bk r3) {
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
    }

    static {
        AnonymousClass0GY r1 = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = r1.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = r1.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = r1.A02("native_stack_trace");
    }

    public void disable() {
        int i;
        int A03 = AnonymousClass0Z0.A03(-1136144109);
        if (!this.mEnabled) {
            this.mProfilerThread = null;
            i = 1610381143;
        } else {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            synchronized (CPUProfiler.class) {
                if (CPUProfiler.sInitialized) {
                    CPUProfiler.nativeStopProfiling();
                }
            }
            Thread thread = this.mProfilerThread;
            if (thread != null) {
                try {
                    thread.join();
                    this.mProfilerThread = null;
                } catch (InterruptedException e) {
                    RuntimeException runtimeException = new RuntimeException(e);
                    AnonymousClass0Z0.A0A(-831141173, A03);
                    throw runtimeException;
                }
            }
            i = -1057524221;
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:373)
        	at java.base/java.util.ArrayList.get(ArrayList.java:425)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void enable() {
        /*
            r22 = this;
            r0 = 1018280768(0x3cb1bb40, float:0.021695733)
            int r3 = p000X.AnonymousClass0Z0.A03(r0)
            r4 = r22
            com.facebook.profilo.ipc.TraceContext r2 = r4.A00
            int r0 = r2.A02
            int r0 = providersToTracers(r0)
            if (r0 != 0) goto L_0x001a
            r0 = 813362116(0x307aebc4, float:9.1284513E-10)
        L_0x0016:
            p000X.AnonymousClass0Z0.A0A(r0, r3)
            return
        L_0x001a:
            java.lang.Thread r0 = r4.mProfilerThread
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = "Duplicate attempt to enable sampling profiler."
            android.util.Log.e(r1, r0)
            r0 = -769628773(0xffffffffd220659b, float:-1.72224856E11)
            goto L_0x0016
        L_0x0029:
            com.facebook.profilo.ipc.TraceContext$TraceConfigExtras r1 = r2.A07
            r5 = 0
            java.lang.String r0 = "provider.stack_trace.cpu_sampling_rate_ms"
            int r6 = r1.A00(r0, r5)
            com.facebook.profilo.ipc.TraceContext$TraceConfigExtras r0 = r2.A07
            java.lang.String r1 = "provider.stack_trace.use_thread_specific_profiler"
            r10 = 0
            java.util.TreeMap r0 = r0.A00
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0047
            boolean r10 = r0.booleanValue()
        L_0x0047:
            com.facebook.profilo.ipc.TraceContext$TraceConfigExtras r1 = r2.A07
            java.lang.String r0 = "provider.stack_trace.thread_detect_interval_ms"
            int r9 = r1.A00(r0, r5)
            int r7 = r2.A02
            r11 = r4
            monitor-enter(r11)
            monitor-enter(r4)     // Catch:{ all -> 0x00ea }
            android.content.Context r0 = r4.mContext     // Catch:{ Exception -> 0x005c }
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.init(r0)     // Catch:{ Exception -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            goto L_0x0068
        L_0x005c:
            r5 = move-exception
            java.lang.String r1 = "StackFrameThread"
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x00e4 }
            android.util.Log.e(r1, r0, r5)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            r0 = 0
        L_0x0068:
            if (r0 == 0) goto L_0x00c1
            if (r6 > 0) goto L_0x006e
            r6 = 11
        L_0x006e:
            if (r9 > 0) goto L_0x0072
            r9 = 23
        L_0x0072:
            int r0 = PROVIDER_WALL_TIME_STACK_TRACE     // Catch:{ all -> 0x00ea }
            r0 = r0 & r7
            r5 = 1
            if (r0 == 0) goto L_0x007a
            r8 = 1
            goto L_0x008c
        L_0x007a:
            int r1 = r4.mSystemClockTimeIntervalMs     // Catch:{ all -> 0x00ea }
            r0 = -1
            if (r1 != r0) goto L_0x0085
            int r0 = nativeSystemClockTickIntervalMs()     // Catch:{ all -> 0x00ea }
            r4.mSystemClockTimeIntervalMs = r0     // Catch:{ all -> 0x00ea }
        L_0x0085:
            int r0 = r4.mSystemClockTimeIntervalMs     // Catch:{ all -> 0x00ea }
            int r6 = java.lang.Math.max(r6, r0)     // Catch:{ all -> 0x00ea }
            r8 = 0
        L_0x008c:
            int r1 = providersToTracers(r7)     // Catch:{ all -> 0x00ea }
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r7 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r7)     // Catch:{ all -> 0x00ea }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x00e7 }
            com.facebook.profilo.provider.stacktrace.StackTraceWhitelist.nativeAddToWhitelist(r0)     // Catch:{ all -> 0x00e7 }
            boolean r0 = com.facebook.profilo.provider.stacktrace.CPUProfiler.sInitialized     // Catch:{ all -> 0x00e7 }
            if (r0 == 0) goto L_0x00a5
            boolean r1 = com.facebook.profilo.provider.stacktrace.CPUProfiler.nativeStartProfiling(r1, r6, r10, r9, r8)     // Catch:{ all -> 0x00e7 }
            r0 = 1
            if (r1 != 0) goto L_0x00a6
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            monitor-exit(r7)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00c1
            r12 = 0
            r13 = 7
            r14 = 52
            r15 = 0
            r17 = 0
            r18 = 8126495(0x7c001f, float:1.1387645E-38)
            r19 = 0
            long r0 = (long) r6     // Catch:{ all -> 0x00ea }
            r20 = r0
            com.facebook.profilo.logger.Logger.writeStandardEntry(r12, r13, r14, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x00ea }
            r4.mEnabled = r5     // Catch:{ all -> 0x00ea }
            boolean r0 = r4.mEnabled     // Catch:{ all -> 0x00ea }
            goto L_0x00c4
        L_0x00c1:
            monitor-exit(r11)
            r0 = 0
            goto L_0x00c5
        L_0x00c4:
            monitor-exit(r11)
        L_0x00c5:
            if (r0 != 0) goto L_0x00cc
            r0 = 169862066(0xa1fe3b2, float:7.698396E-33)
            goto L_0x0016
        L_0x00cc:
            r4.mSavedTraceContext = r2
            java.lang.Thread r2 = new java.lang.Thread
            X.0HU r1 = new X.0HU
            r1.<init>(r4)
            java.lang.String r0 = "Prflo:Profiler"
            r2.<init>(r1, r0)
            r4.mProfilerThread = r2
            r2.start()
            r0 = -158407692(0xfffffffff68ee3f4, float:-1.4490812E33)
            goto L_0x0016
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ea }
            goto L_0x00e9
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ea }
        L_0x00e9:
            throw r0     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }
}
