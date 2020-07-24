package com.facebook.common.dextricks.stats;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public final class ClassLoadingStatsNative extends ClassLoadingStats {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void decrementDexFileQueries();

    public native int getClassLoadsAttempted();

    public native int getClassLoadsFailed();

    public native int getDexFileQueries();

    public native int getIncorrectDfaGuesses();

    public native int getLocatorAssistedClassLoads();

    public native int getTurboLoaderClassLocationFailures();

    public native int getTurboLoaderClassLocationSuccesses();

    public native int getTurboLoaderMapGenerationFailures();

    public native int getTurboLoaderMapGenerationSuccesses();

    public native void incrementClassLoadsAttempted();

    public native void incrementClassLoadsFailed();

    public native void incrementDexFileQueries(int i);

    public native void incrementIncorrectDfaGuesses();

    public native void incrementLocatorAssistedClassLoads();

    public native void incrementTurboLoaderClassLocationFailures();

    public native void incrementTurboLoaderClassLocationSuccesses();

    public native void incrementTurboLoaderMapGenerationFailures();

    public native void incrementTurboLoaderMapGenerationSuccesses();

    static {
        AnonymousClass0Y1.A08("dextricks");
    }
}
