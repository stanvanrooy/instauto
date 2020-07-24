package com.facebook.common.jit.jitoptions;

import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Y1;

public class FbJitOptions {
    public static final boolean PLATFORM_IS_SUPPORTED;

    public static native void nativeApplyAllowMultipleVerifications(long j, boolean z);

    public static native void nativeApplyAlwaysVerifyOnJitCompile(long j, boolean z);

    public static native void nativeApplyArenaAllocRetryFix(long j, boolean z);

    public static native void nativeApplyArenaMallocFallback(long j, boolean z);

    public static native void nativeApplyArenaRetryFastHook(long j, boolean z);

    public static native void nativeApplyBarrierFix(long j, boolean z);

    public static native void nativeApplyCallIntoJavaFromJitThreadFix(long j, boolean z);

    public static native void nativeApplyCustomJitPriorities(long j, boolean z);

    public static native void nativeApplyCustomQCCompilerFix(long j, boolean z);

    public static native void nativeApplyDisableProfilerThreadTimeoutCheck(long j, boolean z);

    public static native void nativeApplyDoNotStartProfilerWithJit(long j, boolean z);

    public static native void nativeApplyEnableThreadPoolPriority(long j, boolean z);

    public static native void nativeApplyFailOnSoftVerificationFailure(long j, boolean z);

    public static native void nativeApplyFlushInstructionCacheFix(long j, boolean z);

    public static native void nativeApplyGcJitFix(long j, boolean z);

    public static native void nativeApplyGenInvokeNoLineFix(long j, boolean z);

    public static native void nativeApplyLogGenInvokeNoInlineBug(long j, boolean z);

    public static native void nativeApplyMirMethodLoweringInfoResolveFix(long j, boolean z);

    public static native void nativeApplyMmapRaceFix(long j, boolean z);

    public static native void nativeApplyMobileConfigInlining(long j, boolean z);

    public static native void nativeApplyMprotectFix(long j, boolean z);

    public static native void nativeApplyMprotectJitCreationOverride(long j, boolean z);

    public static native void nativeApplyNotifyJitActivityFix(long j, boolean z);

    public static native void nativeApplyOverrideJitCompilerCompileMethod(long j, boolean z);

    public static native void nativeApplyOverrideProfilerThread(long j, boolean z);

    public static native void nativeApplyPerformMoveBugFix(long j, boolean z);

    public static native void nativeApplyProfileSaverProfilingThreadHooks(long j, boolean z);

    public static native void nativeApplyProfilerThreadTimeoutSeconds(long j, int i);

    public static native void nativeApplyThreadListRaceFix(long j, boolean z);

    public static native void nativeApplyThreadPoolPriority(long j, int i);

    public static native void nativeApplyThreadPoolThreadCount(long j, int i);

    public static native void nativeApplyUseRemapMprotectPtSafeTL(long j, boolean z);

    public static native void nativeDestroy(long j);

    public static native long nativeInit();

    public static native void nativeSetAppDir(long j, String str);

    public static native void nativeSetCodeCacheCapacity(long j, int i);

    public static native void nativeSetCodeCacheCapacityRatio(long j, double d);

    public static native void nativeSetCodeCacheInitialCapacity(long j, int i);

    public static native void nativeSetCodeCacheInitialCapacityRatio(long j, double d);

    public static native void nativeSetCodeCacheMaxCapacity(long j, int i);

    public static native void nativeSetCodeCacheMaxCapacityRatio(long j, double d);

    public static native void nativeSetCodePath(long j, String[] strArr);

    public static native void nativeSetCompileThreshold(long j, int i);

    public static native void nativeSetCompileThresholdRatio(long j, double d);

    public static native void nativeSetDumpInfoOnShutdown(long j, boolean z);

    public static native void nativeSetForeignDexPath(long j, String str);

    public static native void nativeSetHotStartupMethodSamples(long j, int i);

    public static native void nativeSetInvokeTransitionWeight(long j, int i);

    public static native void nativeSetInvokeTransitionWeightRatio(long j, double d);

    public static native void nativeSetMaxCodeCacheInitialCapacity(long j, int i);

    public static native void nativeSetMaxNotificationBeforeWake(long j, int i);

    public static native void nativeSetMinClassesToSave(long j, int i);

    public static native void nativeSetMinMethodsToSave(long j, int i);

    public static native void nativeSetMinNewClassesForCompilation(long j, int i);

    public static native void nativeSetMinNewMethodsForCompilation(long j, int i);

    public static native void nativeSetMinNotificationBeforeWake(long j, int i);

    public static native void nativeSetMinSavePeriodMs(long j, int i);

    public static native void nativeSetOldProfilerBackoffCoefficient(long j, float f);

    public static native void nativeSetOldProfilerDurationSec(long j, int i);

    public static native void nativeSetOldProfilerIntervalUS(long j, long j2);

    public static native void nativeSetOldProfilerPeriodSec(long j, int i);

    public static native void nativeSetOldProfilerStartImmediately(long j, boolean z);

    public static native void nativeSetOldProfilerTopKChangeThreshold(long j, float f);

    public static native void nativeSetOldProfilerTopKThreshold(long j, float f);

    public static native void nativeSetOsrThreshold(long j, int i);

    public static native void nativeSetOsrThresholdRatio(long j, double d);

    public static native void nativeSetPriorityThreadWeight(long j, int i);

    public static native void nativeSetPriorityThreadWeightRatio(long j, double d);

    public static native void nativeSetProfileBootClassPath(long j, boolean z);

    public static native void nativeSetProfilePath(long j, String str);

    public static native void nativeSetProfileSaverProfilingThreadIoPrioClass(long j, int i);

    public static native void nativeSetProfileSaverProfilingThreadIoPrioPriority(long j, int i);

    public static native void nativeSetProfilerOptionEnabled(long j, boolean z);

    public static native void nativeSetSaveProfilingInfo(long j, boolean z);

    public static native void nativeSetSaveResolvedClassesDelayMs(long j, int i);

    public static native void nativeSetUseJit(long j, boolean z);

    public static native void nativeSetWarmupThreshold(long j, int i);

    public static native void nativeSetWarmupThresholdRatio(long j, double d);

    static {
        boolean z;
        try {
            AnonymousClass0Y1.A08("fbjitoptionsjni");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0DB.A0G("FbJitOptions", "Error loading JitUtils", e);
            z = false;
        }
        PLATFORM_IS_SUPPORTED = z;
    }

    public void finalize() {
        try {
            super.finalize();
            throw null;
        } finally {
        }
    }
}
